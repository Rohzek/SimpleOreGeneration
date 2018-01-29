package com.gmail.rohzek.compatibility;

import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

public class TFCompat 
{
	public static void load()
	{
		fixConfig();
		loadOre();
		LogHelper.log("Thermal Foundation Compatibility loaded, however, please note that additional steps are required to remove Thermal Foundation ores from spawning.");
		LogHelper.log("First, you must go to config/cofh/thermalfoundation and edit common.cfg, and change 'GenerateDefaultFiles' on line 541 to false");
		LogHelper.log("Then, go to config/cofh/world and rename or delete '00_minecraft.json' and '01_thermalfoundation_ores.json'");
		LogHelper.log("This was previously done for you, but that feature has been removed at the request of one of the authors. A simpler version may be coming again in the future, but that is per the author's discretion");
	}
	
	// An IMC may be coming in the future, to automate the feature once more.
	public static void fixConfig(){}
	
	public static void loadOre()
	{
		if(ConfigurationManager.supportTF)
		{			
			ModdedConstants.enabledOres.add(new ModOre("aluminumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("copperOre", true));
			ModdedConstants.enabledOres.add(new ModOre("iridiumOre", true));
			ModdedConstants.enabledOres.add(new ModOre("leadOre", true));
			ModdedConstants.enabledOres.add(new ModOre("nickelOre", true));
			ModdedConstants.enabledOres.add(new ModOre("silverOre", true));
			ModdedConstants.enabledOres.add(new ModOre("tinOre", true));
		}
	}
}
