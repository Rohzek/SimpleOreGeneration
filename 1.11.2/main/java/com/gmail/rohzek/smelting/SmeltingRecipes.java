package com.gmail.rohzek.smelting;

import com.gmail.rohzek.blocks.SGBlocks;
import com.gmail.rohzek.blocks.SGOres;
import com.gmail.rohzek.compatibility.CheckForMods;
import com.gmail.rohzek.compatibility.ModdedConstants;
import com.gmail.rohzek.items.SGItems;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import ic2.api.item.IC2Items;
import ic2.api.recipe.Recipes;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Recipes to get the ingots and stuff out of the ore, if they didn't drop normally, or if silk touch was used.
 * @author Rohzek
 *
 */
public class SmeltingRecipes 
{
	public static void mainRegistry()
	{
		addSmeltingRecipes();
		moddedRecipes();
	}
	
	private static void addSmeltingRecipes()
	{
		ItemStack output = new ItemStack(SGItems.HEART_DIAMOND);
		output.addEnchantment(Enchantments.FIRE_ASPECT, 4);
		output.addEnchantment(Enchantments.UNBREAKING, 4);
		
		GameRegistry.addSmelting(SGBlocks.CHESHIREROSE, output, 1.0f);
		
		if(ConfigurationManager.straight2Ingots)
		{
			GameRegistry.addSmelting(SGOres.NETHER_COAL_ORE, new ItemStack(Items.COAL), 0.1f);
			GameRegistry.addSmelting(SGOres.NETHER_DIAMOND_ORE, new ItemStack(Items.DIAMOND), 1f);
			GameRegistry.addSmelting(SGOres.NETHER_EMERALD_ORE, new ItemStack(Items.EMERALD), 1f);
			GameRegistry.addSmelting(SGOres.NETHER_IRON_ORE, new ItemStack(Items.IRON_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.NETHER_GOLD_ORE, new ItemStack(Items.GOLD_INGOT), 1f);
			GameRegistry.addSmelting(SGOres.NETHER_LAPIS_ORE, new ItemStack(Items.DYE), 0.2f);
			GameRegistry.addSmelting(SGOres.NETHER_REDSTONE_ORE, new ItemStack(Items.REDSTONE), 0.7f);
			
			GameRegistry.addSmelting(SGOres.END_COAL_ORE, new ItemStack(Items.COAL), 0.1f);
			GameRegistry.addSmelting(SGOres.END_DIAMOND_ORE, new ItemStack(Items.DIAMOND), 1f);
			GameRegistry.addSmelting(SGOres.END_EMERALD_ORE, new ItemStack(Items.EMERALD), 1f);
			GameRegistry.addSmelting(SGOres.END_IRON_ORE, new ItemStack(Items.IRON_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.END_GOLD_ORE, new ItemStack(Items.GOLD_INGOT), 1f);
			GameRegistry.addSmelting(SGOres.END_LAPIS_ORE, new ItemStack(Items.DYE), 0.2f);
			GameRegistry.addSmelting(SGOres.END_REDSTONE_ORE, new ItemStack(Items.REDSTONE), 0.7f);
		}
		else
		{
			GameRegistry.addSmelting(SGOres.NETHER_COAL_ORE, new ItemStack(Blocks.COAL_ORE), 0.1f);
			GameRegistry.addSmelting(SGOres.NETHER_DIAMOND_ORE, new ItemStack(Blocks.DIAMOND_ORE), 1f);
			GameRegistry.addSmelting(SGOres.NETHER_EMERALD_ORE, new ItemStack(Blocks.EMERALD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.NETHER_IRON_ORE, new ItemStack(Blocks.IRON_ORE), 0.7f);
			GameRegistry.addSmelting(SGOres.NETHER_GOLD_ORE, new ItemStack(Blocks.GOLD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.NETHER_LAPIS_ORE, new ItemStack(Blocks.LAPIS_ORE), 0.2f);
			GameRegistry.addSmelting(SGOres.NETHER_REDSTONE_ORE, new ItemStack(Blocks.REDSTONE_ORE), 0.7f);
			
			if(ModdedConstants.uraniumOre)
			{
				GameRegistry.addSmelting(SGOres.NETHER_URANIUM_ORE, new ItemStack(SGOres.SURFACE_URANIUM_ORE), 0.7f);
			}
			
			GameRegistry.addSmelting(SGOres.END_COAL_ORE, new ItemStack(Blocks.COAL_ORE), 0.1f);
			GameRegistry.addSmelting(SGOres.END_DIAMOND_ORE, new ItemStack(Blocks.DIAMOND_ORE), 1f);
			GameRegistry.addSmelting(SGOres.END_EMERALD_ORE, new ItemStack(Blocks.EMERALD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.END_IRON_ORE, new ItemStack(Blocks.IRON_ORE), 0.7f);
			GameRegistry.addSmelting(SGOres.END_GOLD_ORE, new ItemStack(Blocks.GOLD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.END_LAPIS_ORE, new ItemStack(Blocks.LAPIS_ORE), 0.2f);
			GameRegistry.addSmelting(SGOres.END_REDSTONE_ORE, new ItemStack(Blocks.REDSTONE_ORE), 0.7f);
			
			if(ModdedConstants.uraniumOre)
			{
				GameRegistry.addSmelting(SGOres.END_URANIUM_ORE, new ItemStack(SGOres.SURFACE_URANIUM_ORE), 0.7f);
			}
		}
	}
	
	public static void moddedRecipes()
	{	
		if(ModdedConstants.bauxiteOre)
		{
			LogHelper.log("I should be adding Bauxite Ore to the smelting recipe list");
			GameRegistry.addSmelting(SGOres.SURFACE_BAUXITE_ORE, new ItemStack(SGItems.ALUMINUM_INGOT), 0.7f);
			
			if(ConfigurationManager.straight2Ingots)
			{
				GameRegistry.addSmelting(SGOres.NETHER_BAUXITE_ORE, new ItemStack(SGItems.ALUMINUM_INGOT), 0.7f);
				GameRegistry.addSmelting(SGOres.END_BAUXITE_ORE, new ItemStack(SGItems.ALUMINUM_INGOT), 0.7f);
			}
			else
			{
				GameRegistry.addSmelting(SGOres.NETHER_BAUXITE_ORE, new ItemStack(SGOres.SURFACE_BAUXITE_ORE), 0.7f);
				GameRegistry.addSmelting(SGOres.END_BAUXITE_ORE, new ItemStack(SGOres.SURFACE_BAUXITE_ORE), 0.7f);
			}
		}
		
		if(ModdedConstants.copperOre)
		{
			GameRegistry.addSmelting(SGOres.SURFACE_COPPER_ORE, new ItemStack(SGItems.COPPER_INGOT), 0.7f);
			
			if(ConfigurationManager.straight2Ingots)
			{
				GameRegistry.addSmelting(SGOres.NETHER_COPPER_ORE, new ItemStack(SGItems.COPPER_INGOT), 0.7f);
				GameRegistry.addSmelting(SGOres.END_COPPER_ORE, new ItemStack(SGItems.COPPER_INGOT), 0.7f);
			}
			else
			{
				GameRegistry.addSmelting(SGOres.NETHER_COPPER_ORE, new ItemStack(SGOres.SURFACE_COPPER_ORE), 0.7f);
				GameRegistry.addSmelting(SGOres.END_COPPER_ORE, new ItemStack(SGOres.SURFACE_COPPER_ORE), 0.7f);
			}
		}
		
		if(ModdedConstants.leadOre)
		{
			GameRegistry.addSmelting(SGOres.SURFACE_LEAD_ORE, new ItemStack(SGItems.LEAD_INGOT), 0.7f);
			
			if(ConfigurationManager.straight2Ingots)
			{
				GameRegistry.addSmelting(SGOres.NETHER_LEAD_ORE, new ItemStack(SGItems.LEAD_INGOT), 0.7f);
				GameRegistry.addSmelting(SGOres.END_LEAD_ORE, new ItemStack(SGItems.LEAD_INGOT), 0.7f);
			}
			else
			{
				GameRegistry.addSmelting(SGOres.NETHER_LEAD_ORE, new ItemStack(SGOres.SURFACE_LEAD_ORE), 0.7f);
				GameRegistry.addSmelting(SGOres.END_LEAD_ORE, new ItemStack(SGOres.SURFACE_LEAD_ORE), 0.7f);
			}
		}
		
		if(ModdedConstants.nickelOre)
		{
			GameRegistry.addSmelting(SGOres.SURFACE_NICKEL_ORE, new ItemStack(SGItems.NICKEL_INGOT), 0.7f);
			
			if(ConfigurationManager.straight2Ingots)
			{
				GameRegistry.addSmelting(SGOres.NETHER_NICKEL_ORE, new ItemStack(SGItems.NICKEL_INGOT), 0.7f);
				GameRegistry.addSmelting(SGOres.END_NICKEL_ORE, new ItemStack(SGItems.NICKEL_INGOT), 0.7f);
			}
			else
			{
				GameRegistry.addSmelting(SGOres.NETHER_NICKEL_ORE, new ItemStack(SGOres.SURFACE_NICKEL_ORE), 0.7f);
				GameRegistry.addSmelting(SGOres.END_NICKEL_ORE, new ItemStack(SGOres.SURFACE_NICKEL_ORE), 0.7f);
			}
		}
		
		if(ModdedConstants.silverOre)
		{
			GameRegistry.addSmelting(SGOres.SURFACE_SILVER_ORE, new ItemStack(SGItems.SILVER_INGOT), 0.7f);
			
			if(ConfigurationManager.straight2Ingots)
			{
				GameRegistry.addSmelting(SGOres.NETHER_SILVER_ORE, new ItemStack(SGItems.SILVER_INGOT), 0.7f);
				GameRegistry.addSmelting(SGOres.END_SILVER_ORE, new ItemStack(SGItems.SILVER_INGOT), 0.7f);
			}
			else
			{
				GameRegistry.addSmelting(SGOres.NETHER_SILVER_ORE, new ItemStack(SGOres.SURFACE_SILVER_ORE), 0.7f);
				GameRegistry.addSmelting(SGOres.END_SILVER_ORE, new ItemStack(SGOres.SURFACE_SILVER_ORE), 0.7f);
			}
		}
		
		if(ModdedConstants.tinOre)
		{
			GameRegistry.addSmelting(SGOres.SURFACE_TIN_ORE, new ItemStack(SGItems.TIN_INGOT), 0.7f);
			
			if(ConfigurationManager.straight2Ingots)
			{
				GameRegistry.addSmelting(SGOres.NETHER_TIN_ORE, new ItemStack(SGItems.TIN_INGOT), 0.7f);
				GameRegistry.addSmelting(SGOres.END_TIN_ORE, new ItemStack(SGItems.TIN_INGOT), 0.7f);
			}
			else
			{
				GameRegistry.addSmelting(SGOres.NETHER_TIN_ORE, new ItemStack(SGOres.SURFACE_TIN_ORE), 0.7f);
				GameRegistry.addSmelting(SGOres.END_TIN_ORE, new ItemStack(SGOres.SURFACE_TIN_ORE), 0.7f);
			}
		}
		
		if(ModdedConstants.uraniumOre)
		{
			if(CheckForMods.check("immersiveengineering"))
			{
				GameRegistry.addSmelting(SGOres.SURFACE_URANIUM_ORE, new ItemStack(SGItems.URANIUM_INGOT), 0.7f);
				
				if(ConfigurationManager.straight2Ingots)
				{
					GameRegistry.addSmelting(SGOres.NETHER_URANIUM_ORE, new ItemStack(SGItems.URANIUM_INGOT), 0.7f);
					GameRegistry.addSmelting(SGOres.END_URANIUM_ORE, new ItemStack(SGItems.URANIUM_INGOT), 0.7f);
				}
				else
				{
					GameRegistry.addSmelting(SGOres.NETHER_URANIUM_ORE, new ItemStack(SGOres.SURFACE_URANIUM_ORE), 0.7f);
					GameRegistry.addSmelting(SGOres.END_URANIUM_ORE, new ItemStack(SGOres.SURFACE_URANIUM_ORE), 0.7f);
				}
			}
		}
	}
	
	@Optional.Method(modid = "ic2")
	public static void addMaceratorRecipes()
	{
		NBTTagCompound compound = new NBTTagCompound();
		ItemStack output = new ItemStack(SGItems.HEART_DIAMOND);
		output.addEnchantment(Enchantments.FIRE_ASPECT, 4);
		output.addEnchantment(Enchantments.UNBREAKING, 4);
		
		// Amy's flower special recipe
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGBlocks.CHESHIREROSE)), compound, false, output);
		
		// Surface Ores
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.SURFACE_COPPER_ORE)), compound, false, IC2Items.getItem("crushed", "copper"), IC2Items.getItem("crushed", "copper"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.SURFACE_LEAD_ORE)), compound, false, IC2Items.getItem("crushed", "lead"), IC2Items.getItem("crushed", "lead"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.SURFACE_SILVER_ORE)), compound, false, IC2Items.getItem("crushed", "silver"), IC2Items.getItem("crushed", "silver"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.SURFACE_TIN_ORE)), compound, false, IC2Items.getItem("crushed", "tin"), IC2Items.getItem("crushed", "tin"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.SURFACE_URANIUM_ORE)), compound, false, IC2Items.getItem("crushed", "uranium"), IC2Items.getItem("crushed", "uranium"));
		
		// Nether Ores
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.NETHER_COPPER_ORE)), compound, false, IC2Items.getItem("crushed", "copper"), IC2Items.getItem("crushed", "copper"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.NETHER_GOLD_ORE)), compound, false, IC2Items.getItem("crushed", "gold"), IC2Items.getItem("crushed", "gold"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.NETHER_IRON_ORE)), compound, false, IC2Items.getItem("crushed", "iron"), IC2Items.getItem("crushed", "iron"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.NETHER_LEAD_ORE)), compound, false, IC2Items.getItem("crushed", "lead"), IC2Items.getItem("crushed", "lead"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.NETHER_SILVER_ORE)), compound, false, IC2Items.getItem("crushed", "silver"), IC2Items.getItem("crushed", "silver"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.NETHER_TIN_ORE)), compound, false, IC2Items.getItem("crushed", "tin"), IC2Items.getItem("crushed", "tin"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.NETHER_URANIUM_ORE)), compound, false, IC2Items.getItem("crushed", "uranium"), IC2Items.getItem("crushed", "uranium"));
		
		// End Ores
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.END_COPPER_ORE)), compound, false, IC2Items.getItem("crushed", "copper"), IC2Items.getItem("crushed", "copper"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.END_GOLD_ORE)), compound, false, IC2Items.getItem("crushed", "gold"), IC2Items.getItem("crushed", "gold"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.END_IRON_ORE)), compound, false, IC2Items.getItem("crushed", "iron"), IC2Items.getItem("crushed", "iron"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.END_LEAD_ORE)), compound, false, IC2Items.getItem("crushed", "lead"), IC2Items.getItem("crushed", "lead"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.END_SILVER_ORE)), compound, false, IC2Items.getItem("crushed", "silver"), IC2Items.getItem("crushed", "silver"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.END_TIN_ORE)), compound, false, IC2Items.getItem("crushed", "tin"), IC2Items.getItem("crushed", "tin"));
		Recipes.macerator.addRecipe(new MaceratorRecipeInput(new ItemStack(SGOres.END_URANIUM_ORE)), compound, false, IC2Items.getItem("crushed", "uranium"), IC2Items.getItem("crushed", "uranium"));
	}
}
