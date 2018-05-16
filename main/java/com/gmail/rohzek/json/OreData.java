package com.gmail.rohzek.json;

import java.util.ArrayList;
import java.util.List;

public class OreData implements Comparable<OreData>
{
	public String name, spawnBlock, miningLevel;
	public int minY, maxY, veinCount, veinMinimum, veinMaximum;
	public boolean disableOre;
	public List<String> biomeList;
	
	public OreData(String name, int minY, int maxY, int rarity, int veinMin, int veinMulti, String mineLvel, String oreConn, boolean disable, List<String> biomes)
	{
		this.name = name;
		this.minY = minY;
		this.maxY = maxY;
		this.veinCount = rarity;
		this.veinMinimum = veinMin;
		/*
		 * VeinMin is removed from the maximum here, because previously "best/worst" case scenario would generate maximum + minimum ores
		 * Now it will only generate maximum
		 */
		this.veinMaximum = (veinMulti - veinMin);
		this.miningLevel = mineLvel;
		this.spawnBlock = oreConn;
		this.disableOre = disable;
		this.biomeList = biomes;
	}

	@Override
	public int compareTo(OreData o) 
	{
		return name.compareTo(o.name);
	}
}
