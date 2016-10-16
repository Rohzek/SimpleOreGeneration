package com.gmail.rohzek.smelting;

import com.gmail.rohzek.blocks.SGOres;
import com.gmail.rohzek.util.ConfigurationManager;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
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
	}
	
	private static void addSmeltingRecipes()
	{
		if(ConfigurationManager.straight2Ingots)
		{
			GameRegistry.addSmelting(SGOres.netherCoalOre, new ItemStack(Items.COAL), 0.1f);
			GameRegistry.addSmelting(SGOres.netherDiamondOre, new ItemStack(Items.DIAMOND), 1f);
			GameRegistry.addSmelting(SGOres.netherEmeraldOre, new ItemStack(Items.EMERALD), 1f);
			GameRegistry.addSmelting(SGOres.netherIronOre, new ItemStack(Items.IRON_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.netherGoldOre, new ItemStack(Items.GOLD_INGOT), 1f);
			GameRegistry.addSmelting(SGOres.netherLapisOre, new ItemStack(Items.DYE), 0.2f);
			GameRegistry.addSmelting(SGOres.netherRedstoneOre, new ItemStack(Items.REDSTONE), 0.7f);
			
			GameRegistry.addSmelting(SGOres.endCoalOre, new ItemStack(Items.COAL), 0.1f);
			GameRegistry.addSmelting(SGOres.endDiamondOre, new ItemStack(Items.DIAMOND), 1f);
			GameRegistry.addSmelting(SGOres.endEmeraldOre, new ItemStack(Items.EMERALD), 1f);
			GameRegistry.addSmelting(SGOres.endIronOre, new ItemStack(Items.IRON_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.endGoldOre, new ItemStack(Items.GOLD_INGOT), 1f);
			GameRegistry.addSmelting(SGOres.endLapisOre, new ItemStack(Items.DYE), 0.2f);
			GameRegistry.addSmelting(SGOres.endRedstoneOre, new ItemStack(Items.REDSTONE), 0.7f);
		}
		else
		{
			GameRegistry.addSmelting(SGOres.netherCoalOre, new ItemStack(Blocks.COAL_ORE), 0.1f);
			GameRegistry.addSmelting(SGOres.netherDiamondOre, new ItemStack(Blocks.DIAMOND_ORE), 1f);
			GameRegistry.addSmelting(SGOres.netherEmeraldOre, new ItemStack(Blocks.EMERALD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.netherIronOre, new ItemStack(Blocks.IRON_ORE), 0.7f);
			GameRegistry.addSmelting(SGOres.netherGoldOre, new ItemStack(Blocks.GOLD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.netherLapisOre, new ItemStack(Blocks.LAPIS_ORE), 0.2f);
			GameRegistry.addSmelting(SGOres.netherRedstoneOre, new ItemStack(Blocks.REDSTONE_ORE), 0.7f);
			
			GameRegistry.addSmelting(SGOres.endCoalOre, new ItemStack(Blocks.COAL_ORE), 0.1f);
			GameRegistry.addSmelting(SGOres.endDiamondOre, new ItemStack(Blocks.DIAMOND_ORE), 1f);
			GameRegistry.addSmelting(SGOres.endEmeraldOre, new ItemStack(Blocks.EMERALD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.endIronOre, new ItemStack(Blocks.IRON_ORE), 0.7f);
			GameRegistry.addSmelting(SGOres.endGoldOre, new ItemStack(Blocks.GOLD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.endLapisOre, new ItemStack(Blocks.LAPIS_ORE), 0.2f);
			GameRegistry.addSmelting(SGOres.endRedstoneOre, new ItemStack(Blocks.REDSTONE_ORE), 0.7f);
		}
	}
}
