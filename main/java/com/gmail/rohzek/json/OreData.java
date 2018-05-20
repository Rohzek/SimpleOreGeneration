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
		this.veinMaximum = veinMulti;
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
