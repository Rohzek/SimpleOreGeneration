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
	public static final ResourceKey<PlacedFeature> OVERWORLD_COAL_ORE_PLACED_KEY = registerKey("overworld_coal_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_COAL_ORE_PLACED_KEY = registerKey("nether_coal_ore_placed");
	public static final ResourceKey<PlacedFeature> END_COAL_ORE_PLACED_KEY = registerKey("end_coal_ore_placed");
	
	public static final ResourceKey<PlacedFeature> OVERWORLD_COPPER_ORE_PLACED_KEY = registerKey("overworld_copper_ore_placed");
	public static final ResourceKey<PlacedFeature> OVERWORLD_COPPER_NUGGET_ORE_PLACED_KEY = registerKey("overworld_copper_nugget_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_COPPER_ORE_PLACED_KEY = registerKey("nether_copper_ore_placed");
	public static final ResourceKey<PlacedFeature> END_COPPER_ORE_PLACED_KEY = registerKey("end_copper_ore_placed");
	
	public static final ResourceKey<PlacedFeature> OVERWORLD_DIAMOND_ORE_PLACED_KEY = registerKey("overworld_diamond_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_DIAMOND_ORE_PLACED_KEY = registerKey("nether_diamond_ore_placed");
	public static final ResourceKey<PlacedFeature> END_DIAMOND_ORE_PLACED_KEY = registerKey("end_diamond_ore_placed");
	
	public static final ResourceKey<PlacedFeature> OVERWORLD_EMERALD_ORE_PLACED_KEY = registerKey("overworld_emerald_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_EMERALD_ORE_PLACED_KEY = registerKey("nether_emerald_ore_placed");
	public static final ResourceKey<PlacedFeature> END_EMERALD_ORE_PLACED_KEY = registerKey("end_emerald_ore_placed");
	
	public static final ResourceKey<PlacedFeature> OVERWORLD_GOLD_ORE_PLACED_KEY = registerKey("overworld_gold_ore_placed");
	public static final ResourceKey<PlacedFeature> OVERWORLD_GOLD_NUGGET_ORE_PLACED_KEY = registerKey("overworld_gold_nugget_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_GOLD_ORE_PLACED_KEY = registerKey("nether_gold_ore_placed");
	public static final ResourceKey<PlacedFeature> END_GOLD_ORE_PLACED_KEY = registerKey("end_gold_ore_placed");
	
	public static final ResourceKey<PlacedFeature> OVERWORLD_IRON_ORE_PLACED_KEY = registerKey("overworld_iron_ore_placed");
	public static final ResourceKey<PlacedFeature> OVERWORLD_IRON_NUGGET_ORE_PLACED_KEY = registerKey("overworld_iron_nugget_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_IRON_ORE_PLACED_KEY = registerKey("nether_iron_ore_placed");
	public static final ResourceKey<PlacedFeature> END_IRON_ORE_PLACED_KEY = registerKey("end_iron_ore_placed");
	
	public static final ResourceKey<PlacedFeature> OVERWORLD_REDSTONE_ORE_PLACED_KEY = registerKey("overworld_redstone_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_REDSTONE_ORE_PLACED_KEY = registerKey("nether_redstone_ore_placed");
	public static final ResourceKey<PlacedFeature> END_REDSTONE_ORE_PLACED_KEY = registerKey("end_redstone_ore_placed");
	
	public static final ResourceKey<PlacedFeature> OVERWORLD_LAPIS_ORE_PLACED_KEY = registerKey("overworld_lapis_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_LAPIS_ORE_PLACED_KEY = registerKey("nether_lapis_ore_placed");
	public static final ResourceKey<PlacedFeature> END_LAPIS_ORE_PLACED_KEY = registerKey("end_lapis_ore_placed");
	
	public static final ResourceKey<PlacedFeature> OVERWORLD_QUARTZ_ORE_PLACED_KEY = registerKey("overworld_quartz_ore_placed");
	//public static final ResourceKey<PlacedFeature> NETHER_QUARTZ_ORE_PLACED_KEY = registerKey("nether_quartz_ore_placed");
	public static final ResourceKey<PlacedFeature> END_QUARTZ_ORE_PLACED_KEY = registerKey("end_quartz_ore_placed");
	
	public static final ResourceKey<PlacedFeature> OVERWORLD_BAUXITE_ORE_PLACED_KEY = registerKey("bauxite_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_BAUXITE_ORE_PLACED_KEY = registerKey("nether_bauxite_ore_placed");
	public static final ResourceKey<PlacedFeature> END_BAUXITE_ORE_PLACED_KEY = registerKey("end_bauxite_ore_placed");
	
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
	
	public static final ResourceKey<PlacedFeature> OVERWORLD_CHAOS_ORE_PLACED_KEY = registerKey("chaos_ore_placed");
	public static final ResourceKey<PlacedFeature> NETHER_CHAOS_ORE_PLACED_KEY = registerKey("nether_chaos_ore_placed");
	public static final ResourceKey<PlacedFeature> END_CHAOS_ORE_PLACED_KEY = registerKey("end_chaos_ore_placed");
	
	public static final ResourceKey<PlacedFeature> CHESHIREROSE_PLACED_KEY = registerKey("cheshirerose_placed");
	public static final ResourceKey<PlacedFeature> ROSE_PLACED_KEY = registerKey("rose_placed");
	public static final ResourceKey<PlacedFeature> ROSE_CYAN_PLACED_KEY = registerKey("rose_cyan_placed");
	
    public static void bootstrap(BootstrapContext<PlacedFeature> context) 
    {
    	// ConfigureFeature -> PlacedFeature -> BiomeModifier
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        
        
        register(context, OVERWORLD_COAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_COAL_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_COAL.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_COAL.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_COAL.getMaxYLevel()))));
        register(context, NETHER_COAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_COAL_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_COAL.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_COAL.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_COAL.getMaxYLevel()))));
        register(context, END_COAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_COAL_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.END_COAL.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_COAL.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_COAL.getMaxYLevel()))));
        register(context, OVERWORLD_COPPER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_COPPER_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_COPPER.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_COPPER.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_COPPER.getMaxYLevel()))));
        register(context, OVERWORLD_COPPER_NUGGET_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_COPPER_NUGGET_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_COPPER_NUGGET.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_COPPER_NUGGET.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_COPPER_NUGGET.getMaxYLevel()))));
        register(context, NETHER_COPPER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_COPPER_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_COPPER.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_COPPER.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_COPPER.getMaxYLevel()))));
        register(context, END_COPPER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_COPPER_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.END_COPPER.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_COPPER.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_COPPER.getMaxYLevel()))));
        register(context, OVERWORLD_DIAMOND_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_DIAMOND_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_DIAMOND.getVeinCount(), HeightRangePlacement.triangle(VerticalAnchor.absolute(OrePlacements.SURFACE_DIAMOND.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_DIAMOND.getMaxYLevel()))));
        register(context, NETHER_DIAMOND_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_DIAMOND_ORE_KEY),
        		ModOrePlacement.rareOrePlacement(OrePlacements.NETHER_DIAMOND.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_DIAMOND.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_DIAMOND.getMaxYLevel()))));
        register(context, END_DIAMOND_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_DIAMOND_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.END_DIAMOND.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_DIAMOND.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_DIAMOND.getMaxYLevel()))));
        register(context, OVERWORLD_EMERALD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_EMERALD_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_EMERALD.getVeinCount(), HeightRangePlacement.triangle(VerticalAnchor.absolute(OrePlacements.SURFACE_EMERALD.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_EMERALD.getMaxYLevel()))));
        register(context, NETHER_EMERALD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_EMERALD_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_EMERALD.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_EMERALD.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_EMERALD.getMaxYLevel()))));
        register(context, END_EMERALD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_EMERALD_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.END_EMERALD.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_EMERALD.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_EMERALD.getMaxYLevel()))));
        register(context, OVERWORLD_GOLD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_GOLD_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_GOLD.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_GOLD.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_GOLD.getMaxYLevel()))));
        register(context, OVERWORLD_GOLD_NUGGET_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_GOLD_NUGGET_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_GOLD_NUGGET.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_GOLD_NUGGET.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_GOLD_NUGGET.getMaxYLevel()))));
        register(context, NETHER_GOLD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_GOLD_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_GOLD.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_GOLD.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_GOLD.getMaxYLevel()))));
        register(context, END_GOLD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_GOLD_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.END_GOLD.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_GOLD.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_GOLD.getMaxYLevel()))));
        register(context, OVERWORLD_IRON_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_IRON_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_IRON.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_IRON.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_IRON.getMaxYLevel()))));
        register(context, OVERWORLD_IRON_NUGGET_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_IRON_NUGGET_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_IRON_NUGGET.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_IRON_NUGGET.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_IRON_NUGGET.getMaxYLevel()))));
        register(context, NETHER_IRON_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_IRON_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_IRON.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_IRON.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_IRON.getMaxYLevel()))));
        register(context, END_IRON_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_IRON_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.END_IRON.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_IRON.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_IRON.getMaxYLevel()))));
        register(context, OVERWORLD_REDSTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_REDSTONE_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_REDSTONE.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_REDSTONE.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_REDSTONE.getMaxYLevel()))));
        register(context, NETHER_REDSTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_REDSTONE_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_REDSTONE.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_REDSTONE.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_REDSTONE.getMaxYLevel()))));
        register(context, END_REDSTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_REDSTONE_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.END_REDSTONE.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_REDSTONE.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_REDSTONE.getMaxYLevel()))));
        register(context, OVERWORLD_LAPIS_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_LAPIS_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_LAPIS.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_LAPIS.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_LAPIS.getMaxYLevel()))));
        register(context, NETHER_LAPIS_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_LAPIS_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_LAPIS.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_LAPIS.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_LAPIS.getMaxYLevel()))));
        register(context, END_LAPIS_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_LAPIS_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.END_LAPIS.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_LAPIS.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_LAPIS.getMaxYLevel()))));
        
        
        register(context, OVERWORLD_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_QUARTZ_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_QUARTZ.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_QUARTZ.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_QUARTZ.getMaxYLevel()))));
        register(context, END_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_QUARTZ_ORE_KEY),
        		ModOrePlacement.commonOrePlacement(OrePlacements.END_QUARTZ.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_QUARTZ.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_QUARTZ.getMaxYLevel()))));
        
        
        register(context, OVERWORLD_BAUXITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_BAUXITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_BAUXITE.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_BAUXITE.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_BAUXITE.getMaxYLevel()))));
        register(context, NETHER_BAUXITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_BAUXITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_BAUXITE.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_BAUXITE.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_BAUXITE.getMaxYLevel()))));
        register(context, END_BAUXITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_BAUXITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.END_BAUXITE.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_BAUXITE.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_BAUXITE.getMaxYLevel()))));
        
        register(context, OVERWORLD_COBALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_COBALT_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_COBALT.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_COBALT.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_COBALT.getMaxYLevel()))));
        register(context, NETHER_COBALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_COBALT_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_COBALT.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_COBALT.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_COBALT.getMaxYLevel()))));
        register(context, END_COBALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_COBALT_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.END_COBALT.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_COBALT.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_COBALT.getMaxYLevel()))));
    
        register(context, OVERWORLD_IRIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_IRIDIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_IRIDIUM.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_IRIDIUM.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_IRIDIUM.getMaxYLevel()))));
        register(context, NETHER_IRIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_IRIDIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_IRIDIUM.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_IRIDIUM.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_IRIDIUM.getMaxYLevel()))));
        register(context, END_IRIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_IRIDIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.END_IRIDIUM.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_IRIDIUM.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_IRIDIUM.getMaxYLevel()))));
        
        register(context, OVERWORLD_LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_LEAD_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_LEAD.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_LEAD.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_LEAD.getMaxYLevel()))));
        register(context, NETHER_LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_LEAD_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_LEAD.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_LEAD.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_LEAD.getMaxYLevel()))));
        register(context, END_LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_LEAD_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.END_LEAD.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_LEAD.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_LEAD.getMaxYLevel()))));
        
        register(context, OVERWORLD_NICKEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_NICKEL_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_NICKEL.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_NICKEL.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_NICKEL.getMaxYLevel()))));
        register(context, NETHER_NICKEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_NICKEL_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_NICKEL.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_NICKEL.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_NICKEL.getMaxYLevel()))));
        register(context, END_NICKEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_NICKEL_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.END_NICKEL.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_NICKEL.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_NICKEL.getMaxYLevel()))));
        
        register(context, OVERWORLD_PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PLATINUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_PLATINUM.getVeinCount(), HeightRangePlacement.triangle(VerticalAnchor.absolute(OrePlacements.SURFACE_PLATINUM.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_PLATINUM.getMaxYLevel()))));
        register(context, NETHER_PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_PLATINUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_NICKEL.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_NICKEL.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_NICKEL.getMaxYLevel()))));
        register(context, END_PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_PLATINUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.END_NICKEL.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_NICKEL.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_NICKEL.getMaxYLevel()))));
        
        register(context, OVERWORLD_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_RUBY.getVeinCount(), HeightRangePlacement.triangle(VerticalAnchor.absolute(OrePlacements.SURFACE_RUBY.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_RUBY.getMaxYLevel()))));
        register(context, NETHER_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_RUBY.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_RUBY.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_RUBY.getMaxYLevel()))));
        register(context, END_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.END_RUBY.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_RUBY.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_RUBY.getMaxYLevel()))));
        
        register(context, OVERWORLD_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_SAPPHIRE.getVeinCount(), HeightRangePlacement.triangle(VerticalAnchor.absolute(OrePlacements.SURFACE_SAPPHIRE.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_SAPPHIRE.getMaxYLevel()))));
        register(context, NETHER_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_SAPPHIRE.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_SAPPHIRE.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_SAPPHIRE.getMaxYLevel()))));
        register(context, END_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.END_SAPPHIRE.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_SAPPHIRE.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_SAPPHIRE.getMaxYLevel()))));
        
        register(context, OVERWORLD_SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SILVER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_SILVER.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_SILVER.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_SILVER.getMaxYLevel()))));
        register(context, NETHER_SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SILVER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_SAPPHIRE.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_SAPPHIRE.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_SAPPHIRE.getMaxYLevel()))));
        register(context, END_SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_SILVER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.END_SAPPHIRE.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_SAPPHIRE.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_SAPPHIRE.getMaxYLevel()))));
        
        register(context, OVERWORLD_TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TIN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_TIN.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_TIN.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_TIN.getMaxYLevel()))));
        register(context, NETHER_TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_TIN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_TIN.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_TIN.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_TIN.getMaxYLevel()))));
        register(context, END_TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_TIN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.END_TIN.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_TIN.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_TIN.getMaxYLevel()))));
        
        register(context, OVERWORLD_TUNGSTEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TUNGSTEN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_TUNGSTEN.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_TUNGSTEN.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_TUNGSTEN.getMaxYLevel()))));
        register(context, NETHER_TUNGSTEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_TUNGSTEN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_TUNGSTEN.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_TUNGSTEN.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_TUNGSTEN.getMaxYLevel()))));
        register(context, END_TUNGSTEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_TUNGSTEN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.END_TUNGSTEN.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_TUNGSTEN.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_TUNGSTEN.getMaxYLevel()))));
        
        register(context, OVERWORLD_URANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_URANIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_URANIUM.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_URANIUM.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_URANIUM.getMaxYLevel()))));
        register(context, NETHER_URANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_URANIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_URANIUM.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_URANIUM.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_URANIUM.getMaxYLevel()))));
        register(context, END_URANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_URANIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.END_URANIUM.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_URANIUM.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_URANIUM.getMaxYLevel()))));
        
        register(context, OVERWORLD_ZINC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ZINC_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_ZINC.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_ZINC.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_ZINC.getMaxYLevel()))));
        register(context, NETHER_ZINC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_ZINC_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_ZINC.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_ZINC.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_ZINC.getMaxYLevel()))));
        register(context, END_ZINC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_ZINC_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.END_ZINC.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_ZINC.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_ZINC.getMaxYLevel()))));
    
        
        register(context, OVERWORLD_CHAOS_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_CHAOS_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.SURFACE_CHAOS.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.SURFACE_CHAOS.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.SURFACE_CHAOS.getMaxYLevel()))));
        register(context, NETHER_CHAOS_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_CHAOS_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.NETHER_CHAOS.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.NETHER_CHAOS.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.NETHER_CHAOS.getMaxYLevel()))));
        register(context, END_CHAOS_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_CHAOS_ORE_KEY),
                ModOrePlacement.commonOrePlacement(OrePlacements.END_CHAOS.getVeinCount(), HeightRangePlacement.uniform(VerticalAnchor.absolute(OrePlacements.END_CHAOS.getMinYLevel()), VerticalAnchor.absolute(OrePlacements.END_CHAOS.getMaxYLevel()))));
        
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
