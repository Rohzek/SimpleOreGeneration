package com.gmail.rohzek.simpleoregen.blocks;

import com.gmail.rohzek.simpleoregen.lib.DeferredRegistration;

import net.minecraft.util.ColorRGBA;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;

public class OreGenBlocks 
{
	// Stone - Vanilla
	public static final DeferredBlock<Block> SURFACE_QUARTZ_ORE = DeferredRegistration.registerBlock("quartz_ore", () -> new SurfaceOre("quartz_ore", 3f, 3f));
	
	// Modded
	public static final DeferredBlock<Block> SURFACE_BAUXITE_ORE = DeferredRegistration.registerBlock("bauxite_ore", () -> new SurfaceOre("bauxite_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_COBALT_ORE = DeferredRegistration.registerBlock("cobalt_ore", () -> new SurfaceOre("cobalt_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_IRIDIUM_ORE = DeferredRegistration.registerBlock("iridium_ore", () -> new SurfaceOre("iridium_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_LEAD_ORE = DeferredRegistration.registerBlock("lead_ore", () -> new SurfaceOre("lead_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_NICKEL_ORE = DeferredRegistration.registerBlock("nickel_ore", () -> new SurfaceOre("nickel_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_PLATINUM_ORE = DeferredRegistration.registerBlock("platinum_ore", () -> new SurfaceOre("platinum_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_RUBY_ORE = DeferredRegistration.registerBlock("ruby_ore", () -> new SurfaceOre("ruby_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_SAPPHIRE_ORE = DeferredRegistration.registerBlock("sapphire_ore", () -> new SurfaceOre("sapphire_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_SILVER_ORE = DeferredRegistration.registerBlock("silver_ore", () -> new SurfaceOre("silver_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_TIN_ORE = DeferredRegistration.registerBlock("tin_ore", () -> new SurfaceOre("tin_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_TUNGSTEN_ORE = DeferredRegistration.registerBlock("tungsten_ore", () -> new SurfaceOre("tungsten_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_URANIUM_ORE = DeferredRegistration.registerBlock("uranium_ore", () -> new SurfaceOre("uranium_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_ZINC_ORE = DeferredRegistration.registerBlock("zinc_ore", () -> new SurfaceOre("zinc_ore", 3f, 3f));
	
	// Deepslate - Vanilla
	public static final DeferredBlock<Block> SURFACE_DEEPSLATE_QUARTZ_ORE = DeferredRegistration.registerBlock("deepslate_quartz_ore", () -> new SurfaceOre("deepslate_quartz_ore", 3f, 3f));
	
	// Modded
	public static final DeferredBlock<Block> SURFACE_DEEPSLATE_BAUXITE_ORE = DeferredRegistration.registerBlock("deepslate_bauxite_ore", () -> new SurfaceOre("deepslate_bauxite_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_DEEPSLATE_COBALT_ORE = DeferredRegistration.registerBlock("deepslate_cobalt_ore", () -> new SurfaceOre("deepslate_cobalt_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_DEEPSLATE_IRIDIUM_ORE = DeferredRegistration.registerBlock("deepslate_iridium_ore", () -> new SurfaceOre("deepslate_iridium_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_DEEPSLATE_LEAD_ORE = DeferredRegistration.registerBlock("deepslate_lead_ore", () -> new SurfaceOre("deepslate_lead_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_DEEPSLATE_NICKEL_ORE = DeferredRegistration.registerBlock("deepslate_nickel_ore", () -> new SurfaceOre("deepslate_nickel_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_DEEPSLATE_PLATINUM_ORE = DeferredRegistration.registerBlock("deepslate_platinum_ore", () -> new SurfaceOre("deepslate_platinum_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_DEEPSLATE_RUBY_ORE = DeferredRegistration.registerBlock("deepslate_ruby_ore", () -> new SurfaceOre("deepslate_ruby_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_DEEPSLATE_SAPPHIRE_ORE = DeferredRegistration.registerBlock("deepslate_sapphire_ore", () -> new SurfaceOre("deepslate_sapphire_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_DEEPSLATE_SILVER_ORE = DeferredRegistration.registerBlock("deepslate_silver_ore", () -> new SurfaceOre("deepslate_silver_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_DEEPSLATE_TIN_ORE = DeferredRegistration.registerBlock("deepslate_tin_ore", () -> new SurfaceOre("deepslate_tin_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_DEEPSLATE_TUNGSTEN_ORE = DeferredRegistration.registerBlock("deepslate_tungsten_ore", () -> new SurfaceOre("deepslate_tungsten_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_DEEPSLATE_URANIUM_ORE = DeferredRegistration.registerBlock("deepslate_uranium_ore", () -> new SurfaceOre("deepslate_uranium_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_DEEPSLATE_ZINC_ORE = DeferredRegistration.registerBlock("deepslate_zinc_ore", () -> new SurfaceOre("deepslate_zinc_ore", 3f, 3f));
	
	// Andesite - Vanilla
	public static final DeferredBlock<Block> ANDESITE_QUARTZ_ORE = DeferredRegistration.registerBlock("andesite_quartz_ore", () -> new SurfaceOre("andesite_quartz_ore", 3f, 3f));
	
	// Modded
	public static final DeferredBlock<Block> ANDESITE_BAUXITE_ORE = DeferredRegistration.registerBlock("andesite_bauxite_ore", () -> new SurfaceOre("andesite_bauxite_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_COBALT_ORE = DeferredRegistration.registerBlock("andesite_cobalt_ore", () -> new SurfaceOre("andesite_cobalt_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_IRIDIUM_ORE = DeferredRegistration.registerBlock("andesite_iridium_ore", () -> new SurfaceOre("andesite_iridium_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_LEAD_ORE = DeferredRegistration.registerBlock("andesite_lead_ore", () -> new SurfaceOre("andesite_lead_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_NICKEL_ORE = DeferredRegistration.registerBlock("andesite_nickel_ore", () -> new SurfaceOre("andesite_nickel_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_PLATINUM_ORE = DeferredRegistration.registerBlock("andesite_platinum_ore", () -> new SurfaceOre("andesite_platinum_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_RUBY_ORE = DeferredRegistration.registerBlock("andesite_ruby_ore", () -> new SurfaceOre("andesite_ruby_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_SAPPHIRE_ORE = DeferredRegistration.registerBlock("andesite_sapphire_ore", () -> new SurfaceOre("andesite_sapphire_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_SILVER_ORE = DeferredRegistration.registerBlock("andesite_silver_ore", () -> new SurfaceOre("andesite_silver_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_TIN_ORE = DeferredRegistration.registerBlock("andesite_tin_ore", () -> new SurfaceOre("andesite_tin_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_TUNGSTEN_ORE = DeferredRegistration.registerBlock("andesite_tungsten_ore", () -> new SurfaceOre("andesite_tungsten_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_URANIUM_ORE = DeferredRegistration.registerBlock("andesite_uranium_ore", () -> new SurfaceOre("andesite_uranium_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_ZINC_ORE = DeferredRegistration.registerBlock("andesite_zinc_ore", () -> new SurfaceOre("andesite_zinc_ore", 3f, 3f));
	
	// Diorite - Vanilla
	public static final DeferredBlock<Block> DIORITE_QUARTZ_ORE = DeferredRegistration.registerBlock("diorite_quartz_ore", () -> new SurfaceOre("diorite_quartz_ore", 3f, 3f));
	
	// Modded
	public static final DeferredBlock<Block> DIORITE_BAUXITE_ORE = DeferredRegistration.registerBlock("diorite_bauxite_ore", () -> new SurfaceOre("diorite_bauxite_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_COBALT_ORE = DeferredRegistration.registerBlock("diorite_cobalt_ore", () -> new SurfaceOre("diorite_cobalt_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_IRIDIUM_ORE = DeferredRegistration.registerBlock("diorite_iridium_ore", () -> new SurfaceOre("diorite_iridium_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_LEAD_ORE = DeferredRegistration.registerBlock("diorite_lead_ore", () -> new SurfaceOre("diorite_lead_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_NICKEL_ORE = DeferredRegistration.registerBlock("diorite_nickel_ore", () -> new SurfaceOre("diorite_nickel_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_PLATINUM_ORE = DeferredRegistration.registerBlock("diorite_platinum_ore", () -> new SurfaceOre("diorite_platinum_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_RUBY_ORE = DeferredRegistration.registerBlock("diorite_ruby_ore", () -> new SurfaceOre("diorite_ruby_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_SAPPHIRE_ORE = DeferredRegistration.registerBlock("diorite_sapphire_ore", () -> new SurfaceOre("diorite_sapphire_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_SILVER_ORE = DeferredRegistration.registerBlock("diorite_silver_ore", () -> new SurfaceOre("diorite_silver_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_TIN_ORE = DeferredRegistration.registerBlock("diorite_tin_ore", () -> new SurfaceOre("diorite_tin_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_TUNGSTEN_ORE = DeferredRegistration.registerBlock("diorite_tungsten_ore", () -> new SurfaceOre("diorite_tungsten_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_URANIUM_ORE = DeferredRegistration.registerBlock("diorite_uranium_ore", () -> new SurfaceOre("diorite_uranium_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_ZINC_ORE = DeferredRegistration.registerBlock("diorite_zinc_ore", () -> new SurfaceOre("diorite_zinc_ore", 3f, 3f));	
		
	// Granite - Vanilla
	public static final DeferredBlock<Block> GRANITE_QUARTZ_ORE = DeferredRegistration.registerBlock("granite_quartz_ore", () -> new SurfaceOre("granite_quartz_ore", 3f, 3f));
	
	// Modded
	public static final DeferredBlock<Block> GRANITE_BAUXITE_ORE = DeferredRegistration.registerBlock("granite_bauxite_ore", () -> new SurfaceOre("granite_bauxite_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_COBALT_ORE = DeferredRegistration.registerBlock("granite_cobalt_ore", () -> new SurfaceOre("granite_cobalt_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_IRIDIUM_ORE = DeferredRegistration.registerBlock("granite_iridium_ore", () -> new SurfaceOre("granite_iridium_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_LEAD_ORE = DeferredRegistration.registerBlock("granite_lead_ore", () -> new SurfaceOre("granite_lead_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_NICKEL_ORE = DeferredRegistration.registerBlock("granite_nickel_ore", () -> new SurfaceOre("granite_nickel_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_PLATINUM_ORE = DeferredRegistration.registerBlock("granite_platinum_ore", () -> new SurfaceOre("granite_platinum_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_RUBY_ORE = DeferredRegistration.registerBlock("granite_ruby_ore", () -> new SurfaceOre("granite_ruby_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_SAPPHIRE_ORE = DeferredRegistration.registerBlock("granite_sapphire_ore", () -> new SurfaceOre("granite_sapphire_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_SILVER_ORE = DeferredRegistration.registerBlock("granite_silver_ore", () -> new SurfaceOre("granite_silver_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_TIN_ORE = DeferredRegistration.registerBlock("granite_tin_ore", () -> new SurfaceOre("granite_tin_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_TUNGSTEN_ORE = DeferredRegistration.registerBlock("granite_tungsten_ore", () -> new SurfaceOre("granite_tungsten_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_URANIUM_ORE = DeferredRegistration.registerBlock("granite_uranium_ore", () -> new SurfaceOre("granite_uranium_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_ZINC_ORE = DeferredRegistration.registerBlock("granite_zinc_ore", () -> new SurfaceOre("granite_zinc_ore", 3f, 3f));
	
	// Sandstone - Vanilla
	public static final DeferredBlock<Block> SANDSTONE_QUARTZ_ORE = DeferredRegistration.registerBlock("sandstone_quartz_ore", () -> new SurfaceOre("sandstone_quartz_ore", 3f, 3f));
	
	// Modded
	public static final DeferredBlock<Block> SANDSTONE_BAUXITE_ORE = DeferredRegistration.registerBlock("sandstone_bauxite_ore", () -> new SurfaceOre("sandstone_bauxite_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_COBALT_ORE = DeferredRegistration.registerBlock("sandstone_cobalt_ore", () -> new SurfaceOre("sandstone_cobalt_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_IRIDIUM_ORE = DeferredRegistration.registerBlock("sandstone_iridium_ore", () -> new SurfaceOre("sandstone_iridium_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_LEAD_ORE = DeferredRegistration.registerBlock("sandstone_lead_ore", () -> new SurfaceOre("sandstone_lead_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_NICKEL_ORE = DeferredRegistration.registerBlock("sandstone_nickel_ore", () -> new SurfaceOre("sandstone_nickel_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_PLATINUM_ORE = DeferredRegistration.registerBlock("sandstone_platinum_ore", () -> new SurfaceOre("sandstone_platinum_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_RUBY_ORE = DeferredRegistration.registerBlock("sandstone_ruby_ore", () -> new SurfaceOre("sandstone_ruby_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_SAPPHIRE_ORE = DeferredRegistration.registerBlock("sandstone_sapphire_ore", () -> new SurfaceOre("sandstone_sapphire_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_SILVER_ORE = DeferredRegistration.registerBlock("sandstone_silver_ore", () -> new SurfaceOre("sandstone_silver_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_TIN_ORE = DeferredRegistration.registerBlock("sandstone_tin_ore", () -> new SurfaceOre("sandstone_tin_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_TUNGSTEN_ORE = DeferredRegistration.registerBlock("sandstone_tungsten_ore", () -> new SurfaceOre("sandstone_tungsten_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_URANIUM_ORE = DeferredRegistration.registerBlock("sandstone_uranium_ore", () -> new SurfaceOre("sandstone_uranium_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_ZINC_ORE = DeferredRegistration.registerBlock("sandstone_zinc_ore", () -> new SurfaceOre("sandstone_zinc_ore", 3f, 3f));
	
	// Sand - Vanilla
	public static final DeferredBlock<Block> SAND_QUARTZ_ORE = DeferredRegistration.registerBlock("sand_quartz_ore", () -> new GravityOreBlock("sand_quartz_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));
	
	// Modded
	public static final DeferredBlock<Block> SAND_BAUXITE_ORE = DeferredRegistration.registerBlock("sand_bauxite_ore", () -> new GravityOreBlock("sand_bauxite_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_COBALT_ORE = DeferredRegistration.registerBlock("sand_cobalt_ore", () -> new GravityOreBlock("sand_cobalt_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_IRIDIUM_ORE = DeferredRegistration.registerBlock("sand_iridium_ore", () -> new GravityOreBlock("sand_iridium_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_LEAD_ORE = DeferredRegistration.registerBlock("sand_lead_ore", () -> new GravityOreBlock("sand_lead_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_NICKEL_ORE = DeferredRegistration.registerBlock("sand_nickel_ore", () -> new GravityOreBlock("sand_nickel_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_PLATINUM_ORE = DeferredRegistration.registerBlock("sand_platinum_ore", () -> new GravityOreBlock("sand_platinum_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_RUBY_ORE = DeferredRegistration.registerBlock("sand_ruby_ore", () -> new GravityOreBlock("sand_ruby_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_SAPPHIRE_ORE = DeferredRegistration.registerBlock("sand_sapphire_ore", () -> new GravityOreBlock("sand_sapphire_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_SILVER_ORE = DeferredRegistration.registerBlock("sand_silver_ore", () -> new GravityOreBlock("sand_silver_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_TIN_ORE = DeferredRegistration.registerBlock("sand_tin_ore", () -> new GravityOreBlock("sand_tin_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_TUNGSTEN_ORE = DeferredRegistration.registerBlock("sand_tungsten_ore", () -> new GravityOreBlock("sand_tungsten_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_URANIUM_ORE = DeferredRegistration.registerBlock("sand_uranium_ore", () -> new GravityOreBlock("sand_uranium_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_ZINC_ORE = DeferredRegistration.registerBlock("sand_zinc_ore", () -> new GravityOreBlock("sand_zinc_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));
	
	// Gravel - Vanilla
	public static final DeferredBlock<Block> GRAVEL_QUARTZ_ORE = DeferredRegistration.registerBlock("gravel_quartz_ore", () -> new GravityOreBlock("gravel_quartz_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.SNARE).strength(0.6F).sound(SoundType.GRAVEL)));
	
	// Modded
	public static final DeferredBlock<Block> GRAVEL_BAUXITE_ORE = DeferredRegistration.registerBlock("gravel_bauxite_ore", () -> new GravityOreBlock("gravel_bauxite_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.SNARE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_COBALT_ORE = DeferredRegistration.registerBlock("gravel_cobalt_ore", () -> new GravityOreBlock("gravel_cobalt_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.SNARE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_IRIDIUM_ORE = DeferredRegistration.registerBlock("gravel_iridium_ore", () -> new GravityOreBlock("gravel_iridium_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.SNARE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_LEAD_ORE = DeferredRegistration.registerBlock("gravel_lead_ore", () -> new GravityOreBlock("gravel_lead_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.SNARE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_NICKEL_ORE = DeferredRegistration.registerBlock("gravel_nickel_ore", () -> new GravityOreBlock("gravel_nickel_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.SNARE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_PLATINUM_ORE = DeferredRegistration.registerBlock("gravel_platinum_ore", () -> new GravityOreBlock("gravel_platinum_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.SNARE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_RUBY_ORE = DeferredRegistration.registerBlock("gravel_ruby_ore", () -> new GravityOreBlock("gravel_ruby_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.SNARE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_SAPPHIRE_ORE = DeferredRegistration.registerBlock("gravel_sapphire_ore", () -> new GravityOreBlock("gravel_sapphire_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.SNARE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_SILVER_ORE = DeferredRegistration.registerBlock("gravel_silver_ore", () -> new GravityOreBlock("gravel_silver_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.SNARE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_TIN_ORE = DeferredRegistration.registerBlock("gravel_tin_ore", () -> new GravityOreBlock("gravel_tin_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.SNARE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_TUNGSTEN_ORE = DeferredRegistration.registerBlock("gravel_tungsten_ore", () -> new GravityOreBlock("gravel_tungsten_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.SNARE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_URANIUM_ORE = DeferredRegistration.registerBlock("gravel_uranium_ore", () -> new GravityOreBlock("gravel_uranium_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.SNARE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_ZINC_ORE = DeferredRegistration.registerBlock("gravel_zinc_ore", () -> new GravityOreBlock("gravel_zinc_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.SNARE).strength(0.6F).sound(SoundType.GRAVEL)));
		
	// Nether - Vanilla
	public static final DeferredBlock<Block> NETHER_COAL_ORE = DeferredRegistration.registerBlock("nether_coal_ore", () -> new NetherOre("nether_coal_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_COPPER_ORE = DeferredRegistration.registerBlock("nether_copper_ore", () -> new NetherOre("nether_copper_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_DIAMOND_ORE = DeferredRegistration.registerBlock("nether_diamond_ore", () -> new NetherOre("nether_diamond_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_EMERALD_ORE = DeferredRegistration.registerBlock("nether_emerald_ore", () -> new NetherOre("nether_emerald_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_GOLD_ORE = DeferredRegistration.registerBlock("nether_gold_ore", () -> new NetherOre("nether_gold_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_IRON_ORE = DeferredRegistration.registerBlock("nether_iron_ore", () -> new NetherOre("nether_iron_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_REDSTONE_ORE = DeferredRegistration.registerBlock("nether_redstone_ore", () -> new NetherOre("nether_redstone_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_LAPIS_ORE = DeferredRegistration.registerBlock("nether_lapis_ore", () -> new NetherOre("nether_lapis_ore", 3f, 3f));
	// Modded
	public static final DeferredBlock<Block> NETHER_BAUXITE_ORE = DeferredRegistration.registerBlock("nether_bauxite_ore", () -> new NetherOre("nether_bauxite_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_COBALT_ORE = DeferredRegistration.registerBlock("nether_cobalt_ore", () -> new NetherOre("nether_cobalt_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_IRIDIUM_ORE = DeferredRegistration.registerBlock("nether_iridium_ore", () -> new NetherOre("nether_iridium_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_LEAD_ORE = DeferredRegistration.registerBlock("nether_lead_ore", () -> new NetherOre("nether_lead_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_NICKEL_ORE = DeferredRegistration.registerBlock("nether_nickel_ore", () -> new NetherOre("nether_nickel_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_PLATINUM_ORE = DeferredRegistration.registerBlock("nether_platinum_ore", () -> new NetherOre("nether_platinum_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_RUBY_ORE = DeferredRegistration.registerBlock("nether_ruby_ore", () -> new NetherOre("nether_ruby_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_SAPPHIRE_ORE = DeferredRegistration.registerBlock("nether_sapphire_ore", () -> new NetherOre("nether_sapphire_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_SILVER_ORE = DeferredRegistration.registerBlock("nether_silver_ore", () -> new NetherOre("nether_silver_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_TIN_ORE = DeferredRegistration.registerBlock("nether_tin_ore", () -> new NetherOre("nether_tin_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_TUNGSTEN_ORE = DeferredRegistration.registerBlock("nether_tungsten_ore", () -> new NetherOre("nether_tungsten_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_URANIUM_ORE = DeferredRegistration.registerBlock("nether_uranium_ore", () -> new NetherOre("nether_uranium_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_ZINC_ORE = DeferredRegistration.registerBlock("nether_zinc_ore", () -> new NetherOre("nether_zinc_ore", 3f, 3f));
	
	// End - Vanilla
	public static final DeferredBlock<Block> END_COAL_ORE = DeferredRegistration.registerBlock("end_coal_ore", () -> new EndOre("end_coal_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_COPPER_ORE = DeferredRegistration.registerBlock("end_copper_ore", () -> new EndOre("end_copper_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_DIAMOND_ORE = DeferredRegistration.registerBlock("end_diamond_ore", () -> new EndOre("end_diamond_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_EMERALD_ORE = DeferredRegistration.registerBlock("end_emerald_ore", () -> new EndOre("end_emerald_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_GOLD_ORE = DeferredRegistration.registerBlock("end_gold_ore", () -> new EndOre("end_gold_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_IRON_ORE = DeferredRegistration.registerBlock("end_iron_ore", () -> new EndOre("end_iron_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_REDSTONE_ORE = DeferredRegistration.registerBlock("end_redstone_ore", () -> new EndOre("end_redstone_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_LAPIS_ORE = DeferredRegistration.registerBlock("end_lapis_ore", () -> new EndOre("end_lapis_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_QUARTZ_ORE = DeferredRegistration.registerBlock("end_quartz_ore", () -> new EndOre("end_quartz_ore", 3f, 3f));
	
	// Modded
	public static final DeferredBlock<Block> END_BAUXITE_ORE = DeferredRegistration.registerBlock("end_bauxite_ore", () -> new EndOre("end_bauxite_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_COBALT_ORE = DeferredRegistration.registerBlock("end_cobalt_ore", () -> new EndOre("end_cobalt_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_IRIDIUM_ORE = DeferredRegistration.registerBlock("end_iridium_ore", () -> new EndOre("end_iridium_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_LEAD_ORE = DeferredRegistration.registerBlock("end_lead_ore", () -> new EndOre("end_lead_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_NICKEL_ORE = DeferredRegistration.registerBlock("end_nickel_ore", () -> new EndOre("end_nickel_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_PLATINUM_ORE = DeferredRegistration.registerBlock("end_platinum_ore", () -> new EndOre("end_platinum_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_RUBY_ORE = DeferredRegistration.registerBlock("end_ruby_ore", () -> new EndOre("end_ruby_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_SAPPHIRE_ORE = DeferredRegistration.registerBlock("end_sapphire_ore", () -> new EndOre("end_sapphire_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_SILVER_ORE = DeferredRegistration.registerBlock("end_silver_ore", () -> new EndOre("end_silver_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_TIN_ORE = DeferredRegistration.registerBlock("end_tin_ore", () -> new EndOre("end_tin_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_TUNGSTEN_ORE = DeferredRegistration.registerBlock("end_tungsten_ore", () -> new EndOre("end_tungsten_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_URANIUM_ORE = DeferredRegistration.registerBlock("end_uranium_ore", () -> new EndOre("end_uranium_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_ZINC_ORE = DeferredRegistration.registerBlock("end_zinc_ore", () -> new EndOre("end_zinc_ore", 3f, 3f));
    
	
	// Solid Blocks
	public static final DeferredBlock<Block> BAUXITE_BLOCK = DeferredRegistration.registerBlock("bauxite_block", () -> new SolidBlock("bauxite_block", 5f, 6f));
	public static final DeferredBlock<Block> BRONZE_BLOCK = DeferredRegistration.registerBlock("bronze_block", () -> new SolidBlock("bronze_block", 5f, 6f));
	public static final DeferredBlock<Block> COBALT_BLOCK = DeferredRegistration.registerBlock("cobalt_block", () -> new SolidBlock("cobalt_block", 5f, 6f));
	public static final DeferredBlock<Block> IRIDIUM_BLOCK = DeferredRegistration.registerBlock("iridium_block", () -> new SolidBlock("iridium_block",5f, 6f));
	public static final DeferredBlock<Block> LEAD_BLOCK = DeferredRegistration.registerBlock("lead_block", () -> new SolidBlock("lead_block", 5f, 6f));
	public static final DeferredBlock<Block> NICKEL_BLOCK = DeferredRegistration.registerBlock("nickel_block", () -> new SolidBlock("nickel_block", 5f, 6f));
	public static final DeferredBlock<Block> PLATINUM_BLOCK = DeferredRegistration.registerBlock("platinum_block", () -> new SolidBlock("platinum_block", 5f, 6f));
	public static final DeferredBlock<Block> RUBY_BLOCK = DeferredRegistration.registerBlock("ruby_block", () -> new SolidBlock("ruby_block", 5f, 6f));
	public static final DeferredBlock<Block> SAPPHIRE_BLOCK = DeferredRegistration.registerBlock("sapphire_block", () -> new SolidBlock("sapphire_block", 5f, 6f));
	public static final DeferredBlock<Block> SILVER_BLOCK = DeferredRegistration.registerBlock("silver_block", () -> new SolidBlock("silver_block", 5f, 6f));
	public static final DeferredBlock<Block> TIN_BLOCK = DeferredRegistration.registerBlock("tin_block", () -> new SolidBlock("tin_block", 5f, 6f));
	public static final DeferredBlock<Block> TUNGSTEN_BLOCK = DeferredRegistration.registerBlock("tungsten_block", () -> new SolidBlock("tungsten_block", 5f, 6f));
	public static final DeferredBlock<Block> URANIUM_BLOCK = DeferredRegistration.registerBlock("uranium_block", () -> new SolidBlock("uranium_block", 5f, 6f));
	public static final DeferredBlock<Block> ZINC_BLOCK = DeferredRegistration.registerBlock("zinc_block", () -> new SolidBlock("zinc_block", 5f, 6f));
	
	public static final DeferredBlock<Block> RAW_BAUXITE_BLOCK = DeferredRegistration.registerBlock("raw_bauxite_block", () -> new SolidBlock("raw_bauxite_block", 3f, 3f));
	public static final DeferredBlock<Block> RAW_COBALT_BLOCK = DeferredRegistration.registerBlock("raw_cobalt_block", () -> new SolidBlock("raw_cobalt_block", 3f, 3f));
	public static final DeferredBlock<Block> RAW_IRIDIUM_BLOCK = DeferredRegistration.registerBlock("raw_iridium_block", () -> new SolidBlock("raw_iridium_block", 3f, 3f));
	public static final DeferredBlock<Block> RAW_LEAD_BLOCK = DeferredRegistration.registerBlock("raw_lead_block", () -> new SolidBlock("raw_lead_block", 3f, 3f));
	public static final DeferredBlock<Block> RAW_NICKEL_BLOCK = DeferredRegistration.registerBlock("raw_nickel_block", () -> new SolidBlock("raw_nickel_block", 3f, 3f));
	public static final DeferredBlock<Block> RAW_PLATINUM_BLOCK = DeferredRegistration.registerBlock("raw_platinum_block", () -> new SolidBlock("raw_platinum_block", 3f, 3f));
	public static final DeferredBlock<Block> RAW_SILVER_BLOCK = DeferredRegistration.registerBlock("raw_silver_block", () -> new SolidBlock("raw_silver_block", 3f, 3f));
	public static final DeferredBlock<Block> RAW_TIN_BLOCK = DeferredRegistration.registerBlock("raw_tin_block", () -> new SolidBlock("raw_tin_block", 3f, 3f));
	public static final DeferredBlock<Block> RAW_TUNGSTEN_BLOCK = DeferredRegistration.registerBlock("raw_tungsten_block", () -> new SolidBlock("raw_tungsten_block", 3f, 3f));
	public static final DeferredBlock<Block> RAW_URANIUM_BLOCK = DeferredRegistration.registerBlock("raw_uranium_block", () -> new SolidBlock("raw_uranium_block", 3f, 3f));
	public static final DeferredBlock<Block> RAW_ZINC_BLOCK = DeferredRegistration.registerBlock("raw_zinc_block", () -> new SolidBlock("raw_zinc_block", 3f, 3f));
	
	public static void register() {}
}
