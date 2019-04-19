package com.gmail.rohzek.compatibility;

import com.gmail.rohzek.blocks.SGBlocks;
import com.gmail.rohzek.blocks.SGOres;
import com.gmail.rohzek.items.SGItems;
import com.gmail.rohzek.util.LogHelper;

import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.internal.CommonInternals;
import thaumcraft.common.config.ModConfig;
import thaumcraft.common.lib.crafting.ThaumcraftCraftingManager;

public class ThaumcraftCompat 
{
	public static void load() 
	{
		fixConfig();
		loadOre();
		loadAspects();
	}
	
	public static void loadAspects() 
	{
		try 
		{
			Class.forName("thaumcraft.api.ThaumcraftApi");
			
			// Items
			ThaumcraftApi.registerObjectTag(new ItemStack(SGItems.ALUMINUM_INGOT), new AspectList().add(Aspect.METAL, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGBlocks.CHESHIREROSEITEM), new AspectList().add(Aspect.AIR, 1).add(Aspect.PLANT, 5).add(Aspect.LIFE, 5).add(Aspect.PROTECT, 3).add(Aspect.DESIRE, 1));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGItems.COPPER_INGOT), new AspectList().add(Aspect.METAL, 10).add(Aspect.EXCHANGE, 5).add(Aspect.TOOL, 3));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGItems.HEART_DIAMOND), new AspectList().add(Aspect.CRYSTAL, 15).add(Aspect.MAGIC, 15).add(Aspect.LIFE, 10).add(Aspect.AURA, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGItems.LEAD_INGOT), new AspectList().add(Aspect.METAL, 10).add(Aspect.ORDER, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGItems.NICKEL_INGOT), new AspectList().add(Aspect.METAL, 10).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGItems.QUARTZ), new AspectList().add(Aspect.CRYSTAL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGItems.RUBY), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.DESIRE, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGItems.SAPPHIRE), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.DESIRE, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGItems.SILVER_INGOT), new AspectList().add(Aspect.METAL, 10).add(Aspect.DESIRE, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGItems.TIN_INGOT), new AspectList().add(Aspect.METAL, 10).add(Aspect.CRAFT, 5).add(Aspect.TOOL, 1));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGItems.TITANIUM_INGOT), new AspectList().add(Aspect.METAL, 10).add(Aspect.CRAFT, 5).add(Aspect.MAN, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGItems.URANIUM_INGOT), new AspectList().add(Aspect.METAL, 10).add(Aspect.ENERGY, 10).add(Aspect.DEATH, 10).add(Aspect.ENTROPY, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGItems.ZINC_INGOT), new AspectList().add(Aspect.METAL, 10).add(Aspect.CRAFT, 5));
			
			// Blocks
			ThaumcraftApi.registerObjectTag(new ItemStack(SGBlocks.CHESHIREROSE), new AspectList().add(Aspect.AIR, 1).add(Aspect.PLANT, 5).add(Aspect.LIFE, 5).add(Aspect.PROTECT, 3).add(Aspect.DESIRE, 1));
			
			// Ores - Surface
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceAluminumOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceArditeOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceCobaltOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceCopperOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15).add(Aspect.TOOL, 6).add(Aspect.EXCHANGE, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceCinnabarOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 10).add(Aspect.ALCHEMY, 5).add(Aspect.DEATH, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceDilithiumOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.CRYSTAL, 15).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceIridiumOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceLeadOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceMagnetiteOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceNickelOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceOsmiumOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfacePyriteOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15).add(Aspect.DESIRE, 20).add(Aspect.VOID, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceQuartzOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.CRYSTAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceSilverOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15).add(Aspect.DESIRE, 5).add(Aspect.EXCHANGE, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceSphaleriteOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceTinOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5).add(Aspect.TOOL, 2));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceUraniumOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15).add(Aspect.ENERGY, 10).add(Aspect.DEATH, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceRubyOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.CRYSTAL, 10).add(Aspect.DESIRE, 10).add(Aspect.TOOL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceRutileOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 10).add(Aspect.TOOL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceSapphireOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.CRYSTAL, 10).add(Aspect.DESIRE, 10).add(Aspect.TOOL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceTungstenOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 20));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceSheldoniteOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15).add(Aspect.DESIRE, 10).add(Aspect.TOOL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfacePeridotOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.CRYSTAL, 10).add(Aspect.DESIRE, 10).add(Aspect.TOOL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceSodaliteOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockSurface("surfaceZincOre")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5));
			
			// Ores - Nether
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherAluminumOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherArditeOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherCertusQuartzOre")), new AspectList().add(Aspect.FIRE, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherChargedCertusQuartzOre")), new AspectList().add(Aspect.FIRE, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherCoalOre")), new AspectList().add(Aspect.FIRE, 20).add(Aspect.ENERGY, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherCobaltOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherCopperOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.TOOL, 6).add(Aspect.EXCHANGE, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherCinnabarOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 10).add(Aspect.ALCHEMY, 5).add(Aspect.DEATH, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherDiamondOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.CRYSTAL, 15).add(Aspect.DESIRE, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherDilithiumOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.CRYSTAL, 15).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherEmeraldOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.CRYSTAL, 15).add(Aspect.DESIRE, 15).add(Aspect.EXCHANGE, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherIridiumOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherIronOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherGoldOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.DESIRE, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherLapisOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.SENSES, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherLeadOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherMagnetiteOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherNickelOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherOsmiumOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherPyriteOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.DESIRE, 20).add(Aspect.VOID, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherQuartzOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.CRYSTAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherRedstoneOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.ENERGY, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherSilverOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.DESIRE, 5).add(Aspect.EXCHANGE, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherSphaleriteOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherTinOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5).add(Aspect.TOOL, 2));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherUraniumOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.ENERGY, 10).add(Aspect.DEATH, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherGalenaOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherRubyOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.CRYSTAL, 10).add(Aspect.DESIRE, 10).add(Aspect.TOOL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherRutileOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 10).add(Aspect.TOOL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherSapphireOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.CRYSTAL, 10).add(Aspect.DESIRE, 10).add(Aspect.TOOL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherTungstenOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 20));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherSheldoniteOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.DESIRE, 10).add(Aspect.TOOL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherPeridotOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.CRYSTAL, 10).add(Aspect.DESIRE, 10).add(Aspect.TOOL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherSodaliteOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockNether("netherZincOre")), new AspectList().add(Aspect.FIRE, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5));
			
			// Ores - End
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endAluminumOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endArditeOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endCertusQuartzOre")), new AspectList().add(Aspect.DARKNESS, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endChargedCertusQuartzOre")), new AspectList().add(Aspect.FIRE, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endCoalOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.FIRE, 15).add(Aspect.ENERGY, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endCobaltOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endCopperOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.TOOL, 6).add(Aspect.EXCHANGE, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endCinnabarOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 10).add(Aspect.ALCHEMY, 5).add(Aspect.DEATH, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endDiamondOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.CRYSTAL, 15).add(Aspect.DESIRE, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endDilithiumOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.CRYSTAL, 15).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endEmeraldOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.CRYSTAL, 15).add(Aspect.DESIRE, 15).add(Aspect.EXCHANGE, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endIridiumOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endIronOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endGoldOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.DESIRE, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endLapisOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.SENSES, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endLeadOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endMagnetiteOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endNickelOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endOsmiumOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endPyriteOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.DESIRE, 20).add(Aspect.VOID, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endQuartzOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.CRYSTAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endRedstoneOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.ENERGY, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endSilverOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.DESIRE, 5).add(Aspect.EXCHANGE, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endSphaleriteOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endTinOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5).add(Aspect.TOOL, 2));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endUraniumOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.ENERGY, 10).add(Aspect.DEATH, 10));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endGalenaOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endRubyOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.CRYSTAL, 10).add(Aspect.DESIRE, 10).add(Aspect.TOOL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endRutileOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 10).add(Aspect.TOOL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endSapphireOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.CRYSTAL, 10).add(Aspect.DESIRE, 10).add(Aspect.TOOL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endTungstenOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 20));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endSheldoniteOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.DESIRE, 10).add(Aspect.TOOL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endPeridotOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.CRYSTAL, 10).add(Aspect.DESIRE, 10).add(Aspect.TOOL, 5));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endSodaliteOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15));
			ThaumcraftApi.registerObjectTag(new ItemStack(SGOres.getBlockEnd("endZincOre")), new AspectList().add(Aspect.DARKNESS, 5).add(Aspect.METAL, 15).add(Aspect.CRAFT, 5));
		}
		catch( ClassNotFoundException e ) 
		{
			 LogHelper.log("Thaumcraft not found, but Thaumcraft compat is loaded?");
		}
	}
	
	public static void fixConfig() 
	{
		try 
		{
			Class.forName("thaumcraft.api.ThaumcraftApi");
			
			ModConfig.CONFIG_WORLD.generateCinnabar = false;
			ModConfig.CONFIG_WORLD.generateQuartz = false;
		}
		catch( ClassNotFoundException e ) 
		{
			 LogHelper.log("Thaumcraft not found, but Thaumcraft compat is loaded?");
		}
	}
	
	public static void loadOre() 
	{
		ModdedConstants.enabledOres.add(new ModOre("cinnabarOre", true));
		// We already spawn surface quartz
	}
	
	
	/*
	 * I'll leave these here for now, but they weren't working:
	 */
	static void removeAspects(ItemStack stack, Aspect... aspects)
	{
		AspectList list = ThaumcraftCraftingManager.getObjectTags(stack);
		if(list != null)
		{
			for(Aspect aspect : aspects)
			{
				list.remove(aspect);
			}
				
			CommonInternals.objectTags.put(CommonInternals.generateUniqueItemstackId(stack), list);
		}
	}
	
	static void removeAllAspects(ItemStack stack)
	{
		AspectList list = ThaumcraftCraftingManager.getObjectTags(stack);
		Aspect[] aspects = list.getAspects();
		
		for(Aspect aspect : aspects)
		{
			list.remove(aspect);
		}
		
		CommonInternals.objectTags.put(CommonInternals.generateUniqueItemstackId(stack), list);
	}
	
	static void replaceAspects(ItemStack stack, AspectList list) 
	{
		CommonInternals.objectTags.put(CommonInternals.generateUniqueItemstackId(stack), list);
	}
}
