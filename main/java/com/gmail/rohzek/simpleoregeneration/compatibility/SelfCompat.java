package com.gmail.rohzek.simpleoregeneration.compatibility;

import com.gmail.rohzek.util.ConfigurationManager;

public class SelfCompat 
{
	public static void load() 
	{
		loadOre();
	}
	
	public static void loadOre()
	{
		if(ConfigurationManager.forceSpawnModdedOres)
		{
			// Enable all modded ores, if user has chosen it.
			ModdedConstants.enabledOres.add(new ModOre("aluminumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("arditeOre", true));
			ModdedConstants.enabledOres.add(new ModOre("certusQuartzOre", true));
			ModdedConstants.enabledOres.add(new ModOre("cinnabarOre", true));
			ModdedConstants.enabledOres.add(new ModOre("cobaltOre", true));
			ModdedConstants.enabledOres.add(new ModOre("chargedCertusQuartzOre", true));
			ModdedConstants.enabledOres.add(new ModOre("copperOre", true));
			ModdedConstants.enabledOres.add(new ModOre("dilithiumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("galenaOre", true));
			ModdedConstants.enabledOres.add(new ModOre("iridiumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("leadOre", true));
			ModdedConstants.enabledOres.add(new ModOre("nickelOre", true));
			ModdedConstants.enabledOres.add(new ModOre("peridotOre", true));
			ModdedConstants.enabledOres.add(new ModOre("platinumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("pyriteOre", true));
			ModdedConstants.enabledOres.add(new ModOre("rubyOre", true));
			ModdedConstants.enabledOres.add(new ModOre("silverOre", true));
			ModdedConstants.enabledOres.add(new ModOre("sapphireOre", true));
			ModdedConstants.enabledOres.add(new ModOre("sheldoniteOre", true));
			ModdedConstants.enabledOres.add(new ModOre("sodaliteOre", true));
			ModdedConstants.enabledOres.add(new ModOre("sphaleriteOre", true));
			ModdedConstants.enabledOres.add(new ModOre("rutileOre", true));
			ModdedConstants.enabledOres.add(new ModOre("tinOre", true));
			ModdedConstants.enabledOres.add(new ModOre("tungstenOre", true));
		}
	}
}
