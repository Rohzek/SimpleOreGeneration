package com.gmail.rohzek.simpleoregen.world;

import java.util.List;

import com.gmail.rohzek.simpleoregen.blocks.OreGenBlocks;
import com.gmail.rohzek.simpleoregen.blocks.WorldGenBlocks;
import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfiguredFeatures 
{
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COAL_ORE_KEY = registerKey("surface_coal_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COAL_ORE_KEY = registerKey("nether_coal_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_COAL_ORE_KEY = registerKey("end_coal_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COPPER_ORE_KEY = registerKey("surface_copper_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COPPER_NUGGET_ORE_KEY = registerKey("surface_copper_nugget_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COPPER_ORE_KEY = registerKey("nether_copper_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_COPPER_ORE_KEY = registerKey("end_copper_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DIAMOND_ORE_KEY = registerKey("surface_diamond_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_DIAMOND_ORE_KEY = registerKey("nether_diamond_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_DIAMOND_ORE_KEY = registerKey("end_diamond_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EMERALD_ORE_KEY = registerKey("surface_emerald_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_EMERALD_ORE_KEY = registerKey("nether_emerald_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_EMERALD_ORE_KEY = registerKey("end_emerald_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GOLD_ORE_KEY = registerKey("surface_gold_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GOLD_NUGGET_ORE_KEY = registerKey("surface_gold_nugget_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_GOLD_ORE_KEY = registerKey("nether_gold_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_GOLD_ORE_KEY = registerKey("end_gold_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_IRON_ORE_KEY = registerKey("surface_iron_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_IRON_NUGGET_ORE_KEY = registerKey("surface_iron_nugget_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_IRON_ORE_KEY = registerKey("nether_iron_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_IRON_ORE_KEY = registerKey("end_iron_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_REDSTONE_ORE_KEY = registerKey("surface_redstone_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_REDSTONE_ORE_KEY = registerKey("nether_redstone_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_REDSTONE_ORE_KEY = registerKey("end_redstone_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LAPIS_ORE_KEY = registerKey("surface_lapis_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LAPIS_ORE_KEY = registerKey("nether_lapis_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_LAPIS_ORE_KEY = registerKey("end_lapis_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZ_ORE_KEY = registerKey("quartz_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_QUARTZ_ORE_KEY = registerKey("end_quartz_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BAUXITE_ORE_KEY = registerKey("bauxite_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_BAUXITE_ORE_KEY = registerKey("nether_bauxite_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_BAUXITE_ORE_KEY = registerKey("end_bauxite_ore");
	
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
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHAOS_ORE_KEY = registerKey("surface_chaos_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_CHAOS_ORE_KEY = registerKey("nether_chaos_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> END_CHAOS_ORE_KEY = registerKey("end_chaos_ore");
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> CHESHIREROSE_KEY = registerKey("cheshirerose");
	public static final ResourceKey<ConfiguredFeature<?, ?>> ROSE_KEY = registerKey("rose");
	public static final ResourceKey<ConfiguredFeature<?, ?>> ROSE_CYAN_KEY = registerKey("rose_cyan");
	
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
        
        List<OreConfiguration.TargetBlockState> overworldCoalOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_COAL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_COAL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_COAL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_COAL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_COAL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_COAL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_COAL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_COAL_ORE.get().defaultBlockState())
                );
        
        List<OreConfiguration.TargetBlockState> overworldCopperOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_COPPER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_COPPER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_COPPER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_COPPER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_COPPER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_COPPER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_COPPER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_COPPER_ORE.get().defaultBlockState())
                );
        
        List<OreConfiguration.TargetBlockState> overworldCopperNuggetOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_COPPER_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_COPPER_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_COPPER_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_COPPER_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_COPPER_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_COPPER_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_COPPER_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_COPPER_NUGGET_ORE.get().defaultBlockState())
                );
        
        List<OreConfiguration.TargetBlockState> overworldDiamondOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_DIAMOND_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_DIAMOND_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_DIAMOND_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_DIAMOND_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_DIAMOND_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_DIAMOND_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_DIAMOND_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_DIAMOND_ORE.get().defaultBlockState())
                );
        
        List<OreConfiguration.TargetBlockState> overworldEmeraldOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_EMERALD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_EMERALD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_EMERALD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_EMERALD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_EMERALD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_EMERALD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_EMERALD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_EMERALD_ORE.get().defaultBlockState())
                );
        
        List<OreConfiguration.TargetBlockState> overworldGoldOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_GOLD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_GOLD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_GOLD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_GOLD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_GOLD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_GOLD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_GOLD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_GOLD_ORE.get().defaultBlockState())
                );
        
        List<OreConfiguration.TargetBlockState> overworldGoldNuggetOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_GOLD_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_GOLD_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_GOLD_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_GOLD_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_GOLD_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_GOLD_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_GOLD_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_GOLD_NUGGET_ORE.get().defaultBlockState())
                );
        
        List<OreConfiguration.TargetBlockState> overworldIronOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_IRON_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_IRON_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_IRON_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_IRON_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_IRON_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_IRON_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_IRON_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_IRON_ORE.get().defaultBlockState())
                );
        
        List<OreConfiguration.TargetBlockState> overworldIronNuggetOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_IRON_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_IRON_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_IRON_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_IRON_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_IRON_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_IRON_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_IRON_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_IRON_NUGGET_ORE.get().defaultBlockState())
                );
        
        List<OreConfiguration.TargetBlockState> overworldRedstoneOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_REDSTONE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_REDSTONE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_REDSTONE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_REDSTONE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_REDSTONE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_REDSTONE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_REDSTONE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_REDSTONE_ORE.get().defaultBlockState())
                );
        
        List<OreConfiguration.TargetBlockState> overworldLapisOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_LAPIS_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_LAPIS_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_LAPIS_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_LAPIS_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_LAPIS_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_LAPIS_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_LAPIS_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_LAPIS_ORE.get().defaultBlockState())
                );
        
        List<OreConfiguration.TargetBlockState> overworldAluminiumOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_BAUXITE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_BAUXITE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_BAUXITE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_BAUXITE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_BAUXITE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_BAUXITE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_BAUXITE_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_BAUXITE_ORE.get().defaultBlockState())/*,
        				OreConfiguration.target(stoneNuggetReplace, OreGenBlocks.SURFACE_BAUXITE_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateNuggetReplaceables, OreGenBlocks.DEEPSLATE_BAUXITE_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteNuggetReplace, OreGenBlocks.ANDESITE_BAUXITE_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteNuggetReplace, OreGenBlocks.DIORITE_BAUXITE_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteNuggetReplace, OreGenBlocks.GRANITE_BAUXITE_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneNuggetReplace, OreGenBlocks.SANDSTONE_BAUXITE_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandNuggetReplace, OreGenBlocks.SAND_BAUXITE_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelNuggetReplace, OreGenBlocks.GRAVEL_BAUXITE_NUGGET_ORE.get().defaultBlockState())*/
                );
        List<OreConfiguration.TargetBlockState> overworldCobaltOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_COBALT_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_COBALT_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_COBALT_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_COBALT_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_COBALT_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_COBALT_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_COBALT_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_COBALT_ORE.get().defaultBlockState())/*,
        				OreConfiguration.target(stoneNuggetReplace, OreGenBlocks.SURFACE_COBALT_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateNuggetReplaceables, OreGenBlocks.DEEPSLATE_COBALT_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteNuggetReplace, OreGenBlocks.ANDESITE_COBALT_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteNuggetReplace, OreGenBlocks.DIORITE_COBALT_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteNuggetReplace, OreGenBlocks.GRANITE_COBALT_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneNuggetReplace, OreGenBlocks.SANDSTONE_COBALT_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandNuggetReplace, OreGenBlocks.SAND_COBALT_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelNuggetReplace, OreGenBlocks.GRAVEL_COBALT_NUGGET_ORE.get().defaultBlockState())*/
                );
        List<OreConfiguration.TargetBlockState> overworldIridiumOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_IRIDIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_IRIDIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_IRIDIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_IRIDIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_IRIDIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_IRIDIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_IRIDIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_IRIDIUM_ORE.get().defaultBlockState())/*,
        				OreConfiguration.target(stoneNuggetReplace, OreGenBlocks.SURFACE_IRIDIUM_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateNuggetReplaceables, OreGenBlocks.DEEPSLATE_IRIDIUM_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteNuggetReplace, OreGenBlocks.ANDESITE_IRIDIUM_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteNuggetReplace, OreGenBlocks.DIORITE_IRIDIUM_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteNuggetReplace, OreGenBlocks.GRANITE_IRIDIUM_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneNuggetReplace, OreGenBlocks.SANDSTONE_IRIDIUM_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandNuggetReplace, OreGenBlocks.SAND_IRIDIUM_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelNuggetReplace, OreGenBlocks.GRAVEL_IRIDIUM_NUGGET_ORE.get().defaultBlockState())*/
                );
        List<OreConfiguration.TargetBlockState> overworldLeadOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_LEAD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_LEAD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_LEAD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_LEAD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_LEAD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_LEAD_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_LEAD_ORE.get().defaultBlockState())/*,
        				OreConfiguration.target(stoneNuggetReplace, OreGenBlocks.SURFACE_LEAD_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateNuggetReplaceables, OreGenBlocks.DEEPSLATE_LEAD_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteNuggetReplace, OreGenBlocks.ANDESITE_LEAD_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteNuggetReplace, OreGenBlocks.DIORITE_LEAD_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteNuggetReplace, OreGenBlocks.GRANITE_LEAD_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneNuggetReplace, OreGenBlocks.SANDSTONE_LEAD_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandNuggetReplace, OreGenBlocks.SAND_LEAD_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelNuggetReplace, OreGenBlocks.GRAVEL_LEAD_NUGGET_ORE.get().defaultBlockState())*/
                );
        List<OreConfiguration.TargetBlockState> overworldNickelOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_NICKEL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_NICKEL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_NICKEL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_NICKEL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_NICKEL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_NICKEL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_NICKEL_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_NICKEL_ORE.get().defaultBlockState())/*,
        				OreConfiguration.target(stoneNuggetReplace, OreGenBlocks.SURFACE_NICKEL_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateNuggetReplaceables, OreGenBlocks.DEEPSLATE_NICKEL_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteNuggetReplace, OreGenBlocks.ANDESITE_NICKEL_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteNuggetReplace, OreGenBlocks.DIORITE_NICKEL_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteNuggetReplace, OreGenBlocks.GRANITE_NICKEL_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneNuggetReplace, OreGenBlocks.SANDSTONE_NICKEL_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandNuggetReplace, OreGenBlocks.SAND_NICKEL_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelNuggetReplace, OreGenBlocks.GRAVEL_NICKEL_NUGGET_ORE.get().defaultBlockState())*/
                );
        
        List<OreConfiguration.TargetBlockState> overworldPlatinumOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_PLATINUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState()),
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
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_QUARTZ_ORE.get().defaultBlockState()),
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
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()),
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
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()),
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
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_SILVER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_SILVER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_SILVER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_SILVER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_SILVER_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_SILVER_ORE.get().defaultBlockState())/*,
        				OreConfiguration.target(stoneNuggetReplace, OreGenBlocks.SURFACE_SILVER_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateNuggetReplaceables, OreGenBlocks.DEEPSLATE_SILVER_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteNuggetReplace, OreGenBlocks.ANDESITE_SILVER_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteNuggetReplace, OreGenBlocks.DIORITE_SILVER_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteNuggetReplace, OreGenBlocks.GRANITE_SILVER_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneNuggetReplace, OreGenBlocks.SANDSTONE_SILVER_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandNuggetReplace, OreGenBlocks.SAND_SILVER_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelNuggetReplace, OreGenBlocks.GRAVEL_SILVER_NUGGET_ORE.get().defaultBlockState())*/
                );
        List<OreConfiguration.TargetBlockState> overworldTinOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_TIN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_TIN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_TIN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_TIN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_TIN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_TIN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_TIN_ORE.get().defaultBlockState())/*,
        				OreConfiguration.target(stoneNuggetReplace, OreGenBlocks.SURFACE_TIN_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateNuggetReplaceables, OreGenBlocks.DEEPSLATE_TIN_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteNuggetReplace, OreGenBlocks.ANDESITE_TIN_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteNuggetReplace, OreGenBlocks.DIORITE_TIN_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteNuggetReplace, OreGenBlocks.GRANITE_TIN_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneNuggetReplace, OreGenBlocks.SANDSTONE_TIN_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandNuggetReplace, OreGenBlocks.SAND_TIN_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelNuggetReplace, OreGenBlocks.GRAVEL_TIN_NUGGET_ORE.get().defaultBlockState())*/
                );
        List<OreConfiguration.TargetBlockState> overworldTungstenOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_TUNGSTEN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_TUNGSTEN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_TUNGSTEN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_TUNGSTEN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_TUNGSTEN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_TUNGSTEN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_TUNGSTEN_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_TUNGSTEN_ORE.get().defaultBlockState())/*,
        				OreConfiguration.target(stoneNuggetReplace, OreGenBlocks.SURFACE_TUNGSTEN_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateNuggetReplaceables, OreGenBlocks.DEEPSLATE_TUNGSTEN_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteNuggetReplace, OreGenBlocks.ANDESITE_TUNGSTEN_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteNuggetReplace, OreGenBlocks.DIORITE_TUNGSTEN_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteNuggetReplace, OreGenBlocks.GRANITE_TUNGSTEN_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneNuggetReplace, OreGenBlocks.SANDSTONE_TUNGSTEN_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandNuggetReplace, OreGenBlocks.SAND_TUNGSTEN_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelNuggetReplace, OreGenBlocks.GRAVEL_TUNGSTEN_NUGGET_ORE.get().defaultBlockState())*/
                );
        List<OreConfiguration.TargetBlockState> overworldUraniumOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_URANIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_URANIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_URANIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_URANIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_URANIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_URANIUM_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_URANIUM_ORE.get().defaultBlockState())/*,
        				OreConfiguration.target(stoneNuggetReplace, OreGenBlocks.SURFACE_URANIUM_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateNuggetReplaceables, OreGenBlocks.DEEPSLATE_URANIUM_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteNuggetReplace, OreGenBlocks.ANDESITE_URANIUM_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteNuggetReplace, OreGenBlocks.DIORITE_URANIUM_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteNuggetReplace, OreGenBlocks.GRANITE_URANIUM_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneNuggetReplace, OreGenBlocks.SANDSTONE_URANIUM_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandNuggetReplace, OreGenBlocks.SAND_URANIUM_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelNuggetReplace, OreGenBlocks.GRAVEL_URANIUM_NUGGET_ORE.get().defaultBlockState())*/
                );
        List<OreConfiguration.TargetBlockState> overworldZincOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_ZINC_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_ZINC_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_ZINC_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_ZINC_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_ZINC_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_ZINC_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_ZINC_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_ZINC_ORE.get().defaultBlockState())/*,
        				OreConfiguration.target(stoneNuggetReplace, OreGenBlocks.SURFACE_ZINC_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateNuggetReplaceables, OreGenBlocks.DEEPSLATE_ZINC_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteNuggetReplace, OreGenBlocks.ANDESITE_ZINC_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteNuggetReplace, OreGenBlocks.DIORITE_ZINC_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteNuggetReplace, OreGenBlocks.GRANITE_ZINC_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneNuggetReplace, OreGenBlocks.SANDSTONE_ZINC_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandNuggetReplace, OreGenBlocks.SAND_ZINC_NUGGET_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelNuggetReplace, OreGenBlocks.GRAVEL_ZINC_NUGGET_ORE.get().defaultBlockState())*/
                );
        
        List<OreConfiguration.TargetBlockState> overworldChaosOres = 
        		List.of(
        				OreConfiguration.target(stoneReplace, OreGenBlocks.SURFACE_CHAOS_ORE.get().defaultBlockState()),
        				OreConfiguration.target(deepslateReplaceables, OreGenBlocks.DEEPSLATE_CHAOS_ORE.get().defaultBlockState()),
        				OreConfiguration.target(andesiteReplace, OreGenBlocks.ANDESITE_CHAOS_ORE.get().defaultBlockState()),
        				OreConfiguration.target(dioriteReplace, OreGenBlocks.DIORITE_CHAOS_ORE.get().defaultBlockState()),
        				OreConfiguration.target(graniteReplace, OreGenBlocks.GRANITE_CHAOS_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandstoneReplace, OreGenBlocks.SANDSTONE_CHAOS_ORE.get().defaultBlockState()),
        				OreConfiguration.target(sandReplace, OreGenBlocks.SAND_CHAOS_ORE.get().defaultBlockState()),
        				OreConfiguration.target(gravelReplace, OreGenBlocks.GRAVEL_CHAOS_ORE.get().defaultBlockState())
                );
        
        register(context, OVERWORLD_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCoalOres, OrePlacements.SURFACE_COAL.getVeinSize()));
        register(context, NETHER_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_COAL_ORE.get().defaultBlockState(), OrePlacements.NETHER_COAL.getVeinSize()));
        register(context, END_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_COAL_ORE.get().defaultBlockState(), OrePlacements.END_COAL.getVeinSize()));
        
        register(context, OVERWORLD_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCopperOres, OrePlacements.SURFACE_COPPER.getVeinSize()));
        register(context, OVERWORLD_COPPER_NUGGET_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCopperNuggetOres, OrePlacements.SURFACE_COPPER_NUGGET.getVeinSize()));
        register(context, NETHER_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_COPPER_ORE.get().defaultBlockState(), OrePlacements.NETHER_COPPER.getVeinSize()));
        register(context, END_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_COPPER_ORE.get().defaultBlockState(), OrePlacements.END_COPPER.getVeinSize()));
        
        register(context, OVERWORLD_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(overworldDiamondOres, OrePlacements.SURFACE_DIAMOND.getVeinSize()));
        register(context, NETHER_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_DIAMOND_ORE.get().defaultBlockState(), OrePlacements.NETHER_DIAMOND.getVeinSize()));
        register(context, END_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_DIAMOND_ORE.get().defaultBlockState(), OrePlacements.END_DIAMOND.getVeinSize()));
        
        register(context, OVERWORLD_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldEmeraldOres, OrePlacements.SURFACE_EMERALD.getVeinSize()));
        register(context, NETHER_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_EMERALD_ORE.get().defaultBlockState(), OrePlacements.NETHER_EMERALD.getVeinSize()));
        register(context, END_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_EMERALD_ORE.get().defaultBlockState(), OrePlacements.END_EMERALD.getVeinSize()));
        
        register(context, OVERWORLD_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldGoldOres, OrePlacements.SURFACE_GOLD.getVeinSize()));
        register(context, OVERWORLD_GOLD_NUGGET_ORE_KEY, Feature.ORE, new OreConfiguration(overworldGoldNuggetOres, OrePlacements.SURFACE_GOLD_NUGGET.getVeinSize()));
        register(context, NETHER_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_GOLD_ORE.get().defaultBlockState(), OrePlacements.NETHER_GOLD.getVeinSize()));
        register(context, END_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_GOLD_ORE.get().defaultBlockState(), OrePlacements.END_GOLD.getVeinSize()));
        
        register(context, OVERWORLD_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(overworldIronOres, OrePlacements.SURFACE_IRON.getVeinSize()));
        register(context, OVERWORLD_IRON_NUGGET_ORE_KEY, Feature.ORE, new OreConfiguration(overworldIronNuggetOres, OrePlacements.SURFACE_IRON_NUGGET.getVeinSize()));
        register(context, NETHER_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_IRON_ORE.get().defaultBlockState(), OrePlacements.NETHER_IRON.getVeinSize()));
        register(context, END_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_IRON_ORE.get().defaultBlockState(), OrePlacements.END_IRON.getVeinSize()));
        
        register(context, OVERWORLD_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRedstoneOres, OrePlacements.SURFACE_REDSTONE.getVeinSize()));
        register(context, NETHER_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_REDSTONE_ORE.get().defaultBlockState(), OrePlacements.NETHER_REDSTONE.getVeinSize()));
        register(context, END_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_REDSTONE_ORE.get().defaultBlockState(), OrePlacements.END_REDSTONE.getVeinSize()));
        
        register(context, OVERWORLD_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLapisOres, OrePlacements.SURFACE_LAPIS.getVeinSize()));
        register(context, NETHER_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_LAPIS_ORE.get().defaultBlockState(), OrePlacements.NETHER_LAPIS.getVeinSize()));
        register(context, END_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
                OreGenBlocks.END_LAPIS_ORE.get().defaultBlockState(), OrePlacements.END_LAPIS.getVeinSize()));
        
        register(context, OVERWORLD_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(overworldQuartzOres, OrePlacements.SURFACE_QUARTZ.getVeinSize()));
        register(context, END_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_QUARTZ_ORE.get().defaultBlockState(), OrePlacements.END_QUARTZ.getVeinSize()));
        
        
        register(context, OVERWORLD_BAUXITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAluminiumOres, OrePlacements.SURFACE_BAUXITE.getVeinSize()));
        register(context, NETHER_BAUXITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_BAUXITE_ORE.get().defaultBlockState(), OrePlacements.NETHER_BAUXITE.getVeinSize()));
        register(context, END_BAUXITE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_BAUXITE_ORE.get().defaultBlockState(), OrePlacements.END_BAUXITE.getVeinSize()));
        
        register(context, OVERWORLD_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCobaltOres, OrePlacements.SURFACE_COBALT.getVeinSize()));
        register(context, NETHER_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_COBALT_ORE.get().defaultBlockState(), OrePlacements.NETHER_COBALT.getVeinSize()));
        register(context, END_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_COBALT_ORE.get().defaultBlockState(), OrePlacements.END_COBALT.getVeinSize()));
        
        register(context, OVERWORLD_IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldIridiumOres, OrePlacements.SURFACE_IRIDIUM.getVeinSize()));
        register(context, NETHER_IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_IRIDIUM_ORE.get().defaultBlockState(), OrePlacements.NETHER_IRIDIUM.getVeinSize()));
        register(context, END_IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_IRIDIUM_ORE.get().defaultBlockState(), OrePlacements.END_IRIDIUM.getVeinSize()));
        
        register(context, OVERWORLD_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLeadOres, OrePlacements.SURFACE_LEAD.getVeinSize()));
        register(context, NETHER_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_LEAD_ORE.get().defaultBlockState(), OrePlacements.NETHER_LEAD.getVeinSize()));
        register(context, END_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_LEAD_ORE.get().defaultBlockState(), OrePlacements.END_LAPIS.getVeinSize()));
        
        register(context, OVERWORLD_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldNickelOres, OrePlacements.SURFACE_DIAMOND.getVeinSize()));
        register(context, NETHER_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_NICKEL_ORE.get().defaultBlockState(), OrePlacements.NETHER_NICKEL.getVeinSize()));
        register(context, END_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_NICKEL_ORE.get().defaultBlockState(), OrePlacements.END_NICKEL.getVeinSize()));
        
        register(context, OVERWORLD_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlatinumOres, OrePlacements.SURFACE_PLATINUM.getVeinSize()));
        register(context, NETHER_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_PLATINUM_ORE.get().defaultBlockState(), OrePlacements.NETHER_PLATINUM.getVeinSize()));
        register(context, END_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_PLATINUM_ORE.get().defaultBlockState(), OrePlacements.END_PLATINUM.getVeinSize()));
        
        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, OrePlacements.SURFACE_RUBY.getVeinSize()));
        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_RUBY_ORE.get().defaultBlockState(), OrePlacements.NETHER_RUBY.getVeinSize()));
        register(context, END_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_RUBY_ORE.get().defaultBlockState(), OrePlacements.END_RUBY.getVeinSize()));
        
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres, OrePlacements.SURFACE_SAPPHIRE.getVeinSize()));
        register(context, NETHER_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_SAPPHIRE_ORE.get().defaultBlockState(), OrePlacements.NETHER_SAPPHIRE.getVeinSize()));
        register(context, END_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_SAPPHIRE_ORE.get().defaultBlockState(), OrePlacements.END_SAPPHIRE.getVeinSize()));
        
        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSilverOres, OrePlacements.SURFACE_SILVER.getVeinSize()));
        register(context, NETHER_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_SILVER_ORE.get().defaultBlockState(), OrePlacements.NETHER_SILVER.getVeinSize()));
        register(context, END_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_SILVER_ORE.get().defaultBlockState(), OrePlacements.END_SILVER.getVeinSize()));
        
        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres, OrePlacements.SURFACE_TIN.getVeinSize()));
        register(context, NETHER_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_TIN_ORE.get().defaultBlockState(), OrePlacements.NETHER_TIN.getVeinSize()));
        register(context, END_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_TIN_ORE.get().defaultBlockState(), OrePlacements.END_TIN.getVeinSize()));
        
        register(context, OVERWORLD_TUNGSTEN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTungstenOres, OrePlacements.SURFACE_TUNGSTEN.getVeinSize()));
        register(context, NETHER_TUNGSTEN_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_TUNGSTEN_ORE.get().defaultBlockState(), OrePlacements.NETHER_TUNGSTEN.getVeinSize()));
        register(context, END_TUNGSTEN_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_TUNGSTEN_ORE.get().defaultBlockState(), OrePlacements.END_TUNGSTEN.getVeinSize()));
        
        register(context, OVERWORLD_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldUraniumOres, OrePlacements.SURFACE_URANIUM.getVeinSize()));
        register(context, NETHER_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_URANIUM_ORE.get().defaultBlockState(), OrePlacements.NETHER_URANIUM.getVeinSize()));
        register(context, END_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_URANIUM_ORE.get().defaultBlockState(), OrePlacements.END_URANIUM.getVeinSize()));
        
        register(context, OVERWORLD_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(overworldZincOres, OrePlacements.SURFACE_ZINC.getVeinSize()));
        register(context, NETHER_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_ZINC_ORE.get().defaultBlockState(), OrePlacements.NETHER_ZINC.getVeinSize()));
        register(context, END_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_ZINC_ORE.get().defaultBlockState(), OrePlacements.END_ZINC.getVeinSize()));
        
        
        // Chaos Ores
        register(context, OVERWORLD_CHAOS_ORE_KEY, Feature.ORE, new OreConfiguration(overworldChaosOres, OrePlacements.SURFACE_CHAOS.getVeinSize()));
        register(context, NETHER_CHAOS_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplace,
        		OreGenBlocks.NETHER_CHAOS_ORE.get().defaultBlockState(), OrePlacements.NETHER_CHAOS.getVeinSize()));
        register(context, END_CHAOS_ORE_KEY, Feature.ORE, new OreConfiguration(endReplace,
        		OreGenBlocks.END_CHAOS_ORE.get().defaultBlockState(), OrePlacements.END_CHAOS.getVeinSize()));
        
        /*
        register(context, CHESHIREROSE_KEY, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
        		new SimpleBlockConfiguration(BlockStateProvider.simple(WorldGenBlocks.CHESHIRE_ROSE_FLOWER.get().defaultBlockState())), 
        		List.of(Blocks.GRASS_BLOCK)));*/
        register(context, CHESHIREROSE_KEY, Feature.FLOWER, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
        		new SimpleBlockConfiguration(BlockStateProvider.simple(WorldGenBlocks.CHESHIRE_ROSE_FLOWER.get().defaultBlockState())), 
        		List.of(Blocks.GRASS_BLOCK, Blocks.DIRT)));
        
        register(context, ROSE_KEY, Feature.FLOWER, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
        		new SimpleBlockConfiguration(BlockStateProvider.simple(WorldGenBlocks.ROSE_FLOWER.get().defaultBlockState())), 
        		List.of(Blocks.GRASS_BLOCK, Blocks.DIRT)));
        
        register(context, ROSE_CYAN_KEY, Feature.FLOWER, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
        		new SimpleBlockConfiguration(BlockStateProvider.simple(WorldGenBlocks.ROSE_CYAN_FLOWER.get().defaultBlockState())), 
        		List.of(Blocks.GRASS_BLOCK, Blocks.DIRT)));
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
