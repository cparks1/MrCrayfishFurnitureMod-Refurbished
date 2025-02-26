package com.mrcrayfish.furniture.refurbished.electricity;

import com.mrcrayfish.furniture.refurbished.core.ModItems;
import com.mrcrayfish.furniture.refurbished.core.ModSounds;
import com.mrcrayfish.furniture.refurbished.network.Network;
import com.mrcrayfish.furniture.refurbished.network.message.MessageSyncLink;
import net.minecraft.core.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * Class to handle creating links between electric nodes
 * <p>
 * Author: MrCrayfish
 */
public class LinkManager
{
    public static final double MAX_LINK_LENGTH = 512; // TODO remove

    public static Optional<LinkManager> get(MinecraftServer server)
    {
        ServerLevel level = server.getLevel(Level.OVERWORLD);
        if(level != null)
        {
            return Optional.of(((Access) level).refurbishedFurniture$GetLinkManager());
        }
        return Optional.empty();
    }

    private final Map<UUID, BlockPos> lastNodeMap = new HashMap<>();

    /**
     * Called when a player interacts with an electric node. This handles creating a link between
     * two different electric nodes. On the first call to this method, it will simply store the
     * block position of the interacted node. On the second call, this method will attempt to
     * retrieve the electric node from block position stored on the first call and connect it to the
     * node just interacted.
     *
     * @param level          the level where the interacted happened
     * @param player         the player interacting with the node
     * @param node the node that was interacted
     */
    public void onNodeInteract(Level level, Player player, IElectricityNode node)
    {
        // Prevent interaction if reached connection limit
        if(node.isNodeConnectionLimitReached())
            return;

        if(this.startLinking(node.getNodePosition(), level, player))
            return;

        // Attempt to connect the two nodes together
        BlockPos previousPos = this.lastNodeMap.get(player.getUUID());
        IElectricityNode lastNode = level.getBlockEntity(previousPos) instanceof IElectricityNode n ? n : null;
        if(lastNode != null && lastNode != node)
        {
            // Sources nodes can't connect to other source nodes
            if(lastNode.isSourceNode() && node.isSourceNode())
                return;

            int linkLength = (int) (lastNode.getNodePosition().getCenter().distanceTo(node.getNodePosition().getCenter()) + 0.5);
            if(linkLength <= MAX_LINK_LENGTH)
            {
                this.lastNodeMap.remove(player.getUUID());
                lastNode.connectToNode(node);

                // Allows the player to chain links more quickly. Sneaking will continue linking
                if(player.isCrouching() && this.startLinking(node.getNodePosition(), level, player))
                {
                    Network.getPlay().sendToPlayer(() -> (ServerPlayer) player, new MessageSyncLink(node.getNodePosition()));
                    return;
                }
                level.playSound(null, node.getNodePosition(), ModSounds.ITEM_WRENCH_CONNECTED_LINK.get(), SoundSource.BLOCKS);
                Network.getPlay().sendToPlayer(() -> (ServerPlayer) player, new MessageSyncLink(null));
            }
        }
    }

    private boolean startLinking(BlockPos pos, Level level, Player player)
    {
        if(!this.lastNodeMap.containsKey(player.getUUID()))
        {
            this.lastNodeMap.put(player.getUUID(), pos);
            level.playSound(null, pos, ModSounds.ITEM_WRENCH_SELECTED_NODE.get(), SoundSource.BLOCKS);
            Network.getPlay().sendToPlayer(() -> (ServerPlayer) player, new MessageSyncLink(pos));
            return true;
        }
        return false;
    }

    /**
     * Called at the end of a player tick. This method ensures that half completed links are reset
     * if the player is no longer holding the wrench in their main hand.
     *
     * @param player the ticking player
     */
    public void onPlayerTick(Player player)
    {
        UUID id = player.getUUID();
        if(this.lastNodeMap.containsKey(id) && !player.getMainHandItem().is(ModItems.WRENCH.get()))
        {
            this.lastNodeMap.remove(id);
            Network.getPlay().sendToPlayer(() -> (ServerPlayer) player, new MessageSyncLink(null));
        }
    }

    /**
     * Called when a player logged out of the server. This handler ensure that half completed links
     * are reset if the player is no longer in the server.
     *
     * @param player the player that logged out
     */
    public void onPlayerLoggedOut(Player player)
    {
        this.lastNodeMap.remove(player.getUUID());
    }

    public interface Access
    {
        LinkManager refurbishedFurniture$GetLinkManager();
    }
}
