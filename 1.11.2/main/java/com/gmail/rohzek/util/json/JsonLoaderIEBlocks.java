package com.gmail.rohzek.util.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonLoaderIEBlocks 
{
	static JsonObject obj = JsonLoader.getJsonObject();
	
	public static JsonArray loadModOres()
	{
		JsonArray modOres = obj.getAsJsonArray("IE");
		return modOres;
	}
	
	public static JsonObject loadSurfaceBauxite()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(0);
	}
	
	public static JsonObject loadSurfaceNickel()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(1);
	}
	
	public static JsonObject loadSurfaceSilver()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(2);
	}
	
	public static JsonObject loadNetherBauxite()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(3);
	}
	
	public static JsonObject loadNetherNickel()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(4);
	}
	
	public static JsonObject loadNetherSilver()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(5);
	}
	
	public static JsonObject loadEndBauxite()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(6);
	}
	
	public static JsonObject loadEndNickel()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(7);
	}
	
	public static JsonObject loadEndSilver()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(8);
	}
}
