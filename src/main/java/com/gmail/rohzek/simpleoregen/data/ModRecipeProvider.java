package com.gmail.rohzek.simpleoregen.data;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.gmail.rohzek.simpleoregen.blocks.OreGenBlocks;
import com.gmail.rohzek.simpleoregen.blocks.WorldGenBlocks;
import com.gmail.rohzek.simpleoregen.items.OreGenArmors;
import com.gmail.rohzek.simpleoregen.items.OreGenItems;
import com.gmail.rohzek.simpleoregen.items.OreGenTools;
import com.gmail.rohzek.simpleoregen.items.VanillaTypeArmors;
import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.BlastingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder
{

	public ModRecipeProvider(PackOutput output, CompletableFuture<Provider> registries) 
	{
		super(output, registries);
	}

	@Override
    protected void buildRecipes(RecipeOutput recipeOutput) 
	{
		List<ItemLike> COPPER_SMELTABLES = List.of(OreGenBlocks.SURFACE_COPPER_ORE, 
        		OreGenBlocks.DEEPSLATE_COPPER_ORE, OreGenBlocks.ANDESITE_COPPER_ORE, OreGenBlocks.DIORITE_COPPER_ORE, 
        		OreGenBlocks.GRANITE_COPPER_ORE, OreGenBlocks.SANDSTONE_COPPER_ORE, OreGenBlocks.SAND_COPPER_ORE, 
        		OreGenBlocks.GRAVEL_COPPER_ORE, OreGenBlocks.NETHER_COPPER_ORE, OreGenBlocks.END_COPPER_ORE);
		List<ItemLike> COPPER_NUGGET_SMELTABLES = List.of(OreGenBlocks.SURFACE_COPPER_NUGGET_ORE, 
        		OreGenBlocks.DEEPSLATE_COPPER_NUGGET_ORE, OreGenBlocks.ANDESITE_COPPER_NUGGET_ORE, OreGenBlocks.DIORITE_COPPER_NUGGET_ORE, 
        		OreGenBlocks.GRANITE_COPPER_NUGGET_ORE, OreGenBlocks.SANDSTONE_COPPER_NUGGET_ORE, OreGenBlocks.SAND_COPPER_NUGGET_ORE, 
        		OreGenBlocks.GRAVEL_COPPER_NUGGET_ORE);
		List<ItemLike> EMERALD_SMELTABLES = List.of(OreGenBlocks.SURFACE_EMERALD_ORE, 
        		OreGenBlocks.DEEPSLATE_EMERALD_ORE, OreGenBlocks.ANDESITE_EMERALD_ORE, OreGenBlocks.DIORITE_EMERALD_ORE, 
        		OreGenBlocks.GRANITE_EMERALD_ORE, OreGenBlocks.SANDSTONE_EMERALD_ORE, OreGenBlocks.SAND_EMERALD_ORE, 
        		OreGenBlocks.GRAVEL_EMERALD_ORE, OreGenBlocks.NETHER_EMERALD_ORE, OreGenBlocks.END_EMERALD_ORE);
		List<ItemLike> GOLD_SMELTABLES = List.of(OreGenBlocks.SURFACE_GOLD_ORE, 
        		OreGenBlocks.DEEPSLATE_GOLD_ORE, OreGenBlocks.ANDESITE_GOLD_ORE, OreGenBlocks.DIORITE_GOLD_ORE, 
        		OreGenBlocks.GRANITE_GOLD_ORE, OreGenBlocks.SANDSTONE_GOLD_ORE, OreGenBlocks.SAND_GOLD_ORE, 
        		OreGenBlocks.GRAVEL_GOLD_ORE, OreGenBlocks.NETHER_GOLD_ORE, OreGenBlocks.END_GOLD_ORE);
		List<ItemLike> GOLD_NUGGET_SMELTABLES = List.of(OreGenBlocks.SURFACE_GOLD_NUGGET_ORE, 
        		OreGenBlocks.DEEPSLATE_GOLD_NUGGET_ORE, OreGenBlocks.ANDESITE_GOLD_NUGGET_ORE, OreGenBlocks.DIORITE_GOLD_NUGGET_ORE, 
        		OreGenBlocks.GRANITE_GOLD_NUGGET_ORE, OreGenBlocks.SANDSTONE_GOLD_NUGGET_ORE, OreGenBlocks.SAND_GOLD_NUGGET_ORE, 
        		OreGenBlocks.GRAVEL_GOLD_NUGGET_ORE);
		List<ItemLike> IRON_SMELTABLES = List.of(OreGenBlocks.SURFACE_IRON_ORE, 
        		OreGenBlocks.DEEPSLATE_IRON_ORE, OreGenBlocks.ANDESITE_IRON_ORE, OreGenBlocks.DIORITE_IRON_ORE, 
        		OreGenBlocks.GRANITE_IRON_ORE, OreGenBlocks.SANDSTONE_IRON_ORE, OreGenBlocks.SAND_IRON_ORE, 
        		OreGenBlocks.GRAVEL_IRON_ORE, OreGenBlocks.NETHER_IRON_ORE, OreGenBlocks.END_IRON_ORE);
		List<ItemLike> IRON_NUGGET_SMELTABLES = List.of(OreGenBlocks.SURFACE_IRON_NUGGET_ORE, 
        		OreGenBlocks.DEEPSLATE_IRON_NUGGET_ORE, OreGenBlocks.ANDESITE_IRON_NUGGET_ORE, OreGenBlocks.DIORITE_IRON_NUGGET_ORE, 
        		OreGenBlocks.GRANITE_IRON_NUGGET_ORE, OreGenBlocks.SANDSTONE_IRON_NUGGET_ORE, OreGenBlocks.SAND_IRON_NUGGET_ORE, 
        		OreGenBlocks.GRAVEL_IRON_NUGGET_ORE);
		List<ItemLike> LAPIS_SMELTABLES = List.of(OreGenBlocks.SURFACE_LAPIS_ORE, 
        		OreGenBlocks.DEEPSLATE_LAPIS_ORE, OreGenBlocks.ANDESITE_LAPIS_ORE, OreGenBlocks.DIORITE_LAPIS_ORE, 
        		OreGenBlocks.GRANITE_LAPIS_ORE, OreGenBlocks.SANDSTONE_LAPIS_ORE, OreGenBlocks.SAND_LAPIS_ORE, 
        		OreGenBlocks.GRAVEL_LAPIS_ORE, OreGenBlocks.NETHER_LAPIS_ORE, OreGenBlocks.END_LAPIS_ORE);
		List<ItemLike> REDSTONE_SMELTABLES = List.of(OreGenBlocks.SURFACE_REDSTONE_ORE, 
        		OreGenBlocks.DEEPSLATE_REDSTONE_ORE, OreGenBlocks.ANDESITE_REDSTONE_ORE, OreGenBlocks.DIORITE_REDSTONE_ORE, 
        		OreGenBlocks.GRANITE_REDSTONE_ORE, OreGenBlocks.SANDSTONE_REDSTONE_ORE, OreGenBlocks.SAND_REDSTONE_ORE, 
        		OreGenBlocks.GRAVEL_REDSTONE_ORE, OreGenBlocks.NETHER_REDSTONE_ORE, OreGenBlocks.END_REDSTONE_ORE);
		
		
        List<ItemLike> BAUXITE_SMELTABLES = List.of(OreGenItems.RAW_BAUXITE, OreGenBlocks.SURFACE_BAUXITE_ORE, 
        		OreGenBlocks.DEEPSLATE_BAUXITE_ORE, OreGenBlocks.ANDESITE_BAUXITE_ORE, OreGenBlocks.DIORITE_BAUXITE_ORE, 
        		OreGenBlocks.GRANITE_BAUXITE_ORE, OreGenBlocks.SANDSTONE_BAUXITE_ORE, OreGenBlocks.SAND_BAUXITE_ORE, 
        		OreGenBlocks.GRAVEL_BAUXITE_ORE, OreGenBlocks.NETHER_BAUXITE_ORE, OreGenBlocks.END_BAUXITE_ORE);
        
        List<ItemLike> COBALT_SMELTABLES = List.of(OreGenItems.RAW_COBALT, OreGenBlocks.SURFACE_COBALT_ORE, 
        		OreGenBlocks.DEEPSLATE_COBALT_ORE, OreGenBlocks.ANDESITE_COBALT_ORE, OreGenBlocks.DIORITE_COBALT_ORE, 
        		OreGenBlocks.GRANITE_COBALT_ORE, OreGenBlocks.SANDSTONE_COBALT_ORE, OreGenBlocks.SAND_COBALT_ORE, 
        		OreGenBlocks.GRAVEL_COBALT_ORE, OreGenBlocks.NETHER_COBALT_ORE, OreGenBlocks.END_COBALT_ORE);
        
        List<ItemLike> IRIDIUM_SMELTABLES = List.of(OreGenItems.RAW_IRIDIUM, OreGenBlocks.SURFACE_IRIDIUM_ORE, 
        		OreGenBlocks.DEEPSLATE_IRIDIUM_ORE, OreGenBlocks.ANDESITE_IRIDIUM_ORE, OreGenBlocks.DIORITE_IRIDIUM_ORE, 
        		OreGenBlocks.GRANITE_IRIDIUM_ORE, OreGenBlocks.SANDSTONE_IRIDIUM_ORE, OreGenBlocks.SAND_IRIDIUM_ORE, 
        		OreGenBlocks.GRAVEL_IRIDIUM_ORE, OreGenBlocks.NETHER_IRIDIUM_ORE, OreGenBlocks.END_IRIDIUM_ORE);
        
        List<ItemLike> LEAD_SMELTABLES = List.of(OreGenItems.RAW_LEAD, OreGenBlocks.SURFACE_LEAD_ORE, 
        		OreGenBlocks.DEEPSLATE_LEAD_ORE, OreGenBlocks.ANDESITE_LEAD_ORE, OreGenBlocks.DIORITE_LEAD_ORE, 
        		OreGenBlocks.GRANITE_LEAD_ORE, OreGenBlocks.SANDSTONE_LEAD_ORE, OreGenBlocks.SAND_LEAD_ORE, 
        		OreGenBlocks.GRAVEL_LEAD_ORE, OreGenBlocks.NETHER_LEAD_ORE, OreGenBlocks.END_LEAD_ORE);
        
        List<ItemLike> NICKEL_SMELTABLES = List.of(OreGenItems.RAW_NICKEL, OreGenBlocks.SURFACE_NICKEL_ORE, 
        		OreGenBlocks.DEEPSLATE_NICKEL_ORE, OreGenBlocks.ANDESITE_NICKEL_ORE, OreGenBlocks.DIORITE_NICKEL_ORE, 
        		OreGenBlocks.GRANITE_NICKEL_ORE, OreGenBlocks.SANDSTONE_NICKEL_ORE, OreGenBlocks.SAND_NICKEL_ORE, 
        		OreGenBlocks.GRAVEL_NICKEL_ORE, OreGenBlocks.NETHER_NICKEL_ORE, OreGenBlocks.END_NICKEL_ORE);
        
        List<ItemLike> PLATINUM_SMELTABLES = List.of(OreGenItems.RAW_PLATINUM, OreGenBlocks.SURFACE_PLATINUM_ORE, 
        		OreGenBlocks.DEEPSLATE_PLATINUM_ORE, OreGenBlocks.ANDESITE_PLATINUM_ORE, OreGenBlocks.DIORITE_PLATINUM_ORE, 
        		OreGenBlocks.GRANITE_PLATINUM_ORE, OreGenBlocks.SANDSTONE_PLATINUM_ORE, OreGenBlocks.SAND_PLATINUM_ORE, 
        		OreGenBlocks.GRAVEL_PLATINUM_ORE, OreGenBlocks.NETHER_PLATINUM_ORE, OreGenBlocks.END_PLATINUM_ORE);
        
        List<ItemLike> SILVER_SMELTABLES = List.of(OreGenItems.RAW_SILVER, OreGenBlocks.SURFACE_SILVER_ORE, 
        		OreGenBlocks.DEEPSLATE_SILVER_ORE, OreGenBlocks.ANDESITE_SILVER_ORE, OreGenBlocks.DIORITE_SILVER_ORE, 
        		OreGenBlocks.GRANITE_SILVER_ORE, OreGenBlocks.SANDSTONE_SILVER_ORE, OreGenBlocks.SAND_SILVER_ORE, 
        		OreGenBlocks.GRAVEL_SILVER_ORE, OreGenBlocks.NETHER_SILVER_ORE, OreGenBlocks.END_SILVER_ORE);
        
        List<ItemLike> TIN_SMELTABLES = List.of(OreGenItems.RAW_TIN, OreGenBlocks.SURFACE_TIN_ORE, 
        		OreGenBlocks.DEEPSLATE_TIN_ORE, OreGenBlocks.ANDESITE_TIN_ORE, OreGenBlocks.DIORITE_TIN_ORE, 
        		OreGenBlocks.GRANITE_TIN_ORE, OreGenBlocks.SANDSTONE_TIN_ORE, OreGenBlocks.SAND_TIN_ORE, 
        		OreGenBlocks.GRAVEL_TIN_ORE, OreGenBlocks.NETHER_TIN_ORE, OreGenBlocks.END_TIN_ORE);
        
        List<ItemLike> TUNGSTEN_SMELTABLES = List.of(OreGenItems.RAW_TUNGSTEN, OreGenBlocks.SURFACE_TUNGSTEN_ORE, 
        		OreGenBlocks.DEEPSLATE_TUNGSTEN_ORE, OreGenBlocks.ANDESITE_TUNGSTEN_ORE, OreGenBlocks.DIORITE_TUNGSTEN_ORE, 
        		OreGenBlocks.GRANITE_TUNGSTEN_ORE, OreGenBlocks.SANDSTONE_TUNGSTEN_ORE, OreGenBlocks.SAND_TUNGSTEN_ORE, 
        		OreGenBlocks.GRAVEL_TUNGSTEN_ORE, OreGenBlocks.NETHER_TUNGSTEN_ORE, OreGenBlocks.END_TUNGSTEN_ORE);
        
        List<ItemLike> URANIUM_SMELTABLES = List.of(OreGenItems.RAW_URANIUM, OreGenBlocks.SURFACE_URANIUM_ORE, 
        		OreGenBlocks.DEEPSLATE_URANIUM_ORE, OreGenBlocks.ANDESITE_URANIUM_ORE, OreGenBlocks.DIORITE_URANIUM_ORE, 
        		OreGenBlocks.GRANITE_URANIUM_ORE, OreGenBlocks.SANDSTONE_URANIUM_ORE, OreGenBlocks.SAND_URANIUM_ORE, 
        		OreGenBlocks.GRAVEL_URANIUM_ORE, OreGenBlocks.NETHER_URANIUM_ORE, OreGenBlocks.END_URANIUM_ORE);
        
        List<ItemLike> ZINC_SMELTABLES = List.of(OreGenItems.RAW_ZINC, OreGenBlocks.SURFACE_ZINC_ORE, 
        		OreGenBlocks.DEEPSLATE_ZINC_ORE, OreGenBlocks.ANDESITE_ZINC_ORE, OreGenBlocks.DIORITE_ZINC_ORE, 
        		OreGenBlocks.GRANITE_ZINC_ORE, OreGenBlocks.SANDSTONE_ZINC_ORE, OreGenBlocks.SAND_ZINC_ORE, 
        		OreGenBlocks.GRAVEL_ZINC_ORE, OreGenBlocks.NETHER_ZINC_ORE, OreGenBlocks.END_ZINC_ORE);
        
        List<ItemLike> RUBY_SMELTABLES = List.of(OreGenBlocks.SURFACE_RUBY_ORE, 
        		OreGenBlocks.DEEPSLATE_RUBY_ORE, OreGenBlocks.ANDESITE_RUBY_ORE, OreGenBlocks.DIORITE_RUBY_ORE, 
        		OreGenBlocks.GRANITE_RUBY_ORE, OreGenBlocks.SANDSTONE_RUBY_ORE, OreGenBlocks.SAND_RUBY_ORE, 
        		OreGenBlocks.GRAVEL_RUBY_ORE, OreGenBlocks.NETHER_RUBY_ORE, OreGenBlocks.END_RUBY_ORE);
        
        List<ItemLike> SAPPHIRE_SMELTABLES = List.of(OreGenBlocks.SURFACE_SAPPHIRE_ORE, 
        		OreGenBlocks.DEEPSLATE_SAPPHIRE_ORE, OreGenBlocks.ANDESITE_SAPPHIRE_ORE, OreGenBlocks.DIORITE_SAPPHIRE_ORE, 
        		OreGenBlocks.GRANITE_SAPPHIRE_ORE, OreGenBlocks.SANDSTONE_SAPPHIRE_ORE, OreGenBlocks.SAND_SAPPHIRE_ORE, 
        		OreGenBlocks.GRAVEL_SAPPHIRE_ORE, OreGenBlocks.NETHER_SAPPHIRE_ORE, OreGenBlocks.END_SAPPHIRE_ORE);
        
        // Raw Blocks
        shapedCraftingSolidBlocks(recipeOutput, "has_bauxite_raw", OreGenItems.RAW_BAUXITE.get(), OreGenBlocks.RAW_BAUXITE_BLOCK.get(), OreGenTags.Items.RAW_BAUXITES, "_from_raw");
        shapedCraftingSolidBlocks(recipeOutput, "has_cobalt_raw", OreGenItems.RAW_COBALT.get(), OreGenBlocks.RAW_COBALT_BLOCK.get(), OreGenTags.Items.RAW_COBALTS, "_from_raw");
        shapedCraftingSolidBlocks(recipeOutput, "has_iridium_raw", OreGenItems.RAW_IRIDIUM.get(), OreGenBlocks.RAW_IRIDIUM_BLOCK.get(), OreGenTags.Items.RAW_IRIDIUMS, "_from_raw");
        shapedCraftingSolidBlocks(recipeOutput, "has_lead_raw", OreGenItems.RAW_LEAD.get(), OreGenBlocks.RAW_LEAD_BLOCK.get(), OreGenTags.Items.RAW_LEADS, "_from_raw");
        shapedCraftingSolidBlocks(recipeOutput, "has_nickel_raw", OreGenItems.RAW_NICKEL.get(), OreGenBlocks.RAW_NICKEL_BLOCK.get(), OreGenTags.Items.RAW_NICKELS, "_from_raw");
        shapedCraftingSolidBlocks(recipeOutput, "has_platinum_raw", OreGenItems.RAW_PLATINUM.get(), OreGenBlocks.RAW_PLATINUM_BLOCK.get(), OreGenTags.Items.RAW_PLATINUMS, "_from_raw");
        shapedCraftingSolidBlocks(recipeOutput, "has_silver_raw", OreGenItems.RAW_SILVER.get(), OreGenBlocks.RAW_SILVER_BLOCK.get(), OreGenTags.Items.RAW_SILVERS, "_from_raw");
        shapedCraftingSolidBlocks(recipeOutput, "has_tin_raw", OreGenItems.RAW_TIN.get(), OreGenBlocks.RAW_TIN_BLOCK.get(), OreGenTags.Items.RAW_TINS, "_from_raw");
        shapedCraftingSolidBlocks(recipeOutput, "has_tungsten_raw", OreGenItems.RAW_TUNGSTEN.get(), OreGenBlocks.RAW_TUNGSTEN_BLOCK.get(), OreGenTags.Items.RAW_TUNGSTENS, "_from_raw");
        shapedCraftingSolidBlocks(recipeOutput, "has_uranium_raw", OreGenItems.RAW_URANIUM.get(), OreGenBlocks.RAW_URANIUM_BLOCK.get(), OreGenTags.Items.RAW_URANIUMS, "_from_raw");
        shapedCraftingSolidBlocks(recipeOutput, "has_zinc_raw", OreGenItems.RAW_ZINC.get(), OreGenBlocks.RAW_ZINC_BLOCK.get(), OreGenTags.Items.RAW_ZINCS, "_from_raw");
        
        // Solid Blocks
        shapedCraftingSolidBlocks(recipeOutput, "has_bauxite", OreGenItems.BAUXITE_INGOT.get(), OreGenBlocks.BAUXITE_BLOCK.get(), OreGenTags.Items.BAUXITE_INGOTS, "_from_ingot");
        shapedCraftingSolidBlocks(recipeOutput, "has_bronze", OreGenItems.BRONZE_INGOT.get(), OreGenBlocks.BRONZE_BLOCK.get(), OreGenTags.Items.BRONZE_INGOTS, "_from_ingot");
        shapedCraftingSolidBlocks(recipeOutput, "has_cobalt", OreGenItems.COBALT_INGOT.get(), OreGenBlocks.COBALT_BLOCK.get(), OreGenTags.Items.COBALT_INGOTS, "_from_ingot");
        shapedCraftingSolidBlocks(recipeOutput, "has_iridium", OreGenItems.IRIDIUM_INGOT.get(), OreGenBlocks.IRIDIUM_BLOCK.get(), OreGenTags.Items.IRIDIUM_INGOTS, "_from_ingot");
        shapedCraftingSolidBlocks(recipeOutput, "has_lead", OreGenItems.LEAD_INGOT.get(), OreGenBlocks.LEAD_BLOCK.get(), OreGenTags.Items.LEAD_INGOTS, "_from_ingot");
        shapedCraftingSolidBlocks(recipeOutput, "has_nickel", OreGenItems.NICKEL_INGOT.get(), OreGenBlocks.NICKEL_BLOCK.get(), OreGenTags.Items.NICKEL_INGOTS, "_from_ingot");
        shapedCraftingSolidBlocks(recipeOutput, "has_platinum", OreGenItems.PLATINUM_INGOT.get(), OreGenBlocks.PLATINUM_BLOCK.get(), OreGenTags.Items.PLATINUM_INGOTS, "_from_ingot");
        shapedCraftingSolidBlocks(recipeOutput, "has_silver", OreGenItems.SILVER_INGOT.get(), OreGenBlocks.SILVER_BLOCK.get(), OreGenTags.Items.SILVER_INGOTS, "_from_ingot");
        shapedCraftingSolidBlocks(recipeOutput, "has_steel", OreGenItems.STEEL_INGOT.get(), OreGenBlocks.STEEL_BLOCK.get(), OreGenTags.Items.STEEL_INGOTS, "_from_ingot");
        shapedCraftingSolidBlocks(recipeOutput, "has_tin", OreGenItems.TIN_INGOT.get(), OreGenBlocks.TIN_BLOCK.get(), OreGenTags.Items.TIN_INGOTS, "_from_ingot");
        shapedCraftingSolidBlocks(recipeOutput, "has_tungsten", OreGenItems.TUNGSTEN_INGOT.get(), OreGenBlocks.TUNGSTEN_BLOCK.get(), OreGenTags.Items.TUNGSTEN_INGOTS, "_from_ingot");
        shapedCraftingSolidBlocks(recipeOutput, "has_uranium", OreGenItems.URANIUM_INGOT.get(), OreGenBlocks.URANIUM_BLOCK.get(), OreGenTags.Items.URANIUM_INGOTS, "_from_ingot");
        shapedCraftingSolidBlocks(recipeOutput, "has_zinc", OreGenItems.ZINC_INGOT.get(), OreGenBlocks.ZINC_BLOCK.get(), OreGenTags.Items.ZINC_INGOTS, "_from_ingot");
        shapedCraftingSolidBlocks(recipeOutput, "has_ruby", OreGenItems.RUBY.get(), OreGenBlocks.RUBY_BLOCK.get(), OreGenTags.Items.RUBIES, "_from_ingot");
        shapedCraftingSolidBlocks(recipeOutput, "has_sapphire", OreGenItems.SAPPHIRE.get(), OreGenBlocks.SAPPHIRE_BLOCK.get(), OreGenTags.Items.SAPPHIRES, "_from_ingot");
        
        // Raw Blocks to Raws
        shapelessCraftingIngots(recipeOutput, "has_bauxite", OreGenBlocks.RAW_BAUXITE_BLOCK.get(), OreGenItems.RAW_BAUXITE.get(), "_to_raw");
        shapelessCraftingIngots(recipeOutput, "has_cobalt", OreGenBlocks.RAW_COBALT_BLOCK.get(), OreGenItems.RAW_COBALT.get(), "_to_raw");
        shapelessCraftingIngots(recipeOutput, "has_iridium", OreGenBlocks.RAW_IRIDIUM_BLOCK.get(), OreGenItems.RAW_IRIDIUM.get(), "_to_raw");
        shapelessCraftingIngots(recipeOutput, "has_lead", OreGenBlocks.RAW_LEAD_BLOCK.get(), OreGenItems.RAW_LEAD.get(), "_to_raw");
        shapelessCraftingIngots(recipeOutput, "has_nickel", OreGenBlocks.RAW_NICKEL_BLOCK.get(), OreGenItems.RAW_NICKEL.get(), "_to_raw");
        shapelessCraftingIngots(recipeOutput, "has_platinum", OreGenBlocks.RAW_PLATINUM_BLOCK.get(), OreGenItems.RAW_PLATINUM.get(), "_to_raw");
        shapelessCraftingIngots(recipeOutput, "has_silver", OreGenBlocks.RAW_SILVER_BLOCK.get(), OreGenItems.RAW_SILVER.get(), "_to_raw");
        shapelessCraftingIngots(recipeOutput, "has_tin", OreGenBlocks.RAW_TIN_BLOCK.get(), OreGenItems.RAW_TIN.get(), "_to_raw");
        shapelessCraftingIngots(recipeOutput, "has_tungsten", OreGenBlocks.RAW_TUNGSTEN_BLOCK.get(), OreGenItems.RAW_TUNGSTEN.get(), "_to_raw");
        shapelessCraftingIngots(recipeOutput, "has_uranium", OreGenBlocks.RAW_URANIUM_BLOCK.get(), OreGenItems.RAW_URANIUM.get(), "_to_raw");
        shapelessCraftingIngots(recipeOutput, "has_zinc", OreGenBlocks.RAW_ZINC_BLOCK.get(), OreGenItems.RAW_ZINC.get(), "_to_raw");
        
        // Blocks to Ingots
        shapelessCraftingIngots(recipeOutput, "has_bauxite", OreGenBlocks.BAUXITE_BLOCK.get(), OreGenItems.BAUXITE_INGOT.get(), "_to_ingot");
        shapelessCraftingIngots(recipeOutput, "has_bronze", OreGenBlocks.BRONZE_BLOCK.get(), OreGenItems.BRONZE_INGOT.get(), "_to_ingot");
        shapelessCraftingIngots(recipeOutput, "has_cobalt", OreGenBlocks.COBALT_BLOCK.get(), OreGenItems.COBALT_INGOT.get(), "_to_ingot");
        shapelessCraftingIngots(recipeOutput, "has_iridium", OreGenBlocks.IRIDIUM_BLOCK.get(), OreGenItems.IRIDIUM_INGOT.get(), "_to_ingot");
        shapelessCraftingIngots(recipeOutput, "has_lead", OreGenBlocks.LEAD_BLOCK.get(), OreGenItems.LEAD_INGOT.get(), "_to_ingot");
        shapelessCraftingIngots(recipeOutput, "has_nickel", OreGenBlocks.NICKEL_BLOCK.get(), OreGenItems.NICKEL_INGOT.get(), "_to_ingot");
        shapelessCraftingIngots(recipeOutput, "has_platinum", OreGenBlocks.PLATINUM_BLOCK.get(), OreGenItems.PLATINUM_INGOT.get(), "_to_ingot");
        shapelessCraftingIngots(recipeOutput, "has_silver", OreGenBlocks.SILVER_BLOCK.get(), OreGenItems.SILVER_INGOT.get(), "_to_ingot");
        shapelessCraftingIngots(recipeOutput, "has_steel", OreGenBlocks.STEEL_BLOCK.get(), OreGenItems.STEEL_INGOT.get(), "_to_ingot");
        shapelessCraftingIngots(recipeOutput, "has_tin", OreGenBlocks.TIN_BLOCK.get(), OreGenItems.TIN_INGOT.get(), "_to_ingot");
        shapelessCraftingIngots(recipeOutput, "has_tungsten", OreGenBlocks.TUNGSTEN_BLOCK.get(), OreGenItems.TUNGSTEN_INGOT.get(), "_to_ingot");
        shapelessCraftingIngots(recipeOutput, "has_uranium", OreGenBlocks.URANIUM_BLOCK.get(), OreGenItems.URANIUM_INGOT.get(), "_to_ingot");
        shapelessCraftingIngots(recipeOutput, "has_zinc", OreGenBlocks.ZINC_BLOCK.get(), OreGenItems.ZINC_INGOT.get(), "_to_ingot");
        shapelessCraftingIngots(recipeOutput, "has_ruby", OreGenBlocks.RUBY_BLOCK.get(), OreGenItems.RUBY.get(), "_to_ingot");
        shapelessCraftingIngots(recipeOutput, "has_sapphire", OreGenBlocks.SAPPHIRE_BLOCK.get(), OreGenItems.SAPPHIRE.get(), "_to_ingot");
        
        // Ingots to Nuggets
        shapelessCraftingNuggets(recipeOutput, "has_bauxite", OreGenItems.BAUXITE_INGOT.get(), OreGenItems.BAUXITE_NUGGET.get(), "_to_nugget");
        shapelessCraftingNuggets(recipeOutput, "has_bronze", OreGenItems.BRONZE_INGOT.get(), OreGenItems.BRONZE_NUGGET.get(), "_to_nugget");
        shapelessCraftingNuggets(recipeOutput, "has_cobalt", OreGenItems.COBALT_INGOT.get(), OreGenItems.COBALT_NUGGET.get(), "_to_nugget");
        shapelessCraftingNuggets(recipeOutput, "has_cobalt", Items.COPPER_INGOT, OreGenItems.COPPER_NUGGET.get(), "_to_nugget");
        shapelessCraftingNuggets(recipeOutput, "has_iridium", OreGenItems.IRIDIUM_INGOT.get(), OreGenItems.IRIDIUM_NUGGET.get(), "_to_nugget");
        shapelessCraftingNuggets(recipeOutput, "has_lead", OreGenItems.LEAD_INGOT.get(), OreGenItems.LEAD_NUGGET.get(), "_to_nugget");
        shapelessCraftingNuggets(recipeOutput, "has_nickel", OreGenItems.NICKEL_INGOT.get(), OreGenItems.NICKEL_NUGGET.get(), "_to_nugget");
        shapelessCraftingNuggets(recipeOutput, "has_platinum", OreGenItems.PLATINUM_INGOT.get(), OreGenItems.PLATINUM_NUGGET.get(), "_to_nugget");
        shapelessCraftingNuggets(recipeOutput, "has_silver", OreGenItems.SILVER_INGOT.get(), OreGenItems.SILVER_NUGGET.get(), "_to_nugget");
        shapelessCraftingNuggets(recipeOutput, "has_steel", OreGenItems.STEEL_INGOT.get(), OreGenItems.STEEL_NUGGET.get(), "_to_nugget");
        shapelessCraftingNuggets(recipeOutput, "has_tin", OreGenItems.TIN_INGOT.get(), OreGenItems.TIN_NUGGET.get(), "_to_nugget");
        shapelessCraftingNuggets(recipeOutput, "has_tungsten", OreGenItems.TUNGSTEN_INGOT.get(), OreGenItems.TUNGSTEN_NUGGET.get(), "_to_nugget");
        shapelessCraftingNuggets(recipeOutput, "has_uranium", OreGenItems.URANIUM_INGOT.get(), OreGenItems.URANIUM_NUGGET.get(), "_to_nugget");
        shapelessCraftingNuggets(recipeOutput, "has_zinc", OreGenItems.ZINC_INGOT.get(), OreGenItems.ZINC_NUGGET.get(), "_to_nugget");
        
        // Nuggets to Ingots
        shapedCraftingIngots(recipeOutput, "has_bauxite", OreGenItems.BAUXITE_NUGGET.get(), OreGenItems.BAUXITE_INGOT.get(), OreGenTags.Items.BAUXITE_INGOTS, "_from_nugget");
        shapedCraftingIngots(recipeOutput, "has_bronze", OreGenItems.BRONZE_NUGGET.get(), OreGenItems.BRONZE_INGOT.get(), OreGenTags.Items.BRONZE_INGOTS, "_from_nugget");
        shapedCraftingIngots(recipeOutput, "has_cobalt", OreGenItems.COBALT_NUGGET.get(), OreGenItems.COBALT_INGOT.get(), OreGenTags.Items.COBALT_INGOTS, "_from_nugget");
        shapedCraftingIngots(recipeOutput, "has_iridium", OreGenItems.IRIDIUM_NUGGET.get(), OreGenItems.IRIDIUM_INGOT.get(), OreGenTags.Items.IRIDIUM_INGOTS, "_from_nugget");
        shapedCraftingIngots(recipeOutput, "has_lead", OreGenItems.LEAD_NUGGET.get(), OreGenItems.LEAD_INGOT.get(), OreGenTags.Items.LEAD_INGOTS, "_from_nugget");
        shapedCraftingIngots(recipeOutput, "has_nickel", OreGenItems.NICKEL_NUGGET.get(), OreGenItems.NICKEL_INGOT.get(), OreGenTags.Items.NICKEL_INGOTS, "_from_nugget");
        shapedCraftingIngots(recipeOutput, "has_platinum", OreGenItems.PLATINUM_NUGGET.get(), OreGenItems.PLATINUM_INGOT.get(), OreGenTags.Items.PLATINUM_INGOTS, "_from_nugget");
        shapedCraftingIngots(recipeOutput, "has_silver", OreGenItems.SILVER_NUGGET.get(), OreGenItems.SILVER_INGOT.get(), OreGenTags.Items.SILVER_INGOTS, "_from_nugget");
        shapedCraftingIngots(recipeOutput, "has_steel", OreGenItems.STEEL_NUGGET.get(), OreGenItems.STEEL_INGOT.get(), OreGenTags.Items.STEEL_INGOTS, "_from_nugget");
        shapedCraftingIngots(recipeOutput, "has_tin", OreGenItems.TIN_NUGGET.get(), OreGenItems.TIN_INGOT.get(), OreGenTags.Items.TIN_INGOTS, "_from_nugget");
        shapedCraftingIngots(recipeOutput, "has_tungsten", OreGenItems.TUNGSTEN_NUGGET.get(), OreGenItems.TUNGSTEN_INGOT.get(), OreGenTags.Items.TUNGSTEN_INGOTS, "_from_nugget");
        shapedCraftingIngots(recipeOutput, "has_uranium", OreGenItems.URANIUM_NUGGET.get(), OreGenItems.URANIUM_INGOT.get(), OreGenTags.Items.URANIUM_INGOTS, "_from_nugget");
        shapedCraftingIngots(recipeOutput, "has_zinc", OreGenItems.ZINC_NUGGET.get(), OreGenItems.ZINC_INGOT.get(), OreGenTags.Items.ZINC_INGOTS, "_from_nugget");
        
        shapelessCraftingAlloys(recipeOutput, "has_bronze", Tags.Items.INGOTS_COPPER, OreGenTags.Items.TIN_INGOTS, OreGenItems.BRONZE_INGOT.get(), "_alloying");
        shapelessCraftingAlloys(recipeOutput, "has_bronze", OreGenTags.Items.COPPER_NUGGETS, OreGenTags.Items.TIN_NUGGETS, OreGenItems.BRONZE_NUGGET.get(), "_alloying");
        shapelessCraftingAlloys(recipeOutput, "has_iron", OreGenTags.Items.COALS, Tags.Items.INGOTS_IRON, OreGenItems.STEEL_INGOT.get(), "_alloying");

        // Heart Diamond Recipes
        shapedCraftingPickaxe(recipeOutput, "has_diamonds", "is_diamond", Tags.Items.GEMS_DIAMOND, OreGenTags.Items.TOOL_HANDLES, Items.DIAMOND_PICKAXE);
        shapedCraftingAxe(recipeOutput, "has_diamonds", "is_diamond", Tags.Items.GEMS_DIAMOND, OreGenTags.Items.TOOL_HANDLES, Items.DIAMOND_AXE);
        shapedCraftingSword(recipeOutput, "has_diamonds", "is_diamond", Tags.Items.GEMS_DIAMOND, OreGenTags.Items.TOOL_HANDLES, Items.DIAMOND_SWORD);
        shapedCraftingShovel(recipeOutput, "has_diamonds", "is_diamond", Tags.Items.GEMS_DIAMOND, OreGenTags.Items.TOOL_HANDLES, Items.DIAMOND_SHOVEL);
        shapedCraftingHoe(recipeOutput, "has_diamonds", "is_diamond", Tags.Items.GEMS_DIAMOND, OreGenTags.Items.TOOL_HANDLES, Items.DIAMOND_HOE);
        
        shapedCraftingHelmet(recipeOutput, "has_diamonds", "is_diamond", Tags.Items.GEMS_DIAMOND, Items.DIAMOND_HELMET);
        shapedCraftingChestplate(recipeOutput, "has_diamonds", "is_diamond", Tags.Items.GEMS_DIAMOND,  Items.DIAMOND_CHESTPLATE);
        shapedCraftingLeggings(recipeOutput, "has_diamonds", "is_diamond", Tags.Items.GEMS_DIAMOND,  Items.DIAMOND_LEGGINGS);
        shapedCraftingBoots(recipeOutput, "has_diamonds", "is_diamond", Tags.Items.GEMS_DIAMOND,  Items.DIAMOND_BOOTS);
        
        
        // Normal Recipes
        shapedCraftingPickaxe(recipeOutput, "has_amethyst", "is_amethyst", Tags.Items.GEMS_AMETHYST, OreGenTags.Items.TOOL_HANDLES, OreGenTools.AMETHYST_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_bauxite", "is_bauxite", OreGenTags.Items.BAUXITE_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.BAUXITE_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_bronze", "is_bronze", OreGenTags.Items.BRONZE_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.BRONZE_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_cobalt", "is_cobalt", OreGenTags.Items.COBALT_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.COBALT_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_copper", "is_copper", Tags.Items.INGOTS_COPPER, OreGenTags.Items.TOOL_HANDLES, OreGenTools.COPPER_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_emerald", "is_emerald", Tags.Items.GEMS_EMERALD, OreGenTags.Items.TOOL_HANDLES, OreGenTools.EMERALD_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_iridium", "is_iridium", OreGenTags.Items.IRIDIUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.IRIDIUM_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_lead", "is_lead", OreGenTags.Items.LEAD_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.LEAD_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_nickel", "is_nickel", OreGenTags.Items.NICKEL_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.NICKEL_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_obsidian", "is_obsidian", Tags.Items.OBSIDIANS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.OBSIDIAN_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_platinum", "is_platinum", OreGenTags.Items.PLATINUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.PLATINUM_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_quartz", "is_quartz", Tags.Items.GEMS_QUARTZ, OreGenTags.Items.TOOL_HANDLES, OreGenTools.QUARTZ_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_ruby", "is_ruby", OreGenTags.Items.RUBIES, OreGenTags.Items.TOOL_HANDLES, OreGenTools.RUBY_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_sapphire", "is_sapphire", OreGenTags.Items.SAPPHIRES, OreGenTags.Items.TOOL_HANDLES, OreGenTools.SAPPHIRE_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_silver", "is_silver", OreGenTags.Items.SILVER_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.SILVER_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_steel", "is_steel", OreGenTags.Items.STEEL_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.STEEL_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_tin", "is_tin", OreGenTags.Items.TIN_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.TIN_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_tungsten", "is_tungsten", OreGenTags.Items.TUNGSTEN_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.TUNGSTEN_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_uranium", "is_uranium", OreGenTags.Items.URANIUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.URANIUM_PICKAXE.get());
        shapedCraftingPickaxe(recipeOutput, "has_zinc", "is_zinc", OreGenTags.Items.ZINC_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.ZINC_PICKAXE.get());
        
        shapedCraftingAxe(recipeOutput, "has_amethyst", "is_amethyst", Tags.Items.GEMS_AMETHYST, OreGenTags.Items.TOOL_HANDLES, OreGenTools.AMETHYST_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_bauxite", "is_bauxite", OreGenTags.Items.BAUXITE_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.BAUXITE_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_bronze", "is_bronze", OreGenTags.Items.BRONZE_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.BRONZE_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_cobalt", "is_cobalt", OreGenTags.Items.COBALT_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.COBALT_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_copper", "is_copper", Tags.Items.INGOTS_COPPER, OreGenTags.Items.TOOL_HANDLES, OreGenTools.COPPER_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_emerald", "is_emerald", Tags.Items.GEMS_EMERALD, OreGenTags.Items.TOOL_HANDLES, OreGenTools.EMERALD_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_iridium", "is_iridium", OreGenTags.Items.IRIDIUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.IRIDIUM_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_lead", "is_lead", OreGenTags.Items.LEAD_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.LEAD_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_nickel", "is_nickel", OreGenTags.Items.NICKEL_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.NICKEL_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_obsidian", "is_obsidian", Tags.Items.OBSIDIANS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.OBSIDIAN_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_platinum", "is_platinum", OreGenTags.Items.PLATINUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.PLATINUM_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_quartz", "is_quartz", Tags.Items.GEMS_QUARTZ, OreGenTags.Items.TOOL_HANDLES, OreGenTools.QUARTZ_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_ruby", "is_ruby", OreGenTags.Items.RUBIES, OreGenTags.Items.TOOL_HANDLES, OreGenTools.RUBY_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_sapphire", "is_sapphire", OreGenTags.Items.SAPPHIRES, OreGenTags.Items.TOOL_HANDLES, OreGenTools.SAPPHIRE_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_silver", "is_silver", OreGenTags.Items.SILVER_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.SILVER_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_steel", "is_steel", OreGenTags.Items.STEEL_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.STEEL_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_tin", "is_tin", OreGenTags.Items.TIN_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.TIN_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_tungsten", "is_tungsten", OreGenTags.Items.TUNGSTEN_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.TUNGSTEN_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_uranium", "is_uranium", OreGenTags.Items.URANIUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.URANIUM_AXE.get());
        shapedCraftingAxe(recipeOutput, "has_zinc", "is_zinc", OreGenTags.Items.ZINC_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.ZINC_AXE.get());
        
        shapedCraftingPaxel(recipeOutput, "has_wood", "is_wood", OreGenTags.Items.PLANKS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.WOOD_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_stone", "is_stone", OreGenTags.Items.STONES, OreGenTags.Items.TOOL_HANDLES, OreGenTools.STONE_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_iron", "is_iron", Tags.Items.INGOTS_IRON, OreGenTags.Items.TOOL_HANDLES, OreGenTools.IRON_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_gold", "is_gold", Tags.Items.INGOTS_GOLD, OreGenTags.Items.TOOL_HANDLES, OreGenTools.GOLD_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_diamond", "is_diamond", Tags.Items.GEMS_DIAMOND, OreGenTags.Items.TOOL_HANDLES, OreGenTools.DIAMOND_PAXEL.get());
        smithingRecipe(recipeOutput, "has_netherite", "is_netherite", OreGenTags.Items.NETHERITE_TEMPLATES, OreGenTools.DIAMOND_PAXEL.get(), Tags.Items.INGOTS_NETHERITE, OreGenTools.NETHERITE_PAXEL.get());
        
        shapedCraftingPaxel(recipeOutput, "has_amethyst", "is_amethyst", Tags.Items.GEMS_AMETHYST, OreGenTags.Items.TOOL_HANDLES, OreGenTools.AMETHYST_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_bauxite", "is_bauxite", OreGenTags.Items.BAUXITE_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.BAUXITE_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_bronze", "is_bronze", OreGenTags.Items.BRONZE_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.BRONZE_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_cobalt", "is_cobalt", OreGenTags.Items.COBALT_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.COBALT_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_copper", "is_copper", Tags.Items.INGOTS_COPPER, OreGenTags.Items.TOOL_HANDLES, OreGenTools.COPPER_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_emerald", "is_emerald", Tags.Items.GEMS_EMERALD, OreGenTags.Items.TOOL_HANDLES, OreGenTools.EMERALD_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_iridium", "is_iridium", OreGenTags.Items.IRIDIUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.IRIDIUM_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_lead", "is_lead", OreGenTags.Items.LEAD_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.LEAD_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_nickel", "is_nickel", OreGenTags.Items.NICKEL_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.NICKEL_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_obsidian", "is_obsidian", Tags.Items.OBSIDIANS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.OBSIDIAN_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_platinum", "is_platinum", OreGenTags.Items.PLATINUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.PLATINUM_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_quartz", "is_quartz", Tags.Items.GEMS_QUARTZ, OreGenTags.Items.TOOL_HANDLES, OreGenTools.QUARTZ_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_ruby", "is_ruby", OreGenTags.Items.RUBIES, OreGenTags.Items.TOOL_HANDLES, OreGenTools.RUBY_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_sapphire", "is_sapphire", OreGenTags.Items.SAPPHIRES, OreGenTags.Items.TOOL_HANDLES, OreGenTools.SAPPHIRE_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_silver", "is_silver", OreGenTags.Items.SILVER_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.SILVER_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_steel", "is_steel", OreGenTags.Items.STEEL_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.STEEL_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_tin", "is_tin", OreGenTags.Items.TIN_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.TIN_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_tungsten", "is_tungsten", OreGenTags.Items.TUNGSTEN_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.TUNGSTEN_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_uranium", "is_uranium", OreGenTags.Items.URANIUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.URANIUM_PAXEL.get());
        shapedCraftingPaxel(recipeOutput, "has_zinc", "is_zinc", OreGenTags.Items.ZINC_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.ZINC_PAXEL.get());
        
        shapedCraftingSword(recipeOutput, "has_amethyst", "is_amethyst", Tags.Items.GEMS_AMETHYST, OreGenTags.Items.TOOL_HANDLES, OreGenTools.AMETHYST_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_bauxite", "is_bauxite", OreGenTags.Items.BAUXITE_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.BAUXITE_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_bronze", "is_bronze", OreGenTags.Items.BRONZE_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.BRONZE_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_cobalt", "is_cobalt", OreGenTags.Items.COBALT_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.COBALT_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_copper", "is_copper", Tags.Items.INGOTS_COPPER, OreGenTags.Items.TOOL_HANDLES, OreGenTools.COPPER_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_emerald", "is_emerald", Tags.Items.GEMS_EMERALD, OreGenTags.Items.TOOL_HANDLES, OreGenTools.EMERALD_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_iridium", "is_iridium", OreGenTags.Items.IRIDIUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.IRIDIUM_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_lead", "is_lead", OreGenTags.Items.LEAD_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.LEAD_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_nickel", "is_nickel", OreGenTags.Items.NICKEL_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.NICKEL_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_obsidian", "is_obsidian", Tags.Items.OBSIDIANS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.OBSIDIAN_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_platinum", "is_platinum", OreGenTags.Items.PLATINUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.PLATINUM_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_quartz", "is_quartz", Tags.Items.GEMS_QUARTZ, OreGenTags.Items.TOOL_HANDLES, OreGenTools.QUARTZ_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_ruby", "is_ruby", OreGenTags.Items.RUBIES, OreGenTags.Items.TOOL_HANDLES, OreGenTools.RUBY_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_sapphire", "is_sapphire", OreGenTags.Items.SAPPHIRES, OreGenTags.Items.TOOL_HANDLES, OreGenTools.SAPPHIRE_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_silver", "is_silver", OreGenTags.Items.SILVER_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.SILVER_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_steel", "is_steel", OreGenTags.Items.STEEL_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.STEEL_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_tin", "is_tin", OreGenTags.Items.TIN_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.TIN_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_tungsten", "is_tungsten", OreGenTags.Items.TUNGSTEN_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.TUNGSTEN_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_uranium", "is_uranium", OreGenTags.Items.URANIUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.URANIUM_SWORD.get());
        shapedCraftingSword(recipeOutput, "has_zinc", "is_zinc", OreGenTags.Items.ZINC_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.ZINC_SWORD.get());
        
        shapedCraftingShovel(recipeOutput, "has_amethyst", "is_amethyst", Tags.Items.GEMS_AMETHYST, OreGenTags.Items.TOOL_HANDLES, OreGenTools.AMETHYST_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_bauxite", "is_bauxite", OreGenTags.Items.BAUXITE_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.BAUXITE_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_bronze", "is_bronze", OreGenTags.Items.BRONZE_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.BRONZE_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_cobalt", "is_cobalt", OreGenTags.Items.COBALT_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.COBALT_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_copper", "is_copper", Tags.Items.INGOTS_COPPER, OreGenTags.Items.TOOL_HANDLES, OreGenTools.COPPER_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_emerald", "is_emerald", Tags.Items.GEMS_EMERALD, OreGenTags.Items.TOOL_HANDLES, OreGenTools.EMERALD_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_iridium", "is_iridium", OreGenTags.Items.IRIDIUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.IRIDIUM_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_lead", "is_lead", OreGenTags.Items.LEAD_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.LEAD_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_nickel", "is_nickel", OreGenTags.Items.NICKEL_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.NICKEL_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_obsidian", "is_obsidian", Tags.Items.OBSIDIANS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.OBSIDIAN_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_platinum", "is_platinum", OreGenTags.Items.PLATINUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.PLATINUM_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_quartz", "is_quartz", Tags.Items.GEMS_QUARTZ, OreGenTags.Items.TOOL_HANDLES, OreGenTools.QUARTZ_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_ruby", "is_ruby", OreGenTags.Items.RUBIES, OreGenTags.Items.TOOL_HANDLES, OreGenTools.RUBY_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_sapphire", "is_sapphire", OreGenTags.Items.SAPPHIRES, OreGenTags.Items.TOOL_HANDLES, OreGenTools.SAPPHIRE_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_silver", "is_silver", OreGenTags.Items.SILVER_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.SILVER_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_steel", "is_steel", OreGenTags.Items.STEEL_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.STEEL_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_tin", "is_tin", OreGenTags.Items.TIN_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.TIN_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_tungsten", "is_tungsten", OreGenTags.Items.TUNGSTEN_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.TUNGSTEN_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_uranium", "is_uranium", OreGenTags.Items.URANIUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.URANIUM_SHOVEL.get());
        shapedCraftingShovel(recipeOutput, "has_zinc", "is_zinc", OreGenTags.Items.ZINC_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.ZINC_SHOVEL.get());
        
        shapedCraftingHoe(recipeOutput, "has_amethyst", "is_amethyst", Tags.Items.GEMS_AMETHYST, OreGenTags.Items.TOOL_HANDLES, OreGenTools.AMETHYST_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_bauxite", "is_bauxite", OreGenTags.Items.BAUXITE_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.BAUXITE_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_bronze", "is_bronze", OreGenTags.Items.BRONZE_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.BRONZE_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_cobalt", "is_cobalt", OreGenTags.Items.COBALT_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.COBALT_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_copper", "is_copper", Tags.Items.INGOTS_COPPER, OreGenTags.Items.TOOL_HANDLES, OreGenTools.COPPER_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_emerald", "is_emerald", Tags.Items.GEMS_EMERALD, OreGenTags.Items.TOOL_HANDLES, OreGenTools.EMERALD_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_iridium", "is_iridium", OreGenTags.Items.IRIDIUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.IRIDIUM_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_lead", "is_lead", OreGenTags.Items.LEAD_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.LEAD_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_nickel", "is_nickel", OreGenTags.Items.NICKEL_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.NICKEL_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_obsidian", "is_obsidian", Tags.Items.OBSIDIANS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.OBSIDIAN_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_platinum", "is_platinum", OreGenTags.Items.PLATINUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.PLATINUM_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_quartz", "is_quartz", Tags.Items.GEMS_QUARTZ, OreGenTags.Items.TOOL_HANDLES, OreGenTools.QUARTZ_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_ruby", "is_ruby", OreGenTags.Items.RUBIES, OreGenTags.Items.TOOL_HANDLES, OreGenTools.RUBY_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_sapphire", "is_sapphire", OreGenTags.Items.SAPPHIRES, OreGenTags.Items.TOOL_HANDLES, OreGenTools.SAPPHIRE_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_silver", "is_silver", OreGenTags.Items.SILVER_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.SILVER_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_steel", "is_steel", OreGenTags.Items.STEEL_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.STEEL_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_tin", "is_tin", OreGenTags.Items.TIN_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.TIN_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_tungsten", "is_tungsten", OreGenTags.Items.TUNGSTEN_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.TUNGSTEN_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_uranium", "is_uranium", OreGenTags.Items.URANIUM_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.URANIUM_HOE.get());
        shapedCraftingHoe(recipeOutput, "has_zinc", "is_zinc", OreGenTags.Items.ZINC_INGOTS, OreGenTags.Items.TOOL_HANDLES, OreGenTools.ZINC_HOE.get());
        
        shapedCraftingHelmet(recipeOutput, "has_bauxite", "is_bauxite", OreGenTags.Items.BAUXITE_INGOTS, OreGenArmors.BAUXITE_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_bronze", "is_bronze", OreGenTags.Items.BRONZE_INGOTS, OreGenArmors.BRONZE_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_cobalt", "is_cobalt", OreGenTags.Items.COBALT_INGOTS, OreGenArmors.COBALT_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_copper", "is_copper", Tags.Items.INGOTS_COPPER, VanillaTypeArmors.COPPER_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_emerald", "is_emerald", Tags.Items.GEMS_EMERALD, VanillaTypeArmors.EMERALD_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_iridium", "is_iridium", OreGenTags.Items.IRIDIUM_INGOTS, OreGenArmors.IRIDIUM_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_lead", "is_lead", OreGenTags.Items.LEAD_INGOTS, OreGenArmors.LEAD_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_nickel", "is_nickel", OreGenTags.Items.NICKEL_INGOTS, OreGenArmors.NICKEL_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_obsidian", "is_obsidian", Tags.Items.OBSIDIANS, VanillaTypeArmors.OBSIDIAN_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_platinum", "is_platinum", OreGenTags.Items.PLATINUM_INGOTS, OreGenArmors.PLATINUM_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_ruby", "is_ruby", OreGenTags.Items.RUBIES, OreGenArmors.RUBY_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_sapphire", "is_sapphire", OreGenTags.Items.SAPPHIRES, OreGenArmors.SAPPHIRE_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_silver", "is_silver", OreGenTags.Items.SILVER_INGOTS, OreGenArmors.SILVER_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_steel", "is_steel", OreGenTags.Items.STEEL_INGOTS, OreGenArmors.STEEL_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_tin", "is_tin", OreGenTags.Items.TIN_INGOTS, OreGenArmors.TIN_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_tungsten", "is_tungsten", OreGenTags.Items.TUNGSTEN_INGOTS, OreGenArmors.TUNGSTEN_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_uranium", "is_uranium", OreGenTags.Items.URANIUM_INGOTS, OreGenArmors.URANIUM_HELMET.get());
        shapedCraftingHelmet(recipeOutput, "has_zinc", "is_zinc", OreGenTags.Items.ZINC_INGOTS, OreGenArmors.ZINC_HELMET.get());
        
        shapedCraftingChestplate(recipeOutput, "has_bauxite", "is_bauxite", OreGenTags.Items.BAUXITE_INGOTS, OreGenArmors.BAUXITE_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_bronze", "is_bronze", OreGenTags.Items.BRONZE_INGOTS, OreGenArmors.BRONZE_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_cobalt", "is_cobalt", OreGenTags.Items.COBALT_INGOTS, OreGenArmors.COBALT_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_copper", "is_copper", Tags.Items.INGOTS_COPPER, VanillaTypeArmors.COPPER_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_emerald", "is_emerald", Tags.Items.GEMS_EMERALD, VanillaTypeArmors.EMERALD_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_iridium", "is_iridium", OreGenTags.Items.IRIDIUM_INGOTS, OreGenArmors.IRIDIUM_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_lead", "is_lead", OreGenTags.Items.LEAD_INGOTS, OreGenArmors.LEAD_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_nickel", "is_nickel", OreGenTags.Items.NICKEL_INGOTS, OreGenArmors.NICKEL_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_obsidian", "is_obsidian", Tags.Items.OBSIDIANS, VanillaTypeArmors.OBSIDIAN_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_platinum", "is_platinum", OreGenTags.Items.PLATINUM_INGOTS, OreGenArmors.PLATINUM_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_ruby", "is_ruby", OreGenTags.Items.RUBIES, OreGenArmors.RUBY_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_sapphire", "is_sapphire", OreGenTags.Items.SAPPHIRES, OreGenArmors.SAPPHIRE_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_silver", "is_silver", OreGenTags.Items.SILVER_INGOTS, OreGenArmors.SILVER_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_steel", "is_steel", OreGenTags.Items.STEEL_INGOTS, OreGenArmors.STEEL_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_tin", "is_tin", OreGenTags.Items.TIN_INGOTS, OreGenArmors.TIN_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_tungsten", "is_tungsten", OreGenTags.Items.TUNGSTEN_INGOTS, OreGenArmors.TUNGSTEN_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_uranium", "is_uranium", OreGenTags.Items.URANIUM_INGOTS, OreGenArmors.URANIUM_CHESTPLATE.get());
        shapedCraftingChestplate(recipeOutput, "has_zinc", "is_zinc", OreGenTags.Items.ZINC_INGOTS, OreGenArmors.ZINC_CHESTPLATE.get());
        
        shapedCraftingLeggings(recipeOutput, "has_bauxite", "is_bauxite", OreGenTags.Items.BAUXITE_INGOTS, OreGenArmors.BAUXITE_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_bronze", "is_bronze", OreGenTags.Items.BRONZE_INGOTS, OreGenArmors.BRONZE_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_cobalt", "is_cobalt", OreGenTags.Items.COBALT_INGOTS, OreGenArmors.COBALT_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_copper", "is_copper", Tags.Items.INGOTS_COPPER, VanillaTypeArmors.COPPER_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_emerald", "is_emerald", Tags.Items.GEMS_EMERALD, VanillaTypeArmors.EMERALD_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_iridium", "is_iridium", OreGenTags.Items.IRIDIUM_INGOTS, OreGenArmors.IRIDIUM_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_lead", "is_lead", OreGenTags.Items.LEAD_INGOTS, OreGenArmors.LEAD_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_nickel", "is_nickel", OreGenTags.Items.NICKEL_INGOTS, OreGenArmors.NICKEL_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_obsidian", "is_obsidian", Tags.Items.OBSIDIANS, VanillaTypeArmors.OBSIDIAN_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_platinum", "is_platinum", OreGenTags.Items.PLATINUM_INGOTS, OreGenArmors.PLATINUM_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_ruby", "is_ruby", OreGenTags.Items.RUBIES, OreGenArmors.RUBY_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_sapphire", "is_sapphire", OreGenTags.Items.SAPPHIRES, OreGenArmors.SAPPHIRE_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_silver", "is_silver", OreGenTags.Items.SILVER_INGOTS, OreGenArmors.SILVER_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_steel", "is_steel", OreGenTags.Items.STEEL_INGOTS, OreGenArmors.STEEL_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_tin", "is_tin", OreGenTags.Items.TIN_INGOTS, OreGenArmors.TIN_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_tungsten", "is_tungsten", OreGenTags.Items.TUNGSTEN_INGOTS, OreGenArmors.TUNGSTEN_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_uranium", "is_uranium", OreGenTags.Items.URANIUM_INGOTS, OreGenArmors.URANIUM_LEGGINGS.get());
        shapedCraftingLeggings(recipeOutput, "has_zinc", "is_zinc", OreGenTags.Items.ZINC_INGOTS, OreGenArmors.ZINC_LEGGINGS.get());
        
        shapedCraftingBoots(recipeOutput, "has_bauxite", "is_bauxite", OreGenTags.Items.BAUXITE_INGOTS, OreGenArmors.BAUXITE_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_bronze", "is_bronze", OreGenTags.Items.BRONZE_INGOTS, OreGenArmors.BRONZE_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_cobalt", "is_cobalt", OreGenTags.Items.COBALT_INGOTS, OreGenArmors.COBALT_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_copper", "is_copper", Tags.Items.INGOTS_COPPER, VanillaTypeArmors.COPPER_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_emerald", "is_emerald", Tags.Items.GEMS_EMERALD, VanillaTypeArmors.EMERALD_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_iridium", "is_iridium", OreGenTags.Items.IRIDIUM_INGOTS, OreGenArmors.IRIDIUM_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_lead", "is_lead", OreGenTags.Items.LEAD_INGOTS, OreGenArmors.LEAD_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_nickel", "is_nickel", OreGenTags.Items.NICKEL_INGOTS, OreGenArmors.NICKEL_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_obsidian", "is_obsidian", Tags.Items.OBSIDIANS, VanillaTypeArmors.OBSIDIAN_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_platinum", "is_platinum", OreGenTags.Items.PLATINUM_INGOTS, OreGenArmors.PLATINUM_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_ruby", "is_ruby", OreGenTags.Items.RUBIES, OreGenArmors.RUBY_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_sapphire", "is_sapphire", OreGenTags.Items.SAPPHIRES, OreGenArmors.SAPPHIRE_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_silver", "is_silver", OreGenTags.Items.SILVER_INGOTS, OreGenArmors.SILVER_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_steel", "is_steel", OreGenTags.Items.STEEL_INGOTS, OreGenArmors.STEEL_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_tin", "is_tin", OreGenTags.Items.TIN_INGOTS, OreGenArmors.TIN_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_tungsten", "is_tungsten", OreGenTags.Items.TUNGSTEN_INGOTS, OreGenArmors.TUNGSTEN_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_uranium", "is_uranium", OreGenTags.Items.URANIUM_INGOTS, OreGenArmors.URANIUM_BOOTS.get());
        shapedCraftingBoots(recipeOutput, "has_zinc", "is_zinc", OreGenTags.Items.ZINC_INGOTS, OreGenArmors.ZINC_BOOTS.get());
        
        
        // Smelting Recipes
        oreSmelting(recipeOutput, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "copper");
        oreBlasting(recipeOutput, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "copper");
        
        oreSmelting(recipeOutput, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "iron");
        oreBlasting(recipeOutput, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "iron");
        
        oreSmelting(recipeOutput, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 200, "gold");
        oreBlasting(recipeOutput, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 100, "gold");
        
        oreSmelting(recipeOutput, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "lapis");
        oreBlasting(recipeOutput, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "lapis");
        
        oreSmelting(recipeOutput, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "redstone");
        oreBlasting(recipeOutput, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "redstone");
        
        oreSmelting(recipeOutput, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 200, "emerald");
        oreBlasting(recipeOutput, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.25f, 100, "emerald");
        
        oreSmelting(recipeOutput, IRON_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.IRON_NUGGET, 0.25f, 200, "iron_nugget");
        oreBlasting(recipeOutput, IRON_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.IRON_NUGGET, 0.25f, 100, "iron_nugget");
        
        oreSmelting(recipeOutput, COPPER_NUGGET_SMELTABLES, RecipeCategory.MISC, OreGenItems.COPPER_NUGGET.get(), 0.25f, 200, "copper_nugget");
        oreBlasting(recipeOutput, COPPER_NUGGET_SMELTABLES, RecipeCategory.MISC, OreGenItems.COPPER_NUGGET.get(), 0.25f, 100, "copper_nugget");
        
        oreSmelting(recipeOutput, GOLD_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.GOLD_NUGGET, 0.25f, 200, "gold_nugget");
        oreBlasting(recipeOutput, GOLD_NUGGET_SMELTABLES, RecipeCategory.MISC, Items.GOLD_NUGGET, 0.25f, 100, "gold_nugget");
        
        
        
        oreSmelting(recipeOutput, BAUXITE_SMELTABLES, RecipeCategory.MISC, OreGenItems.BAUXITE_INGOT.get(), 0.25f, 200, "bauxite");
        oreBlasting(recipeOutput, BAUXITE_SMELTABLES, RecipeCategory.MISC, OreGenItems.BAUXITE_INGOT.get(), 0.25f, 100, "bauxite");
        oreSmelting(recipeOutput, COBALT_SMELTABLES, RecipeCategory.MISC, OreGenItems.COBALT_INGOT.get(), 0.25f, 200, "cobalt");
        oreBlasting(recipeOutput, COBALT_SMELTABLES, RecipeCategory.MISC, OreGenItems.COBALT_INGOT.get(), 0.25f, 100, "cobalt");
        oreSmelting(recipeOutput, IRIDIUM_SMELTABLES, RecipeCategory.MISC, OreGenItems.IRIDIUM_INGOT.get(), 0.25f, 200, "iridium");
        oreBlasting(recipeOutput, IRIDIUM_SMELTABLES, RecipeCategory.MISC, OreGenItems.IRIDIUM_INGOT.get(), 0.25f, 100, "iridium");
        oreSmelting(recipeOutput, LEAD_SMELTABLES, RecipeCategory.MISC, OreGenItems.LEAD_INGOT.get(), 0.25f, 200, "lead");
        oreBlasting(recipeOutput, LEAD_SMELTABLES, RecipeCategory.MISC, OreGenItems.LEAD_INGOT.get(), 0.25f, 100, "lead");
        oreSmelting(recipeOutput, NICKEL_SMELTABLES, RecipeCategory.MISC, OreGenItems.NICKEL_INGOT.get(), 0.25f, 200, "nickel");
        oreBlasting(recipeOutput, NICKEL_SMELTABLES, RecipeCategory.MISC, OreGenItems.NICKEL_INGOT.get(), 0.25f, 100, "nickel");
        oreSmelting(recipeOutput, PLATINUM_SMELTABLES, RecipeCategory.MISC, OreGenItems.PLATINUM_INGOT.get(), 0.25f, 200, "platinum");
        oreBlasting(recipeOutput, PLATINUM_SMELTABLES, RecipeCategory.MISC, OreGenItems.PLATINUM_INGOT.get(), 0.25f, 100, "platinum");
        oreSmelting(recipeOutput, SILVER_SMELTABLES, RecipeCategory.MISC, OreGenItems.SILVER_INGOT.get(), 0.25f, 200, "silver");
        oreBlasting(recipeOutput, SILVER_SMELTABLES, RecipeCategory.MISC, OreGenItems.SILVER_INGOT.get(), 0.25f, 100, "silver");
        oreSmelting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, OreGenItems.TIN_INGOT.get(), 0.25f, 200, "tin");
        oreBlasting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, OreGenItems.TIN_INGOT.get(), 0.25f, 100, "tin");
        oreSmelting(recipeOutput, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, OreGenItems.TUNGSTEN_INGOT.get(), 0.25f, 200, "tungsten");
        oreBlasting(recipeOutput, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, OreGenItems.TUNGSTEN_INGOT.get(), 0.25f, 100, "tungsten");
        oreSmelting(recipeOutput, URANIUM_SMELTABLES, RecipeCategory.MISC, OreGenItems.URANIUM_INGOT.get(), 0.25f, 200, "uranium");
        oreBlasting(recipeOutput, URANIUM_SMELTABLES, RecipeCategory.MISC, OreGenItems.URANIUM_INGOT.get(), 0.25f, 100, "uranium");
        oreSmelting(recipeOutput, ZINC_SMELTABLES, RecipeCategory.MISC, OreGenItems.ZINC_INGOT.get(), 0.25f, 200, "zinc");
        oreBlasting(recipeOutput, ZINC_SMELTABLES, RecipeCategory.MISC, OreGenItems.ZINC_INGOT.get(), 0.25f, 100, "zinc");
        oreSmelting(recipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, OreGenItems.RUBY.get(), 0.25f, 200, "ruby");
        oreBlasting(recipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, OreGenItems.RUBY.get(), 0.25f, 100, "ruby");
        oreSmelting(recipeOutput, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, OreGenItems.SAPPHIRE.get(), 0.25f, 200, "sapphire");
        oreBlasting(recipeOutput, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, OreGenItems.SAPPHIRE.get(), 0.25f, 100, "sapphire");
        
        oreSmelting(recipeOutput, List.of(WorldGenBlocks.CHESHIRE_ROSE_FLOWER), RecipeCategory.MISC, OreGenItems.HEART_DIAMOND.get(), 0.25f, 300, "heart_diamond");
        oreBlasting(recipeOutput, List.of(WorldGenBlocks.CHESHIRE_ROSE_FLOWER), RecipeCategory.MISC, OreGenItems.HEART_DIAMOND.get(), 0.25f, 150, "heart_diamond");
        
        oreSmelting(recipeOutput, List.of(WorldGenBlocks.ROSE_FLOWER), RecipeCategory.MISC, Items.RED_DYE, 0.25f, 200, "red_dye");
        oreBlasting(recipeOutput, List.of(WorldGenBlocks.ROSE_FLOWER), RecipeCategory.MISC, Items.RED_DYE, 0.25f, 100, "red_dye");
        
        oreSmelting(recipeOutput, List.of(WorldGenBlocks.ROSE_CYAN_FLOWER), RecipeCategory.MISC, Items.CYAN_DYE, 0.25f, 200, "cyan_dye");
        oreBlasting(recipeOutput, List.of(WorldGenBlocks.ROSE_CYAN_FLOWER), RecipeCategory.MISC, Items.CYAN_DYE, 0.25f, 100, "cyan_dye");
    }
	
	protected static void shapedCraftingPickaxe(RecipeOutput recipeOutput, String unlocked, String name, TagKey<Item> input_material, TagKey<Item> input_handle, Item output) 
	{
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
        .pattern("MMM")
        .pattern(" H ")
        .pattern(" H ")
        .define('M', input_material)
        .define('H', input_handle)
        .unlockedBy(unlocked, has(input_material)).save(recipeOutput, Reference.MODID + ":" + name + "_pickaxe");
	}
	
	protected static void shapedCraftingAxe(RecipeOutput recipeOutput, String unlocked, String name, TagKey<Item> input_material, TagKey<Item> input_handle, Item output) 
	{
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
        .pattern("MM")
        .pattern("MH")
        .pattern(" H")
        .define('M', input_material)
        .define('H', input_handle)
        .unlockedBy(unlocked, has(input_material)).save(recipeOutput, Reference.MODID + ":" + name + "_axe");
	}
	
	protected static void shapedCraftingPaxel(RecipeOutput recipeOutput, String unlocked, String name, TagKey<Item> input_material, TagKey<Item> input_handle, Item output) 
	{
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
        .pattern("MMM")
        .pattern("MH ")
        .pattern(" H ")
        .define('M', input_material)
        .define('H', input_handle)
        .unlockedBy(unlocked, has(input_material)).save(recipeOutput, Reference.MODID + ":" + name + "_paxel");
	}
	
	protected static void shapedCraftingSword(RecipeOutput recipeOutput, String unlocked, String name, TagKey<Item> input_material, TagKey<Item> input_handle, Item output) 
	{
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
        .pattern("M")
        .pattern("M")
        .pattern("H")
        .define('M', input_material)
        .define('H', input_handle)
        .unlockedBy(unlocked, has(input_material)).save(recipeOutput, Reference.MODID + ":" + name + "_sword");
	}
	
	protected static void shapedCraftingShovel(RecipeOutput recipeOutput, String unlocked, String name, TagKey<Item> input_material, TagKey<Item> input_handle, Item output) 
	{
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
        .pattern("M")
        .pattern("H")
        .pattern("H")
        .define('M', input_material)
        .define('H', input_handle)
        .unlockedBy(unlocked, has(input_material)).save(recipeOutput, Reference.MODID + ":" + name + "_shovel");
	}
	
	protected static void shapedCraftingHoe(RecipeOutput recipeOutput, String unlocked, String name, TagKey<Item> input_material, TagKey<Item> input_handle, Item output) 
	{
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
        .pattern("MM")
        .pattern(" H")
        .pattern(" H")
        .define('M', input_material)
        .define('H', input_handle)
        .unlockedBy(unlocked, has(input_material)).save(recipeOutput, Reference.MODID + ":" + name + "_hoe");
	}
	
	protected static void smithingRecipe(RecipeOutput recipeOutput, String unlocked, String name, TagKey<Item> template, ItemLike tool, TagKey<Item> input_material, Item output) 
	{
		SmithingTransformRecipeBuilder.smithing
		(
				Ingredient.of(template), 
				Ingredient.of(tool), 
				Ingredient.of(input_material), 
				RecipeCategory.TOOLS, 
				output
		)
		.unlocks(unlocked, has(input_material))
		.save(recipeOutput, name);
	}
	
	protected static void shapedCraftingHelmet(RecipeOutput recipeOutput, String unlocked, String name, TagKey<Item> input_material, Item output) 
	{
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output)
        .pattern("MMM")
        .pattern("M M")
        .define('M', input_material)
        .unlockedBy(unlocked, has(input_material)).save(recipeOutput, Reference.MODID + ":" + name + "_helmet");
	}
	
	protected static void shapedCraftingChestplate(RecipeOutput recipeOutput, String unlocked, String name, TagKey<Item> input_material, Item output) 
	{
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output)
        .pattern("M M")
        .pattern("MMM")
        .pattern("MMM")
        .define('M', input_material)
        .unlockedBy(unlocked, has(input_material)).save(recipeOutput, Reference.MODID + ":" + name + "_chestplate");
	}
	
	protected static void shapedCraftingLeggings(RecipeOutput recipeOutput, String unlocked, String name, TagKey<Item> input_material, Item output) 
	{
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output)
        .pattern("MMM")
        .pattern("M M")
        .pattern("M M")
        .define('M', input_material)
        .unlockedBy(unlocked, has(input_material)).save(recipeOutput, Reference.MODID + ":" + name + "_leggings");
	}
	
	protected static void shapedCraftingBoots(RecipeOutput recipeOutput, String unlocked, String name, TagKey<Item> input_material, Item output) 
	{
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output)
        .pattern("M M")
        .pattern("M M")
        .define('M', input_material)
        .unlockedBy(unlocked, has(input_material)).save(recipeOutput, Reference.MODID + ":" + name + "_boots");
	}
	
	protected static void shapedCraftingSolidBlocks(RecipeOutput recipeOutput, String unlocked, Item input, Block output, TagKey<Item> unlock, String name) 
	{
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
        .pattern("BBB")
        .pattern("BBB")
        .pattern("BBB")
        .define('B', input)
        .unlockedBy(unlocked, has(unlock)).save(recipeOutput, Reference.MODID + ":" + getItemName(input) + name + "_" + getItemName(output));
	}
	
	protected static void shapelessCraftingNuggets(RecipeOutput recipeOutput, String unlocked, Item input, Item output, String name) 
	{
		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, 9)
        .requires(input)
        .unlockedBy(unlocked, has(output)).save(recipeOutput, Reference.MODID + ":" + getItemName(input) + name + "_" + getItemName(output));
	}
	
	protected static void shapelessCraftingAlloys(RecipeOutput recipeOutput, String unlocked, TagKey<Item> base1, TagKey<Item> base2, Item output, String name) 
	{
		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, 4)
        .requires(base1)
        .requires(base1)
        .requires(base1)
        .requires(base2)
        .unlockedBy(unlocked, has(output)).save(recipeOutput, Reference.MODID + ":" + getItemName(output) + name);
	}
	
	protected static void shapelessCraftingIngots(RecipeOutput recipeOutput, String unlocked, Block input, Item output, String name) 
	{
		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, 9)
        .requires(input)
        .unlockedBy("has_bismuth_block", has(output))
        .unlockedBy(unlocked, has(output)).save(recipeOutput, Reference.MODID + ":" + getItemName(input) + name + "_" + getItemName(output));
	}
	
	protected static void shapedCraftingIngots(RecipeOutput recipeOutput, String unlocked, Item input, Item output, TagKey<Item> unlock, String name) 
	{
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
        .pattern("BBB")
        .pattern("BBB")
        .pattern("BBB")
        .define('B', input)
        .unlockedBy(unlocked, has(unlock)).save(recipeOutput, Reference.MODID + ":" + getItemName(input) + name + "_" + getItemName(output));
	}
	
	protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup)
	{
		oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
	}

	protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) 
	{
		oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
	}

	protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
 List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) 
	{
		for(ItemLike itemlike : pIngredients) 
		{
			SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
			.save(recipeOutput, Reference.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
		}
	}
}
