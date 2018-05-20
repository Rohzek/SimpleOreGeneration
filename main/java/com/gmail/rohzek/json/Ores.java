package com.gmail.rohzek.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.gmail.rohzek.lib.Reference;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;

public class Ores 
{
	public static List<OreData> vanillaOres, surfaceOres, netherOres, endOres;
	
	static File file = new File(Reference.LOCATION + "/OreGen.json"), rename = new File(file.getName() + ".bak");
	static int netherMin = 0, netherMax = 126, endMin = 10, endMax = 60, surfaceMin = 0;
	static List<String> biomeIDs = new ArrayList<String>(), nether = new ArrayList<String>(), end = new ArrayList<String>();
	
	// Gets list of forge-registered biomes, so modded biomes are supported.
	static Set<ResourceLocation> biomes = Biome.REGISTRY.getKeys();
	
	public static void init()
	{
		LogHelper.debug("List of registered biomes:");
		
		for(ResourceLocation loc : biomes)
		{
			LogHelper.debug(loc.getResourcePath());
		}
		
		checkForFiles();
	}
	
	static void checkForFiles()
	{
		if(file.exists() && !file.isDirectory())
		{
			if(checkVersion())
			{
				loadFile();
				return;
			}
		}

		generateFile();
	}
	
	/*
	 * Returns true if version number is correct
	 */
	static boolean checkVersion()
	{
		JsonLoader.loadData(file);
		
		String version = JsonLoader.getVersionNumber();
		
		LogHelper.debug("OreGen.json created with mod version " + version);
		
		return version.equals(Reference.VERSION);
	}
	
	static void generateFile()
	{
		// Checks for an old backup, and removes it
		if(rename.exists() && !rename.isDirectory())
		{
			rename.delete();
		}
		
		// Renames the old file
		if(file.exists() && !file.isDirectory())
		{
			LogHelper.debug("I should be renaming " + file.getName() + " to " + rename.getName() + " but due to an error, I don't.");
			file.renameTo(rename);
		}
		
		if(!file.getParentFile().exists())
		{
			file.getParentFile().mkdirs();
		}
		
		populateArrays();
		
		// Generates new file
		JsonObject root = new JsonObject(), versionNumber = new JsonObject(), documentation = new JsonObject();
		JsonParser parser = new JsonParser();
		
		versionNumber.addProperty("Version", Reference.VERSION);
		root.add("VersionNumber", versionNumber);
		
		// Fill out documentation here
		documentation.addProperty("BasicDocumentation", "Here is a small explanation of what each entry does/means. For more information, read oregen_documentation.md at github.com/Rohzek/SimpleOreGeneration");
		documentation.addProperty("name", "The name of the ore, as referenced in code. Do not change");
		documentation.addProperty("spawnBlock", "The block that gets replaced by the ore. Usually Stone for surface, Netherrack for Nether, or End Stone for End");
		documentation.addProperty("miningLevel", "The level of pickaxe required to mine the block. Only applys to Simple Ore Generation blocks, if it says vanilla, or modded, then it wont change anything");
		documentation.addProperty("minY", "The lowest Y level the block can spawn at");
		documentation.addProperty("maxY", "The highest Y level the block can spawn at");
		documentation.addProperty("veinMinimum", "The minimum number of blocks that can be spawned in a vein");
		documentation.addProperty("veinMaximum", "The maximum amount of blocks that can be spawned in a vein");
		documentation.addProperty("disableOre", "If true, this ore will not spawn");
		documentation.addProperty("biomeList", "A list of biomes this ore can spawn in. Is dynamically filled based on what biomes are registered with Forge when this file is created, so should include modded biomes, too");
		
		
		
		// End documentation
		root.add("Documentation", documentation);
		
		JsonArray vanilla = parser.parse(new Gson().toJson(vanillaOres)).getAsJsonArray();
		root.add("VanillaOres", vanilla);
		
		JsonArray surface = parser.parse(new Gson().toJson(surfaceOres)).getAsJsonArray();
		root.add("SurfaceOres", surface);
		
		JsonArray nether = parser.parse(new Gson().toJson(netherOres)).getAsJsonArray();
		root.add("NetherOres", nether);
		
		JsonArray end = parser.parse(new Gson().toJson(endOres)).getAsJsonArray();
		root.add("EndOres", end);
		
		LogHelper.debug("I should be creating: " + file.getAbsolutePath());
		LogHelper.debug("It should be: " + JsonFormatting(root));
		
		PrintWriter writer = null;
		try
		{
			writer = new PrintWriter(file);
			writer.print(JsonFormatting(root));
		} 
		catch (FileNotFoundException e) {}
		finally
		{
			if(writer != null)
			{
				LogHelper.debug("Closing print writer");
				writer.close();
			}
		}
	}
	
	
	static void loadFile()
	{
		LogHelper.debug("Loading OreGen.json arrays into memory.");
		vanillaOres = JsonLoader.getList("VanillaOres");
		
		surfaceOres = JsonLoader.getList("SurfaceOres");
		netherOres = JsonLoader.getList("NetherOres");
		endOres = JsonLoader.getList("EndOres");
	}
	
