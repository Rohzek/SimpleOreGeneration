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
			GameRegistry.addSmelting(SGOres.netherCoalOre, new ItemStack(Items.coal), 0.1f);
			GameRegistry.addSmelting(SGOres.netherDiamondOre, new ItemStack(Items.diamond), 1f);
			GameRegistry.addSmelting(SGOres.netherEmeraldOre, new ItemStack(Items.emerald), 1f);
			GameRegistry.addSmelting(SGOres.netherIronOre, new ItemStack(Items.iron_ingot), 0.7f);
			GameRegistry.addSmelting(SGOres.netherGoldOre, new ItemStack(Items.gold_ingot), 1f);
			GameRegistry.addSmelting(SGOres.netherLapisOre, new ItemStack(Items.dye), 0.2f);
			GameRegistry.addSmelting(SGOres.netherRedstoneOre, new ItemStack(Items.redstone), 0.7f);
			
			GameRegistry.addSmelting(SGOres.endCoalOre, new ItemStack(Items.coal), 0.1f);
			GameRegistry.addSmelting(SGOres.endDiamondOre, new ItemStack(Items.diamond), 1f);
			GameRegistry.addSmelting(SGOres.endEmeraldOre, new ItemStack(Items.emerald), 1f);
			GameRegistry.addSmelting(SGOres.endIronOre, new ItemStack(Items.iron_ingot), 0.7f);
			GameRegistry.addSmelting(SGOres.endGoldOre, new ItemStack(Items.gold_ingot), 1f);
			GameRegistry.addSmelting(SGOres.endLapisOre, new ItemStack(Items.dye), 0.2f);
			GameRegistry.addSmelting(SGOres.endRedstoneOre, new ItemStack(Items.redstone), 0.7f);
		}
		else
		{
			GameRegistry.addSmelting(SGOres.netherCoalOre, new ItemStack(Blocks.coal_ore), 0.1f);
			GameRegistry.addSmelting(SGOres.netherDiamondOre, new ItemStack(Blocks.diamond_ore), 1f);
			GameRegistry.addSmelting(SGOres.netherEmeraldOre, new ItemStack(Blocks.emerald_ore), 1f);
			GameRegistry.addSmelting(SGOres.netherIronOre, new ItemStack(Blocks.iron_ore), 0.7f);
			GameRegistry.addSmelting(SGOres.netherGoldOre, new ItemStack(Blocks.gold_ore), 1f);
			GameRegistry.addSmelting(SGOres.netherLapisOre, new ItemStack(Blocks.lapis_ore), 0.2f);
			GameRegistry.addSmelting(SGOres.netherRedstoneOre, new ItemStack(Blocks.redstone_ore), 0.7f);
			
			GameRegistry.addSmelting(SGOres.endCoalOre, new ItemStack(Blocks.coal_ore), 0.1f);
			GameRegistry.addSmelting(SGOres.endDiamondOre, new ItemStack(Blocks.diamond_ore), 1f);
			GameRegistry.addSmelting(SGOres.endEmeraldOre, new ItemStack(Blocks.emerald_ore), 1f);
			GameRegistry.addSmelting(SGOres.endIronOre, new ItemStack(Blocks.iron_ore), 0.7f);
			GameRegistry.addSmelting(SGOres.endGoldOre, new ItemStack(Blocks.gold_ore), 1f);
			GameRegistry.addSmelting(SGOres.endLapisOre, new ItemStack(Blocks.lapis_ore), 0.2f);
			GameRegistry.addSmelting(SGOres.endRedstoneOre, new ItemStack(Blocks.redstone_ore), 0.7f);
		}
	}
}
