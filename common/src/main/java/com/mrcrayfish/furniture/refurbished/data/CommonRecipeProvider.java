package com.mrcrayfish.furniture.refurbished.data;

import com.mrcrayfish.furniture.refurbished.core.ModBlocks;
import com.mrcrayfish.furniture.refurbished.core.ModRecipeSerializers;
import com.mrcrayfish.furniture.refurbished.core.ModTags;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Author: MrCrayfish
 */
public class CommonRecipeProvider
{
    private final Consumer<FinishedRecipe> consumer;
    private final Function<ItemLike, CriterionTriggerInstance> has;

    public CommonRecipeProvider(Consumer<FinishedRecipe> consumer, Function<ItemLike, CriterionTriggerInstance> has)
    {
        this.consumer = consumer;
        this.has = has;
    }

    public void run()
    {
        this.table(Blocks.OAK_PLANKS, ModBlocks.TABLE_OAK.get());
        this.table(Blocks.SPRUCE_PLANKS, ModBlocks.TABLE_SPRUCE.get());
        this.table(Blocks.BIRCH_PLANKS, ModBlocks.TABLE_BIRCH.get());
        this.table(Blocks.JUNGLE_PLANKS, ModBlocks.TABLE_JUNGLE.get());
        this.table(Blocks.ACACIA_PLANKS, ModBlocks.TABLE_ACACIA.get());
        this.table(Blocks.DARK_OAK_PLANKS, ModBlocks.TABLE_DARK_OAK.get());
        this.table(Blocks.MANGROVE_PLANKS, ModBlocks.TABLE_MANGROVE.get());
        this.table(Blocks.CHERRY_PLANKS, ModBlocks.TABLE_CHERRY.get());
        this.table(Blocks.CRIMSON_PLANKS, ModBlocks.TABLE_CRIMSON.get());
        this.table(Blocks.WARPED_PLANKS, ModBlocks.TABLE_WARPED.get());
        this.chair(Blocks.OAK_PLANKS, ModBlocks.CHAIR_OAK.get());
        this.chair(Blocks.SPRUCE_PLANKS, ModBlocks.CHAIR_SPRUCE.get());
        this.chair(Blocks.BIRCH_PLANKS, ModBlocks.CHAIR_BIRCH.get());
        this.chair(Blocks.JUNGLE_PLANKS, ModBlocks.CHAIR_JUNGLE.get());
        this.chair(Blocks.ACACIA_PLANKS, ModBlocks.CHAIR_ACACIA.get());
        this.chair(Blocks.DARK_OAK_PLANKS, ModBlocks.CHAIR_DARK_OAK.get());
        this.chair(Blocks.MANGROVE_PLANKS, ModBlocks.CHAIR_MANGROVE.get());
        this.chair(Blocks.CHERRY_PLANKS, ModBlocks.CHAIR_CHERRY.get());
        this.chair(Blocks.CRIMSON_PLANKS, ModBlocks.CHAIR_CRIMSON.get());
        this.chair(Blocks.WARPED_PLANKS, ModBlocks.CHAIR_WARPED.get());
        this.desk(Blocks.OAK_PLANKS, ModBlocks.DESK_OAK.get());
        this.desk(Blocks.SPRUCE_PLANKS, ModBlocks.DESK_SPRUCE.get());
        this.desk(Blocks.BIRCH_PLANKS, ModBlocks.DESK_BIRCH.get());
        this.desk(Blocks.JUNGLE_PLANKS, ModBlocks.DESK_JUNGLE.get());
        this.desk(Blocks.ACACIA_PLANKS, ModBlocks.DESK_ACACIA.get());
        this.desk(Blocks.DARK_OAK_PLANKS, ModBlocks.DESK_DARK_OAK.get());
        this.desk(Blocks.MANGROVE_PLANKS, ModBlocks.DESK_MANGROVE.get());
        this.desk(Blocks.CHERRY_PLANKS, ModBlocks.DESK_CHERRY.get());
        this.desk(Blocks.CRIMSON_PLANKS, ModBlocks.DESK_CRIMSON.get());
        this.desk(Blocks.WARPED_PLANKS, ModBlocks.DESK_WARPED.get());
        this.drawer(Blocks.OAK_PLANKS, Blocks.OAK_SLAB, ModBlocks.DRAWER_OAK.get());
        this.drawer(Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB, ModBlocks.DRAWER_SPRUCE.get());
        this.drawer(Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB, ModBlocks.DRAWER_BIRCH.get());
        this.drawer(Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB, ModBlocks.DRAWER_JUNGLE.get());
        this.drawer(Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB, ModBlocks.DRAWER_ACACIA.get());
        this.drawer(Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB, ModBlocks.DRAWER_DARK_OAK.get());
        this.drawer(Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB, ModBlocks.DRAWER_MANGROVE.get());
        this.drawer(Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB, ModBlocks.DRAWER_CHERRY.get());
        this.drawer(Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_SLAB, ModBlocks.DRAWER_CRIMSON.get());
        this.drawer(Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB, ModBlocks.DRAWER_WARPED.get());
        this.woodenKitchenCabinetry(Blocks.OAK_PLANKS, Blocks.OAK_SLAB, ModBlocks.KITCHEN_CABINETRY_OAK.get());
        this.woodenKitchenCabinetry(Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB, ModBlocks.KITCHEN_CABINETRY_SPRUCE.get());
        this.woodenKitchenCabinetry(Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB, ModBlocks.KITCHEN_CABINETRY_BIRCH.get());
        this.woodenKitchenCabinetry(Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB, ModBlocks.KITCHEN_CABINETRY_JUNGLE.get());
        this.woodenKitchenCabinetry(Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB, ModBlocks.KITCHEN_CABINETRY_ACACIA.get());
        this.woodenKitchenCabinetry(Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB, ModBlocks.KITCHEN_CABINETRY_DARK_OAK.get());
        this.woodenKitchenCabinetry(Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB, ModBlocks.KITCHEN_CABINETRY_MANGROVE.get());
        this.woodenKitchenCabinetry(Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB, ModBlocks.KITCHEN_CABINETRY_CHERRY.get());
        this.woodenKitchenCabinetry(Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_SLAB, ModBlocks.KITCHEN_CABINETRY_CRIMSON.get());
        this.woodenKitchenCabinetry(Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB, ModBlocks.KITCHEN_CABINETRY_WARPED.get());
        this.woodenKitchenDrawer(Blocks.OAK_PLANKS, Blocks.OAK_SLAB, ModBlocks.KITCHEN_DRAWER_OAK.get());
        this.woodenKitchenDrawer(Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB, ModBlocks.KITCHEN_DRAWER_SPRUCE.get());
        this.woodenKitchenDrawer(Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB, ModBlocks.KITCHEN_DRAWER_BIRCH.get());
        this.woodenKitchenDrawer(Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB, ModBlocks.KITCHEN_DRAWER_JUNGLE.get());
        this.woodenKitchenDrawer(Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB, ModBlocks.KITCHEN_DRAWER_ACACIA.get());
        this.woodenKitchenDrawer(Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB, ModBlocks.KITCHEN_DRAWER_DARK_OAK.get());
        this.woodenKitchenDrawer(Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB, ModBlocks.KITCHEN_DRAWER_MANGROVE.get());
        this.woodenKitchenDrawer(Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB, ModBlocks.KITCHEN_DRAWER_CHERRY.get());
        this.woodenKitchenDrawer(Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_SLAB, ModBlocks.KITCHEN_DRAWER_CRIMSON.get());
        this.woodenKitchenDrawer(Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB, ModBlocks.KITCHEN_DRAWER_WARPED.get());
        this.woodenKitchenSink(Blocks.OAK_PLANKS, Blocks.OAK_SLAB, ModBlocks.KITCHEN_SINK_OAK.get());
        this.woodenKitchenSink(Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB, ModBlocks.KITCHEN_SINK_SPRUCE.get());
        this.woodenKitchenSink(Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB, ModBlocks.KITCHEN_SINK_BIRCH.get());
        this.woodenKitchenSink(Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB, ModBlocks.KITCHEN_SINK_JUNGLE.get());
        this.woodenKitchenSink(Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB, ModBlocks.KITCHEN_SINK_ACACIA.get());
        this.woodenKitchenSink(Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB, ModBlocks.KITCHEN_SINK_DARK_OAK.get());
        this.woodenKitchenSink(Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB, ModBlocks.KITCHEN_SINK_MANGROVE.get());
        this.woodenKitchenSink(Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB, ModBlocks.KITCHEN_SINK_CHERRY.get());
        this.woodenKitchenSink(Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_SLAB, ModBlocks.KITCHEN_SINK_CRIMSON.get());
        this.woodenKitchenSink(Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB, ModBlocks.KITCHEN_SINK_WARPED.get());
        this.woodenKitchenStorageCabinet(Blocks.OAK_PLANKS, Blocks.OAK_SLAB, ModBlocks.KITCHEN_STORAGE_CABINET_OAK.get());
        this.woodenKitchenStorageCabinet(Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB, ModBlocks.KITCHEN_STORAGE_CABINET_SPRUCE.get());
        this.woodenKitchenStorageCabinet(Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB, ModBlocks.KITCHEN_STORAGE_CABINET_BIRCH.get());
        this.woodenKitchenStorageCabinet(Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB, ModBlocks.KITCHEN_STORAGE_CABINET_JUNGLE.get());
        this.woodenKitchenStorageCabinet(Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB, ModBlocks.KITCHEN_STORAGE_CABINET_ACACIA.get());
        this.woodenKitchenStorageCabinet(Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB, ModBlocks.KITCHEN_STORAGE_CABINET_DARK_OAK.get());
        this.woodenKitchenStorageCabinet(Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB, ModBlocks.KITCHEN_STORAGE_CABINET_MANGROVE.get());
        this.woodenKitchenStorageCabinet(Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB, ModBlocks.KITCHEN_STORAGE_CABINET_CHERRY.get());
        this.woodenKitchenStorageCabinet(Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_SLAB, ModBlocks.KITCHEN_STORAGE_CABINET_CRIMSON.get());
        this.woodenKitchenStorageCabinet(Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB, ModBlocks.KITCHEN_STORAGE_CABINET_WARPED.get());
        this.colouredKitchenCabinetry(Items.WHITE_DYE, ModBlocks.KITCHEN_CABINETRY_WHITE.get());
        this.colouredKitchenCabinetry(Items.ORANGE_DYE, ModBlocks.KITCHEN_CABINETRY_ORANGE.get());
        this.colouredKitchenCabinetry(Items.MAGENTA_DYE, ModBlocks.KITCHEN_CABINETRY_MAGENTA.get());
        this.colouredKitchenCabinetry(Items.LIGHT_BLUE_DYE, ModBlocks.KITCHEN_CABINETRY_LIGHT_BLUE.get());
        this.colouredKitchenCabinetry(Items.YELLOW_DYE, ModBlocks.KITCHEN_CABINETRY_YELLOW.get());
        this.colouredKitchenCabinetry(Items.LIME_DYE, ModBlocks.KITCHEN_CABINETRY_LIME.get());
        this.colouredKitchenCabinetry(Items.PINK_DYE, ModBlocks.KITCHEN_CABINETRY_PINK.get());
        this.colouredKitchenCabinetry(Items.GRAY_DYE, ModBlocks.KITCHEN_CABINETRY_GRAY.get());
        this.colouredKitchenCabinetry(Items.LIGHT_GRAY_DYE, ModBlocks.KITCHEN_CABINETRY_LIGHT_GRAY.get());
        this.colouredKitchenCabinetry(Items.CYAN_DYE, ModBlocks.KITCHEN_CABINETRY_CYAN.get());
        this.colouredKitchenCabinetry(Items.PURPLE_DYE, ModBlocks.KITCHEN_CABINETRY_PURPLE.get());
        this.colouredKitchenCabinetry(Items.BLUE_DYE, ModBlocks.KITCHEN_CABINETRY_BLUE.get());
        this.colouredKitchenCabinetry(Items.BROWN_DYE, ModBlocks.KITCHEN_CABINETRY_BROWN.get());
        this.colouredKitchenCabinetry(Items.GREEN_DYE, ModBlocks.KITCHEN_CABINETRY_GREEN.get());
        this.colouredKitchenCabinetry(Items.RED_DYE, ModBlocks.KITCHEN_CABINETRY_RED.get());
        this.colouredKitchenCabinetry(Items.BLACK_DYE, ModBlocks.KITCHEN_CABINETRY_BLACK.get());
        this.colouredKitchenDrawer(Items.WHITE_DYE, ModBlocks.KITCHEN_DRAWER_WHITE.get());
        this.colouredKitchenDrawer(Items.ORANGE_DYE, ModBlocks.KITCHEN_DRAWER_ORANGE.get());
        this.colouredKitchenDrawer(Items.MAGENTA_DYE, ModBlocks.KITCHEN_DRAWER_MAGENTA.get());
        this.colouredKitchenDrawer(Items.LIGHT_BLUE_DYE, ModBlocks.KITCHEN_DRAWER_LIGHT_BLUE.get());
        this.colouredKitchenDrawer(Items.YELLOW_DYE, ModBlocks.KITCHEN_DRAWER_YELLOW.get());
        this.colouredKitchenDrawer(Items.LIME_DYE, ModBlocks.KITCHEN_DRAWER_LIME.get());
        this.colouredKitchenDrawer(Items.PINK_DYE, ModBlocks.KITCHEN_DRAWER_PINK.get());
        this.colouredKitchenDrawer(Items.GRAY_DYE, ModBlocks.KITCHEN_DRAWER_GRAY.get());
        this.colouredKitchenDrawer(Items.LIGHT_GRAY_DYE, ModBlocks.KITCHEN_DRAWER_LIGHT_GRAY.get());
        this.colouredKitchenDrawer(Items.CYAN_DYE, ModBlocks.KITCHEN_DRAWER_CYAN.get());
        this.colouredKitchenDrawer(Items.PURPLE_DYE, ModBlocks.KITCHEN_DRAWER_PURPLE.get());
        this.colouredKitchenDrawer(Items.BLUE_DYE, ModBlocks.KITCHEN_DRAWER_BLUE.get());
        this.colouredKitchenDrawer(Items.BROWN_DYE, ModBlocks.KITCHEN_DRAWER_BROWN.get());
        this.colouredKitchenDrawer(Items.GREEN_DYE, ModBlocks.KITCHEN_DRAWER_GREEN.get());
        this.colouredKitchenDrawer(Items.RED_DYE, ModBlocks.KITCHEN_DRAWER_RED.get());
        this.colouredKitchenDrawer(Items.BLACK_DYE, ModBlocks.KITCHEN_DRAWER_BLACK.get());
        this.colouredKitchenSink(Items.WHITE_DYE, ModBlocks.KITCHEN_SINK_WHITE.get());
        this.colouredKitchenSink(Items.ORANGE_DYE, ModBlocks.KITCHEN_SINK_ORANGE.get());
        this.colouredKitchenSink(Items.MAGENTA_DYE, ModBlocks.KITCHEN_SINK_MAGENTA.get());
        this.colouredKitchenSink(Items.LIGHT_BLUE_DYE, ModBlocks.KITCHEN_SINK_LIGHT_BLUE.get());
        this.colouredKitchenSink(Items.YELLOW_DYE, ModBlocks.KITCHEN_SINK_YELLOW.get());
        this.colouredKitchenSink(Items.LIME_DYE, ModBlocks.KITCHEN_SINK_LIME.get());
        this.colouredKitchenSink(Items.PINK_DYE, ModBlocks.KITCHEN_SINK_PINK.get());
        this.colouredKitchenSink(Items.GRAY_DYE, ModBlocks.KITCHEN_SINK_GRAY.get());
        this.colouredKitchenSink(Items.LIGHT_GRAY_DYE, ModBlocks.KITCHEN_SINK_LIGHT_GRAY.get());
        this.colouredKitchenSink(Items.CYAN_DYE, ModBlocks.KITCHEN_SINK_CYAN.get());
        this.colouredKitchenSink(Items.PURPLE_DYE, ModBlocks.KITCHEN_SINK_PURPLE.get());
        this.colouredKitchenSink(Items.BLUE_DYE, ModBlocks.KITCHEN_SINK_BLUE.get());
        this.colouredKitchenSink(Items.BROWN_DYE, ModBlocks.KITCHEN_SINK_BROWN.get());
        this.colouredKitchenSink(Items.GREEN_DYE, ModBlocks.KITCHEN_SINK_GREEN.get());
        this.colouredKitchenSink(Items.RED_DYE, ModBlocks.KITCHEN_SINK_RED.get());
        this.colouredKitchenSink(Items.BLACK_DYE, ModBlocks.KITCHEN_SINK_BLACK.get());
        this.colouredKitchenStorageCabinet(Items.WHITE_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_WHITE.get());
        this.colouredKitchenStorageCabinet(Items.ORANGE_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_ORANGE.get());
        this.colouredKitchenStorageCabinet(Items.MAGENTA_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_MAGENTA.get());
        this.colouredKitchenStorageCabinet(Items.LIGHT_BLUE_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_LIGHT_BLUE.get());
        this.colouredKitchenStorageCabinet(Items.YELLOW_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_YELLOW.get());
        this.colouredKitchenStorageCabinet(Items.LIME_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_LIME.get());
        this.colouredKitchenStorageCabinet(Items.PINK_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_PINK.get());
        this.colouredKitchenStorageCabinet(Items.GRAY_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_GRAY.get());
        this.colouredKitchenStorageCabinet(Items.LIGHT_GRAY_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_LIGHT_GRAY.get());
        this.colouredKitchenStorageCabinet(Items.CYAN_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_CYAN.get());
        this.colouredKitchenStorageCabinet(Items.PURPLE_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_PURPLE.get());
        this.colouredKitchenStorageCabinet(Items.BLUE_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_BLUE.get());
        this.colouredKitchenStorageCabinet(Items.BROWN_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_BROWN.get());
        this.colouredKitchenStorageCabinet(Items.GREEN_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_GREEN.get());
        this.colouredKitchenStorageCabinet(Items.RED_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_RED.get());
        this.colouredKitchenStorageCabinet(Items.BLACK_DYE, ModBlocks.KITCHEN_STORAGE_CABINET_BLACK.get());
        this.toaster(ModBlocks.TOASTER_LIGHT.get(), ModBlocks.TOASTER_DARK.get());
        this.microwave(ModBlocks.MICROWAVE_LIGHT.get(), ModBlocks.MICROWAVE_DARK.get());
        this.stove(ModBlocks.STOVE_LIGHT.get(), ModBlocks.STOVE_DARK.get());
        this.rangeHood(ModBlocks.RANGE_HOOD_LIGHT.get(), ModBlocks.RANGE_HOOD_DARK.get());
        this.fryingPan(ModBlocks.FRYING_PAN.get());
        this.recyclingBin(ModBlocks.RECYCLE_BIN.get());
        this.cuttingBoard(Blocks.OAK_PLANKS, Blocks.OAK_SLAB, ModBlocks.CUTTING_BOARD_OAK.get());
        this.cuttingBoard(Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB, ModBlocks.CUTTING_BOARD_SPRUCE.get());
        this.cuttingBoard(Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB, ModBlocks.CUTTING_BOARD_BIRCH.get());
        this.cuttingBoard(Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB, ModBlocks.CUTTING_BOARD_JUNGLE.get());
        this.cuttingBoard(Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB, ModBlocks.CUTTING_BOARD_ACACIA.get());
        this.cuttingBoard(Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB, ModBlocks.CUTTING_BOARD_DARK_OAK.get());
        this.cuttingBoard(Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB, ModBlocks.CUTTING_BOARD_MANGROVE.get());
        this.cuttingBoard(Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB, ModBlocks.CUTTING_BOARD_CHERRY.get());
        this.cuttingBoard(Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_SLAB, ModBlocks.CUTTING_BOARD_CRIMSON.get());
        this.cuttingBoard(Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB, ModBlocks.CUTTING_BOARD_WARPED.get());
        this.plate(ModBlocks.PLATE.get());
        this.crate(Blocks.OAK_PLANKS, ModBlocks.CRATE_OAK.get());
        this.crate(Blocks.SPRUCE_PLANKS, ModBlocks.CRATE_SPRUCE.get());
        this.crate(Blocks.BIRCH_PLANKS, ModBlocks.CRATE_BIRCH.get());
        this.crate(Blocks.JUNGLE_PLANKS, ModBlocks.CRATE_JUNGLE.get());
        this.crate(Blocks.ACACIA_PLANKS, ModBlocks.CRATE_ACACIA.get());
        this.crate(Blocks.DARK_OAK_PLANKS, ModBlocks.CRATE_DARK_OAK.get());
        this.crate(Blocks.MANGROVE_PLANKS, ModBlocks.CRATE_MANGROVE.get());
        this.crate(Blocks.CHERRY_PLANKS, ModBlocks.CRATE_CHERRY.get());
        this.crate(Blocks.CRIMSON_PLANKS, ModBlocks.CRATE_CRIMSON.get());
        this.crate(Blocks.WARPED_PLANKS, ModBlocks.CRATE_WARPED.get());
        this.grill(Items.WHITE_DYE, ModBlocks.GRILL_WHITE.get());
        this.grill(Items.ORANGE_DYE, ModBlocks.GRILL_ORANGE.get());
        this.grill(Items.MAGENTA_DYE, ModBlocks.GRILL_MAGENTA.get());
        this.grill(Items.LIGHT_BLUE_DYE, ModBlocks.GRILL_LIGHT_BLUE.get());
        this.grill(Items.YELLOW_DYE, ModBlocks.GRILL_YELLOW.get());
        this.grill(Items.LIME_DYE, ModBlocks.GRILL_LIME.get());
        this.grill(Items.PINK_DYE, ModBlocks.GRILL_PINK.get());
        this.grill(Items.GRAY_DYE, ModBlocks.GRILL_GRAY.get());
        this.grill(Items.LIGHT_GRAY_DYE, ModBlocks.GRILL_LIGHT_GRAY.get());
        this.grill(Items.CYAN_DYE, ModBlocks.GRILL_CYAN.get());
        this.grill(Items.PURPLE_DYE, ModBlocks.GRILL_PURPLE.get());
        this.grill(Items.BLUE_DYE, ModBlocks.GRILL_BLUE.get());
        this.grill(Items.BROWN_DYE, ModBlocks.GRILL_BROWN.get());
        this.grill(Items.GREEN_DYE, ModBlocks.GRILL_GREEN.get());
        this.grill(Items.RED_DYE, ModBlocks.GRILL_RED.get());
        this.grill(Items.BLACK_DYE, ModBlocks.GRILL_BLACK.get());
        this.mailbox(Blocks.OAK_SLAB, Blocks.OAK_PLANKS, Blocks.OAK_FENCE, ModBlocks.MAIL_BOX_OAK.get());
        this.mailbox(Blocks.SPRUCE_SLAB, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_FENCE, ModBlocks.MAIL_BOX_SPRUCE.get());
        this.mailbox(Blocks.BIRCH_SLAB, Blocks.BIRCH_PLANKS, Blocks.BIRCH_FENCE, ModBlocks.MAIL_BOX_BIRCH.get());
        this.mailbox(Blocks.JUNGLE_SLAB, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_FENCE, ModBlocks.MAIL_BOX_JUNGLE.get());
        this.mailbox(Blocks.ACACIA_SLAB, Blocks.ACACIA_PLANKS, Blocks.ACACIA_FENCE, ModBlocks.MAIL_BOX_ACACIA.get());
        this.mailbox(Blocks.DARK_OAK_SLAB, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_FENCE, ModBlocks.MAIL_BOX_DARK_OAK.get());
        this.mailbox(Blocks.MANGROVE_SLAB, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_FENCE, ModBlocks.MAIL_BOX_MANGROVE.get());
        this.mailbox(Blocks.CHERRY_SLAB, Blocks.CHERRY_PLANKS, Blocks.CHERRY_FENCE, ModBlocks.MAIL_BOX_CHERRY.get());
        this.mailbox(Blocks.CRIMSON_SLAB, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_FENCE, ModBlocks.MAIL_BOX_CRIMSON.get());
        this.mailbox(Blocks.WARPED_SLAB, Blocks.WARPED_PLANKS, Blocks.WARPED_FENCE, ModBlocks.MAIL_BOX_WARPED.get());
        this.postBox(ModBlocks.POST_BOX.get());
        this.grillCooking(Items.BEEF, Items.COOKED_BEEF, 200, 0.5F);
        this.grillCooking(Items.CHICKEN, Items.COOKED_CHICKEN, 200, 0.5F);
        this.grillCooking(Items.COD, Items.COOKED_COD, 200, 0.5F);
        this.grillCooking(Items.KELP, Items.DRIED_KELP, 200, 0.25F);
        this.grillCooking(Items.SALMON, Items.COOKED_SALMON, 200, 0.5F);
        this.grillCooking(Items.MUTTON, Items.COOKED_MUTTON, 200, 0.5F);
        this.grillCooking(Items.PORKCHOP, Items.COOKED_PORKCHOP, 200, 0.5F);
        this.grillCooking(Items.POTATO, Items.BAKED_POTATO, 200, 0.5F);
        this.grillCooking(Items.RABBIT, Items.COOKED_RABBIT, 200, 0.5F);
        this.freezerSolidifying(Items.WATER_BUCKET, Items.ICE, 300, 1.0F);
        this.toasterHeating(Items.POTATO, Items.BAKED_POTATO, 100, 0.5F);
        this.cuttingBoardSlicing(Blocks.MELON, Items.MELON_SLICE, 6);
        this.cuttingBoardSlicing(Items.APPLE, Items.DIAMOND, 8);
        this.microwaveHeating(Items.POTATO, Items.BAKED_POTATO, 200, 0.5F);
        this.fryingPanCooking(Items.BEEF, Items.COOKED_BEEF, 200, 0.5F);

        // Recycling
        this.recycleBinSalvaging(Items.OAK_STAIRS, Items.OAK_PLANKS, 1);
        this.recycleBinSalvaging(Items.OAK_FENCE, Items.OAK_PLANKS, 1);
        this.recycleBinSalvaging(Items.OAK_FENCE_GATE, Items.OAK_PLANKS, 1);
        this.recycleBinSalvaging(Items.OAK_FENCE_GATE, Items.STICK, 2);
        this.recycleBinSalvaging(Items.OAK_TRAPDOOR, Items.OAK_PLANKS, 2);
        this.recycleBinSalvaging(Items.OAK_PRESSURE_PLATE, Items.OAK_PLANKS, 1);
        this.recycleBinSalvaging(Items.SPRUCE_STAIRS, Items.SPRUCE_PLANKS, 1);
        this.recycleBinSalvaging(Items.SPRUCE_FENCE, Items.SPRUCE_PLANKS, 1);
        this.recycleBinSalvaging(Items.SPRUCE_FENCE_GATE, Items.SPRUCE_PLANKS, 1);
        this.recycleBinSalvaging(Items.SPRUCE_FENCE_GATE, Items.STICK, 2);
        this.recycleBinSalvaging(Items.SPRUCE_TRAPDOOR, Items.SPRUCE_PLANKS, 2);
        this.recycleBinSalvaging(Items.SPRUCE_PRESSURE_PLATE, Items.SPRUCE_PLANKS, 1);
        this.recycleBinSalvaging(Items.BIRCH_STAIRS, Items.BIRCH_PLANKS, 1);
        this.recycleBinSalvaging(Items.BIRCH_FENCE, Items.BIRCH_PLANKS, 1);
        this.recycleBinSalvaging(Items.BIRCH_FENCE_GATE, Items.BIRCH_PLANKS, 1);
        this.recycleBinSalvaging(Items.BIRCH_FENCE_GATE, Items.STICK, 2);
        this.recycleBinSalvaging(Items.BIRCH_TRAPDOOR, Items.BIRCH_PLANKS, 2);
        this.recycleBinSalvaging(Items.BIRCH_PRESSURE_PLATE, Items.BIRCH_PLANKS, 1);
        this.recycleBinSalvaging(Items.JUNGLE_STAIRS, Items.JUNGLE_PLANKS, 1);
        this.recycleBinSalvaging(Items.JUNGLE_FENCE, Items.JUNGLE_PLANKS, 1);
        this.recycleBinSalvaging(Items.JUNGLE_FENCE_GATE, Items.JUNGLE_PLANKS, 1);
        this.recycleBinSalvaging(Items.JUNGLE_FENCE_GATE, Items.STICK, 2);
        this.recycleBinSalvaging(Items.JUNGLE_TRAPDOOR, Items.JUNGLE_PLANKS, 2);
        this.recycleBinSalvaging(Items.JUNGLE_PRESSURE_PLATE, Items.JUNGLE_PLANKS, 1);
        this.recycleBinSalvaging(Items.ACACIA_STAIRS, Items.ACACIA_PLANKS, 1);
        this.recycleBinSalvaging(Items.ACACIA_FENCE, Items.ACACIA_PLANKS, 1);
        this.recycleBinSalvaging(Items.ACACIA_FENCE_GATE, Items.ACACIA_PLANKS, 1);
        this.recycleBinSalvaging(Items.ACACIA_FENCE_GATE, Items.STICK, 2);
        this.recycleBinSalvaging(Items.ACACIA_TRAPDOOR, Items.ACACIA_PLANKS, 2);
        this.recycleBinSalvaging(Items.ACACIA_PRESSURE_PLATE, Items.ACACIA_PLANKS, 1);
        this.recycleBinSalvaging(Items.DARK_OAK_STAIRS, Items.DARK_OAK_PLANKS, 1);
        this.recycleBinSalvaging(Items.DARK_OAK_FENCE, Items.DARK_OAK_PLANKS, 1);
        this.recycleBinSalvaging(Items.DARK_OAK_FENCE_GATE, Items.DARK_OAK_PLANKS, 1);
        this.recycleBinSalvaging(Items.DARK_OAK_FENCE_GATE, Items.STICK, 2);
        this.recycleBinSalvaging(Items.DARK_OAK_TRAPDOOR, Items.DARK_OAK_PLANKS, 2);
        this.recycleBinSalvaging(Items.DARK_OAK_PRESSURE_PLATE, Items.DARK_OAK_PLANKS, 1);
        this.recycleBinSalvaging(Items.MANGROVE_STAIRS, Items.MANGROVE_PLANKS, 1);
        this.recycleBinSalvaging(Items.MANGROVE_FENCE, Items.MANGROVE_PLANKS, 1);
        this.recycleBinSalvaging(Items.MANGROVE_FENCE_GATE, Items.MANGROVE_PLANKS, 1);
        this.recycleBinSalvaging(Items.MANGROVE_FENCE_GATE, Items.STICK, 2);
        this.recycleBinSalvaging(Items.MANGROVE_TRAPDOOR, Items.MANGROVE_PLANKS, 2);
        this.recycleBinSalvaging(Items.MANGROVE_PRESSURE_PLATE, Items.MANGROVE_PLANKS, 1);
        this.recycleBinSalvaging(Items.CHERRY_STAIRS, Items.CHERRY_PLANKS, 1);
        this.recycleBinSalvaging(Items.CHERRY_FENCE, Items.CHERRY_PLANKS, 1);
        this.recycleBinSalvaging(Items.CHERRY_FENCE_GATE, Items.CHERRY_PLANKS, 1);
        this.recycleBinSalvaging(Items.CHERRY_FENCE_GATE, Items.STICK, 2);
        this.recycleBinSalvaging(Items.CHERRY_TRAPDOOR, Items.CHERRY_PLANKS, 2);
        this.recycleBinSalvaging(Items.CHERRY_PRESSURE_PLATE, Items.CHERRY_PLANKS, 1);
        this.recycleBinSalvaging(Items.BAMBOO_STAIRS, Items.BAMBOO_PLANKS, 1);
        this.recycleBinSalvaging(Items.BAMBOO_FENCE, Items.BAMBOO_PLANKS, 1);
        this.recycleBinSalvaging(Items.BAMBOO_FENCE_GATE, Items.BAMBOO_PLANKS, 1);
        this.recycleBinSalvaging(Items.BAMBOO_FENCE_GATE, Items.STICK, 2);
        this.recycleBinSalvaging(Items.BAMBOO_TRAPDOOR, Items.BAMBOO_PLANKS, 2);
        this.recycleBinSalvaging(Items.BAMBOO_PRESSURE_PLATE, Items.BAMBOO_PLANKS, 1);
        this.recycleBinSalvaging(Items.CRIMSON_STAIRS, Items.CRIMSON_PLANKS, 1);
        this.recycleBinSalvaging(Items.CRIMSON_FENCE, Items.CRIMSON_PLANKS, 1);
        this.recycleBinSalvaging(Items.CRIMSON_FENCE_GATE, Items.CRIMSON_PLANKS, 1);
        this.recycleBinSalvaging(Items.CRIMSON_FENCE_GATE, Items.STICK, 2);
        this.recycleBinSalvaging(Items.CRIMSON_TRAPDOOR, Items.CRIMSON_PLANKS, 2);
        this.recycleBinSalvaging(Items.CRIMSON_PRESSURE_PLATE, Items.CRIMSON_PLANKS, 1);
        this.recycleBinSalvaging(Items.WARPED_STAIRS, Items.WARPED_PLANKS, 1);
        this.recycleBinSalvaging(Items.WARPED_FENCE, Items.WARPED_PLANKS, 1);
        this.recycleBinSalvaging(Items.WARPED_FENCE_GATE, Items.WARPED_PLANKS, 1);
        this.recycleBinSalvaging(Items.WARPED_FENCE_GATE, Items.STICK, 2);
        this.recycleBinSalvaging(Items.WARPED_TRAPDOOR, Items.WARPED_PLANKS, 2);
        this.recycleBinSalvaging(Items.WARPED_PRESSURE_PLATE, Items.WARPED_PLANKS, 1);
        this.recycleBinSalvaging(Items.STONE_STAIRS, Items.STONE, 1);
        this.recycleBinSalvaging(Items.COBBLESTONE_STAIRS, Items.COBBLESTONE, 1);
        this.recycleBinSalvaging(Items.COBBLESTONE_WALL, Items.COBBLESTONE, 1);
        this.recycleBinSalvaging(Items.MOSSY_COBBLESTONE_STAIRS, Items.MOSSY_COBBLESTONE, 1);
        this.recycleBinSalvaging(Items.MOSSY_COBBLESTONE_WALL, Items.MOSSY_COBBLESTONE, 1);
        this.recycleBinSalvaging(Items.STONE_BRICK_STAIRS, Items.STONE_BRICKS, 1);
        this.recycleBinSalvaging(Items.STONE_BRICK_WALL, Items.STONE_BRICKS, 1);
        this.recycleBinSalvaging(Items.MOSSY_STONE_BRICK_STAIRS, Items.MOSSY_STONE_BRICKS, 1);
        this.recycleBinSalvaging(Items.MOSSY_STONE_BRICK_WALL, Items.MOSSY_STONE_BRICKS, 1);
        this.recycleBinSalvaging(Items.GRANITE_STAIRS, Items.GRANITE, 1);
        this.recycleBinSalvaging(Items.GRANITE_WALL, Items.GRANITE, 1);
        this.recycleBinSalvaging(Items.POLISHED_GRANITE, Items.GRANITE, 1);
        this.recycleBinSalvaging(Items.POLISHED_GRANITE_STAIRS, Items.POLISHED_GRANITE, 1);
        this.recycleBinSalvaging(Items.DIORITE_STAIRS, Items.DIORITE, 1);
        this.recycleBinSalvaging(Items.DIORITE_WALL, Items.DIORITE, 1);
        this.recycleBinSalvaging(Items.POLISHED_DIORITE, Items.DIORITE, 1);
        this.recycleBinSalvaging(Items.POLISHED_DIORITE_STAIRS, Items.POLISHED_DIORITE, 1);
        this.recycleBinSalvaging(Items.ANDESITE_STAIRS, Items.ANDESITE, 1);
        this.recycleBinSalvaging(Items.ANDESITE_WALL, Items.ANDESITE, 1);
        this.recycleBinSalvaging(Items.POLISHED_ANDESITE, Items.ANDESITE, 1);
        this.recycleBinSalvaging(Items.POLISHED_ANDESITE_STAIRS, Items.POLISHED_ANDESITE, 1);
        this.recycleBinSalvaging(Items.COBBLED_DEEPSLATE_STAIRS, Items.COBBLED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.COBBLED_DEEPSLATE_WALL, Items.COBBLED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.CHISELED_DEEPSLATE, Items.COBBLED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.POLISHED_DEEPSLATE, Items.COBBLED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.POLISHED_DEEPSLATE_STAIRS, Items.COBBLED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.POLISHED_DEEPSLATE_STAIRS, Items.POLISHED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.POLISHED_DEEPSLATE_WALL, Items.COBBLED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.POLISHED_DEEPSLATE_WALL, Items.POLISHED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.DEEPSLATE_BRICKS, Items.COBBLED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.DEEPSLATE_BRICKS, Items.POLISHED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.DEEPSLATE_BRICK_STAIRS, Items.COBBLED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.DEEPSLATE_BRICK_STAIRS, Items.POLISHED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.DEEPSLATE_BRICK_WALL, Items.COBBLED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.DEEPSLATE_BRICK_WALL, Items.POLISHED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.DEEPSLATE_TILES, Items.COBBLED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.DEEPSLATE_TILES, Items.POLISHED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.DEEPSLATE_TILE_STAIRS, Items.COBBLED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.DEEPSLATE_TILE_STAIRS, Items.POLISHED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.DEEPSLATE_TILE_WALL, Items.COBBLED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.DEEPSLATE_TILE_WALL, Items.POLISHED_DEEPSLATE, 1);
        this.recycleBinSalvaging(Items.BRICKS, Items.BRICK, 3);
        this.recycleBinSalvaging(Items.BRICK_STAIRS, Items.BRICK, 4);
        this.recycleBinSalvaging(Items.BRICK_SLAB, Items.BRICK, 1);
        this.recycleBinSalvaging(Items.BRICK_WALL, Items.BRICK, 4);
        this.recycleBinSalvaging(Items.MUD_BRICK_STAIRS, Items.MUD_BRICKS, 1);
        this.recycleBinSalvaging(Items.MUD_BRICK_WALL, Items.MUD_BRICKS, 1);
        this.recycleBinSalvaging(Items.SANDSTONE_STAIRS, Items.SANDSTONE, 1);
        this.recycleBinSalvaging(Items.SANDSTONE_WALL, Items.SANDSTONE, 1);
        this.recycleBinSalvaging(Items.SMOOTH_SANDSTONE_STAIRS, Items.SMOOTH_SANDSTONE, 1);
        this.recycleBinSalvaging(Items.CUT_SANDSTONE, Items.SANDSTONE, 1);
        this.recycleBinSalvaging(Items.RED_SANDSTONE_STAIRS, Items.RED_SANDSTONE, 1);
        this.recycleBinSalvaging(Items.RED_SANDSTONE_WALL, Items.RED_SANDSTONE, 1);
        this.recycleBinSalvaging(Items.SMOOTH_RED_SANDSTONE_STAIRS, Items.SMOOTH_RED_SANDSTONE, 1);
        this.recycleBinSalvaging(Items.CUT_RED_SANDSTONE, Items.RED_SANDSTONE, 1);
        this.recycleBinSalvaging(Items.PRISMARINE_STAIRS, Items.PRISMARINE, 1);
        this.recycleBinSalvaging(Items.PRISMARINE_BRICK_STAIRS, Items.PRISMARINE_BRICKS, 1);
        this.recycleBinSalvaging(Items.DARK_PRISMARINE_STAIRS, Items.DARK_PRISMARINE, 1);
        this.recycleBinSalvaging(Items.NETHER_BRICKS, Items.NETHER_BRICK, 3);
        this.recycleBinSalvaging(Items.NETHER_BRICK_STAIRS, Items.NETHER_BRICK, 4);
        this.recycleBinSalvaging(Items.NETHER_BRICK_SLAB, Items.NETHER_BRICK, 1);
        this.recycleBinSalvaging(Items.NETHER_BRICK_WALL, Items.NETHER_BRICK, 4);
        this.recycleBinSalvaging(Items.NETHER_BRICK_FENCE, Items.NETHER_BRICK, 1);
        this.recycleBinSalvaging(Items.RED_NETHER_BRICK_STAIRS, Items.RED_NETHER_BRICKS, 1);
        this.recycleBinSalvaging(Items.RED_NETHER_BRICK_WALL, Items.RED_NETHER_BRICKS, 1);
        this.recycleBinSalvaging(Items.BLACKSTONE_STAIRS, Items.BLACKSTONE, 1);
        this.recycleBinSalvaging(Items.BLACKSTONE_WALL, Items.BLACKSTONE, 1);
        this.recycleBinSalvaging(Items.POLISHED_BLACKSTONE, Items.BLACKSTONE, 1);
        this.recycleBinSalvaging(Items.POLISHED_BLACKSTONE_STAIRS, Items.BLACKSTONE, 1);
        this.recycleBinSalvaging(Items.POLISHED_BLACKSTONE_STAIRS, Items.POLISHED_BLACKSTONE, 1);
        this.recycleBinSalvaging(Items.POLISHED_BLACKSTONE_WALL, Items.BLACKSTONE, 1);
        this.recycleBinSalvaging(Items.POLISHED_BLACKSTONE_WALL, Items.POLISHED_BLACKSTONE, 1);
        this.recycleBinSalvaging(Items.END_STONE_BRICK_STAIRS, Items.END_STONE_BRICKS, 1);
        this.recycleBinSalvaging(Items.END_STONE_BRICK_WALL, Items.END_STONE_BRICKS, 1);
        this.recycleBinSalvaging(Items.PURPUR_STAIRS, Items.PURPUR_BLOCK, 1);
        this.recycleBinSalvaging(Items.PURPUR_PILLAR, Items.PURPUR_BLOCK, 1);
        this.recycleBinSalvaging(Items.IRON_BARS, Items.IRON_NUGGET, 2);
        this.recycleBinSalvaging(Items.IRON_DOOR, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.IRON_TRAPDOOR, Items.IRON_INGOT, 2);
        this.recycleBinSalvaging(Items.HEAVY_WEIGHTED_PRESSURE_PLATE, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.CHAIN, Items.IRON_NUGGET, 6);
        this.recycleBinSalvaging(Items.LIGHT_WEIGHTED_PRESSURE_PLATE, Items.GOLD_INGOT, 1);
        this.recycleBinSalvaging(Items.QUARTZ_STAIRS, Items.QUARTZ_BLOCK, 1);
        this.recycleBinSalvaging(Items.QUARTZ_BRICKS, Items.QUARTZ_BLOCK, 1);
        this.recycleBinSalvaging(Items.SMOOTH_QUARTZ_STAIRS, Items.SMOOTH_QUARTZ, 1);
        this.recycleBinSalvaging(Items.AMETHYST_BLOCK, Items.AMETHYST_SHARD, 2);
        this.recycleBinSalvaging(Items.CUT_COPPER, Items.COPPER_INGOT, 4);
        this.recycleBinSalvaging(Items.CUT_COPPER_STAIRS, Items.COPPER_INGOT, 8);
        this.recycleBinSalvaging(Items.CUT_COPPER_SLAB, Items.COPPER_INGOT, 2);
        this.recycleBinSalvaging(Items.EXPOSED_CUT_COPPER, Items.COPPER_INGOT, 4);
        this.recycleBinSalvaging(Items.EXPOSED_CUT_COPPER_STAIRS, Items.COPPER_INGOT, 8);
        this.recycleBinSalvaging(Items.EXPOSED_CUT_COPPER_SLAB, Items.COPPER_INGOT, 2);
        this.recycleBinSalvaging(Items.WEATHERED_CUT_COPPER, Items.COPPER_INGOT, 4);
        this.recycleBinSalvaging(Items.WEATHERED_CUT_COPPER_STAIRS, Items.COPPER_INGOT, 8);
        this.recycleBinSalvaging(Items.WEATHERED_CUT_COPPER_SLAB, Items.COPPER_INGOT, 2);
        this.recycleBinSalvaging(Items.OXIDIZED_CUT_COPPER, Items.COPPER_INGOT, 4);
        this.recycleBinSalvaging(Items.OXIDIZED_CUT_COPPER_STAIRS, Items.COPPER_INGOT, 8);
        this.recycleBinSalvaging(Items.OXIDIZED_CUT_COPPER_SLAB, Items.COPPER_INGOT, 2);
        this.recycleBinSalvaging(Items.WAXED_CUT_COPPER, Items.COPPER_INGOT, 4);
        this.recycleBinSalvaging(Items.WAXED_CUT_COPPER_STAIRS, Items.COPPER_INGOT, 8);
        this.recycleBinSalvaging(Items.WAXED_CUT_COPPER_SLAB, Items.COPPER_INGOT, 2);
        this.recycleBinSalvaging(Items.WAXED_EXPOSED_CUT_COPPER, Items.COPPER_INGOT, 4);
        this.recycleBinSalvaging(Items.WAXED_EXPOSED_CUT_COPPER_STAIRS, Items.COPPER_INGOT, 8);
        this.recycleBinSalvaging(Items.WAXED_EXPOSED_CUT_COPPER_SLAB, Items.COPPER_INGOT, 2);
        this.recycleBinSalvaging(Items.WAXED_WEATHERED_CUT_COPPER, Items.COPPER_INGOT, 4);
        this.recycleBinSalvaging(Items.WAXED_WEATHERED_CUT_COPPER_STAIRS, Items.COPPER_INGOT, 8);
        this.recycleBinSalvaging(Items.WAXED_WEATHERED_CUT_COPPER_SLAB, Items.COPPER_INGOT, 2);
        this.recycleBinSalvaging(Items.WAXED_OXIDIZED_CUT_COPPER, Items.COPPER_INGOT, 4);
        this.recycleBinSalvaging(Items.WAXED_OXIDIZED_CUT_COPPER_STAIRS, Items.COPPER_INGOT, 8);
        this.recycleBinSalvaging(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB, Items.COPPER_INGOT, 2);
        this.recycleBinSalvaging(Items.WHITE_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.LIGHT_GRAY_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.GRAY_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.BLACK_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.BROWN_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.RED_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.ORANGE_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.YELLOW_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.LIME_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.GREEN_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.CYAN_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.LIGHT_BLUE_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.BLUE_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.PURPLE_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.MAGENTA_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.PINK_WOOL, Items.STRING, 2);
        this.recycleBinSalvaging(Items.WHITE_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.LIGHT_GRAY_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.GRAY_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.BLACK_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.BROWN_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.RED_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.ORANGE_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.YELLOW_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.LIME_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.GREEN_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.CYAN_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.LIGHT_BLUE_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.BLUE_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.PURPLE_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.MAGENTA_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.PINK_CARPET, Items.STRING, 1);
        this.recycleBinSalvaging(Items.SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.WHITE_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.LIGHT_GRAY_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.GRAY_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.BLACK_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.BROWN_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.RED_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.ORANGE_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.YELLOW_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.LIME_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.GREEN_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.CYAN_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.LIGHT_BLUE_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.BLUE_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.PURPLE_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.MAGENTA_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.PINK_SHULKER_BOX, Items.SHULKER_SHELL, 2);
        this.recycleBinSalvaging(Items.SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.WHITE_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.LIGHT_GRAY_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.GRAY_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.BLACK_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.BROWN_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.RED_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.ORANGE_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.YELLOW_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.LIME_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.GREEN_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.CYAN_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.LIGHT_BLUE_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.BLUE_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.PURPLE_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.MAGENTA_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.PINK_SHULKER_BOX, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.WHITE_BED, Items.WHITE_WOOL, 2);
        this.recycleBinSalvaging(Items.LIGHT_GRAY_BED, Items.LIGHT_GRAY_WOOL, 2);
        this.recycleBinSalvaging(Items.GRAY_BED, Items.GRAY_WOOL, 2);
        this.recycleBinSalvaging(Items.BLACK_BED, Items.BLACK_WOOL, 2);
        this.recycleBinSalvaging(Items.BROWN_BED, Items.BROWN_WOOL, 2);
        this.recycleBinSalvaging(Items.RED_BED, Items.RED_WOOL, 2);
        this.recycleBinSalvaging(Items.ORANGE_BED, Items.ORANGE_WOOL, 2);
        this.recycleBinSalvaging(Items.YELLOW_BED, Items.YELLOW_WOOL, 2);
        this.recycleBinSalvaging(Items.LIME_BED, Items.LIME_WOOL, 2);
        this.recycleBinSalvaging(Items.GREEN_BED, Items.GREEN_WOOL, 2);
        this.recycleBinSalvaging(Items.CYAN_BED, Items.CYAN_WOOL, 2);
        this.recycleBinSalvaging(Items.LIGHT_BLUE_BED, Items.LIGHT_BLUE_WOOL, 2);
        this.recycleBinSalvaging(Items.BLUE_BED, Items.BLUE_WOOL, 2);
        this.recycleBinSalvaging(Items.PURPLE_BED, Items.PURPLE_WOOL, 2);
        this.recycleBinSalvaging(Items.MAGENTA_BED, Items.MAGENTA_WOOL, 2);
        this.recycleBinSalvaging(Items.PINK_BED, Items.PINK_WOOL, 2);
        this.recycleBinSalvaging(Items.WHITE_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.LIGHT_GRAY_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.GRAY_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.BLACK_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.BROWN_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.RED_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.ORANGE_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.YELLOW_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.LIME_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.GREEN_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.CYAN_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.LIGHT_BLUE_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.BLUE_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.PURPLE_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.MAGENTA_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.PINK_BED, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.WHITE_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.LIGHT_GRAY_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.GRAY_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.BLACK_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.BROWN_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.RED_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.ORANGE_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.YELLOW_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.LIME_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.GREEN_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.CYAN_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.LIGHT_BLUE_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.BLUE_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.PURPLE_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.MAGENTA_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.PINK_CANDLE, Items.STRING, 1);
        this.recycleBinSalvaging(Items.WHITE_BANNER, Items.WHITE_WOOL, 3);
        this.recycleBinSalvaging(Items.LIGHT_GRAY_BANNER, Items.LIGHT_GRAY_WOOL, 3);
        this.recycleBinSalvaging(Items.GRAY_BANNER, Items.GRAY_WOOL, 3);
        this.recycleBinSalvaging(Items.BLACK_BANNER, Items.BLACK_WOOL, 3);
        this.recycleBinSalvaging(Items.BROWN_BANNER, Items.BROWN_WOOL, 3);
        this.recycleBinSalvaging(Items.RED_BANNER, Items.RED_WOOL, 3);
        this.recycleBinSalvaging(Items.ORANGE_BANNER, Items.ORANGE_WOOL, 3);
        this.recycleBinSalvaging(Items.YELLOW_BANNER, Items.YELLOW_WOOL, 3);
        this.recycleBinSalvaging(Items.LIME_BANNER, Items.LIME_WOOL, 3);
        this.recycleBinSalvaging(Items.GREEN_BANNER, Items.GREEN_WOOL, 3);
        this.recycleBinSalvaging(Items.CYAN_BANNER, Items.CYAN_WOOL, 3);
        this.recycleBinSalvaging(Items.LIGHT_BLUE_BANNER, Items.LIGHT_BLUE_WOOL, 3);
        this.recycleBinSalvaging(Items.BLUE_BANNER, Items.BLUE_WOOL, 3);
        this.recycleBinSalvaging(Items.PURPLE_BANNER, Items.PURPLE_WOOL, 3);
        this.recycleBinSalvaging(Items.MAGENTA_BANNER, Items.MAGENTA_WOOL, 3);
        this.recycleBinSalvaging(Items.PINK_BANNER, Items.PINK_WOOL, 3);
        this.recycleBinSalvaging(Items.CALIBRATED_SCULK_SENSOR, Items.SCULK_SENSOR, 1);
        this.recycleBinSalvaging(Items.CALIBRATED_SCULK_SENSOR, Items.AMETHYST_SHARD, 2);
        this.recycleBinSalvaging(Items.REDSTONE_TORCH, Items.REDSTONE, 1);
        this.recycleBinSalvaging(Items.LANTERN, Items.IRON_NUGGET, 4);
        this.recycleBinSalvaging(Items.LANTERN, Items.TORCH, 1);
        this.recycleBinSalvaging(Items.SOUL_LANTERN, Items.IRON_NUGGET, 4);
        this.recycleBinSalvaging(Items.SOUL_LANTERN, Items.SOUL_TORCH, 1);
        this.recycleBinSalvaging(Items.SEA_LANTERN, Items.PRISMARINE_SHARD, 2);
        this.recycleBinSalvaging(Items.SEA_LANTERN, Items.PRISMARINE_CRYSTALS, 3);
        this.recycleBinSalvaging(Items.REDSTONE_LAMP, Items.REDSTONE, 3);
        this.recycleBinSalvaging(Items.CRAFTING_TABLE, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.STONECUTTER, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.CARTOGRAPHY_TABLE, Items.PAPER, 1);
        this.recycleBinSalvaging(Items.CARTOGRAPHY_TABLE, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.FLETCHING_TABLE, Items.FLINT, 1);
        this.recycleBinSalvaging(Items.FLETCHING_TABLE, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.SMITHING_TABLE, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.SMITHING_TABLE, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.GRINDSTONE, ItemTags.PLANKS, 1);
        this.recycleBinSalvaging(Items.GRINDSTONE, Items.STONE_SLAB, 1);
        this.recycleBinSalvaging(Items.LOOM, Items.STRING, 1);
        this.recycleBinSalvaging(Items.LOOM, ItemTags.PLANKS, 1);
        this.recycleBinSalvaging(Items.FURNACE, ItemTags.STONE_CRAFTING_MATERIALS, 4);
        this.recycleBinSalvaging(Items.SMOKER, Items.FURNACE, 1);
        this.recycleBinSalvaging(Items.BLAST_FURNACE, Items.FURNACE, 1);
        this.recycleBinSalvaging(Items.BLAST_FURNACE, Items.IRON_INGOT, 3);
        this.recycleBinSalvaging(Items.CAMPFIRE, Items.COAL, 1);
        this.recycleBinSalvaging(Items.SOUL_CAMPFIRE, Items.SOUL_SAND, 1);
        this.recycleBinSalvaging(Items.ANVIL, Items.IRON_INGOT, 3);
        this.recycleBinSalvaging(Items.ANVIL, Items.IRON_BLOCK, 2);
        this.recycleBinSalvaging(Items.CHIPPED_ANVIL, Items.IRON_INGOT, 2);
        this.recycleBinSalvaging(Items.CHIPPED_ANVIL, Items.IRON_BLOCK, 1);
        this.recycleBinSalvaging(Items.DAMAGED_ANVIL, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.COMPOSTER, ItemTags.WOODEN_SLABS, 3);
        this.recycleBinSalvaging(Items.NOTE_BLOCK, Items.REDSTONE, 1);
        this.recycleBinSalvaging(Items.NOTE_BLOCK, ItemTags.PLANKS, 3);
        this.recycleBinSalvaging(Items.JUKEBOX, Items.DIAMOND, 1);
        this.recycleBinSalvaging(Items.JUKEBOX, ItemTags.PLANKS, 3);
        this.recycleBinSalvaging(Items.ENCHANTING_TABLE, Items.DIAMOND, 1);
        this.recycleBinSalvaging(Items.ENCHANTING_TABLE, Items.OBSIDIAN, 2);
        this.recycleBinSalvaging(Items.ENCHANTING_TABLE, Items.BOOK, 1);
        this.recycleBinSalvaging(Items.END_CRYSTAL, Items.ENDER_EYE, 1);
        this.recycleBinSalvaging(Items.BREWING_STAND, ItemTags.STONE_CRAFTING_MATERIALS, 2);
        this.recycleBinSalvaging(Items.BREWING_STAND, Items.BLAZE_ROD, 1);
        this.recycleBinSalvaging(Items.CAULDRON, Items.IRON_INGOT, 3);
        this.recycleBinSalvaging(Items.BELL, Items.GOLD_INGOT, 2);
        this.recycleBinSalvaging(Items.BELL, Items.STICK, 1);
        this.recycleBinSalvaging(Items.BEACON, Items.NETHER_STAR, 1);
        this.recycleBinSalvaging(Items.BEACON, Items.OBSIDIAN, 2);
        this.recycleBinSalvaging(Items.CONDUIT, Items.NAUTILUS_SHELL, 3);
        this.recycleBinSalvaging(Items.CONDUIT, Items.HEART_OF_THE_SEA, 1);
        this.recycleBinSalvaging(Items.LODESTONE, Items.NETHERITE_INGOT, 1);
        this.recycleBinSalvaging(Items.LODESTONE, Items.CHISELED_STONE_BRICKS, 3);
        this.recycleBinSalvaging(Items.LADDER, Items.STICK, 1);
        this.recycleBinSalvaging(Items.SCAFFOLDING, Items.BAMBOO, 1);
        this.recycleBinSalvaging(Items.SCAFFOLDING, Items.STRING, 1);
        this.recycleBinSalvaging(Items.BEEHIVE, Items.HONEYCOMB, 2);
        this.recycleBinSalvaging(Items.BEEHIVE, ItemTags.PLANKS, 3);
        this.recycleBinSalvaging(Items.LIGHTNING_ROD, Items.COPPER_INGOT, 1);
        this.recycleBinSalvaging(Items.FLOWER_POT, Items.BRICK, 1);
        this.recycleBinSalvaging(Items.DECORATED_POT, Items.BRICK, 1);
        this.recycleBinSalvaging(Items.ARMOR_STAND, Items.STICK, 3);
        this.recycleBinSalvaging(Items.ITEM_FRAME, Items.LEATHER, 1);
        this.recycleBinSalvaging(Items.ITEM_FRAME, Items.STICK, 3);
        this.recycleBinSalvaging(Items.GLOW_ITEM_FRAME, Items.LEATHER, 1);
        this.recycleBinSalvaging(Items.GLOW_ITEM_FRAME, Items.STICK, 3);
        this.recycleBinSalvaging(Items.PAINTING, Items.STICK, 3);
        this.recycleBinSalvaging(Items.PAINTING, ItemTags.WOOL, 1);
        this.recycleBinSalvaging(Items.BOOKSHELF, Items.BOOK, 2);
        this.recycleBinSalvaging(Items.BOOKSHELF, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.CHISELED_BOOKSHELF, ItemTags.WOODEN_SLABS, 1);
        this.recycleBinSalvaging(Items.CHISELED_BOOKSHELF, ItemTags.PLANKS, 3);
        this.recycleBinSalvaging(Items.LECTERN, ItemTags.WOODEN_SLABS, 2);
        this.recycleBinSalvaging(Items.LECTERN, Items.BOOKSHELF, 1);
        this.recycleBinSalvaging(Items.OAK_SIGN, Items.OAK_PLANKS, 1);
        this.recycleBinSalvaging(Items.SPRUCE_SIGN, Items.SPRUCE_PLANKS, 1);
        this.recycleBinSalvaging(Items.BIRCH_SIGN, Items.BIRCH_PLANKS, 1);
        this.recycleBinSalvaging(Items.JUNGLE_SIGN, Items.JUNGLE_PLANKS, 1);
        this.recycleBinSalvaging(Items.ACACIA_SIGN, Items.ACACIA_PLANKS, 1);
        this.recycleBinSalvaging(Items.DARK_OAK_SIGN, Items.DARK_OAK_PLANKS, 1);
        this.recycleBinSalvaging(Items.MANGROVE_SIGN, Items.MANGROVE_PLANKS, 1);
        this.recycleBinSalvaging(Items.CHERRY_SIGN, Items.CHERRY_PLANKS, 1);
        this.recycleBinSalvaging(Items.CRIMSON_SIGN, Items.CRIMSON_PLANKS, 1);
        this.recycleBinSalvaging(Items.WARPED_SIGN, Items.WARPED_PLANKS, 1);
        this.recycleBinSalvaging(Items.BAMBOO_SIGN, Items.BAMBOO_PLANKS, 1);
        this.recycleBinSalvaging(Items.OAK_HANGING_SIGN, Items.OAK_PLANKS, 1);
        this.recycleBinSalvaging(Items.SPRUCE_HANGING_SIGN, Items.SPRUCE_PLANKS, 1);
        this.recycleBinSalvaging(Items.BIRCH_HANGING_SIGN, Items.BIRCH_PLANKS, 1);
        this.recycleBinSalvaging(Items.JUNGLE_HANGING_SIGN, Items.JUNGLE_PLANKS, 1);
        this.recycleBinSalvaging(Items.ACACIA_HANGING_SIGN, Items.ACACIA_PLANKS, 1);
        this.recycleBinSalvaging(Items.DARK_OAK_HANGING_SIGN, Items.DARK_OAK_PLANKS, 1);
        this.recycleBinSalvaging(Items.MANGROVE_HANGING_SIGN, Items.MANGROVE_PLANKS, 1);
        this.recycleBinSalvaging(Items.CHERRY_HANGING_SIGN, Items.CHERRY_PLANKS, 1);
        this.recycleBinSalvaging(Items.CRIMSON_HANGING_SIGN, Items.CRIMSON_PLANKS, 1);
        this.recycleBinSalvaging(Items.WARPED_HANGING_SIGN, Items.WARPED_PLANKS, 1);
        this.recycleBinSalvaging(Items.BAMBOO_HANGING_SIGN, Items.BAMBOO_PLANKS, 1);
        this.recycleBinSalvaging(Items.CHEST, ItemTags.PLANKS, 3);
        this.recycleBinSalvaging(Items.TRAPPED_CHEST, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.TRAPPED_CHEST, Items.TRIPWIRE_HOOK, 1);
        this.recycleBinSalvaging(Items.BARREL, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.ENDER_CHEST, Items.OBSIDIAN, 3);
        this.recycleBinSalvaging(Items.ENDER_CHEST, Items.ENDER_EYE, 1);
        this.recycleBinSalvaging(Items.RESPAWN_ANCHOR, Items.CRYING_OBSIDIAN, 3);
        this.recycleBinSalvaging(Items.RESPAWN_ANCHOR, Items.GLOWSTONE, 1);
        this.recycleBinSalvaging(Items.REPEATER, Items.REDSTONE_TORCH, 1);
        this.recycleBinSalvaging(Items.REPEATER, Items.REDSTONE, 1);
        this.recycleBinSalvaging(Items.REPEATER, Items.STONE, 2);
        this.recycleBinSalvaging(Items.COMPARATOR, Items.REDSTONE_TORCH, 1);
        this.recycleBinSalvaging(Items.COMPARATOR, Items.QUARTZ, 1);
        this.recycleBinSalvaging(Items.COMPARATOR, Items.STONE, 2);
        this.recycleBinSalvaging(Items.TARGET, Items.REDSTONE, 2);
        this.recycleBinSalvaging(Items.TARGET, Items.HAY_BLOCK, 1);
        this.recycleBinSalvaging(Items.LEVER, Items.COBBLESTONE, 1);
        this.recycleBinSalvaging(Items.LEVER, Items.STICK, 1);
        this.recycleBinSalvaging(Items.TRIPWIRE_HOOK, Items.STICK, 1);
        this.recycleBinSalvaging(Items.DAYLIGHT_DETECTOR, Items.QUARTZ, 2);
        this.recycleBinSalvaging(Items.DAYLIGHT_DETECTOR, Items.GLASS, 1);
        this.recycleBinSalvaging(Items.DAYLIGHT_DETECTOR, ItemTags.WOODEN_SLABS, 1);
        this.recycleBinSalvaging(Items.PISTON, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.PISTON, Items.REDSTONE, 1);
        this.recycleBinSalvaging(Items.PISTON, Items.COBBLESTONE, 2);
        this.recycleBinSalvaging(Items.PISTON, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.STICKY_PISTON, Items.PISTON, 1);
        this.recycleBinSalvaging(Items.STICKY_PISTON, Items.SLIME_BALL, 1);
        this.recycleBinSalvaging(Items.DISPENSER, Items.COBBLESTONE, 3);
        this.recycleBinSalvaging(Items.DISPENSER, Items.BOW, 1);
        this.recycleBinSalvaging(Items.DISPENSER, Items.REDSTONE, 1);
        this.recycleBinSalvaging(Items.DROPPER, Items.COBBLESTONE, 3);
        this.recycleBinSalvaging(Items.DROPPER, Items.REDSTONE, 1);
        this.recycleBinSalvaging(Items.HOPPER, Items.IRON_INGOT, 3);
        this.recycleBinSalvaging(Items.HOPPER, Items.CHEST, 1);
        this.recycleBinSalvaging(Items.OBSERVER, Items.REDSTONE, 1);
        this.recycleBinSalvaging(Items.OBSERVER, Items.QUARTZ, 1);
        this.recycleBinSalvaging(Items.OBSERVER, Items.COBBLESTONE, 3);
        this.recycleBinSalvaging(Items.RAIL, Items.IRON_NUGGET, 2);
        this.recycleBinSalvaging(Items.RAIL, Items.STICK, 1);
        this.recycleBinSalvaging(Items.POWERED_RAIL, Items.STICK, 1);
        this.recycleBinSalvaging(Items.POWERED_RAIL, Items.GOLD_NUGGET, 6);
        this.recycleBinSalvaging(Items.ACTIVATOR_RAIL, Items.STICK, 1);
        this.recycleBinSalvaging(Items.ACTIVATOR_RAIL, Items.IRON_NUGGET, 6);
        this.recycleBinSalvaging(Items.DETECTOR_RAIL, Items.STICK, 1);
        this.recycleBinSalvaging(Items.DETECTOR_RAIL, Items.IRON_NUGGET, 6);
        this.recycleBinSalvaging(Items.MINECART, Items.IRON_INGOT, 3);
        this.recycleBinSalvaging(Items.CHEST_MINECART, Items.IRON_INGOT, 3);
        this.recycleBinSalvaging(Items.CHEST_MINECART, ItemTags.PLANKS, 4);
        this.recycleBinSalvaging(Items.HOPPER_MINECART, Items.IRON_INGOT, 6);
        this.recycleBinSalvaging(Items.TNT_MINECART, Items.IRON_INGOT, 3);
        this.recycleBinSalvaging(Items.TNT_MINECART, Items.GUNPOWDER, 3);
        this.recycleBinSalvaging(Items.FURNACE_MINECART, Items.IRON_INGOT, 3);
        this.recycleBinSalvaging(Items.FURNACE_MINECART, ItemTags.STONE_CRAFTING_MATERIALS, 4);
        this.recycleBinSalvaging(Items.WOODEN_SHOVEL, Items.STICK, 1);
        this.recycleBinSalvaging(Items.WOODEN_PICKAXE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.WOODEN_PICKAXE, ItemTags.PLANKS, 1);
        this.recycleBinSalvaging(Items.WOODEN_AXE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.WOODEN_AXE, ItemTags.PLANKS, 1);
        this.recycleBinSalvaging(Items.WOODEN_HOE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.WOODEN_HOE, ItemTags.PLANKS, 1);
        this.recycleBinSalvaging(Items.WOODEN_SWORD, Items.STICK, 1);
        this.recycleBinSalvaging(Items.WOODEN_SWORD, ItemTags.PLANKS, 1);
        this.recycleBinSalvaging(Items.STONE_SHOVEL, Items.STICK, 1);
        this.recycleBinSalvaging(Items.STONE_PICKAXE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.STONE_PICKAXE, ItemTags.STONE_CRAFTING_MATERIALS, 1);
        this.recycleBinSalvaging(Items.STONE_AXE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.STONE_AXE, ItemTags.STONE_CRAFTING_MATERIALS, 1);
        this.recycleBinSalvaging(Items.STONE_HOE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.STONE_HOE, ItemTags.STONE_CRAFTING_MATERIALS, 1);
        this.recycleBinSalvaging(Items.STONE_SWORD, Items.STICK, 1);
        this.recycleBinSalvaging(Items.STONE_SWORD, ItemTags.STONE_CRAFTING_MATERIALS, 1);
        this.recycleBinSalvaging(Items.IRON_SHOVEL, Items.STICK, 1);
        this.recycleBinSalvaging(Items.IRON_PICKAXE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.IRON_PICKAXE, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.IRON_AXE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.IRON_AXE, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.IRON_HOE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.IRON_HOE, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.IRON_SWORD, Items.STICK, 1);
        this.recycleBinSalvaging(Items.IRON_SWORD, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.GOLDEN_SHOVEL, Items.STICK, 1);
        this.recycleBinSalvaging(Items.GOLDEN_PICKAXE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.GOLDEN_PICKAXE, Items.GOLD_INGOT, 1);
        this.recycleBinSalvaging(Items.GOLDEN_AXE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.GOLDEN_AXE, Items.GOLD_INGOT, 1);
        this.recycleBinSalvaging(Items.GOLDEN_HOE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.GOLDEN_HOE, Items.GOLD_INGOT, 1);
        this.recycleBinSalvaging(Items.GOLDEN_SWORD, Items.STICK, 1);
        this.recycleBinSalvaging(Items.GOLDEN_SWORD, Items.GOLD_INGOT, 1);
        this.recycleBinSalvaging(Items.DIAMOND_SHOVEL, Items.STICK, 1);
        this.recycleBinSalvaging(Items.DIAMOND_PICKAXE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.DIAMOND_PICKAXE, Items.DIAMOND, 1);
        this.recycleBinSalvaging(Items.DIAMOND_AXE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.DIAMOND_AXE, Items.DIAMOND, 1);
        this.recycleBinSalvaging(Items.DIAMOND_HOE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.DIAMOND_HOE, Items.DIAMOND, 1);
        this.recycleBinSalvaging(Items.DIAMOND_SWORD, Items.STICK, 1);
        this.recycleBinSalvaging(Items.DIAMOND_SWORD, Items.DIAMOND, 1);
        this.recycleBinSalvaging(Items.NETHERITE_SHOVEL, Items.STICK, 1);
        this.recycleBinSalvaging(Items.NETHERITE_PICKAXE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.NETHERITE_PICKAXE, Items.DIAMOND, 1);
        this.recycleBinSalvaging(Items.NETHERITE_PICKAXE, Items.NETHERITE_SCRAP, 1);
        this.recycleBinSalvaging(Items.NETHERITE_AXE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.NETHERITE_AXE, Items.DIAMOND, 1);
        this.recycleBinSalvaging(Items.NETHERITE_AXE, Items.NETHERITE_SCRAP, 1);
        this.recycleBinSalvaging(Items.NETHERITE_HOE, Items.STICK, 1);
        this.recycleBinSalvaging(Items.NETHERITE_HOE, Items.DIAMOND, 1);
        this.recycleBinSalvaging(Items.NETHERITE_HOE, Items.NETHERITE_SCRAP, 1);
        this.recycleBinSalvaging(Items.NETHERITE_SWORD, Items.STICK, 1);
        this.recycleBinSalvaging(Items.NETHERITE_SWORD, Items.DIAMOND, 1);
        this.recycleBinSalvaging(Items.NETHERITE_SWORD, Items.NETHERITE_SCRAP, 1);
        this.recycleBinSalvaging(Items.BUCKET, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.WATER_BUCKET, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.LAVA_BUCKET, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.POWDER_SNOW_BUCKET, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.MILK_BUCKET, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.PUFFERFISH_BUCKET, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.SALMON_BUCKET, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.COD_BUCKET, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.TROPICAL_FISH_BUCKET, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.AXOLOTL_BUCKET, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.TADPOLE_BUCKET, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.FISHING_ROD, Items.STICK, 1);
        this.recycleBinSalvaging(Items.FISHING_ROD, Items.STRING, 1);
        this.recycleBinSalvaging(Items.FLINT_AND_STEEL, Items.FLINT, 1);
        this.recycleBinSalvaging(Items.SHEARS, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.BRUSH, Items.COPPER_INGOT, 1);
        this.recycleBinSalvaging(Items.BRUSH, Items.FEATHER, 1);
        this.recycleBinSalvaging(Items.NAME_TAG, Items.STRING, 1);
        this.recycleBinSalvaging(Items.NAME_TAG, Items.PAPER, 1);
        this.recycleBinSalvaging(Items.LEAD, Items.STRING, 3);
        this.recycleBinSalvaging(Items.COMPASS, Items.IRON_INGOT, 3);
        this.recycleBinSalvaging(Items.COMPASS, Items.REDSTONE, 1);
        this.recycleBinSalvaging(Items.RECOVERY_COMPASS, Items.COMPASS, 1);
        this.recycleBinSalvaging(Items.RECOVERY_COMPASS, Items.ECHO_SHARD, 5);
        this.recycleBinSalvaging(Items.CLOCK, Items.GOLD_INGOT, 3);
        this.recycleBinSalvaging(Items.CLOCK, Items.REDSTONE, 1);
        this.recycleBinSalvaging(Items.SPYGLASS, Items.COPPER_INGOT, 1);
        this.recycleBinSalvaging(Items.SPYGLASS, Items.AMETHYST_SHARD, 1);
        this.recycleBinSalvaging(Items.MAP, Items.PAPER, 4);
        this.recycleBinSalvaging(Items.WRITABLE_BOOK, Items.BOOK, 1);
        this.recycleBinSalvaging(Items.WRITABLE_BOOK, Items.FEATHER, 1);
        this.recycleBinSalvaging(Items.SADDLE, Items.LEATHER, 1);
        this.recycleBinSalvaging(Items.CARROT_ON_A_STICK, Items.CARROT, 1);
        this.recycleBinSalvaging(Items.CARROT_ON_A_STICK, Items.STICK, 1);
        this.recycleBinSalvaging(Items.CARROT_ON_A_STICK, Items.STRING, 1);
        this.recycleBinSalvaging(Items.WARPED_FUNGUS_ON_A_STICK, Items.WARPED_FUNGUS, 1);
        this.recycleBinSalvaging(Items.WARPED_FUNGUS_ON_A_STICK, Items.STICK, 1);
        this.recycleBinSalvaging(Items.WARPED_FUNGUS_ON_A_STICK, Items.STRING, 1);
        this.recycleBinSalvaging(Items.OAK_BOAT, Items.OAK_PLANKS, 2);
        this.recycleBinSalvaging(Items.OAK_CHEST_BOAT, Items.OAK_PLANKS, 2);
        this.recycleBinSalvaging(Items.OAK_CHEST_BOAT, ItemTags.PLANKS, 4);
        this.recycleBinSalvaging(Items.SPRUCE_BOAT, Items.SPRUCE_PLANKS, 2);
        this.recycleBinSalvaging(Items.SPRUCE_CHEST_BOAT, Items.SPRUCE_PLANKS, 2);
        this.recycleBinSalvaging(Items.SPRUCE_CHEST_BOAT, ItemTags.PLANKS, 4);
        this.recycleBinSalvaging(Items.BIRCH_BOAT, Items.BIRCH_PLANKS, 2);
        this.recycleBinSalvaging(Items.BIRCH_CHEST_BOAT, Items.BIRCH_PLANKS, 2);
        this.recycleBinSalvaging(Items.BIRCH_CHEST_BOAT, ItemTags.PLANKS, 4);
        this.recycleBinSalvaging(Items.JUNGLE_BOAT, Items.JUNGLE_PLANKS, 2);
        this.recycleBinSalvaging(Items.JUNGLE_CHEST_BOAT, Items.JUNGLE_PLANKS, 2);
        this.recycleBinSalvaging(Items.JUNGLE_CHEST_BOAT, ItemTags.PLANKS, 4);
        this.recycleBinSalvaging(Items.ACACIA_BOAT, Items.ACACIA_PLANKS, 2);
        this.recycleBinSalvaging(Items.ACACIA_CHEST_BOAT, Items.ACACIA_PLANKS, 2);
        this.recycleBinSalvaging(Items.ACACIA_CHEST_BOAT, ItemTags.PLANKS, 4);
        this.recycleBinSalvaging(Items.DARK_OAK_BOAT, Items.DARK_OAK_PLANKS, 2);
        this.recycleBinSalvaging(Items.DARK_OAK_CHEST_BOAT, Items.DARK_OAK_PLANKS, 2);
        this.recycleBinSalvaging(Items.DARK_OAK_CHEST_BOAT, ItemTags.PLANKS, 4);
        this.recycleBinSalvaging(Items.MANGROVE_BOAT, Items.MANGROVE_PLANKS, 2);
        this.recycleBinSalvaging(Items.MANGROVE_CHEST_BOAT, Items.MANGROVE_PLANKS, 2);
        this.recycleBinSalvaging(Items.MANGROVE_CHEST_BOAT, ItemTags.PLANKS, 4);
        this.recycleBinSalvaging(Items.CHERRY_BOAT, Items.CHERRY_PLANKS, 2);
        this.recycleBinSalvaging(Items.CHERRY_CHEST_BOAT, Items.CHERRY_PLANKS, 2);
        this.recycleBinSalvaging(Items.CHERRY_CHEST_BOAT, ItemTags.PLANKS, 4);
        this.recycleBinSalvaging(Items.BAMBOO_RAFT, Items.BAMBOO_PLANKS, 2);
        this.recycleBinSalvaging(Items.BAMBOO_CHEST_RAFT, Items.BAMBOO_PLANKS, 2);
        this.recycleBinSalvaging(Items.BAMBOO_CHEST_RAFT, ItemTags.PLANKS, 4);
        this.recycleBinSalvaging(Items.TRIDENT, Items.PRISMARINE_SHARD, 2);
        this.recycleBinSalvaging(Items.SHIELD, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.SHIELD, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.LEATHER_HELMET, Items.LEATHER, 2);
        this.recycleBinSalvaging(Items.LEATHER_CHESTPLATE, Items.LEATHER, 3);
        this.recycleBinSalvaging(Items.LEATHER_LEGGINGS, Items.LEATHER, 2);
        this.recycleBinSalvaging(Items.LEATHER_BOOTS, Items.LEATHER, 1);
        this.recycleBinSalvaging(Items.IRON_HELMET, Items.IRON_INGOT, 2);
        this.recycleBinSalvaging(Items.IRON_CHESTPLATE, Items.IRON_INGOT, 3);
        this.recycleBinSalvaging(Items.IRON_LEGGINGS, Items.IRON_INGOT, 2);
        this.recycleBinSalvaging(Items.IRON_BOOTS, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.CHAINMAIL_HELMET, Items.IRON_NUGGET, 4);
        this.recycleBinSalvaging(Items.CHAINMAIL_CHESTPLATE, Items.IRON_NUGGET, 6);
        this.recycleBinSalvaging(Items.CHAINMAIL_LEGGINGS, Items.IRON_NUGGET, 4);
        this.recycleBinSalvaging(Items.CHAINMAIL_BOOTS, Items.IRON_NUGGET, 2);
        this.recycleBinSalvaging(Items.GOLDEN_HELMET, Items.GOLD_INGOT, 2);
        this.recycleBinSalvaging(Items.GOLDEN_CHESTPLATE, Items.GOLD_INGOT, 3);
        this.recycleBinSalvaging(Items.GOLDEN_LEGGINGS, Items.GOLD_INGOT, 2);
        this.recycleBinSalvaging(Items.GOLDEN_BOOTS, Items.GOLD_INGOT, 1);
        this.recycleBinSalvaging(Items.DIAMOND_HELMET, Items.DIAMOND, 2);
        this.recycleBinSalvaging(Items.DIAMOND_CHESTPLATE, Items.DIAMOND, 3);
        this.recycleBinSalvaging(Items.DIAMOND_LEGGINGS, Items.DIAMOND, 2);
        this.recycleBinSalvaging(Items.DIAMOND_BOOTS, Items.DIAMOND, 1);
        this.recycleBinSalvaging(Items.NETHERITE_HELMET, Items.DIAMOND, 2);
        this.recycleBinSalvaging(Items.NETHERITE_HELMET, Items.NETHERITE_SCRAP, 1);
        this.recycleBinSalvaging(Items.NETHERITE_CHESTPLATE, Items.DIAMOND, 3);
        this.recycleBinSalvaging(Items.NETHERITE_CHESTPLATE, Items.NETHERITE_SCRAP, 1);
        this.recycleBinSalvaging(Items.NETHERITE_LEGGINGS, Items.DIAMOND, 2);
        this.recycleBinSalvaging(Items.NETHERITE_LEGGINGS, Items.NETHERITE_SCRAP, 1);
        this.recycleBinSalvaging(Items.NETHERITE_BOOTS, Items.DIAMOND, 1);
        this.recycleBinSalvaging(Items.NETHERITE_BOOTS, Items.NETHERITE_SCRAP, 1);
        this.recycleBinSalvaging(Items.TURTLE_HELMET, Items.SCUTE, 2);
        this.recycleBinSalvaging(Items.LEATHER_HORSE_ARMOR, Items.LEATHER, 3);
        this.recycleBinSalvaging(Items.IRON_HORSE_ARMOR, Items.IRON_INGOT, 3);
        this.recycleBinSalvaging(Items.GOLDEN_HORSE_ARMOR, Items.GOLD_INGOT, 3);
        this.recycleBinSalvaging(Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND, 3);
        this.recycleBinSalvaging(Items.TNT, Items.GUNPOWDER, 3);
        this.recycleBinSalvaging(Items.TNT, Items.SAND, 2);
        this.recycleBinSalvaging(Items.TOTEM_OF_UNDYING, Items.EMERALD, 4);
        this.recycleBinSalvaging(Items.TOTEM_OF_UNDYING, ItemTags.PLANKS, 2);
        this.recycleBinSalvaging(Items.BOW, Items.STICK, 2);
        this.recycleBinSalvaging(Items.BOW, Items.STRING, 2);
        this.recycleBinSalvaging(Items.CROSSBOW, Items.STICK, 1);
        this.recycleBinSalvaging(Items.CROSSBOW, Items.STRING, 1);
        this.recycleBinSalvaging(Items.CROSSBOW, Items.IRON_INGOT, 1);
        this.recycleBinSalvaging(Items.CROSSBOW, Items.TRIPWIRE_HOOK, 1);
        this.recycleBinSalvaging(Items.ARROW, Items.STICK, 1);
        this.recycleBinSalvaging(Items.TIPPED_ARROW, Items.STICK, 1);
        this.recycleBinSalvaging(Items.SPECTRAL_ARROW, Items.STICK, 1);
        this.recycleBinSalvaging(Items.SPECTRAL_ARROW, Items.GLOWSTONE_DUST, 1);
        this.recycleBinSalvaging(Items.POTION, Items.GLASS_BOTTLE, 1);
        this.recycleBinSalvaging(Items.LINGERING_POTION, Items.GLASS_BOTTLE, 1);
        this.recycleBinSalvaging(Items.SPLASH_POTION, Items.GLASS_BOTTLE, 1);
        this.recycleBinSalvaging(Items.BOOK, Items.LEATHER, 1);
        this.recycleBinSalvaging(Items.BOOK, Items.PAPER, 2);
        this.recycleBinSalvaging(Items.FLOWER_BANNER_PATTERN, Items.PAPER, 1);
        this.recycleBinSalvaging(Items.CREEPER_BANNER_PATTERN, Items.PAPER, 1);
        this.recycleBinSalvaging(Items.SKULL_BANNER_PATTERN, Items.PAPER, 1);
        this.recycleBinSalvaging(Items.MOJANG_BANNER_PATTERN, Items.PAPER, 1);
        this.recycleBinSalvaging(Items.GLOBE_BANNER_PATTERN, Items.PAPER, 1);
        this.recycleBinSalvaging(Items.PIGLIN_BANNER_PATTERN, Items.PAPER, 1);
        this.recycleBinSalvaging(Items.ENCHANTED_BOOK, Items.LEATHER, 1);
        this.recycleBinSalvaging(Items.ENCHANTED_BOOK, Items.PAPER, 2);
    }

