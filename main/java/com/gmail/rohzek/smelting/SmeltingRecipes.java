package com.gmail.rohzek.smelting;

import com.gmail.rohzek.blocks.SGBlocks;
import com.gmail.rohzek.blocks.SGOres;
import com.gmail.rohzek.compatibility.CheckForMods;
import com.gmail.rohzek.items.SGItems;
import com.gmail.rohzek.util.ConfigurationManager;

import appeng.core.Api;
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
		
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfaceQuartzOre"), new ItemStack(SGItems.QUARTZ), 0.7f);
		
		if(ConfigurationManager.straight2Ingots)
		{
			GameRegistry.addSmelting(SGOres.getBlockNether("netherCoalOre"), new ItemStack(Items.COAL), 0.1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherDiamondOre"), new ItemStack(Items.DIAMOND), 1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherEmeraldOre"), new ItemStack(Items.EMERALD), 1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherIronOre"), new ItemStack(Items.IRON_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherGoldOre"), new ItemStack(Items.GOLD_INGOT), 1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherLapisOre"), new ItemStack(Items.DYE, 1, 4), 0.2f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherQuartzOre"), new ItemStack(SGItems.QUARTZ), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherRedstoneOre"), new ItemStack(Items.REDSTONE), 0.7f);
			
			GameRegistry.addSmelting(SGOres.getBlockEnd("endCoalOre"), new ItemStack(Items.COAL), 0.1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endDiamondOre"), new ItemStack(Items.DIAMOND), 1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endEmeraldOre"), new ItemStack(Items.EMERALD), 1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endIronOre"), new ItemStack(Items.IRON_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endGoldOre"), new ItemStack(Items.GOLD_INGOT), 1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endLapisOre"), new ItemStack(Items.DYE, 1, 4), 0.2f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endQuartzOre"), new ItemStack(SGItems.QUARTZ), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endRedstoneOre"), new ItemStack(Items.REDSTONE), 0.7f);
		}
		else
		{
			GameRegistry.addSmelting(SGOres.getBlockNether("netherCoalOre"), new ItemStack(Blocks.COAL_ORE), 0.1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherDiamondOre"), new ItemStack(Blocks.DIAMOND_ORE), 1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherEmeraldOre"), new ItemStack(Blocks.EMERALD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherIronOre"), new ItemStack(Blocks.IRON_ORE), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherGoldOre"), new ItemStack(Blocks.GOLD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherLapisOre"), new ItemStack(Blocks.LAPIS_ORE), 0.2f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherQuartzOre"), new ItemStack(SGOres.getBlockSurface("surfaceQuartzOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherRedstoneOre"), new ItemStack(Blocks.REDSTONE_ORE), 0.7f);
			
			
			GameRegistry.addSmelting(SGOres.getBlockEnd("endCoalOre"), new ItemStack(Blocks.COAL_ORE), 0.1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endDiamondOre"), new ItemStack(Blocks.DIAMOND_ORE), 1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endEmeraldOre"), new ItemStack(Blocks.EMERALD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endIronOre"), new ItemStack(Blocks.IRON_ORE), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endGoldOre"), new ItemStack(Blocks.GOLD_ORE), 1f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endLapisOre"), new ItemStack(Blocks.LAPIS_ORE), 0.2f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endQuartzOre"), new ItemStack(SGOres.getBlockSurface("surfaceQuartzOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endRedstoneOre"), new ItemStack(Blocks.REDSTONE_ORE), 0.7f);
		}
	}

	public static void moddedRecipes()
	{	
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfaceAluminumOre"), new ItemStack(SGItems.ALUMINUM_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfaceCopperOre"), new ItemStack(SGItems.COPPER_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfaceIridiumOre"), new ItemStack(SGItems.IRIDIUM_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfaceLeadOre"), new ItemStack(SGItems.LEAD_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfaceMagnetiteOre"), new ItemStack(Items.IRON_INGOT, 4), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfaceNickelOre"), new ItemStack(SGItems.NICKEL_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfacePlatinumOre"), new ItemStack(SGItems.PLATINUM_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfaceRubyOre"), new ItemStack(SGItems.RUBY), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfaceRutileOre"), new ItemStack(SGItems.TITANIUM_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfaceSapphireOre"), new ItemStack(SGItems.SAPPHIRE), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfaceSilverOre"), new ItemStack(SGItems.SILVER_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfaceTinOre"), new ItemStack(SGItems.TIN_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfaceUraniumOre"), new ItemStack(SGItems.URANIUM_INGOT), 0.7f);
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfaceZincOre"), new ItemStack(SGItems.ZINC_INGOT), 0.7f);
		
		if(CheckForMods.check("mekanism"))
		{
			mekanismOre();
		}
		
		if(CheckForMods.check("thaumcraft"))
		{
			thaumcraftOre();
		}
		
		if(CheckForMods.check("appliedenergistics2")) 
		{
			ItemStack certus = new ItemStack( Api.INSTANCE.definitions().materials().certusQuartzCrystal().maybeItem().get()), // Item
					  chargedCertus = new ItemStack(Api.INSTANCE.definitions().materials().certusQuartzCrystalCharged().maybeItem().get(), 1, 1), // Item
			          quartz = new ItemStack(Api.INSTANCE.definitions().blocks().quartzOre().maybeBlock().get()), // Block
				      chargedQuartz = new ItemStack(Api.INSTANCE.definitions().blocks().quartzOreCharged().maybeBlock().get()); // Block
			
			if(ConfigurationManager.straight2Ingots)
			{
				GameRegistry.addSmelting(SGOres.getBlockNether("netherCertusQuartzOre"), certus, 0.7f);
				GameRegistry.addSmelting(SGOres.getBlockEnd("endCertusQuartzOre"), certus, 0.7f);
				GameRegistry.addSmelting(SGOres.getBlockNether("netherChargedCertusQuartzOre"), chargedCertus, 0.7f);
				GameRegistry.addSmelting(SGOres.getBlockEnd("endChargedCertusQuartzOre"), chargedCertus, 0.7f);
			}
			
			else
			{
				GameRegistry.addSmelting(SGOres.getBlockNether("netherCertusQuartzOre"), quartz, 0.7f);
				GameRegistry.addSmelting(SGOres.getBlockEnd("endCertusQuartzOre"), quartz, 0.7f);
				GameRegistry.addSmelting(SGOres.getBlockNether("netherChargedCertusQuartzOre"), chargedQuartz, 0.7f);
				GameRegistry.addSmelting(SGOres.getBlockEnd("endChargedCertusQuartzOre"), chargedQuartz, 0.7f);
			}
		}
		
		if(ConfigurationManager.straight2Ingots)
		{
			GameRegistry.addSmelting(SGOres.getBlockNether("netherAluminumOre"), new ItemStack(SGItems.ALUMINUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endAluminumOre"), new ItemStack(SGItems.ALUMINUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherCopperOre"), new ItemStack(SGItems.COPPER_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endCopperOre"), new ItemStack(SGItems.COPPER_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherRutileOre"), new ItemStack(SGItems.TITANIUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endRutileOre"), new ItemStack(SGItems.TITANIUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherIridiumOre"), new ItemStack(SGItems.IRIDIUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endIridiumOre"), new ItemStack(SGItems.IRIDIUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherLeadOre"), new ItemStack(SGItems.LEAD_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endLeadOre"), new ItemStack(SGItems.LEAD_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherMagnetiteOre"), new ItemStack(Items.IRON_INGOT, 4), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endMagnetiteOre"), new ItemStack(Items.IRON_INGOT, 4), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherPlatinumOre"), new ItemStack(SGItems.PLATINUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endPlatinumOre"), new ItemStack(SGItems.PLATINUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherNickelOre"), new ItemStack(SGItems.NICKEL_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endNickelOre"), new ItemStack(SGItems.NICKEL_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherRubyOre"), new ItemStack(SGItems.RUBY), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endRubyOre"), new ItemStack(SGItems.RUBY), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherSapphireOre"), new ItemStack(SGItems.SAPPHIRE), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endSapphireOre"), new ItemStack(SGItems.SAPPHIRE), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherSilverOre"), new ItemStack(SGItems.SILVER_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endSilverOre"), new ItemStack(SGItems.SILVER_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherTinOre"), new ItemStack(SGItems.TIN_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endTinOre"), new ItemStack(SGItems.TIN_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherUraniumOre"), new ItemStack(SGItems.URANIUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endUraniumOre"), new ItemStack(SGItems.URANIUM_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherZincOre"), new ItemStack(SGItems.ZINC_INGOT), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endZincOre"), new ItemStack(SGItems.ZINC_INGOT), 0.7f);
		}
		else
		{
			GameRegistry.addSmelting(SGOres.getBlockNether("netherAluminumOre"), new ItemStack(SGOres.getBlockSurface("surfaceAluminumOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endAluminumOre"), new ItemStack(SGOres.getBlockSurface("surfaceAluminumOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherCopperOre"), new ItemStack(SGOres.getBlockSurface("surfaceCopperOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endCopperOre"), new ItemStack(SGOres.getBlockSurface("surfaceCopperOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherIridiumOre"), new ItemStack(SGOres.getBlockSurface("surfaceIridiumOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endIridiumOre"), new ItemStack(SGOres.getBlockSurface("surfaceIridiumOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherLeadOre"), new ItemStack(SGOres.getBlockSurface("surfaceLeadOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endLeadOre"), new ItemStack(SGOres.getBlockSurface("surfaceLeadOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherMagnetiteOre"), new ItemStack(SGOres.getBlockSurface("surfaceMagnetiteOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endMagnetiteOre"), new ItemStack(SGOres.getBlockSurface("surfaceMagnetiteOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherPlatinumOre"), new ItemStack(SGOres.getBlockSurface("surfacePlatinumOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endPlatinumOre"), new ItemStack(SGOres.getBlockSurface("surfacePlatinumOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherNickelOre"), new ItemStack(SGOres.getBlockSurface("surfaceNickelOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endNickelOre"), new ItemStack(SGOres.getBlockSurface("surfaceNickelOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherRubyOre"), new ItemStack(SGOres.getBlockSurface("surfaceRubyOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endRubyOre"), new ItemStack(SGOres.getBlockSurface("surfaceRubyOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherRutileOre"), new ItemStack(SGOres.getBlockSurface("surfaceRutileOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endRutileOre"), new ItemStack(SGOres.getBlockSurface("surfaceRutileOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherSapphireOre"), new ItemStack(SGOres.getBlockSurface("surfaceSapphireOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endSapphireOre"), new ItemStack(SGOres.getBlockSurface("surfaceSapphireOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherSilverOre"), new ItemStack(SGOres.getBlockSurface("surfaceSilverOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endSilverOre"), new ItemStack(SGOres.getBlockSurface("surfaceSilverOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherTinOre"), new ItemStack(SGOres.getBlockSurface("surfaceTinOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endTinOre"), new ItemStack(SGOres.getBlockSurface("surfaceTinOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherUraniumOre"), new ItemStack(SGOres.getBlockSurface("surfaceUraniumOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endUraniumOre"), new ItemStack(SGOres.getBlockSurface("surfaceUraniumOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockNether("netherZincOre"), new ItemStack(SGOres.getBlockSurface("surfaceZincOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endZincOre"), new ItemStack(SGOres.getBlockSurface("surfaceZincOre")), 0.7f);
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
			GameRegistry.addSmelting(SGOres.getBlockNether("netherOsmiumOre"), osmiumIngot, 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endOsmiumOre"), osmiumIngot, 0.7f);
		}
		else
		{
			GameRegistry.addSmelting(SGOres.getBlockNether("netherOsmiumOre"), new ItemStack(osmium), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endOsmiumOre"), new ItemStack(osmium), 0.7f);
		}
	}
	
	@Optional.Method(modid = "thaumcraft")
	public static void thaumcraftOre() 
	{
		GameRegistry.addSmelting(SGOres.getBlockSurface("surfaceCinnabarOre"), new ItemStack(ItemsTC.quicksilver), 0.7f);
		
		if(ConfigurationManager.straight2Ingots)
		{
			GameRegistry.addSmelting(SGOres.getBlockNether("netherCinnabarOre"), new ItemStack(ItemsTC.quicksilver), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endCinnabarOre"), new ItemStack(ItemsTC.quicksilver), 0.7f);
		}
		else
		{
			GameRegistry.addSmelting(SGOres.getBlockNether("netherCinnabarOre"), new ItemStack(SGOres.getBlockSurface("surfaceCinnabarOre")), 0.7f);
			GameRegistry.addSmelting(SGOres.getBlockEnd("endCinnabarOre"), new ItemStack(SGOres.getBlockSurface("surfaceCinnabarOre")), 0.7f);
		}
	}
}
