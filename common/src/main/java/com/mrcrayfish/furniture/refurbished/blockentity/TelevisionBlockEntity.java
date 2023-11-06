package com.mrcrayfish.furniture.refurbished.blockentity;

import com.google.common.base.Preconditions;
import com.mrcrayfish.furniture.refurbished.block.TelevisionBlock;
import com.mrcrayfish.furniture.refurbished.client.audio.AudioManager;
import com.mrcrayfish.furniture.refurbished.core.ModBlockEntities;
import com.mrcrayfish.furniture.refurbished.core.ModSounds;
import com.mrcrayfish.furniture.refurbished.network.Network;
import com.mrcrayfish.furniture.refurbished.network.message.MessageTelevisionChannel;
import com.mrcrayfish.furniture.refurbished.util.Utils;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.Vec3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Author: MrCrayfish
 */
public class TelevisionBlockEntity extends ElectricityModuleBlockEntity implements IAudioBlock
{
    public static final List<Channel> VIEWABLE_CHANNELS = List.of(HEART_SCREENSAVER, COLOUR_TEST);
    public static final Channel WHITE_NOISE = new Channel(Utils.resource("white_noise"), ModSounds.BLOCK_TELEVISION_CHANNEL_WHITE_NOISE::get, 0);
    public static final Channel HEART_SCREENSAVER = new Channel(Utils.resource("heart_screensaver"), () -> null, 10);
    public static final Channel COLOUR_TEST = new Channel(Utils.resource("colour_test"), ModSounds.BLOCK_TELEVISION_CHANNEL_COLOUR_TEST::get, 1);
    public static final List<Channel> ALL_CHANNELS = Util.make(new ArrayList<>(), channels -> {
        channels.add(WHITE_NOISE);
        channels.addAll(VIEWABLE_CHANNELS);
    });
    public static final Map<ResourceLocation, Channel> ID_TO_CHANNEL = ALL_CHANNELS.stream().collect(Collectors.toMap(c -> c.id, Function.identity()));
    public static final int TOTAL_CHANNEL_WEIGHT = VIEWABLE_CHANNELS.stream().mapToInt(Channel::weight).sum();
    public static final double MAX_AUDIO_DISTANCE = Mth.square(8);

    protected Channel currentChannel = COLOUR_TEST;
    protected boolean transitioning;

    public TelevisionBlockEntity(BlockPos $$1, BlockState $$2)
    {
        this(ModBlockEntities.TELEVISION.get(), $$1, $$2);
    }

    public TelevisionBlockEntity(BlockEntityType<?> $$0, BlockPos $$1, BlockState $$2)
    {
        super($$0, $$1, $$2);
    }

    public Channel getCurrentChannel()
    {
        return this.currentChannel;
    }

    @Override
    public SoundEvent getSound()
    {
        return this.currentChannel.sound().get();
    }

    @Override
    public BlockPos getAudioPosition()
    {
        return this.worldPosition;
    }

    @Override
    public Vec3 getAudioPositionOffset()
    {
        BlockState state = this.getBlockState();
        if(state.hasProperty(TelevisionBlock.DIRECTION))
        {
            Direction direction = state.getValue(TelevisionBlock.DIRECTION).getOpposite();
            Vec3i normal = direction.getNormal();
            return new Vec3(normal.getX() * 0.375, normal.getY(), normal.getZ() * 0.375);
        }
        return Vec3.ZERO;
    }

    @Override
    public boolean canPlayAudio()
    {
        return !this.isRemoved() && this.isPowered();
    }

    @Override
    public double getAudioRadiusSqr()
    {
        return MAX_AUDIO_DISTANCE;
    }

    @Override
    public boolean isPowered()
    {
        BlockState state = this.getBlockState();
        return state.hasProperty(BlockStateProperties.POWERED) && state.getValue(BlockStateProperties.POWERED);
    }

    @Override
    public void setPowered(boolean powered)
    {
        BlockState state = this.getBlockState();
        if(state.hasProperty(BlockStateProperties.POWERED))
        {
            this.level.setBlock(this.worldPosition, state.setValue(BlockStateProperties.POWERED, powered), Block.UPDATE_ALL);
        }
    }

    public void interact()
    {
        if(!this.transitioning)
        {
            Preconditions.checkState(this.level instanceof ServerLevel);
            int transitionTime = this.level.random.nextInt(5, 20);
            this.level.scheduleTick(this.worldPosition, this.getBlockState().getBlock(), transitionTime);
            this.setChannel(WHITE_NOISE);
            this.transitioning = true;
        }
    }

    public void selectRandomChannel()
    {
        Preconditions.checkState(this.level instanceof ServerLevel);
        int randomIndex = 0;
        for(int i = this.level.random.nextIntBetweenInclusive(0, TOTAL_CHANNEL_WEIGHT); randomIndex < VIEWABLE_CHANNELS.size() - 1; randomIndex++)
        {
            i -= VIEWABLE_CHANNELS.get(randomIndex).weight();
            if(i < 0) break;
        }
        this.setChannel(VIEWABLE_CHANNELS.get(randomIndex));
        this.transitioning = false;
    }

    private void setChannel(Channel channel)
    {
        Preconditions.checkNotNull(this.level);
        this.currentChannel = channel;
        if(!this.level.isClientSide())
        {
            Network.getPlay().sendToTrackingBlockEntity(() -> this, new MessageTelevisionChannel(this.worldPosition, channel.id));
        }
    }

    public void setChannelFromId(ResourceLocation id)
    {
        Channel channel = ID_TO_CHANNEL.get(id);
        if(channel != null)
        {
            this.setChannel(channel);
        }
    }

    public static void serverTick(Level level, BlockPos pos, BlockState state, TelevisionBlockEntity television)
    {
        ElectricityModuleBlockEntity.serverTick(level, pos, state, television);
    }

    public static void clientTick(Level level, BlockPos pos, BlockState state, TelevisionBlockEntity television)
    {
        SoundEvent sound = television.currentChannel.sound().get();
        if(sound != null)
        {
            AudioManager.get().playAudioBlock(television);
        }
    }

    @Override
    public void load(CompoundTag tag)
    {
        super.load(tag);
        if(tag.contains("CurrentChannel", Tag.TAG_STRING))
        {
            ResourceLocation id = ResourceLocation.tryParse(tag.getString("CurrentChannel"));
            if(id != null && !id.equals(WHITE_NOISE.id) && ID_TO_CHANNEL.containsKey(id))
            {
                this.currentChannel = ID_TO_CHANNEL.get(id);
            }
        }
    }

    @Override
    protected void saveAdditional(CompoundTag tag)
    {
        super.saveAdditional(tag);
        if(this.currentChannel != null && this.currentChannel != WHITE_NOISE)
        {
            tag.putString("CurrentChannel", this.currentChannel.id.toString());
        }
    }

    public record Channel(ResourceLocation id, Supplier<SoundEvent> sound, int weight) {}
}
