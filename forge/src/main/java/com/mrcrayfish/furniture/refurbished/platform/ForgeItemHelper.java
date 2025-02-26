package com.mrcrayfish.furniture.refurbished.platform;

import com.mrcrayfish.furniture.refurbished.platform.services.IItemHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.common.ForgeHooks;
import org.jetbrains.annotations.Nullable;

/**
 * Author: MrCrayfish
 */
public class ForgeItemHelper implements IItemHelper
{
    @Override
    public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> type)
    {
        return ForgeHooks.getBurnTime(stack, type);
    }
}
