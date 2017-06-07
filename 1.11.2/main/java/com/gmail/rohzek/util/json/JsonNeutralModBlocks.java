package com.gmail.rohzek.util.json;

import com.gmail.rohzek.util.LogHelper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonNeutralModBlocks 
{
	static JsonObject obj = JsonLoader.getJsonObject();
	
	public static JsonArray loadModOres()
	{
		JsonArray modOres = obj.getAsJsonArray("neutral");
		return modOres;
	}
	
	public static JsonObject loadSurfaceCopper()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(0);
	}
	
	public static JsonObject loadSurfaceTin()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(1);
	}
	
	public static JsonObject loadSurfaceLead()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(2);
	}
	
	public static JsonObject loadNetherCopper()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(3);
	}
	
	public static JsonObject loadNetherTin()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(4);
	}
	
	public static JsonObject loadNetherLead()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(5);
	}
	
	public static JsonObject loadEndCopper()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(6);
	}
	
	public static JsonObject loadEndTin()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(7);
	}
	
	public static JsonObject loadEndLead()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(8);
	}
}
