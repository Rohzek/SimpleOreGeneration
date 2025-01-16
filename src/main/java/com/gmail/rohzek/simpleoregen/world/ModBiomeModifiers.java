package com.gmail.rohzek.simpleoregen.world;

import com.gmail.rohzek.simpleoregen.data.OreGenTags;
import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers 
{
	public static final ResourceKey<BiomeModifier> ADD_NETHER_COAL_ORE = registerKey("add_nether_coal_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_COAL_ORE = registerKey("add_end_coal_ore");
	
	public static final ResourceKey<BiomeModifier> ADD_NETHER_COPPER_ORE = registerKey("add_nether_copper_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_COPPER_ORE = registerKey("add_end_copper_ore");
	
	public static final ResourceKey<BiomeModifier> ADD_NETHER_DIAMOND_ORE = registerKey("add_nether_diamond_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_DIAMOND_ORE = registerKey("add_end_diamond_ore");
	
	public static final ResourceKey<BiomeModifier> ADD_NETHER_EMERALD_ORE = registerKey("add_nether_emerald_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_EMERALD_ORE = registerKey("add_end_emerald_ore");
	
	public static final ResourceKey<BiomeModifier> ADD_NETHER_GOLD_ORE = registerKey("add_nether_gold_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_GOLD_ORE = registerKey("add_end_gold_ore");
	
	public static final ResourceKey<BiomeModifier> ADD_NETHER_IRON_ORE = registerKey("add_nether_iron_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_IRON_ORE = registerKey("add_end_iron_ore");
	
	public static final ResourceKey<BiomeModifier> ADD_NETHER_REDSTONE_ORE = registerKey("add_nether_redstone_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_REDSTONE_ORE = registerKey("add_end_redstone_ore");
	
	public static final ResourceKey<BiomeModifier> ADD_NETHER_LAPIS_ORE = registerKey("add_nether_lapis_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_LAPIS_ORE = registerKey("add_end_lapis_ore");
	
	public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_ALUMINIUM_ORE = registerKey("add_aluminium_ore");
	public static final ResourceKey<BiomeModifier> ADD_NETHER_ALUMINIUM_ORE = registerKey("add_nether_aluminium_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_ALUMINIUM_ORE = registerKey("add_end_aluminium_ore");
	
	public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_COBALT_ORE = registerKey("add_cobalt_ore");
	public static final ResourceKey<BiomeModifier> ADD_NETHER_COBALT_ORE = registerKey("add_nether_cobalt_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_COBALT_ORE = registerKey("add_end_cobalt_ore");
	
	public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_IRIDIUM_ORE = registerKey("add_iridium_ore");
	public static final ResourceKey<BiomeModifier> ADD_NETHER_IRIDIUM_ORE = registerKey("add_nether_iridium_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_IRIDIUM_ORE = registerKey("add_end_iridium_ore");

	public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_LEAD_ORE = registerKey("add_lead_ore");
	public static final ResourceKey<BiomeModifier> ADD_NETHER_LEAD_ORE = registerKey("add_nether_lead_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_LEAD_ORE = registerKey("add_end_lead_ore");

	public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_NICKEL_ORE = registerKey("add_nickel_ore");
	public static final ResourceKey<BiomeModifier> ADD_NETHER_NICKEL_ORE = registerKey("add_nether_nickel_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_NICKEL_ORE = registerKey("add_end_nickel_ore");

	public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_PLATINUM_ORE = registerKey("add_platinum_ore");
	public static final ResourceKey<BiomeModifier> ADD_NETHER_PLATINUM_ORE = registerKey("add_nether_platinum_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_PLATINUM_ORE = registerKey("add_end_platinum_ore");

	public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_QUARTZ_ORE = registerKey("add_quartz_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_QUARTZ_ORE = registerKey("add_end_quartz_ore");

	public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_RUBY_ORE = registerKey("add_ruby_ore");
	public static final ResourceKey<BiomeModifier> ADD_NETHER_RUBY_ORE = registerKey("add_nether_ruby_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_RUBY_ORE = registerKey("add_end_ruby_ore");

	public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_SAPPHIRE_ORE = registerKey("add_sapphire_ore");
	public static final ResourceKey<BiomeModifier> ADD_NETHER_SAPPHIRE_ORE = registerKey("add_nether_sapphire_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_SAPPHIRE_ORE = registerKey("add_end_sapphire_ore");

	public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_SILVER_ORE = registerKey("add_silver_ore");
	public static final ResourceKey<BiomeModifier> ADD_NETHER_SILVER_ORE = registerKey("add_nether_silver_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_SILVER_ORE = registerKey("add_end_silver_ore");

	public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_TIN_ORE = registerKey("add_tin_ore");
	public static final ResourceKey<BiomeModifier> ADD_NETHER_TIN_ORE = registerKey("add_nether_tin_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_TIN_ORE = registerKey("add_end_tin_ore");

	public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_TUNGSTEN_ORE = registerKey("add_tungsten_ore");
	public static final ResourceKey<BiomeModifier> ADD_NETHER_TUNGSTEN_ORE = registerKey("add_nether_tungsten_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_TUNGSTEN_ORE = registerKey("add_end_tungsten_ore");

	public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_URANIUM_ORE = registerKey("add_uranium_ore");
	public static final ResourceKey<BiomeModifier> ADD_NETHER_URANIUM_ORE = registerKey("add_nether_uranium_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_URANIUM_ORE = registerKey("add_end_uranium_ore");

	public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_ZINC_ORE = registerKey("add_zinc_ore");
	public static final ResourceKey<BiomeModifier> ADD_NETHER_ZINC_ORE = registerKey("add_nether_zinc_ore");
	public static final ResourceKey<BiomeModifier> ADD_END_ZINC_ORE = registerKey("add_end_zinc_ore");
	
	public static final ResourceKey<BiomeModifier> ADD_CHESHIREROSE = registerKey("add_cheshirerose");
	public static final ResourceKey<BiomeModifier> ADD_ROSE = registerKey("add_rose");
	public static final ResourceKey<BiomeModifier> ADD_ROSE_CYAN = registerKey("add_rose_cyan");
	
    public static void bootstrap(BootstrapContext<BiomeModifier> context) 
    {
        // ConfigureFeature -> PlacedFeature -> BiomeModifier
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        
        // Example for individual Biomes
        // context.register(ADD_OVERWORLD_ZINC_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
        //         HolderSet.direct(biomes.getOrThrow(Biomes.PLAINS), biomes.getOrThrow(Biomes.SAVANNA)),
        //         HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_ZINC_ORE_PLACED_KEY)),
        //         GenerationStep.Decoration.UNDERGROUND_ORES));
        
        
        
        context.register(ADD_NETHER_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_COAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_COAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        
        context.register(ADD_NETHER_COPPER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_COPPER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_COPPER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_COPPER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

				context.register(ADD_NETHER_DIAMOND_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_DIAMOND_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_DIAMOND_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_DIAMOND_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

				context.register(ADD_NETHER_EMERALD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_EMERALD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_EMERALD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_EMERALD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

				context.register(ADD_NETHER_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_GOLD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_GOLD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

				context.register(ADD_NETHER_IRON_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_IRON_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_IRON_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_IRON_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

				context.register(ADD_NETHER_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_REDSTONE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_REDSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

				context.register(ADD_NETHER_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_LAPIS_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_LAPIS_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        
        
        context.register(ADD_OVERWORLD_QUARTZ_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_QUARTZ_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));


        context.register(ADD_END_QUARTZ_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_QUARTZ_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        
        
        context.register(ADD_OVERWORLD_ALUMINIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_ALUMINIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_ALUMINIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_ALUMINIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_ALUMINIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_ALUMINIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_COBALT_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_COBALT_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_COBALT_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_COBALT_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_COBALT_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_COBALT_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_IRIDIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_IRIDIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_IRIDIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_IRIDIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_IRIDIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_IRIDIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_LEAD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_LEAD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_LEAD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_LEAD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_LEAD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_LEAD_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_NICKEL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_NICKEL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_NICKEL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_NICKEL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_NICKEL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_NICKEL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_PLATINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_PLATINUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_PLATINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_PLATINUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_PLATINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_PLATINUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_RUBY_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_RUBY_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_RUBY_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_RUBY_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_RUBY_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_RUBY_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_SAPPHIRE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_SAPPHIRE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_SAPPHIRE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_SILVER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_SILVER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_SILVER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_SILVER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_SILVER_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_SILVER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_TIN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_TIN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_TIN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_TIN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_TIN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_TIN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_TUNGSTEN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_TUNGSTEN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_TUNGSTEN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_TUNGSTEN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_TUNGSTEN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_TUNGSTEN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
				
        context.register(ADD_OVERWORLD_URANIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_URANIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_URANIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_URANIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_URANIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_URANIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        
        context.register(ADD_OVERWORLD_ZINC_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_ZINC_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_ZINC_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_ZINC_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_ZINC_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_ZINC_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        
     // context.register(ADD_OVERWORLD_ZINC_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
        //         HolderSet.direct(biomes.getOrThrow(Biomes.PLAINS), biomes.getOrThrow(Biomes.SAVANNA)),
        //         HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OVERWORLD_ZINC_ORE_PLACED_KEY)),
        //         GenerationStep.Decoration.UNDERGROUND_ORES));
        
        context.register(ADD_CHESHIREROSE, new BiomeModifiers.AddFeaturesBiomeModifier(
        		biomes.getOrThrow(OreGenTags.Biomes.CHESHIREROSE_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CHESHIREROSE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        
        context.register(ADD_ROSE, new BiomeModifiers.AddFeaturesBiomeModifier(
        		biomes.getOrThrow(OreGenTags.Biomes.ROSE_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ROSE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        
        context.register(ADD_ROSE_CYAN, new BiomeModifiers.AddFeaturesBiomeModifier(
        		biomes.getOrThrow(OreGenTags.Biomes.ROSE_BIOMES),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ROSE_CYAN_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) 
    {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(Reference.MODID, name));
    }
}
