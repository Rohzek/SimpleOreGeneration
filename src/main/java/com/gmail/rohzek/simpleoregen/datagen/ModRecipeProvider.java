package com.gmail.rohzek.simpleoregen.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.gmail.rohzek.simpleoregen.blocks.OreGenBlocks;
import com.gmail.rohzek.simpleoregen.blocks.WorldGenBlocks;
import com.gmail.rohzek.simpleoregen.items.OreGenItems;
import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.BlastingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder
{

	public ModRecipeProvider(PackOutput output, CompletableFuture<Provider> registries) 
	{
		super(output, registries);
	}

	@Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> ALUMINIUM_SMELTABLES = List.of(OreGenItems.RAW_ALUMINIUM, OreGenBlocks.SURFACE_ALUMINUM_ORE, 
        		OreGenBlocks.SURFACE_DEEPSLATE_ALUMINUM_ORE, OreGenBlocks.NETHER_ALUMINUM_ORE, OreGenBlocks.END_ALUMINUM_ORE);
        List<ItemLike> COBALT_SMELTABLES = List.of(OreGenItems.RAW_COBALT, OreGenBlocks.SURFACE_COBALT_ORE, OreGenBlocks.SURFACE_DEEPSLATE_COBALT_ORE,
        		OreGenBlocks.NETHER_COBALT_ORE, OreGenBlocks.END_COBALT_ORE);
        /*
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BISMUTH_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.BISMUTH.get())
                .unlockedBy("has_bismuth", has(ModItems.BISMUTH)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BISMUTH.get(), 9)
                .requires(ModBlocks.BISMUTH_BLOCK)
                .unlockedBy("has_bismuth_block", has(ModBlocks.BISMUTH_BLOCK)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BISMUTH.get(), 18)
                .requires(ModBlocks.MAGIC_BLOCK)
                .unlockedBy("has_magic_block", has(ModBlocks.MAGIC_BLOCK))
                .save(recipeOutput, "tutorialmod:bismuth_from_magic_block");
         */
        oreSmelting(recipeOutput, ALUMINIUM_SMELTABLES, RecipeCategory.MISC, OreGenItems.ALUMINIUM_INGOT.get(), 0.25f, 200, "aluminium");
        oreBlasting(recipeOutput, ALUMINIUM_SMELTABLES, RecipeCategory.MISC, OreGenItems.ALUMINIUM_INGOT.get(), 0.25f, 100, "aluminium");
        oreSmelting(recipeOutput, COBALT_SMELTABLES, RecipeCategory.MISC, OreGenItems.COBALT_INGOT.get(), 0.25f, 200, "cobalt");
        oreBlasting(recipeOutput, COBALT_SMELTABLES, RecipeCategory.MISC, OreGenItems.COBALT_INGOT.get(), 0.25f, 100, "cobalt");
        
        oreSmelting(recipeOutput, List.of(WorldGenBlocks.CHESHIRE_ROSE_FLOWER), RecipeCategory.MISC, OreGenItems.HEART_DIAMOND.get(), 0.25f, 200, "heart_diamond");
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
