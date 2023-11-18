package com.mrcrayfish.furniture.refurbished.data;

import com.mrcrayfish.framework.Registration;
import com.mrcrayfish.furniture.refurbished.Constants;
import com.mrcrayfish.furniture.refurbished.block.DoorMatBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.DynamicLoot;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.CopyNameFunction;
import net.minecraft.world.level.storage.loot.functions.CopyNbtFunction;
import net.minecraft.world.level.storage.loot.functions.SetContainerContents;
import net.minecraft.world.level.storage.loot.providers.nbt.ContextNbtProvider;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

/**
 * Author: MrCrayfish
 */
public class CommonLootTableProvider
{
    public static class Block
    {
        public static void accept(LootBuilder.Block builder)
        {
            // TODO system to customise instead of dropping self
            Registration.get(Registries.BLOCK).stream().filter(entry -> entry.getId().getNamespace().equals(Constants.MOD_ID)).forEach(entry -> {
                net.minecraft.world.level.block.Block block = (net.minecraft.world.level.block.Block) entry.get();
                if(block instanceof DoorMatBlock) {
                    builder.custom(block, createDoorMatLootPool(block));
                } else {
                    builder.self(block);
                }
            });
        }

        private static LootPool.Builder createDoorMatLootPool(net.minecraft.world.level.block.Block block)
        {
            return LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(block).apply(CopyNbtFunction.copyData(ContextNbtProvider.BLOCK_ENTITY).copy("Image", "BlockEntityTag.Image").copy("Finalised", "BlockEntityTag.Finalised")));
        }
    }

    public static class Entity
    {
        public static void accept(LootBuilder.Entity builder)
        {
            //builder.add(EntityType.ALLAY, LootTable.lootTable());
        }
    }
}
