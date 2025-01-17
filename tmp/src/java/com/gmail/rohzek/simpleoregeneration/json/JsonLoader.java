package com.gmail.rohzek.simpleoregeneration.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import com.gmail.rohzek.util.LogHelper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class JsonLoader 
{
	private static JsonObject obj;
	private static JsonParser parser = new JsonParser();
	
	public static void loadData(File file)
	{
		FileReader reader = null;
		if(file.exists() && !file.isDirectory())
		{
			try 
			{
				reader = new FileReader(file);
				obj = parser.parse(reader).getAsJsonObject();
			} 
			catch (JsonIOException e){} 
			catch (JsonSyntaxException e){} 
			catch (FileNotFoundException e){} 
			finally
			{
				if(reader != null)
				{
					try 
					{
						reader.close();
					} 
					catch (IOException e) {}
				}
			}
		}
		else
		{
			LogHelper.error("No file found when attempting to load " + file.getName());
		}
	}
	
	public static JsonObject getJsonObject()
	{
		return obj;
	}
	
	public static String getVersionNumber()
	{
		return obj.getAsJsonObject("VersionNumber").get("Version").getAsString();
	}
	
	public static List<OreData> getList(String name)
	{
		JsonElement element = obj.get(name);
		Type listType = new TypeToken<List<OreData>>() {}.getType();
		
		return new Gson().fromJson(element, listType);
	}
}
