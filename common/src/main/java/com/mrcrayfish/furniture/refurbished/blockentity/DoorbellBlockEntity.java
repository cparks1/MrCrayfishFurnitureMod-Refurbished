package com.mrcrayfish.furniture.refurbished.blockentity;

import com.mrcrayfish.furniture.refurbished.core.ModBlockEntities;
import com.mrcrayfish.furniture.refurbished.network.Network;
import com.mrcrayfish.furniture.refurbished.network.message.MessageDoorbellNotification;
import com.mrcrayfish.furniture.refurbished.util.BlockEntityHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;

import org.jetbrains.annotations.Nullable;
import java.util.UUID;

/**
 * Author: MrCrayfish
 */
public class DoorbellBlockEntity extends ElectricityModuleBlockEntity implements INameable
{
    public static final int MAX_NAME_LENGTH = 32;

    protected UUID owner;
    protected String customName = "";
    protected long lastPressedTime;
    protected boolean powered;

    public DoorbellBlockEntity(BlockPos pos, BlockState state)
    {
        super(ModBlockEntities.DOORBELL.get(), pos, state);
    }

    public void setOwner(UUID owner)
    {
        this.owner = owner;
        this.setChanged();
    }

    @Override
    public boolean isNodePowered()
    {
        return this.powered;
    }

    @Override
    public void setNodePowered(boolean powered)
    {
        this.powered = powered;
        this.setChanged();

        // Sync the state to the client
        if(!this.level.isClientSide())
        {
            BlockEntityHelper.sendCustomUpdate(this, (entity, access) -> {
                CompoundTag compound = new CompoundTag();
                compound.putBoolean("Powered", powered);
                return compound;
            });
        }
    }

    @Override
    public void setName(@Nullable ServerPlayer player, String name)
    {
        if(this.owner == null || player == null)
            return;

        if(!this.owner.equals(player.getUUID()))
            return;

        if(!name.isBlank() && name.length() <= MAX_NAME_LENGTH)
        {
            this.customName = name;
            this.setChanged();
        }
    }

    public void sendNotificationToOwner(@Nullable Player presser)
    {
        if(this.level instanceof ServerLevel level && this.owner != null)
        {
            MinecraftServer server = level.getServer();
            ServerPlayer player = server.getPlayerList().getPlayer(this.owner);
            if(player == null || (level.getGameTime() - this.lastPressedTime) < 600L)
                return;

            if(presser != null && presser.equals(player))
                return;

            Network.getPlay().sendToPlayer(() -> player, new MessageDoorbellNotification(this.customName));
            this.lastPressedTime = level.getGameTime();
        }
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider provider)
    {
        super.loadAdditional(tag, provider);
        if(tag.contains("Owner", Tag.TAG_INT_ARRAY))
        {
            this.owner = tag.getUUID("Owner");
        }
        if(tag.contains("CustomName", Tag.TAG_STRING))
        {
            this.customName = tag.getString("CustomName");
        }
        if(tag.contains("Powered", Tag.TAG_BYTE))
        {
            this.powered = tag.getBoolean("Powered");
        }
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider provider)
    {
        super.saveAdditional(tag, provider);
        if(this.owner != null)
        {
            tag.putUUID("Owner", this.owner);
        }
        tag.putBoolean("Powered", this.powered);
        tag.putString("CustomName", this.customName);
    }
}
