package com.mrcrayfish.furniture.refurbished.client.gui.recipe;

import com.mrcrayfish.furniture.refurbished.crafting.FreezerSolidifyingRecipe;
import net.minecraft.client.gui.screens.recipebook.RecipeBookComponent;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeHolder;

import java.util.List;

/**
 * Author: MrCrayfish
 */
public class FreezerRecipeBookComponent extends RecipeBookComponent
{
    @Override
    public void setupGhostRecipe(RecipeHolder<?> holder, List<Slot> slots)
    {
        if(holder.value() instanceof FreezerSolidifyingRecipe solidifyingRecipe)
        {
            Slot inputSlot = slots.get(0);
            Slot resultSlot = slots.get(this.menu.getResultSlotIndex());
            ItemStack stack = solidifyingRecipe.getResultItem(this.minecraft.level.registryAccess());
            this.ghostRecipe.setRecipe(holder);
            this.ghostRecipe.addIngredient(Ingredient.of(stack), resultSlot.x, resultSlot.y);
            this.ghostRecipe.addIngredient(solidifyingRecipe.getIngredient(), inputSlot.x, inputSlot.y);
        }
    }
}