    private void table(Block plank, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("PPP")
                .pattern("P P")
                .pattern("P P")
                .define('P', plank)
                .unlockedBy("has_planks", this.has.apply(plank))
                .save(this.consumer);
    }

    private void chair(Block plank, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("P  ")
                .pattern("PPP")
                .pattern("P P")
                .define('P', plank)
                .unlockedBy("has_planks", this.has.apply(plank))
                .save(this.consumer);
    }

    private void desk(Block plank, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("PPP")
                .pattern("PSP")
                .pattern("PSP")
                .define('P', plank)
                .define('S', Items.STICK)
                .unlockedBy("has_planks", this.has.apply(plank))
                .save(this.consumer);
    }

    private void drawer(Block plank, Block slab, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 2)
                .pattern("SSS")
                .pattern("PCP")
                .pattern("PPP")
                .define('S', slab)
                .define('P', plank)
                .define('C', Items.CHEST)
                .unlockedBy("has_planks", this.has.apply(plank))
                .save(this.consumer);
    }

    private void woodenKitchenCabinetry(Block plank, Block slab, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 2)
                .pattern("SSS")
                .pattern("PPP")
                .pattern("PDP")
                .define('S', slab)
                .define('P', plank)
                .define('D', Items.WHITE_DYE)
                .unlockedBy("has_planks", this.has.apply(plank))
                .save(this.consumer);
    }

    private void woodenKitchenDrawer(Block plank, Block slab, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 2)
                .pattern("SSS")
                .pattern("PCP")
                .pattern("PDP")
                .define('S', slab)
                .define('P', plank)
                .define('C', Items.CHEST)
                .define('D', Items.WHITE_DYE)
                .unlockedBy("has_planks", this.has.apply(plank))
                .save(this.consumer);
    }

    private void woodenKitchenSink(Block plank, Block slab, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("SIS")
                .pattern("PQP")
                .pattern("PDP")
                .define('S', slab)
                .define('P', plank)
                .define('I', Items.COPPER_INGOT)
                .define('Q', Items.QUARTZ_BLOCK)
                .define('D', Items.WHITE_DYE)
                .unlockedBy("has_planks", this.has.apply(plank))
                .save(this.consumer);
    }

    private void woodenKitchenStorageCabinet(Block plank, Block slab, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 2)
                .pattern("PPS")
                .pattern("D S")
                .pattern("PPS")
                .define('S', slab)
                .define('P', plank)
                .define('D', Items.WHITE_DYE)
                .unlockedBy("has_planks", this.has.apply(plank))
                .save(this.consumer);
    }

    private void colouredKitchenCabinetry(Item dye, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("D")
                .pattern("K")
                .define('D', dye)
                .define('K', ModTags.Items.WOODEN_KITCHEN_CABINETRY)
                .unlockedBy("has_dye", this.has.apply(dye))
                .save(this.consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("D")
                .pattern("K")
                .define('D', dye)
                .define('K', ModTags.Items.COLOURED_KITCHEN_CABINETRY)
                .unlockedBy("has_dye", this.has.apply(dye))
                .save(this.consumer);
    }

    private void colouredKitchenDrawer(Item dye, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("D")
                .pattern("K")
                .define('D', dye)
                .define('K', ModTags.Items.WOODEN_KITCHEN_DRAWERS)
                .unlockedBy("has_dye", this.has.apply(dye))
                .save(this.consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("D")
                .pattern("K")
                .define('D', dye)
                .define('K', ModTags.Items.COLOURED_KITCHEN_DRAWERS)
                .unlockedBy("has_dye", this.has.apply(dye))
                .save(this.consumer);
    }

    private void colouredKitchenSink(Item dye, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("D")
                .pattern("K")
                .define('D', dye)
                .define('K', ModTags.Items.WOODEN_KITCHEN_SINKS)
                .unlockedBy("has_dye", this.has.apply(dye))
                .save(this.consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("D")
                .pattern("K")
                .define('D', dye)
                .define('K', ModTags.Items.COLOURED_KITCHEN_SINKS)
                .unlockedBy("has_dye", this.has.apply(dye))
                .save(this.consumer);
    }

    private void colouredKitchenStorageCabinet(Item dye, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("KD")
                .define('D', dye)
                .define('K', ModTags.Items.WOODEN_KITCHEN_STORAGE_CABINETS)
                .unlockedBy("has_dye", this.has.apply(dye))
                .save(this.consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("KD")
                .define('D', dye)
                .define('K', ModTags.Items.COLOURED_KITCHEN_STORAGE_CABINETS)
                .unlockedBy("has_dye", this.has.apply(dye))
                .save(this.consumer);
    }

    private void toaster(Block light, Block dark)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, light)
                .pattern("IBI")
                .pattern("IRI")
                .define('I', Items.IRON_INGOT)
                .define('B', Items.IRON_BARS)
                .define('R', Items.REDSTONE)
                .unlockedBy("has_ingots", this.has.apply(Items.IRON_INGOT))
                .unlockedBy("has_redstone", this.has.apply(Items.REDSTONE))
                .save(this.consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, dark)
                .requires(light)
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_ingots", this.has.apply(Items.IRON_INGOT))
                .unlockedBy("has_redstone", this.has.apply(Items.REDSTONE))
                .save(this.consumer);
    }

    private void microwave(Block light, Block dark)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, light)
                .pattern("IGI")
                .pattern("IRI")
                .define('I', Items.IRON_INGOT)
                .define('G', Items.GLASS_PANE)
                .define('R', Items.REDSTONE)
                .unlockedBy("has_ingots", this.has.apply(Items.IRON_INGOT))
                .unlockedBy("has_redstone", this.has.apply(Items.REDSTONE))
                .save(this.consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, dark)
                .requires(light)
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_ingots", this.has.apply(Items.IRON_INGOT))
                .unlockedBy("has_redstone", this.has.apply(Items.REDSTONE))
                .save(this.consumer);
    }

    private void stove(Block light, Block dark)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, light)
                .pattern("IBI")
                .pattern("IFI")
                .pattern("IRI")
                .define('I', Items.IRON_INGOT)
                .define('B', Items.IRON_BARS)
                .define('F', Items.FURNACE)
                .define('R', Items.REDSTONE)
                .unlockedBy("has_ingots", this.has.apply(Items.IRON_INGOT))
                .unlockedBy("has_redstone", this.has.apply(Items.REDSTONE))
                .save(this.consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, dark)
                .requires(light)
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_ingots", this.has.apply(Items.IRON_INGOT))
                .unlockedBy("has_redstone", this.has.apply(Items.REDSTONE))
                .save(this.consumer);
    }

    private void rangeHood(Block light, Block dark)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, light)
                .pattern(" R ")
                .pattern("ILI")
                .define('R', Items.REDSTONE)
                .define('I', Items.IRON_INGOT)
                .define('L', Items.REDSTONE_LAMP)
                .unlockedBy("has_ingots", this.has.apply(Items.IRON_INGOT))
                .unlockedBy("has_redstone", this.has.apply(Items.REDSTONE))
                .save(this.consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, dark)
                .requires(light)
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_ingots", this.has.apply(Items.IRON_INGOT))
                .unlockedBy("has_redstone", this.has.apply(Items.REDSTONE))
                .save(this.consumer);
    }

    private void fryingPan(Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("SII")
                .define('S', Items.STICK)
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_ingots", this.has.apply(Items.IRON_INGOT))
                .save(this.consumer);
    }

    private void recyclingBin(Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("III")
                .pattern("IRI")
                .pattern("IPI")
                .define('I', Items.IRON_INGOT)
                .define('R', Items.REDSTONE)
                .define('P', Items.PISTON)
                .unlockedBy("has_ingots", this.has.apply(Items.IRON_INGOT))
                .unlockedBy("has_redstone", this.has.apply(Items.REDSTONE))
                .save(this.consumer);
    }

    private void cuttingBoard(Block slab, Block plank, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("SS")
                .define('S', slab)
                .unlockedBy("has_planks", this.has.apply(plank))
                .unlockedBy("has_slabs", this.has.apply(slab))
                .save(this.consumer);
    }

    private void plate(Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result, 4)
                .pattern("QQ")
                .define('Q', Items.QUARTZ_BLOCK)
                .unlockedBy("has_quartz_block", this.has.apply(Items.QUARTZ_BLOCK))
                .unlockedBy("has_quartz", this.has.apply(Items.QUARTZ))
                .save(this.consumer);
    }

    private void crate(Block plank, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("PSP")
                .pattern("SPS")
                .pattern("PSP")
                .define('P', plank)
                .define('S', Items.STICK)
                .unlockedBy("has_planks", this.has.apply(plank))
                .save(this.consumer);
    }

    private void grill(Item dye, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("IBI")
                .pattern("IDI")
                .pattern("I I")
                .define('I', Items.IRON_INGOT)
                .define('B', Items.IRON_BARS)
                .define('D', dye)
                .unlockedBy("has_ingots", this.has.apply(Items.IRON_INGOT))
                .unlockedBy("has_dye", this.has.apply(dye))
                .save(this.consumer);
    }

    private void mailbox(Block slab, Block plank, Block fence, Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("SSS")
                .pattern("PCP")
                .pattern(" F ")
                .define('S', slab)
                .define('P', plank)
                .define('C', Blocks.CHEST)
                .define('F', fence)
                .unlockedBy("has_planks", this.has.apply(plank))
                .save(this.consumer);
    }

    private void postBox(Block result)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result)
                .pattern("DID")
                .pattern("ICI")
                .pattern("IBI")
                .define('D', Items.BLUE_DYE)
                .define('I', Items.IRON_INGOT)
                .define('B', Blocks.IRON_BLOCK)
                .define('C', Blocks.CHEST)
                .unlockedBy("has_ingots", this.has.apply(Items.IRON_INGOT))
                .save(this.consumer);
    }

    private void cooking(String name, RecipeCategory category, RecipeSerializer<? extends AbstractCookingRecipe> serializer, ItemLike input, ItemLike output, int time, float experience)
    {
        String baseName = input.asItem().toString();
        String resultName = output.asItem().toString();
        SimpleCookingRecipeBuilder
                .generic(Ingredient.of(input), category, output, experience, time, serializer)
                .unlockedBy("has_" + baseName, this.has.apply(input))
                .save(this.consumer, resultName + "_from_" + name);
    }

    private void grillCooking(ItemLike rawItem, ItemLike cookedItem, int cookingTime, float experience)
    {
        this.cooking("grill_cooking", RecipeCategory.FOOD, ModRecipeSerializers.GRILL_RECIPE.get(), rawItem, cookedItem, cookingTime, experience);
    }

    private void freezerSolidifying(ItemLike baseItem, ItemLike frozenItem, int freezeTime, float experience)
    {
        this.cooking("freezer_solidifying", RecipeCategory.MISC, ModRecipeSerializers.FREEZER_RECIPE.get(), baseItem, frozenItem, freezeTime, experience);
    }

    private void toasterHeating(ItemLike baseItem, ItemLike heatedItem, int heatingTime, float experience)
    {
        this.cooking("toaster_heating", RecipeCategory.FOOD, ModRecipeSerializers.TOASTER_RECIPE.get(), baseItem, heatedItem, heatingTime, experience);
    }

    private void microwaveHeating(ItemLike baseItem, ItemLike heatedItem, int heatingTime, float experience)
    {
        this.cooking("microwave_heating", RecipeCategory.FOOD, ModRecipeSerializers.MICROWAVE_RECIPE.get(), baseItem, heatedItem, heatingTime, experience);
    }

    private void fryingPanCooking(ItemLike baseItem, ItemLike heatedItem, int heatingTime, float experience)
    {
        this.cooking("frying_pan_cooking", RecipeCategory.FOOD, ModRecipeSerializers.FRYING_PAN_RECIPE.get(), baseItem, heatedItem, heatingTime, experience);
    }

    private void cuttingBoardSlicing(ItemLike baseItem, ItemLike resultItem, int resultCount)
    {
        String baseName = baseItem.asItem().toString();
        String resultName = resultItem.asItem().toString();
        SingleItemRecipeBuilder builder = new SingleItemRecipeBuilder(RecipeCategory.MISC, ModRecipeSerializers.CUTTING_BOARD_RECIPE.get(), Ingredient.of(baseItem), resultItem, resultCount);
        builder.unlockedBy("has_" + baseName, this.has.apply(baseItem)).save(this.consumer, resultName + "_from_cutting_board_slicing");
    }

    private void recycleBinSalvaging(ItemLike baseItem, ItemLike resultItem, int resultCount)
    {
        String baseName = baseItem.asItem().toString();
        String resultName = resultItem.asItem().toString();
        SingleItemRecipeBuilder builder = new SingleItemRecipeBuilder(RecipeCategory.MISC, ModRecipeSerializers.RECYCLE_BIN_RECIPE.get(), Ingredient.of(resultItem), baseItem, resultCount);
        builder.unlockedBy("has_" + baseName, this.has.apply(baseItem)).save(this.consumer, resultName + "_from_recycling_" + baseName);
    }

    private void recycleBinSalvaging(ItemLike baseItem, TagKey<Item> resultItem, int resultCount)
    {
        String baseName = baseItem.asItem().toString();
        String resultName = resultItem.location().toString().replace(":", "_");
        SingleItemRecipeBuilder builder = new SingleItemRecipeBuilder(RecipeCategory.MISC, ModRecipeSerializers.RECYCLE_BIN_RECIPE.get(), Ingredient.of(resultItem), baseItem, resultCount);
        builder.unlockedBy("has_" + baseName, this.has.apply(baseItem)).save(this.consumer, resultName + "_from_recycling_" + baseName);
    }
}
