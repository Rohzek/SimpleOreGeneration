package com.gmail.rohzek.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.gmail.rohzek.lib.Reference;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonCreator 
{
	static File jsonFile = new File(Reference.LOCATION + "/OreGen.json");
	
	public static String createJson()
	{
		int surfaceMinY = 0;
		
		int netherMinY = 0;
		int netherMaxY = 126;
		
		int endMinY = 10;
		int endMaxY = 60;
		
		// The holder object
		JsonObject root = new JsonObject();
		
		// Holder array
		JsonArray basic = new JsonArray();
		
		// Vanilla Array
		JsonArray vanilla = new JsonArray();
		
		// vanillaCoalOre
		JsonObject vCoalOre = new JsonObject();
		
		vCoalOre.addProperty("ore", "SurfaceCoalOre");
		vCoalOre.addProperty("minY", surfaceMinY);
		vCoalOre.addProperty("maxY", 132);
		vCoalOre.addProperty("rarity", 12 * 2);
		vCoalOre.addProperty("veinMinimum", 2);
		vCoalOre.addProperty("veinMultiplier", 17);
		
		vanilla.add(vCoalOre);
		
		 // vanillaDiamondOre
		JsonObject vDiamondOre = new JsonObject();
		
		vDiamondOre.addProperty("ore", "SurfaceDiamondOre");
		vDiamondOre.addProperty("minY", surfaceMinY);
		vDiamondOre.addProperty("maxY", 21);
		vDiamondOre.addProperty("rarity", 2 * 2);
		vDiamondOre.addProperty("veinMinimum", 3);
		vDiamondOre.addProperty("veinMultiplier", 6);
		
		vanilla.add(vDiamondOre);
		
		 // vanillaEmeraldOre
		JsonObject vEmeraldOre = new JsonObject();
		
		vEmeraldOre.addProperty("ore", "SurfaceEmeraldOre");
		vEmeraldOre.addProperty("minY", surfaceMinY);
		vEmeraldOre.addProperty("maxY", 33);
		vEmeraldOre.addProperty("rarity", 4 * 2);
		vEmeraldOre.addProperty("veinMinimum", 6);
		vEmeraldOre.addProperty("veinMultiplier", 6);
		
		vanilla.add(vEmeraldOre);
		
		// vanillaGoldOre
		JsonObject vGoldOre = new JsonObject();
		
		vGoldOre.addProperty("ore", "SurfaceGoldOre");
		vGoldOre.addProperty("minY", surfaceMinY);
		vGoldOre.addProperty("maxY", 34);
		vGoldOre.addProperty("rarity", 6 * 2);
		vGoldOre.addProperty("veinMinimum", 9);
		vGoldOre.addProperty("veinMultiplier", 9);
		
		vanilla.add(vGoldOre);
		
		 // vanillaIronOre
		JsonObject vIronOre = new JsonObject();
		
		vIronOre.addProperty("ore", "SurfaceIronOre");
		vIronOre.addProperty("minY", surfaceMinY);
		vIronOre.addProperty("maxY", 69);
		vIronOre.addProperty("rarity", 10 * 2);
		vIronOre.addProperty("veinMinimum", 5);
		vIronOre.addProperty("veinMultiplier", 19);
		
		vanilla.add(vIronOre);
		
		 // vanillaLapisOre
		JsonObject vLapisOre = new JsonObject();
		
		vLapisOre.addProperty("ore", "SurfaceLapisOre");
		vLapisOre.addProperty("minY", surfaceMinY);
		vLapisOre.addProperty("maxY", 34);
		vLapisOre.addProperty("rarity", 8 * 2);
		vLapisOre.addProperty("veinMinimum", 7);
		vLapisOre.addProperty("veinMultiplier", 7);
		
		vanilla.add(vLapisOre);
		
		 // vanillaRedstoneOre
		JsonObject vRedstoneOre = new JsonObject();
		
		vRedstoneOre.addProperty("ore", "SurfaceRedstoneOre");
		vRedstoneOre.addProperty("minY", surfaceMinY);
		vRedstoneOre.addProperty("maxY", 17);
		vRedstoneOre.addProperty("rarity", 24);
		vRedstoneOre.addProperty("veinMinimum", 3);
		vRedstoneOre.addProperty("veinMultiplier", 7);
		
		vanilla.add(vRedstoneOre);
		
		// --------------------------------------- End Surface Ores -------------------------------------------------- \\
		
		// Nether array
		JsonArray nether = new JsonArray();
		
		// netherCoalOre
		JsonObject nCoalOre = new JsonObject();
		
		nCoalOre.addProperty("ore", "NetherCoalOre");
		nCoalOre.addProperty("minY", netherMinY);
		nCoalOre.addProperty("maxY", netherMaxY);
		nCoalOre.addProperty("rarity", 12 * 3);
		nCoalOre.addProperty("veinMinimum", 2);
		nCoalOre.addProperty("veinMultiplier", 17);
		
		nether.add(nCoalOre);
		
		// netherDiamondOre
		JsonObject nDiamondOre = new JsonObject();
		
		nDiamondOre.addProperty("ore", "NetherDiamondOre");
		nDiamondOre.addProperty("minY", netherMinY);
		nDiamondOre.addProperty("maxY", netherMaxY);
		nDiamondOre.addProperty("rarity", 2 * 3);
		nDiamondOre.addProperty("veinMinimum", 3);
		nDiamondOre.addProperty("veinMultiplier", 6);
		
		nether.add(nDiamondOre);
		
		// netherEmeraldOre
		JsonObject nEmeraldOre = new JsonObject();
		
		nEmeraldOre.addProperty("ore", "NetherEmeraldOre");
		nEmeraldOre.addProperty("minY", netherMinY);
		nEmeraldOre.addProperty("maxY", netherMaxY);
		nEmeraldOre.addProperty("rarity", 4 * 3);
		nEmeraldOre.addProperty("veinMinimum", 6);
		nEmeraldOre.addProperty("veinMultiplier", 6);
		
		nether.add(nEmeraldOre);
		
		// netherGoldOre
		JsonObject nGoldOre = new JsonObject();
		
		nGoldOre.addProperty("ore", "NetherGoldOre");
		nGoldOre.addProperty("minY", netherMinY);
		nGoldOre.addProperty("maxY", netherMaxY);
		nGoldOre.addProperty("rarity", 6 * 3);
		nGoldOre.addProperty("veinMinimum", 9);
		nGoldOre.addProperty("veinMultiplier", 9);
		
		nether.add(nGoldOre);
		
		// netherIronOre
		JsonObject nIronOre = new JsonObject();
		
		nIronOre.addProperty("ore", "NetherIronOre");
		nIronOre.addProperty("minY", netherMinY);
		nIronOre.addProperty("maxY", netherMaxY);
		nIronOre.addProperty("rarity", 10 * 3);
		nIronOre.addProperty("veinMinimum", 5);
		nIronOre.addProperty("veinMultiplier", 19);
		
		nether.add(nIronOre);
		
		// netherLapisOre
		JsonObject nLapisOre = new JsonObject();
		
		nLapisOre.addProperty("ore", "NetherLapisOre");
		nLapisOre.addProperty("minY", netherMinY);
		nLapisOre.addProperty("maxY", netherMaxY);
		nLapisOre.addProperty("rarity", 8 * 3);
		nLapisOre.addProperty("veinMinimum", 7);
		nLapisOre.addProperty("veinMultiplier", 7);
		
		nether.add(nLapisOre);
		
		// netherQuartzOre
		JsonObject nQuartz = new JsonObject();
		
		nQuartz.addProperty("ore", "NetherQuartzOre");
		nQuartz.addProperty("minY", netherMinY);
		nQuartz.addProperty("maxY", netherMaxY);
		nQuartz.addProperty("rarity", 12 * 3);
		nQuartz.addProperty("veinMinimum", 5);
		nQuartz.addProperty("veinMultiplier", 9);
		
		nether.add(nQuartz);
		
		// netherRedstoneOre
		JsonObject nRedstoneOre = new JsonObject();
		
		nRedstoneOre.addProperty("ore", "NetherRedstoneOre");
		nRedstoneOre.addProperty("minY", netherMinY);
		nRedstoneOre.addProperty("maxY", netherMaxY);
		nRedstoneOre.addProperty("rarity", 24 * 3);
		nRedstoneOre.addProperty("veinMinimum", 3);
		nRedstoneOre.addProperty("veinMultiplier", 7);
		
		nether.add(nRedstoneOre);
		
		// --------------------------------------- End Nether Ores -------------------------------------------------- \\
		
		// End array
		JsonArray end = new JsonArray();
		
		// netherCoalOre
		JsonObject eCoalOre = new JsonObject();
		
		eCoalOre.addProperty("ore", "EndCoalOre");
		eCoalOre.addProperty("minY", endMinY);
		eCoalOre.addProperty("maxY", endMaxY);
		eCoalOre.addProperty("rarity", 12);
		eCoalOre.addProperty("veinMinimum", 2);
		eCoalOre.addProperty("veinMultiplier", 17);
		
		end.add(eCoalOre);
		
		// netherDiamondOre
		JsonObject eDiamondOre = new JsonObject();
		
		eDiamondOre.addProperty("ore", "EndDiamondOre");
		eDiamondOre.addProperty("minY", endMinY);
		eDiamondOre.addProperty("maxY", endMaxY);
		eDiamondOre.addProperty("rarity", 2);
		eDiamondOre.addProperty("veinMinimum", 3);
		eDiamondOre.addProperty("veinMultiplier", 6);
		
		end.add(eDiamondOre);
		
		// netherEmeraldOre
		JsonObject eEmeraldOre = new JsonObject();
		
		eEmeraldOre.addProperty("ore", "EndEmeraldOre");
		eEmeraldOre.addProperty("minY", endMinY);
		eEmeraldOre.addProperty("maxY", endMaxY);
		eEmeraldOre.addProperty("rarity", 4);
		eEmeraldOre.addProperty("veinMinimum", 6);
		eEmeraldOre.addProperty("veinMultiplier", 6);
		
		end.add(eEmeraldOre);
		
		// netherGoldOre
		JsonObject eGoldOre = new JsonObject();
		
		eGoldOre.addProperty("ore", "EndGoldOre");
		eGoldOre.addProperty("minY", endMinY);
		eGoldOre.addProperty("maxY", endMaxY);
		eGoldOre.addProperty("rarity", 6);
		eGoldOre.addProperty("veinMinimum", 9);
		eGoldOre.addProperty("veinMultiplier", 9);
		
		end.add(eGoldOre);
		
		// netherIronOre
		JsonObject eIronOre = new JsonObject();
		
		eIronOre.addProperty("ore", "EndIronOre");
		eIronOre.addProperty("minY", endMinY);
		eIronOre.addProperty("maxY", endMaxY);
		eIronOre.addProperty("rarity", 10);
		eIronOre.addProperty("veinMinimum", 5);
		eIronOre.addProperty("veinMultiplier", 19);
		
		end.add(eIronOre);
		
		// netherLapisOre
		JsonObject eLapisOre = new JsonObject();
		
		eLapisOre.addProperty("ore", "EndLapisOre");
		eLapisOre.addProperty("minY", endMinY);
		eLapisOre.addProperty("maxY", endMaxY);
		eLapisOre.addProperty("rarity", 8);
		eLapisOre.addProperty("veinMinimum", 7);
		eLapisOre.addProperty("veinMultiplier", 7);
		
		end.add(eLapisOre);
		
		// netherRedstoneOre
		JsonObject eRedstoneOre = new JsonObject();
		
		eRedstoneOre.addProperty("ore", "EndRedstoneOre");
		eRedstoneOre.addProperty("minY", endMinY);
		eRedstoneOre.addProperty("maxY", endMaxY);
		eRedstoneOre.addProperty("rarity", 24);
		eRedstoneOre.addProperty("veinMinimum", 3);
		eRedstoneOre.addProperty("veinMultiplier", 7);
		
		end.add(eRedstoneOre);
		
		// --------------------------------------- End Ender Ores -------------------------------------------------- \\
		
		basic.add(vanilla);
		basic.add(nether);
		basic.add(end);
		
		root.add("basic", basic);
		
		createFile(root);
		
		return JsonFormatting(root);
	}
	
	public static void createFile(JsonObject obj)
	{
		try(PrintWriter writer = new PrintWriter(jsonFile))
		{
			writer.print(JsonFormatting(obj));
		}
		catch(FileNotFoundException fnf){}
	}
	
	public static String JsonFormatting(JsonObject obj)
	{
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    
	    String prettyJson = gson.toJson(obj);
	    
	    return prettyJson;
	}
}
