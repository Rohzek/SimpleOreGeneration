package com.gmail.rohzek.simpleoregeneration.compatibility;

import java.util.LinkedHashSet;
import java.util.Set;

import com.gmail.rohzek.util.LogHelper;
import com.gmail.rohzek.world.SGWorldGenMineable;
import com.gmail.rohzek.world.WorldGenerators;

public class ModdedConstants 
{
	public static Set<ModOre> allOres = new LinkedHashSet<>();
	public static Set<ModOre> enabledOres = new LinkedHashSet<>();
	public static Set<ModOre> removeOres = new LinkedHashSet<>();
	
	public static void removeWorldGenerators()
	{
		populateSet();
		cleanSet();
		
		for(SGWorldGenMineable mineable : WorldGenerators.worldGeneratorsSurface)
		{
			for(ModOre ore : allOres)
			{
				if(mineable.data.name.toLowerCase().contains(ore.name.toLowerCase()))
				{
					mineable.data.disableOre = true;
				}
			}
		}

		for(SGWorldGenMineable mineable : WorldGenerators.worldGeneratorsNether)
		{
			for(ModOre ore : allOres)
			{
				if(mineable.data.name.toLowerCase().contains(ore.name.toLowerCase()))
				{
					mineable.data.disableOre = true;
				}
			}
		}
		
		for(SGWorldGenMineable mineable : WorldGenerators.worldGeneratorsEnd)
		{
			for(ModOre ore : allOres)
			{
				if(mineable.data.name.toLowerCase().contains(ore.name.toLowerCase()))
				{
					mineable.data.disableOre = true;
				}
			}
		}
	}
	static void cleanSet()
	{
		for(ModOre ore : allOres)
		{
			for(ModOre ores : enabledOres)
			{	
				if(ore.equals(ores))
				{
					removeOres.add(ore);
					continue;
				}
			}
		}
		
		allOres.removeAll(removeOres);
	}
	
	static void populateSet()
	{
		allOres.add(new ModOre("aluminumOre", false));
		allOres.add(new ModOre("cobaltOre", false));
		allOres.add(new ModOre("arditeOre", false));
		allOres.add(new ModOre("copperOre", false));
		allOres.add(new ModOre("iridiumOre", false));
		allOres.add(new ModOre("leadOre", false));
		allOres.add(new ModOre("nickelOre", false));
		allOres.add(new ModOre("platinumOre", false));
		allOres.add(new ModOre("tinOre", false));
		allOres.add(new ModOre("silverOre", false));
		allOres.add(new ModOre("uraniumOre", false));
		
		allOres.add(new ModOre("cinnabarOre", false));
		allOres.add(new ModOre("galenaOre", false));
		allOres.add(new ModOre("peridotOre", false));
		allOres.add(new ModOre("pyriteOre", false));
		allOres.add(new ModOre("rubyOre", false));
		allOres.add(new ModOre("sapphireOre", false));
		allOres.add(new ModOre("sheldoniteOre", false));
		allOres.add(new ModOre("sodaliteOre", false));
		allOres.add(new ModOre("sphaleriteOre", false));
		allOres.add(new ModOre("tungstenOre", false));
		
		allOres.add(new ModOre("osmiumOre", false));

		allOres.add(new ModOre("rutileOre", false));
		allOres.add(new ModOre("dilithiumOre", false));
		
		allOres.add(new ModOre("magnetiteOre", false));
		allOres.add(new ModOre("zincOre", false));
		
		allOres.add(new ModOre("certusQuartzOre", false));
		allOres.add(new ModOre("chargedCertusQuartzOre", false));
	}
}
