package com.gmail.rohzek.util.json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonLoader 
{
	private static JsonObject obj;
	private static JsonParser parser = new JsonParser();
	
	public static void loadData()
	{
		if(JsonCreator.jsonFile.exists() && !JsonCreator.jsonFile.isDirectory())
		{
			try 
			{
				obj = parser.parse(new FileReader(JsonCreator.jsonFile)).getAsJsonObject();
			} 
			catch (JsonIOException e){} 
			catch (JsonSyntaxException e){} 
			catch (FileNotFoundException e){}
		}
		else
		{
			obj = parser.parse(JsonCreator.createJson()).getAsJsonObject();
		}
	}
	
	public static JsonObject getJsonObject()
	{
		return obj;
	}
}
