package com.gmail.rohzek.simpleoregen.world;

import java.util.List;

import com.gmail.rohzek.simpleoregen.blocks.OreGenBlocks;
import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfiguredFeatures 
{
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COAL_ORE_KEY = registerKey("nether_coal_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_COAL_ORE_KEY = registerKey("end_coal_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COPPER_ORE_KEY = registerKey("nether_copper_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_COPPER_ORE_KEY = registerKey("end_copper_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_DIAMOND_ORE_KEY = registerKey("nether_diamond_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_DIAMOND_ORE_KEY = registerKey("end_diamond_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_EMERALD_ORE_KEY = registerKey("nether_emerald_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_EMERALD_ORE_KEY = registerKey("end_emerald_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_GOLD_ORE_KEY = registerKey("nether_gold_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_GOLD_ORE_KEY = registerKey("end_gold_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_IRON_ORE_KEY = registerKey("nether_iron_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_IRON_ORE_KEY = registerKey("end_iron_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_REDSTONE_ORE_KEY = registerKey("nether_redstone_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_REDSTONE_ORE_KEY = registerKey("end_redstone_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LAPIS_ORE_KEY = registerKey("nether_lapis_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_LAPIS_ORE_KEY = registerKey("end_lapis_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ALUMINIUM_ORE_KEY = registerKey("aluminium_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ALUMINIUM_ORE_KEY = registerKey("nether_aluminium_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_ALUMINIUM_ORE_KEY = registerKey("end_aluminium_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COBALT_ORE_KEY = registerKey("cobalt_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COBALT_ORE_KEY = registerKey("nether_cobalt_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_COBALT_ORE_KEY = registerKey("end_cobalt_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_IRIDIUM_ORE_KEY = registerKey("iridium_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_IRIDIUM_ORE_KEY = registerKey("nether_iridium_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_IRIDIUM_ORE_KEY = registerKey("end_iridium_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LEAD_ORE_KEY = registerKey("lead_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LEAD_ORE_KEY = registerKey("nether_lead_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_LEAD_ORE_KEY = registerKey("end_lead_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_NICKEL_ORE_KEY = registerKey("nickel_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_NICKEL_ORE_KEY = registerKey("nether_nickel_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_NICKEL_ORE_KEY = registerKey("end_nickel_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLATINUM_ORE_KEY = registerKey("platinum_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_PLATINUM_ORE_KEY = registerKey("nether_platinum_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_PLATINUM_ORE_KEY = registerKey("end_platinum_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZ_ORE_KEY = registerKey("quartz_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_QUARTZ_ORE_KEY = registerKey("end_quartz_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("ruby_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_RUBY_ORE_KEY = registerKey("end_ruby_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SAPPHIRE_ORE_KEY = registerKey("nether_sapphire_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_SAPPHIRE_ORE_KEY = registerKey("end_sapphire_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE_KEY = registerKey("silver_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SILVER_ORE_KEY = registerKey("nether_silver_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_SILVER_ORE_KEY = registerKey("end_silver_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TIN_ORE_KEY = registerKey("tin_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_TIN_ORE_KEY = registerKey("nether_tin_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_TIN_ORE_KEY = registerKey("end_tin_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TUNGSTEN_ORE_KEY = registerKey("tungsten_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_TUNGSTEN_ORE_KEY = registerKey("nether_tungsten_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_TUNGSTEN_ORE_KEY = registerKey("end_tungsten_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_URANIUM_ORE_KEY = registerKey("uranium_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_URANIUM_ORE_KEY = registerKey("nether_uranium_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_URANIUM_ORE_KEY = registerKey("end_uranium_ore");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ZINC_ORE_KEY = registerKey("zinc_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ZINC_ORE_KEY = registerKey("nether_zinc_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_ZINC_ORE_KEY = registerKey("end_zinc_ore");
	
	
	
    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) 
    {
    	// ConfiguredFeature -> PlacedFeature -> BiomeModifier
    	//RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
       
        RuleTest stoneReplace = new BlockMatchTest(Blocks.STONE);
        RuleTest andesiteReplace = new BlockMatchTest(Blocks.ANDESITE);
        RuleTest dioriteReplace = new BlockMatchTest(Blocks.DIORITE);
        RuleTest graniteReplace = new BlockMatchTest(Blocks.GRANITE);
        RuleTest sandstoneReplace = new BlockMatchTest(Blocks.SANDSTONE);
        RuleTest sandReplace = new BlockMatchTest(Blocks.SAND);
        RuleTest gravelReplace = new BlockMatchTest(Blocks.GRAVEL);
        
        RuleTest netherReplace = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplace = new BlockMatchTest(Blocks.END_STONE);
        
        List<OreConfiguration.TargetBlockState> overworldAluminiumOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_ALUMINIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.SURFACE_DEEPSLATE_ALUMINIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_ALUMINIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_ALUMINIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_ALUMINIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_ALUMINIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_ALUMINIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_ALUMINIUM_ORE.get().defaultBlockState())
                );
        List<OreConfiguration.TargetBlockState> overworldCobaltOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_COBALT_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.SURFACE_DEEPSLATE_COBALT_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_COBALT_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_COBALT_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_COBALT_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_COBALT_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_COBALT_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_COBALT_ORE.get().defaultBlockState())
                );
        List<OreConfiguration.TargetBlockState> overworldIridiumOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_IRIDIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.SURFACE_DEEPSLATE_IRIDIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_IRIDIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_IRIDIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_IRIDIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_IRIDIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_IRIDIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_IRIDIUM_ORE.get().defaultBlockState())
                );
        List<OreConfiguration.TargetBlockState> overworldLeadOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_LEAD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.SURFACE_DEEPSLATE_LEAD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_LEAD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_LEAD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_LEAD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_LEAD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_LEAD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_LEAD_ORE.get().defaultBlockState())
                );
        List<OreConfiguration.TargetBlockState> overworldNickelOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_NICKEL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.SURFACE_DEEPSLATE_NICKEL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_NICKEL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_NICKEL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_NICKEL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_NICKEL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_NICKEL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_NICKEL_ORE.get().defaultBlockState())
                );
        List<OreConfiguration.TargetBlockState> overworldPlatinumOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_PLATINUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.SURFACE_DEEPSLATE_PLATINUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_PLATINUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_PLATINUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_PLATINUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_PLATINUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_PLATINUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_PLATINUM_ORE.get().defaultBlockState())
                );
        List<OreConfiguration.TargetBlockState> overworldQuartzOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_QUARTZ_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.SURFACE_DEEPSLATE_QUARTZ_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_QUARTZ_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_QUARTZ_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_QUARTZ_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_QUARTZ_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_QUARTZ_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_QUARTZ_ORE.get().defaultBlockState())
                );
        List<OreConfiguration.TargetBlockState> overworldRubyOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_RUBY_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.SURFACE_DEEPSLATE_RUBY_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_RUBY_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_RUBY_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_RUBY_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_RUBY_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_RUBY_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_RUBY_ORE.get().defaultBlockState())
                );
        List<OreConfiguration.TargetBlockState> overworldSapphireOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_SAPPHIRE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.SURFACE_DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_SAPPHIRE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_SAPPHIRE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_SAPPHIRE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_SAPPHIRE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_SAPPHIRE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_SAPPHIRE_ORE.get().defaultBlockState())
                );
        List<OreConfiguration.TargetBlockState> overworldSilverOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_SILVER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.SURFACE_DEEPSLATE_SILVER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_SILVER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_SILVER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_SILVER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_SILVER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_SILVER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_SILVER_ORE.get().defaultBlockState())
                );
        List<OreConfiguration.TargetBlockState> overworldTinOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_TIN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.SURFACE_DEEPSLATE_TIN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_TIN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_TIN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_TIN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_TIN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_TIN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_TIN_ORE.get().defaultBlockState())
                );
        List<OreConfiguration.TargetBlockState> overworldTungstenOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_TUNGSTEN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.SURFACE_DEEPSLATE_TUNGSTEN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_TUNGSTEN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_TUNGSTEN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_TUNGSTEN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_TUNGSTEN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_TUNGSTEN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_TUNGSTEN_ORE.get().defaultBlockState())
                );
        List<OreConfiguration.TargetBlockState> overworldUraniumOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_URANIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.SURFACE_DEEPSLATE_URANIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_URANIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_URANIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_URANIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_URANIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_URANIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_URANIUM_ORE.get().defaultBlockState())
                );
        List<OreConfiguration.TargetBlockState> overworldZincOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_ZINC_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.SURFACE_DEEPSLATE_ZINC_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_ZINC_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_ZINC_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_ZINC_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_ZINC_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_ZINC_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_ZINC_ORE.get().defaultBlockState())
                );
        
        int veinSize = 9;
        
        register(context, NETHER_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_COAL_ORE.get().defaultBlockState(), veinSize));
        register(context, END_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_COAL_ORE.get().defaultBlockState(), veinSize));
        register(context, NETHER_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_COPPER_ORE.get().defaultBlockState(), veinSize));
        register(context, END_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_COPPER_ORE.get().defaultBlockState(), veinSize));
        register(context, NETHER_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_DIAMOND_ORE.get().defaultBlockState(), veinSize));
        register(context, END_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_DIAMOND_ORE.get().defaultBlockState(), veinSize));
        register(context, NETHER_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_EMERALD_ORE.get().defaultBlockState(), veinSize));
        register(context, END_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_EMERALD_ORE.get().defaultBlockState(), veinSize));
        register(context, NETHER_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_GOLD_ORE.get().defaultBlockState(), veinSize));
        register(context, END_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_GOLD_ORE.get().defaultBlockState(), veinSize));
        register(context, NETHER_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_IRON_ORE.get().defaultBlockState(), veinSize));
        register(context, END_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_IRON_ORE.get().defaultBlockState(), veinSize));
        register(context, NETHER_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_REDSTONE_ORE.get().defaultBlockState(), veinSize));
        register(context, END_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_REDSTONE_ORE.get().defaultBlockState(), veinSize));
        register(context, NETHER_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_LAPIS_ORE.get().defaultBlockState(), veinSize));
        register(context, END_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_LAPIS_ORE.get().defaultBlockState(), veinSize));
        
        register(context, OVERWORLD_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(overworldQuartzOres, veinSize));
        register(context, END_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_QUARTZ_ORE.get().defaultBlockState(), veinSize));
        
        
        register(context, OVERWORLD_ALUMINIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAluminiumOres, veinSize));
        register(context, NETHER_ALUMINIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_ALUMINIUM_ORE.get().defaultBlockState(), veinSize));
        register(context, END_ALUMINIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_ALUMINIUM_ORE.get().defaultBlockState(), veinSize));
        
        register(context, OVERWORLD_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCobaltOres, veinSize));
        register(context, NETHER_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_COBALT_ORE.get().defaultBlockState(), veinSize));
        register(context, END_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_COBALT_ORE.get().defaultBlockState(), veinSize));
        
        register(context, OVERWORLD_IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldIridiumOres, veinSize));
        register(context, NETHER_IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_IRIDIUM_ORE.get().defaultBlockState(), veinSize));
        register(context, END_IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_IRIDIUM_ORE.get().defaultBlockState(), veinSize));
        
        register(context, OVERWORLD_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLeadOres, veinSize));
        register(context, NETHER_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_LEAD_ORE.get().defaultBlockState(), veinSize));
        register(context, END_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_LEAD_ORE.get().defaultBlockState(), veinSize));
        
        register(context, OVERWORLD_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldNickelOres, veinSize));
        register(context, NETHER_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_NICKEL_ORE.get().defaultBlockState(), veinSize));
        register(context, END_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_NICKEL_ORE.get().defaultBlockState(), veinSize));
        
        register(context, OVERWORLD_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlatinumOres, veinSize));
        register(context, NETHER_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_PLATINUM_ORE.get().defaultBlockState(), veinSize));
        register(context, END_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_PLATINUM_ORE.get().defaultBlockState(), veinSize));
        
        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, veinSize));
        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_RUBY_ORE.get().defaultBlockState(), veinSize));
        register(context, END_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_RUBY_ORE.get().defaultBlockState(), veinSize));
        
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres, veinSize));
        register(context, NETHER_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_SAPPHIRE_ORE.get().defaultBlockState(), veinSize));
        register(context, END_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_SAPPHIRE_ORE.get().defaultBlockState(), veinSize));
        
        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSilverOres, veinSize));
        register(context, NETHER_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_SILVER_ORE.get().defaultBlockState(), veinSize));
        register(context, END_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_SILVER_ORE.get().defaultBlockState(), veinSize));
        
        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres, veinSize));
        register(context, NETHER_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_TIN_ORE.get().defaultBlockState(), veinSize));
        register(context, END_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_TIN_ORE.get().defaultBlockState(), veinSize));
        
        register(context, OVERWORLD_TUNGSTEN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTungstenOres, veinSize));
        register(context, NETHER_TUNGSTEN_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_TUNGSTEN_ORE.get().defaultBlockState(), veinSize));
        register(context, END_TUNGSTEN_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_TUNGSTEN_ORE.get().defaultBlockState(), veinSize));
        
        register(context, OVERWORLD_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldUraniumOres, veinSize));
        register(context, NETHER_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_URANIUM_ORE.get().defaultBlockState(), veinSize));
        register(context, END_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_URANIUM_ORE.get().defaultBlockState(), veinSize));
        
        register(context, OVERWORLD_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(overworldZincOres, veinSize));
        register(context, NETHER_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_ZINC_ORE.get().defaultBlockState(), veinSize));
        register(context, END_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_ZINC_ORE.get().defaultBlockState(), veinSize));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) 
    {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Reference.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) 
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
