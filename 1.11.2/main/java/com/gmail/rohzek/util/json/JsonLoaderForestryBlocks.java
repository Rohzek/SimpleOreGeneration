package com.gmail.rohzek.util.json;

import com.gmail.rohzek.util.LogHelper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonLoaderForestryBlocks
{
	static JsonObject obj = JsonLoader.getJsonObject();
	
	public static JsonArray loadModOres()
	{
		JsonArray modOres = obj.getAsJsonArray("forestry");
		return modOres;
	}
	
	public static JsonObject loadSurfaceApatite()
	{	
		JsonArray array = loadModOres();
		return (JsonObject) array.get(0);
	}
}
