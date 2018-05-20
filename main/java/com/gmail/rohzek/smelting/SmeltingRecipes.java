package com.gmail.rohzek.smelting;

import com.gmail.rohzek.blocks.SGBlocks;
import com.gmail.rohzek.blocks.SGOres;
import com.gmail.rohzek.compatibility.CheckForMods;
import com.gmail.rohzek.items.SGItems;
import com.gmail.rohzek.util.ConfigurationManager;

import ic2.api.recipe.Recipes;
import mekanism.common.MekanismBlocks;
import mekanism.common.MekanismItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thaumcraft.api.items.ItemsTC;
import zmaster587.libVulpes.api.material.AllowedProducts;

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
		
		if(!ConfigurationManager.gfFlowerSmeltingDisable) 
		{
			GameRegistry.addSmelting(SGBlocks.CHESHIREROSE, output, 1.0f);
		}
		
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfacequartzore"), new ItemStack(SGItems.QUARTZ), 0.7f);
		
		if(ConfigurationManager.straight2Ingots)
		{
			GameRegistry.addSmelting(SGOres.getBlockNether("coal"), new ItemStack(Items.COAL), 0.1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("diamond"), new ItemStack(Items.DIAMOND), 1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("emerald"), new ItemStack(Items.EMERALD), 1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("iron"), new ItemStack(Items.IRON_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("gold"), new ItemStack(Items.GOLD_INGOT), 1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("lapis"), new ItemStack(Items.DYE, 1, 4), 0.2f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherquartzore"), new ItemStack(SGItems.QUARTZ), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("redstone"), new ItemStack(Items.REDSTONE), 0.7f);
			
			GameRegistry.addSmelting(SGOres.getBlockEnd("coal"), new ItemStack(Items.COAL), 0.1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("diamond"), new ItemStack(Items.DIAMOND), 1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("emerald"), new ItemStack(Items.EMERALD), 1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("iron"), new ItemStack(Items.IRON_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("gold"), new ItemStack(Items.GOLD_INGOT), 1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("lapis"), new ItemStack(Items.DYE, 1, 4), 0.2f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endquartzore"), new ItemStack(SGItems.QUARTZ), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("redstone"), new ItemStack(Items.REDSTONE), 0.7f);
		}
		else
		{
			GameRegistry.addSmelting(SGOres.getBlockNether("coal"), new ItemStack(Blocks.COAL_ORE), 0.1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("diamomd"), new ItemStack(Blocks.DIAMOND_ORE), 1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("emerald"), new ItemStack(Blocks.EMERALD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("iron"), new ItemStack(Blocks.IRON_ORE), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("gold"), new ItemStack(Blocks.GOLD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("lapis"), new ItemStack(Blocks.LAPIS_ORE), 0.2f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherquartzore"), new ItemStack(SGOres.getBlockSurface("surfacequartzore")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("redstone"), new ItemStack(Blocks.REDSTONE_ORE), 0.7f);
			
			
			GameRegistry.addSmelting(SGOres.getBlockEnd("coal"), new ItemStack(Blocks.COAL_ORE), 0.1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("diamond"), new ItemStack(Blocks.DIAMOND_ORE), 1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("emerald"), new ItemStack(Blocks.EMERALD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("iron"), new ItemStack(Blocks.IRON_ORE), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("gold"), new ItemStack(Blocks.GOLD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("lapis"), new ItemStack(Blocks.LAPIS_ORE), 0.2f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endquartzore"), new ItemStack(SGOres.getBlockSurface("surfacequartzore")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("redstone"), new ItemStack(Blocks.REDSTONE_ORE), 0.7f);
		}
	}

	public static void moddedRecipes()
	{	
		GameRegistry.addSmelting(SGOres.getBlockSurface("aluminum"), new ItemStack(SGItems.ALUMINUM_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("copper"), new ItemStack(SGItems.COPPER_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("iridium"), new ItemStack(SGItems.IRIDIUM_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("lead"), new ItemStack(SGItems.LEAD_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("nickel"), new ItemStack(SGItems.NICKEL_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("platinum"), new ItemStack(SGItems.PLATINUM_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("silver"), new ItemStack(SGItems.SILVER_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("tin"), new ItemStack(SGItems.TIN_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("uranium"), new ItemStack(SGItems.URANIUM_INGOT), 0.7f);
		
		if(CheckForMods.check("mekanism"))
		{
			mekanismOre();
		}
		
		if(CheckForMods.check("thaumcraft"))
		{
			thaumcraftOre();
		}
		
		if(ConfigurationManager.straight2Ingots)
		{
			GameRegistry.addSmelting(SGOres.getBlockNether("aluminum"), new ItemStack(SGItems.ALUMINUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("aluminum"), new ItemStack(SGItems.ALUMINUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("copper"), new ItemStack(SGItems.COPPER_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("copper"), new ItemStack(SGItems.COPPER_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("rutile"), new ItemStack(SGItems.TITANIUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("rutile"), new ItemStack(SGItems.TITANIUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("iridium"), new ItemStack(SGItems.IRIDIUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("iridium"), new ItemStack(SGItems.IRIDIUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("lead"), new ItemStack(SGItems.LEAD_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("lead"), new ItemStack(SGItems.LEAD_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("magnetite"), new ItemStack(Items.IRON_INGOT, 4), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("magnetite"), new ItemStack(Items.IRON_INGOT, 4), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("platinum"), new ItemStack(SGItems.PLATINUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("platinum"), new ItemStack(SGItems.PLATINUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("nickel"), new ItemStack(SGItems.NICKEL_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("nickel"), new ItemStack(SGItems.NICKEL_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("silver"), new ItemStack(SGItems.SILVER_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("silver"), new ItemStack(SGItems.SILVER_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("tin"), new ItemStack(SGItems.TIN_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("tin"), new ItemStack(SGItems.TIN_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("uranium"), new ItemStack(SGItems.URANIUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("uranium"), new ItemStack(SGItems.URANIUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("zinc"), new ItemStack(SGItems.ZINC_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("zinc"), new ItemStack(SGItems.ZINC_INGOT), 0.7f);
		}
		else
		{
			GameRegistry.addSmelting(SGOres.getBlockNether("aluminum"), new ItemStack(SGOres.getBlockSurface("aluminum")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("aluminum"), new ItemStack(SGOres.getBlockSurface("aluminum")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("copper"), new ItemStack(SGOres.getBlockSurface("copper")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("copper"), new ItemStack(SGOres.getBlockSurface("copper")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("rutile"), new ItemStack(SGOres.getBlockSurface("rutile")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("rutile"), new ItemStack(SGOres.getBlockSurface("rutile")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("iridium"), new ItemStack(SGOres.getBlockSurface("iridium")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("iridium"), new ItemStack(SGOres.getBlockSurface("iridium")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("lead"), new ItemStack(SGOres.getBlockSurface("lead")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("lead"), new ItemStack(SGOres.getBlockSurface("lead")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("magnetite"), new ItemStack(SGOres.getBlockSurface("magnetite")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("magnetite"), new ItemStack(SGOres.getBlockSurface("magnetite")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("platinum"), new ItemStack(SGOres.getBlockSurface("platinum")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("platinum"), new ItemStack(SGOres.getBlockSurface("platinum")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("nickel"), new ItemStack(SGOres.getBlockSurface("nickel")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("nickel"), new ItemStack(SGOres.getBlockSurface("nickel")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("silver"), new ItemStack(SGOres.getBlockSurface("silver")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("silver"), new ItemStack(SGOres.getBlockSurface("silver")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("tin"), new ItemStack(SGOres.getBlockSurface("tin")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("tin"), new ItemStack(SGOres.getBlockSurface("tin")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("uranium"), new ItemStack(SGOres.getBlockSurface("uranium")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("uranium"), new ItemStack(SGOres.getBlockSurface("uranium")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("zinc"), new ItemStack(SGOres.getBlockSurface("zinc")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("zinc"), new ItemStack(SGOres.getBlockSurface("zinc")), 0.7f);
		}
	}
	
	@Optional.Method(modid = "mekanism")
	public static void mekanismOre()
	{
		// Get Osmium Ore
		Block osmium = MekanismBlocks.OreBlock;
		// Get Osmium ingot
		ItemStack osmiumIngot = new ItemStack(MekanismItems.Ingot, 1, 1);
		
		if(ConfigurationManager.straight2Ingots)
		{
			GameRegistry.addSmelting(SGOres.getBlockNether("osmium"), osmiumIngot, 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("osmium"), osmiumIngot, 0.7f);
		}
		else
		{
			GameRegistry.addSmelting(SGOres.getBlockNether("osmium"), new ItemStack(osmium), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("osmium"), new ItemStack(osmium), 0.7f);
		}
	}
	
	@Optional.Method(modid = "thaumcraft")
	public static void thaumcraftOre() 
	{
		GameRegistry.addSmelting(SGOres.getBlockSurface("cinnabar"), new ItemStack(ItemsTC.quicksilver), 0.7f);
		
		if(ConfigurationManager.straight2Ingots)
		{
			GameRegistry.addSmelting(SGOres.getBlockNether("cinnabar"), new ItemStack(ItemsTC.quicksilver), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("cinnabar"), new ItemStack(ItemsTC.quicksilver), 0.7f);
		}
		else
		{
			GameRegistry.addSmelting(SGOres.getBlockNether("cinnabar"), new ItemStack(SGOres.getBlockSurface("cinnabar")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("cinnabar"), new ItemStack(SGOres.getBlockSurface("cinnabar")), 0.7f);
		}
	}
}
