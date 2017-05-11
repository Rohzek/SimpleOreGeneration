package com.gmail.rohzek.smelting;

import java.util.ArrayList;

import com.gmail.rohzek.blocks.SGOres;
import com.gmail.rohzek.compatibility.CheckForMods;
import com.gmail.rohzek.compatibility.ModdedConstants;
import com.gmail.rohzek.items.SGItems;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import forestry.core.items.ItemRegistryCore;
import forestry.core.utils.OreDictUtil;
import forestry.plugins.PluginManager;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

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
			
			GameRegistry.addSmelting(SGOres.END_COAL_ORE, new ItemStack(Blocks.COAL_ORE), 0.1f);
			GameRegistry.addSmelting(SGOres.END_DIAMOND_ORE, new ItemStack(Blocks.DIAMOND_ORE), 1f);
			GameRegistry.addSmelting(SGOres.END_EMERALD_ORE, new ItemStack(Blocks.EMERALD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.END_IRON_ORE, new ItemStack(Blocks.IRON_ORE), 0.7f);
			GameRegistry.addSmelting(SGOres.END_GOLD_ORE, new ItemStack(Blocks.GOLD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.END_LAPIS_ORE, new ItemStack(Blocks.LAPIS_ORE), 0.2f);
			GameRegistry.addSmelting(SGOres.END_REDSTONE_ORE, new ItemStack(Blocks.REDSTONE_ORE), 0.7f);
		}
	}
	
	public static void moddedRecipes()
	{	
		GameRegistry.addSmelting(SGOres.SURFACE_COPPER_ORE, new ItemStack(SGItems.COPPER_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.SURFACE_LEAD_ORE, new ItemStack(SGItems.LEAD_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.SURFACE_TIN_ORE, new ItemStack(SGItems.TIN_INGOT), 0.7f);
		
		if(ConfigurationManager.straight2Ingots)
		{
			// End
			GameRegistry.addSmelting(SGOres.END_COPPER_ORE, new ItemStack(SGItems.COPPER_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.END_LEAD_ORE, new ItemStack(SGItems.LEAD_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.END_TIN_ORE, new ItemStack(SGItems.TIN_INGOT), 0.7f);
			
			// Nether
			GameRegistry.addSmelting(SGOres.NETHER_COPPER_ORE, new ItemStack(SGItems.COPPER_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.NETHER_LEAD_ORE, new ItemStack(SGItems.LEAD_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.NETHER_TIN_ORE, new ItemStack(SGItems.TIN_INGOT), 0.7f);
		}
		else
		{
			// End
			GameRegistry.addSmelting(SGOres.END_COPPER_ORE, new ItemStack(SGOres.SURFACE_COPPER_ORE), 0.7f);
			GameRegistry.addSmelting(SGOres.END_LEAD_ORE, new ItemStack(SGOres.SURFACE_LEAD_ORE), 0.7f);
			GameRegistry.addSmelting(SGOres.END_TIN_ORE, new ItemStack(SGOres.SURFACE_TIN_ORE), 0.7f);
			
			// Nether
			GameRegistry.addSmelting(SGOres.NETHER_COPPER_ORE, new ItemStack(SGOres.SURFACE_COPPER_ORE), 0.7f);
			GameRegistry.addSmelting(SGOres.NETHER_LEAD_ORE, new ItemStack(SGOres.SURFACE_LEAD_ORE), 0.7f);
			GameRegistry.addSmelting(SGOres.NETHER_TIN_ORE, new ItemStack(SGOres.SURFACE_TIN_ORE), 0.7f);
		}
	}
}
