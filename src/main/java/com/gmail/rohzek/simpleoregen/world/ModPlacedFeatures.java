package com.gmail.rohzek.simpleoregen.world;

import java.util.List;

import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModPlacedFeatures 
{
	public static final ResourceKey<PlacedFeature> NETHER_COAL_ORE_PLACED_KEY = registerKey("nether_coal_ore_placed");
	public static final ResourceKey<PlacedFeature> END_COAL_ORE_PLACED_KEY = registerKey("end_coal_ore_placed");
	
	public static final ResourceKey<PlacedFeature> NETHER_COPPER_ORE_PLACED_KEY = registerKey("nether_copper_ore_placed");
	public static final ResourceKey<PlacedFeature> END_COPPER_ORE_PLACED_KEY = registerKey("end_copper_ore_placed");
	
	public static final ResourceKey<PlacedFeature> NETHER_DIAMOND_ORE_PLACED_KEY = registerKey("nether_diamond_ore_placed");
	public static final ResourceKey<PlacedFeature> END_DIAMOND_ORE_PLACED_KEY = registerKey("end_diamond_ore_placed");
	
	public static final ResourceKey<PlacedFeature> NETHER_EMERALD_ORE_PLACED_KEY = registerKey("nether_emerald_ore_placed");
	public static final ResourceKey<PlacedFeature> END_EMERALD_ORE_PLACED_KEY = registerKey("end_emerald_ore_placed");
	
	public static final ResourceKey<PlacedFeature> NETHER_GOLD_ORE_PLACED_KEY = registerKey("nether_gold_ore_placed");
	public static final ResourceKey<PlacedFeature> END_GOLD_ORE_PLACED_KEY = registerKey("end_gold_ore_placed");
	
	public static final ResourceKey<PlacedFeature> NETHER_IRON_ORE_PLACED_KEY = registerKey("nether_iron_ore_placed");
	public static final ResourceKey<PlacedFeature> END_IRON_ORE_PLACED_KEY = registerKey("end_iron_ore_placed");
	
	public static final ResourceKey<PlacedFeature> NETHER_REDSTONE_ORE_PLACED_KEY = registerKey("nether_redstone_ore_placed");
	public static final ResourceKey<PlacedFeature> END_REDSTONE_ORE_PLACED_KEY = registerKey("end_redstone_ore_placed");
	
	public static final ResourceKey<PlacedFeature> NETHER_LAPIS_ORE_PLACED_KEY = registerKey("nether_lapis_ore_placed");
	public static final ResourceKey<PlacedFeature> END_LAPIS_ORE_PLACED_KEY = registerKey("end_lapis_ore_placed");
	
	public static final ResourceKey<PlacedFeature> OVERWORLD_ALUMINIUM_ORE_PLACED_KEY = registerKey("aluminium_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_ALUMINIUM_ORE_PLACED_KEY = registerKey("nether_aluminium_ore_placed");
	public static final ResourceKey<PlacedFeature> END_ALUMINIUM_ORE_PLACED_KEY = registerKey("end_aluminium_ore_placed");
	
	public static final ResourceKey<PlacedFeature> OVERWORLD_COBALT_ORE_PLACED_KEY = registerKey("cobalt_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_COBALT_ORE_PLACED_KEY = registerKey("nether_cobalt_ore_placed");
	public static final ResourceKey<PlacedFeature> END_COBALT_ORE_PLACED_KEY = registerKey("end_cobalt_ore_placed");
	
	public static final ResourceKey<PlacedFeature> OVERWORLD_IRIDIUM_ORE_PLACED_KEY = registerKey("iridium_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_IRIDIUM_ORE_PLACED_KEY = registerKey("nether_iridium_ore_placed");
	public static final ResourceKey<PlacedFeature> END_IRIDIUM_ORE_PLACED_KEY = registerKey("end_iridium_ore_placed");

	public static final ResourceKey<PlacedFeature> OVERWORLD_LEAD_ORE_PLACED_KEY = registerKey("lead_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_LEAD_ORE_PLACED_KEY = registerKey("nether_lead_ore_placed");
	public static final ResourceKey<PlacedFeature> END_LEAD_ORE_PLACED_KEY = registerKey("end_lead_ore_placed");

	public static final ResourceKey<PlacedFeature> OVERWORLD_NICKEL_ORE_PLACED_KEY = registerKey("nickel_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_NICKEL_ORE_PLACED_KEY = registerKey("nether_nickel_ore_placed");
	public static final ResourceKey<PlacedFeature> END_NICKEL_ORE_PLACED_KEY = registerKey("end_nickel_ore_placed");

	public static final ResourceKey<PlacedFeature> OVERWORLD_PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_PLATINUM_ORE_PLACED_KEY = registerKey("nether_platinum_ore_placed");
	public static final ResourceKey<PlacedFeature> END_PLATINUM_ORE_PLACED_KEY = registerKey("end_platinum_ore_placed");

	public static final ResourceKey<PlacedFeature> OVERWORLD_QUARTZ_ORE_PLACED_KEY = registerKey("quartz_ore_placed");
	public static final ResourceKey<PlacedFeature> END_QUARTZ_ORE_PLACED_KEY = registerKey("end_quartz_ore_placed");

	public static final ResourceKey<PlacedFeature> OVERWORLD_RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_RUBY_ORE_PLACED_KEY = registerKey("nether_ruby_ore_placed");
	public static final ResourceKey<PlacedFeature> END_RUBY_ORE_PLACED_KEY = registerKey("end_ruby_ore_placed");

	public static final ResourceKey<PlacedFeature> OVERWORLD_SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_SAPPHIRE_ORE_PLACED_KEY = registerKey("nether_sapphire_ore_placed");
	public static final ResourceKey<PlacedFeature> END_SAPPHIRE_ORE_PLACED_KEY = registerKey("end_sapphire_ore_placed");

	public static final ResourceKey<PlacedFeature> OVERWORLD_SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_SILVER_ORE_PLACED_KEY = registerKey("nether_silver_ore_placed");
	public static final ResourceKey<PlacedFeature> END_SILVER_ORE_PLACED_KEY = registerKey("end_silver_ore_placed");

	public static final ResourceKey<PlacedFeature> OVERWORLD_TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_TIN_ORE_PLACED_KEY = registerKey("nether_tin_ore_placed");
	public static final ResourceKey<PlacedFeature> END_TIN_ORE_PLACED_KEY = registerKey("end_tin_ore_placed");

	public static final ResourceKey<PlacedFeature> OVERWORLD_TUNGSTEN_ORE_PLACED_KEY = registerKey("tungsten_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_TUNGSTEN_ORE_PLACED_KEY = registerKey("nether_tungsten_ore_placed");
	public static final ResourceKey<PlacedFeature> END_TUNGSTEN_ORE_PLACED_KEY = registerKey("end_tungsten_ore_placed");

	public static final ResourceKey<PlacedFeature> OVERWORLD_URANIUM_ORE_PLACED_KEY = registerKey("uranium_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_URANIUM_ORE_PLACED_KEY = registerKey("nether_uranium_ore_placed");
	public static final ResourceKey<PlacedFeature> END_URANIUM_ORE_PLACED_KEY = registerKey("end_uranium_ore_placed");

	public static final ResourceKey<PlacedFeature> OVERWORLD_ZINC_ORE_PLACED_KEY = registerKey("zinc_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_ZINC_ORE_PLACED_KEY = registerKey("nether_zinc_ore_placed");
	public static final ResourceKey<PlacedFeature> END_ZINC_ORE_PLACED_KEY = registerKey("end_zinc_ore_placed");
	
	public static final ResourceKey<PlacedFeature> CHESHIREROSE_PLACED_KEY = registerKey("cheshirerose_placed");
	public static final ResourceKey<PlacedFeature> ROSE_PLACED_KEY = registerKey("rose_placed");
	public static final ResourceKey<PlacedFeature> ROSE_CYAN_PLACED_KEY = registerKey("rose_cyan_placed");
	
    public static void bootstrap(BootstrapContext<PlacedFeature> context) 
    {
    	// ConfigureFeature -> PlacedFeature -> BiomeModifier
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        int veinCount = 12, lowestYLevel = -64, highestYLevel = 80;
        
        
        register(context, NETHER_COAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_COAL_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_COAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_COAL_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_COPPER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_COPPER_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_COPPER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_COPPER_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_DIAMOND_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_DIAMOND_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_DIAMOND_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_DIAMOND_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_EMERALD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_EMERALD_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_EMERALD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_EMERALD_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_GOLD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_GOLD_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_GOLD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_GOLD_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_IRON_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_IRON_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_IRON_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_IRON_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_REDSTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_REDSTONE_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_REDSTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_REDSTONE_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_LAPIS_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_LAPIS_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_LAPIS_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_LAPIS_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        
        
        register(context, OVERWORLD_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_QUARTZ_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_QUARTZ_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        
        
        register(context, OVERWORLD_ALUMINIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ALUMINIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_ALUMINIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_ALUMINIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_ALUMINIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_ALUMINIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        
        register(context, OVERWORLD_COBALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_COBALT_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_COBALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_COBALT_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_COBALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_COBALT_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
    
        register(context, OVERWORLD_IRIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_IRIDIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_IRIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_IRIDIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_IRIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_IRIDIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        
        register(context, OVERWORLD_LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_LEAD_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_LEAD_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_LEAD_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        
        register(context, OVERWORLD_NICKEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_NICKEL_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_NICKEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_NICKEL_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_NICKEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_NICKEL_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        
        register(context, OVERWORLD_PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PLATINUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_PLATINUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_PLATINUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        
        register(context, OVERWORLD_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        
        register(context, OVERWORLD_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        
        register(context, OVERWORLD_SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SILVER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SILVER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_SILVER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        
        register(context, OVERWORLD_TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TIN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_TIN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_TIN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        
        register(context, OVERWORLD_TUNGSTEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TUNGSTEN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_TUNGSTEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_TUNGSTEN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_TUNGSTEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_TUNGSTEN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        
        register(context, OVERWORLD_URANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_URANIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_URANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_URANIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_URANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_URANIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        
        register(context, OVERWORLD_ZINC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ZINC_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, NETHER_ZINC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_ZINC_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
        register(context, END_ZINC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_ZINC_ORE_KEY),
                ModOrePlacement.commonOrePlacement(veinCount, HeightRangePlacement.uniform(VerticalAnchor.absolute(lowestYLevel), VerticalAnchor.absolute(highestYLevel))));
    
        // Cheshire Rose should be more rare than any other flower
        // NoiseThresholdCountPlacement.of(-0.8, 15, 4)
        register(context, CHESHIREROSE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHESHIREROSE_KEY),
        		List.of(CountPlacement.of(3), RarityFilter.onAverageOnceEvery(128), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, 
        		BiomeFilter.biome()));
        
        register(context, ROSE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROSE_KEY),
        		List.of(CountPlacement.of(3),
        				RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, 
        		BiomeFilter.biome()));
        
        register(context, ROSE_CYAN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROSE_CYAN_KEY),
        		List.of(CountPlacement.of(3), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, 
        		BiomeFilter.biome()));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) 
    {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(Reference.MODID, name));
    }

    
	private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) 
    {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
