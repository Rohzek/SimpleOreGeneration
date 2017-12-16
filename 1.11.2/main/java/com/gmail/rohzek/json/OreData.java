package com.gmail.rohzek.json;

public class OreData implements Comparable<OreData>
{
	public String name, spawnBlock, miningLevel;
	public int minY, maxY, veinCount, veinMinimum, veinMultiplier;
	public boolean disableOre;
	
	public OreData(String name, int minY, int maxY, int rarity, int veinMin, int veinMulti, String mineLvel, String oreConn, boolean disable)
	{
		this.name = name;
		this.minY = minY;
		this.maxY = maxY;
		this.veinCount = rarity;
		this.veinMinimum = veinMin;
		this.veinMultiplier = veinMulti;
		this.miningLevel = mineLvel;
		this.spawnBlock = oreConn;
		this.disableOre = disable;
	}

	@Override
	public int compareTo(OreData o) 
	{
		return name.compareTo(o.name);
	}
}
