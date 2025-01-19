package com.gmail.rohzek.simpleoregen.lib;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ConfigurationManager
{
	private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final General GENERAL = new General(BUILDER);
    public static final ModConfigSpec spec = BUILDER.build();
    
    public static class General 
    {
    	public final ModConfigSpec.ConfigValue<Boolean> isDebug;
    	public final ModConfigSpec.ConfigValue<String> chaosBlockDropMode;
    	/*
    	public final ModConfigSpec.ConfigValue<Boolean> consumeAir;
    	public final ModConfigSpec.ConfigValue<Integer> minutesOfAir;
    	public final ModConfigSpec.ConfigValue<Integer> airReturnSpeed;
    	public final ModConfigSpec.ConfigValue<Boolean> displayAirRemaining;
    	
    	public final ModConfigSpec.ConfigValue<Integer> airDisplayVerticalAlignment;
    	
    	public final ModConfigSpec.ConfigValue<Boolean> airRemainingCustomLocation;
    	public final ModConfigSpec.ConfigValue<Integer> airDisplayCustomX;
    	public final ModConfigSpec.ConfigValue<Integer> airDisplayCustomY;
    	
    	public final ModConfigSpec.ConfigValue<Boolean> invincibleArmor;
    	*/
    	
    	public General(ModConfigSpec.Builder builder)
        {
            builder.push("General");
            
            isDebug = builder
                    .comment("Enables/Disables debug mode logging [false/true|default:false]")
                    .translation("debugmode." + Reference.MODID + ".config")
                    .define("isDebug", false);
            
            chaosBlockDropMode = builder
                    .comment("Choose mode for ore drops from mining a Chaos Ore block [single/multiple|all|none; defaults to: none]")
                    .translation("chaosmode." + Reference.MODID + ".config")
                    .define("chaosBlockDropMode", "multiple");
            
            /*
            consumeAir = builder.comment("Enables/Disables the limited air system. If false, wearing gets you unlimited air. [false/true|default:true]")
            		.translation("shouldconsumeair." + Reference.MODID + ".config")
            		.define("consumeAir", true);
            
            minutesOfAir = builder.comment("How many minutes of air do you have on one tank [1..60|default:2]")
            		.translation("minutespertank." + Reference.MODID + ".config")
            		.defineInRange("minutesOfAir", 2, 1, 60);
            
            airReturnSpeed = builder.comment("How quickly should the air return; 1x the speed it takes to lose it, 2x the speed, etc. [1..10|default:2]")
            		.translation("airreturnmultiplier." + Reference.MODID + ".config")
            		.defineInRange("airReturnSpeed", 2, 1, 10);
            
            displayAirRemaining = builder
                    .comment("Enables/Disables the rendering of air time left in tank [false/true|default:true]")
                    .translation("displayairremaining." + Reference.MODID + ".config")
                    .define("displayAirRemaining", true);
			
            airDisplayVerticalAlignment = builder.comment("Vertical alignment of the air display text. Is a float. Ignored when custom location is enabled [default:69.0]")
            		.translation("displayverticalalignment." + Reference.MODID + ".config")
            		.define("airDisplayVerticalAlignment", 69);
            
            airRemainingCustomLocation = builder
                    .comment("Enables/Disables a custom location for the air display [false/true|default:false]")
                    .translation("airremainingcustomlocation." + Reference.MODID + ".config")
                    .define("airRemainingCustomLocation", false);
            
            airDisplayCustomX = builder.comment("Allows for a completely custom X value for the location of the air counter. Is resolution dependant! [default:0f]")
            		.translation("displaycustomx." + Reference.MODID + ".config")
            		.define("airDisplayCustomX", 0);
            
            airDisplayCustomY = builder.comment("Allows for a completely custom Y value for the location of the air counter. Is resolution dependant! [default:0f]")
            		.translation("displaycustomy." + Reference.MODID + ".config")
            		.define("airDisplayCustomX", 0);
            
            invincibleArmor = builder
                    .comment("If the head, legs, and feet should repair themselves if damage is recieved [false/true|default:true]")
                    .translation("invinciblearmor." + Reference.MODID + ".config")
                    .define("invincibleArmor", true);
            */
            builder.pop();
        }
    }
}

