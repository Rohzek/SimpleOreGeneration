package com.gmail.rohzek.json;

import java.util.ArrayList;
import java.util.List;

public class OreData implements Comparable<OreData>
{
	public String name, spawnBlock, miningLevel;
	/*
	 * 
	 * veinMinimum and veinMaximum = number of blocks per vein
	 */
	public int minY, maxY, veinMinimum, veinMaximum, countMinimum, countMaximum;
	public boolean disableOre;
	public List<String> biomeList;
	
	public OreData(String name, int minY, int maxY, int rarityMin, int rarityMax, int countMin, int countMulti, String mineLvel, String oreConn, boolean disable, List<String> biomes)
	{
		this.name = name;
		this.minY = minY;
		this.maxY = maxY;
		this.veinMinimum = rarityMin;
		this.veinMaximum = rarityMax;
		this.countMinimum = countMin;
		this.countMaximum = countMulti;
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
