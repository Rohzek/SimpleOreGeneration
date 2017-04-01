package com.gmail.rohzek.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonParser 
{
	static JsonObject obj = JsonLoader.getJsonObject();
	
	public static JsonArray loadModOres(int place)
	{
		JsonArray modOres = obj.getAsJsonArray("basic");
		
		return (JsonArray) modOres.get(place);
	}
	
	public static JsonArray loadSurfaceOres()
	{
		return loadModOres(0);	
	}
	
	public static JsonObject loadSurfaceCoalOre()
	{
		JsonArray array = loadSurfaceOres();
		return (JsonObject) array.get(0);
	}
	
	public static JsonObject loadSurfaceDiamondOre()
	{
		JsonArray array = loadSurfaceOres();
		return (JsonObject) array.get(1);
	}
	
	public static JsonObject loadSurfaceEmeraldOre()
	{
		JsonArray array = loadSurfaceOres();
		return (JsonObject) array.get(2);
	}
	
	public static JsonObject loadSurfaceGoldOre()
	{
		JsonArray array = loadSurfaceOres();
		return (JsonObject) array.get(3);
	}
	
	public static JsonObject loadSurfaceIronOre()
	{
		JsonArray array = loadSurfaceOres();
		return (JsonObject) array.get(4);
	}
	
	public static JsonObject loadSurfaceLapisOre()
	{
		JsonArray array = loadSurfaceOres();
		return (JsonObject) array.get(5);
	}
	
	public static JsonObject loadSurfaceRedstoneOre()
	{
		JsonArray array = loadSurfaceOres();
		return (JsonObject) array.get(6);
	}
	
	// --------------------------------------- End Surface Ores -------------------------------------------------- \\
	
	public static JsonArray loadNetherOres()
	{	
		return loadModOres(1);
	}
	
	public static JsonObject loadNetherCoalOre()
	{
		JsonArray array = loadNetherOres();
		return (JsonObject) array.get(0);
	}
	
	public static JsonObject loadNetherDiamondOre()
	{
		JsonArray array = loadNetherOres();
		return (JsonObject) array.get(1);
	}
	
	public static JsonObject loadNetherEmeraldOre()
	{
		JsonArray array = loadNetherOres();
		return (JsonObject) array.get(2);
	}
	
	public static JsonObject loadNetherGoldOre()
	{
		JsonArray array = loadNetherOres();
		return (JsonObject) array.get(3);
	}
	
	public static JsonObject loadNetherIronOre()
	{
		JsonArray array = loadNetherOres();
		return (JsonObject) array.get(4);
	}
	
	public static JsonObject loadNetherLapisOre()
	{
		JsonArray array = loadNetherOres();
		return (JsonObject) array.get(5);
	}
	
	public static JsonObject loadNetherQuartzOre()
	{
		JsonArray array = loadNetherOres();
		return (JsonObject) array.get(6);
	}
	
	public static JsonObject loadNetherRedstoneOre()
	{
		JsonArray array = loadNetherOres();
		return (JsonObject) array.get(7);
	}
	
	
	// --------------------------------------- End Nether Ores -------------------------------------------------- \\
	
	public static JsonArray loadEndOres()
	{
		return loadModOres(2);
	}
	
	public static JsonObject loadEndCoalOre()
	{
		JsonArray array = loadEndOres();
		return (JsonObject) array.get(0);
	}
	
	public static JsonObject loadEndDiamondOre()
	{
		JsonArray array = loadEndOres();
		return (JsonObject) array.get(1);
	}
	
	public static JsonObject loadEndEmeraldOre()
	{
		JsonArray array = loadEndOres();
		return (JsonObject) array.get(2);
	}
	
	public static JsonObject loadEndGoldOre()
	{
		JsonArray array = loadEndOres();
		return (JsonObject) array.get(3);
	}
	
	public static JsonObject loadEndIronOre()
	{
		JsonArray array = loadEndOres();
		return (JsonObject) array.get(4);
	}
	
	public static JsonObject loadEndLapisOre()
	{
		JsonArray array = loadEndOres();
		return (JsonObject) array.get(5);
	}
	
	public static JsonObject loadEndRedstoneOre()
	{
		JsonArray array = loadEndOres();
		return (JsonObject) array.get(6);
	}
	
	// --------------------------------------- End Ender Ores -------------------------------------------------- \\
}
