package com.gmail.rohzek.util.json;

import com.gmail.rohzek.util.LogHelper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonLoadICBlocks 
{
	static JsonObject obj = JsonLoader.getJsonObject();
	
	public static JsonArray loadModOres()
	{
		JsonArray modOres = obj.getAsJsonArray("IC2");
		return modOres;
	}
	
	public static JsonObject loadSurfaceUranium()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(0);
	}
	
	public static JsonObject loadNetherUranium()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(1);
	}
	
	public static JsonObject loadEndUranium()
	{
		JsonArray array = loadModOres();
		return (JsonObject) array.get(2);
	}
}