	static void populateArrays()
	{
		compileBiomesList();
		
		OreData[] vOres = 
			{
					new OreData("surfaceCoalOre", surfaceMin, 213, 24, 6, 31, "VANILLA", "minecraft:stone", false, biomeIDs),
					new OreData("surfaceDiamondOre", surfaceMin, 21, 4, 3, 6, "VANILLA", "minecraft:stone", false, biomeIDs),
					new OreData("surfaceEmeraldOre", surfaceMin, 33, 8, 6, 6, "VANILLA", "minecraft:stone", false, biomeIDs),
					new OreData("surfaceGoldOre", surfaceMin, 34, 12, 9, 9, "VANILLA", "minecraft:stone", false, biomeIDs),
					new OreData("surfaceIronOre", surfaceMin, 69, 20, 5, 19, "VANILLA", "minecraft:stone", false, biomeIDs),
					new OreData("surfaceLapisOre", surfaceMin, 34, 16, 7, 7, "VANILLA", "minecraft:stone", false, biomeIDs),
					new OreData("surfaceRedstoneOre", surfaceMin, 17, 24, 3, 7, "VANILLA", "minecraft:stone", false, biomeIDs),
					new OreData("netherQuartzOre", netherMin, netherMax, 36, 5, 9, "VANILLA", "minecraft:netherrack", false, nether)
			};
		vanillaOres = new ArrayList<OreData>(Arrays.asList(vOres));
		
		OreData[] sOres = 
			{
				new OreData("surfaceApatiteOre", 64, 256, 24, 7, 11, "MODDED", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceArditeOre", 64, 256, 24, 7, 11, "IRON", "minecraft:stone", true, biomeIDs),
				new OreData("surfaceCertusQuartzOre", surfaceMin, 250, 13, 3, 6, "STONE", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceChargedCertusQuartzOre", surfaceMin, 250, 9, 3, 6, "STONE", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceCobaltOre", 64, 256, 24, 7, 11, "IRON", "minecraft:stone", true, biomeIDs),
				new OreData("surfaceCopperOre", 10, 256, 30, 5, 19, "STONE", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceTinOre", 20, 256, 72, 3, 19, "STONE", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceLeadOre", 16, 60, 20, 5, 19, "IRON", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceIridiumOre", 5, 60, 3, 5, 8, "IRON", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceAluminumOre", 40, 85, 48, 6, 20, "STONE", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceNickelOre", 8, 24, 6, 9, 9, "STONE", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceSilverOre", 8, 40, 4, 3, 6, "IRON", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceUraniumOre", surfaceMin, 60, 4, 4, 8, "IRON", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceGalenaOre", 10, 60, 24, 4, 9, "MODDED", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceRubyOre", 10, 60, 12, 4, 9, "MODDED", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceSapphireOre", 10, 60, 12, 4, 9, "MODDED", "minecraft:stone", false, biomeIDs),
				new OreData("surfacePyriteOre", 10, 60, 12, 4, 9, "IRON", "minecraft:stone", true, biomeIDs),
				new OreData("surfaceCinnabarOre", 10, 60, 12, 4, 9, "IRON", "minecraft:stone", true, biomeIDs),
				new OreData("surfaceSphaleriteOre", 10, 60, 12, 4, 9, "IRON", "minecraft:stone", true, biomeIDs),
				new OreData("surfaceTungstenOre", 10, 60, 12, 4, 9, "IRON", "minecraft:stone", true, biomeIDs),
				new OreData("surfaceSheldoniteOre", 10, 60, 12, 4, 9, "IRON", "minecraft:stone", true, biomeIDs),
				new OreData("surfacePeridotOre", 10, 60, 12, 4, 9, "IRON", "minecraft:stone", true, biomeIDs),
				new OreData("surfaceSodaliteOre", 10, 60, 12, 4, 9, "IRON", "minecraft:stone", true, biomeIDs),
				new OreData("surfaceOsmiumOre", surfaceMin, 256, 12, 4, 9, "MODDED", "minecraft:stone", false, biomeIDs),
				new OreData("surfacePlatinumOre", surfaceMin, 256, 8, 6, 12, "IRON", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceQuartzOre", surfaceMin, 21, 4, 3, 6, "WOODEN", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceDilithiumOre", surfaceMin, 21, 4, 3, 6, "STONE", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceRutileOre", 5, 60, 3, 5, 8, "IRON", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceZincOre", surfaceMin, 69, 6, 5, 19, "IRON", "minecraft:stone", false, biomeIDs),
				new OreData("surfaceMagnetiteOre", surfaceMin, 69, 20, 5, 19, "IRON", "minecraft:stone", false, biomeIDs)
			};
		surfaceOres = new ArrayList<OreData>(Arrays.asList(sOres));
		
		OreData[] nOres = 
			{
				new OreData("netherCertusQuartzOre", netherMin, netherMax, 36, 5, 9, "STONE", "minecraft:netherrack", false, nether),
				new OreData("netherChargedCertusQuartzOre", netherMin, netherMax, 36, 5, 9, "STONE", "minecraft:netherrack", false, nether),
				new OreData("netherCoalOre", netherMin, netherMax, 36, 2, 17, "WOODEN", "minecraft:netherrack",  false, nether),
				new OreData("netherDiamondOre", netherMin, netherMax, 6, 3, 6, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherEmeraldOre", netherMin, netherMax, 12, 6, 6, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherGoldOre", netherMin, netherMax, 18, 9, 9, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherIronOre", netherMin, netherMax, 30, 5, 19, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherLapisOre", netherMin, netherMax, 24, 7, 7, "STONE", "minecraft:netherrack", false, nether),
				new OreData("netherQuartzOre", netherMin, netherMax, 36, 5, 9, "WOODEN", "minecraft:netherrack", false, nether),
				new OreData("netherRedstoneOre", netherMin, netherMax, 72, 3, 7, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherCopperOre", netherMin, netherMax, 30, 5, 19, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherTinOre", netherMin, netherMax, 72, 5, 19, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherLeadOre", netherMin, netherMax, 30, 5, 19, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherIridiumOre", 10, 80, 9, 5, 8, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherUraniumOre", netherMin, netherMax, 6, 4, 8, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherAluminumOre", netherMin, netherMax, 48, 6, 20, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherArditeOre", netherMin, netherMax, 7, 7, 19, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherCobaltOre", netherMin, netherMax, 7, 5, 18, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherNickelOre", netherMin, netherMax, 6, 9, 9, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherSilverOre", netherMin, netherMax, 4, 3, 6, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherGalenaOre", 10, netherMax, 24, 4, 9, "IRON", "minecraft:netherrack", true, nether),
				new OreData("netherRubyOre", 10, netherMax, 12, 4, 9, "IRON", "minecraft:netherrack", true, nether),
				new OreData("netherSapphireOre", 10, netherMax, 12, 4, 9, "IRON", "minecraft:netherrack", true, nether),
				new OreData("netherPyriteOre", 10, netherMax, 12, 4, 9, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherCinnabarOre", 10, netherMax, 12, 4, 9, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherSphaleriteOre", 10, netherMax, 12, 4, 9, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherTungstenOre", 10, netherMax, 12, 4, 9, "IRON", "minecraft:netherrack", true, nether),
				new OreData("netherSheldoniteOre", 10, netherMax, 12, 4, 9, "IRON", "minecraft:netherrack", true, nether),
				new OreData("netherPeridotOre", 10, netherMax, 12, 4, 9, "IRON", "minecraft:netherrack", true, nether),
				new OreData("netherPlatinumOre", netherMin, netherMax, 8, 6, 12, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherSodaliteOre", 10, netherMax, 12, 4, 9, "IRON", "minecraft:netherrack", true, nether),
				new OreData("netherSodaliteOre", netherMin, netherMax, 12, 3, 10, "IRON", "minecraft:netherrack", true, nether),
				new OreData("netherRutileOre", 10, 80, 9, 5, 8, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherDilithiumOre", netherMin, netherMax, 6, 3, 6, "WOODEN", "minecraft:netherrack", false, nether),
				new OreData("netherMagnetiteOre", netherMin, netherMax, 30, 5, 19, "IRON", "minecraft:netherrack", false, nether),
				new OreData("netherZincOre", netherMin, netherMax, 30, 5, 19, "IRON", "minecraft:netherrack", false, nether)
			};
		netherOres = new ArrayList<OreData>(Arrays.asList(nOres));
		
		OreData[] eOres = 
			{
				new OreData("endCertusQuartzOre", endMin, endMax, 36, 5, 9, "STONE", "minecraft:end_stone", false, end),
				new OreData("endChargedCertusQuartzOre", endMin, endMax, 36, 5, 9, "STONE", "minecraft:end_stone", false, end),
				new OreData("endCoalOre", endMin, endMax, 36, 2, 17, "WOODEN", "minecraft:end_stone",  false, end),
				new OreData("endDiamondOre", endMin, endMax, 6, 3, 6, "IRON", "minecraft:end_stone", false, end),
				new OreData("endEmeraldOre", endMin, endMax, 12, 6, 6, "IRON", "minecraft:end_stone", false, end),
				new OreData("endGoldOre", endMin, endMax, 18, 9, 9, "IRON", "minecraft:end_stone", false, end),
				new OreData("endIronOre", endMin, endMax, 30, 5, 19, "STONE", "minecraft:end_stone", false, end),
				new OreData("endLapisOre", endMin, endMax, 24, 7, 7, "STONE", "minecraft:end_stone", false, end),
				new OreData("endQuartzOre", endMin, endMax, 36, 5, 9, "WOODEN", "minecraft:end_stone", false, end),
				new OreData("endRedstoneOre", endMin, endMax, 72, 3, 7, "IRON", "minecraft:end_stone", false, end),
				new OreData("endArditeOre", endMin, endMax, 7, 7, 19, "IRON", "minecraft:end_stone", true, end),
				new OreData("endCobaltOre", endMin, endMax, 7, 7, 20, "IRON", "minecraft:end_stone", true, end),
				new OreData("endCopperOre", endMin, endMax, 30, 5, 19, "IRON", "minecraft:end_stone", false, end),
				new OreData("endTinOre", endMin, endMax, 72, 5, 19, "IRON", "minecraft:end_stone", false, end),
				new OreData("endLeadOre", endMin, endMax, 30, 5, 19, "IRON", "minecraft:end_stone", false, end),
				new OreData("endIridiumOre", 10, endMax, 9, 5, 8, "IRON", "minecraft:end_stone", false, end),
				new OreData("endUraniumOre", endMin, endMax, 6, 4, 8, "IRON", "minecraft:end_stone", false, end),
				new OreData("endAluminumOre", endMin, endMax, 48, 6, 20, "IRON", "minecraft:end_stone", false, end),
				new OreData("endNickelOre", endMin, endMax, 6, 9, 9, "IRON", "minecraft:end_stone", false, end),
				new OreData("endSilverOre", endMin, endMax, 4, 3, 6, "IRON", "minecraft:end_stone", false, end),
				new OreData("endGalenaOre", 10, endMax, 24, 4, 9, "IRON", "minecraft:end_stone", true, end),
				new OreData("endRubyOre", 10, endMax, 12, 4, 9, "IRON", "minecraft:end_stone", true, end),
				new OreData("endSapphireOre", 10, endMax, 12, 4, 9, "IRON", "minecraft:end_stone", true, end),
				new OreData("endPyriteOre", 10, endMax, 12, 4, 9, "IRON", "minecraft:end_stone", true, end),
				new OreData("endCinnabarOre", 10, endMax, 12, 4, 9, "IRON", "minecraft:end_stone", true, end),
				new OreData("endSphaleriteOre", 10, endMax, 12, 4, 9, "IRON", "minecraft:end_stone", true, end),
				new OreData("endTungstenOre", 10, endMax, 12, 4, 9, "MODDED", "minecraft:end_stone", false, end),
				new OreData("endSheldoniteOre", 10, endMax, 12, 4, 9, "MODDED", "minecraft:end_stone", false, end),
				new OreData("endPlatinumOre", endMin, endMax, 8, 6, 12, "IRON", "minecraft:end_stone", false, end),
				new OreData("endPeridotOre", 10, endMax, 12, 4, 9, "MODDED", "minecraft:end_stone", false, end),
				new OreData("endSodaliteOre", 10, endMax, 12, 4, 9, "MODDED", "minecraft:end_stone", false, end),
				new OreData("endSodaliteOre", endMin, endMax, 12, 3, 10, "IRON", "minecraft:end_stone", true, end),
				new OreData("endDilithiumOre", endMin, endMax, 6, 3, 6, "IRON", "minecraft:end_stone", false, end),
				new OreData("endRutileOre", 10, endMax, 9, 5, 8, "IRON", "minecraft:end_stone", false, end),
				new OreData("endMagnetiteOre", endMin, endMax, 30, 5, 19, "STONE", "minecraft:end_stone", false, end),
				new OreData("endZincOre", endMin, endMax, 30, 5, 19, "STONE", "minecraft:end_stone", false, end)
			};
		endOres = new ArrayList<OreData>(Arrays.asList(eOres));
		
		sortArrays();
	}
	
	private static void compileBiomesList()
	{
		for(ResourceLocation loc : biomes)
		{	
			// We don't need the End or Nether biomes for the surface ores; Also don't need void
			if(!loc.getResourcePath().equals("sky") && !loc.getResourcePath().equals("hell") && !loc.getResourcePath().equals("void"))
			{
				biomeIDs.add(loc.getResourcePath());
			}
		}
		
		// Add them seperately instead
		nether.add("hell");
		end.add("sky");
	}
	
	public static String JsonFormatting(JsonObject obj)
	{
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    
	    String prettyJson = gson.toJson(obj);
	    
	    return prettyJson;
	}
	
	static void sortArrays()
	{
		Collections.sort(vanillaOres);
		Collections.sort(surfaceOres);
		Collections.sort(netherOres);
		Collections.sort(endOres);
	}
}
