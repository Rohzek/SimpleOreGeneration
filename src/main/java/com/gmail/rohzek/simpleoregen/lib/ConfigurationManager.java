package com.gmail.rohzek.simpleoregen.lib;

import java.util.HashMap;
import java.util.Map;

import com.gmail.rohzek.simpleoregen.world.OrePlacements;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ConfigurationManager
{
	private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final General GENERAL = new General(BUILDER);
    public static final OreGen OREGEN = new OreGen(BUILDER);
    public static final ModConfigSpec spec = BUILDER.build();
    
    public static class General 
    {
    	public final ModConfigSpec.ConfigValue<Boolean> isDebug;
    	public final ModConfigSpec.ConfigValue<String> chaosBlockDropMode;
    	public final ModConfigSpec.ConfigValue<Boolean> wifeFlower;
    	
    	public General(ModConfigSpec.Builder builder)
        {
            builder.push("General");
            
            isDebug = builder
                    .comment("Enables/Disables debug mode logging [false/true|default:false] NOTE: WILL SPAM OUTPUT LOGS!")
                    .translation("debugmode." + Reference.MODID + ".config")
                    .define("isDebug", false);
            
            chaosBlockDropMode = builder
                    .comment("Choose mode for ore drops from mining a Chaos Ore block [single/multiple|all|none; default: multiple]")
                    .translation("chaosmode." + Reference.MODID + ".config")
                    .define("chaosBlockDropMode", "multiple");
            
            wifeFlower = builder
                    .comment("Enables/Disables generation of the CheshireRose [false/true|default:true]")
                    .translation("wifeflower." + Reference.MODID + ".config")
                    .define("wifeFlower", true);
            
            builder.pop();
        }
    }
    
    public static class OreGen
    {
    	public final Map<OrePlacements, ModConfigSpec.IntValue> veinSizes = new HashMap<>();
    	public final Map<OrePlacements, ModConfigSpec.IntValue> veinCounts = new HashMap<>();
    	public final Map<OrePlacements, ModConfigSpec.IntValue> minYLevels = new HashMap<>();
    	public final Map<OrePlacements, ModConfigSpec.IntValue> maxYLevels = new HashMap<>();
    	
    	public OreGen(ModConfigSpec.Builder builder)
    	{
            builder.push("OreGeneration");

            for (OrePlacements ore : OrePlacements.values()) 
            {
                String base = ore.name().toLowerCase();

                veinSizes.put(
                    ore,
                    builder.defineInRange(base + "_vein_size", ore.getVeinSize(), 0, 100)
                );

                veinCounts.put(
                    ore,
                    builder.defineInRange(base + "_vein_count", ore.getVeinCount(), 0, 100)
                );

                minYLevels.put(
                    ore,
                    builder.defineInRange(base + "_min_y", ore.getMinYLevel(), -64, 320)
                );

                maxYLevels.put(
                    ore,
                    builder.defineInRange(base + "_max_y", ore.getMaxYLevel(), -64, 320)
                );
            }
            
            builder.pop();
    	}
    }
}

