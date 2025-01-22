package com.gmail.rohzek.simpleoregen.blocks;

import com.gmail.rohzek.simpleoregen.blocks.blocktypes.SolidBlock;
import com.gmail.rohzek.simpleoregen.blocks.oretypes.ChaosOre;
import com.gmail.rohzek.simpleoregen.blocks.oretypes.EndChaosOre;
import com.gmail.rohzek.simpleoregen.blocks.oretypes.EndOre;
import com.gmail.rohzek.simpleoregen.blocks.oretypes.EndRedstoneOre;
import com.gmail.rohzek.simpleoregen.blocks.oretypes.GravityChaosOre;
import com.gmail.rohzek.simpleoregen.blocks.oretypes.GravityOre;
import com.gmail.rohzek.simpleoregen.blocks.oretypes.GravityRedstoneOre;
import com.gmail.rohzek.simpleoregen.blocks.oretypes.NetherChaosOre;
import com.gmail.rohzek.simpleoregen.blocks.oretypes.NetherOre;
import com.gmail.rohzek.simpleoregen.blocks.oretypes.NetherRedstoneOre;
import com.gmail.rohzek.simpleoregen.blocks.oretypes.SurfaceOre;
import com.gmail.rohzek.simpleoregen.blocks.oretypes.SurfaceRedstoneOre;
import com.gmail.rohzek.simpleoregen.lib.DeferredRegistration;

import net.minecraft.util.ColorRGBA;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;

public class OreGenBlocks 
{
	/**
	 * Full Ores
	 */
	// Stone - Vanilla
	public static final DeferredBlock<Block> SURFACE_COAL_ORE = DeferredRegistration.registerBlock("coal_ore", () -> new SurfaceOre("coal_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_COPPER_ORE = DeferredRegistration.registerBlock("copper_ore", () -> new SurfaceOre("copper_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_DIAMOND_ORE = DeferredRegistration.registerBlock("diamond_ore", () -> new SurfaceOre("diamond_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_EMERALD_ORE = DeferredRegistration.registerBlock("emerald_ore", () -> new SurfaceOre("emerald_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_GOLD_ORE = DeferredRegistration.registerBlock("gold_ore", () -> new SurfaceOre("gold_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_IRON_ORE = DeferredRegistration.registerBlock("iron_ore", () -> new SurfaceOre("iron_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_REDSTONE_ORE = DeferredRegistration.registerBlock("redstone_ore", () -> new SurfaceRedstoneOre("redstone_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_LAPIS_ORE = DeferredRegistration.registerBlock("lapis_ore", () -> new SurfaceOre("lapis_ore", 3f, 3f));
		
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
	public static final DeferredBlock<Block> SURFACE_CHAOS_ORE = DeferredRegistration.registerBlock("chaos_ore", () -> new ChaosOre("chaos_ore", 3f, 3f));
	
	// Deepslate - Vanilla
	public static final DeferredBlock<Block> DEEPSLATE_COAL_ORE = DeferredRegistration.registerBlock("deepslate_coal_ore", () -> new SurfaceOre("deepslate_coal_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_COPPER_ORE = DeferredRegistration.registerBlock("deepslate_copper_ore", () -> new SurfaceOre("deepslate_copper_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_DIAMOND_ORE = DeferredRegistration.registerBlock("deepslate_diamond_ore", () -> new SurfaceOre("deepslate_diamond_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_EMERALD_ORE = DeferredRegistration.registerBlock("deepslate_emerald_ore", () -> new SurfaceOre("deepslate_emerald_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_GOLD_ORE = DeferredRegistration.registerBlock("deepslate_gold_ore", () -> new SurfaceOre("deepslate_gold_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_IRON_ORE = DeferredRegistration.registerBlock("deepslate_iron_ore", () -> new SurfaceOre("deepslate_iron_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_REDSTONE_ORE = DeferredRegistration.registerBlock("deepslate_redstone_ore", () -> new SurfaceRedstoneOre("deepslate_redstone_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_LAPIS_ORE = DeferredRegistration.registerBlock("deepslate_lapis_ore", () -> new SurfaceOre("deepslate_lapis_ore", 3f, 3f));
		
	
	public static final DeferredBlock<Block> DEEPSLATE_QUARTZ_ORE = DeferredRegistration.registerBlock("deepslate_quartz_ore", () -> new SurfaceOre("deepslate_quartz_ore", 3f, 3f));
	
	// Modded
	public static final DeferredBlock<Block> DEEPSLATE_BAUXITE_ORE = DeferredRegistration.registerBlock("deepslate_bauxite_ore", () -> new SurfaceOre("deepslate_bauxite_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_COBALT_ORE = DeferredRegistration.registerBlock("deepslate_cobalt_ore", () -> new SurfaceOre("deepslate_cobalt_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_IRIDIUM_ORE = DeferredRegistration.registerBlock("deepslate_iridium_ore", () -> new SurfaceOre("deepslate_iridium_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_LEAD_ORE = DeferredRegistration.registerBlock("deepslate_lead_ore", () -> new SurfaceOre("deepslate_lead_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_NICKEL_ORE = DeferredRegistration.registerBlock("deepslate_nickel_ore", () -> new SurfaceOre("deepslate_nickel_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_PLATINUM_ORE = DeferredRegistration.registerBlock("deepslate_platinum_ore", () -> new SurfaceOre("deepslate_platinum_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = DeferredRegistration.registerBlock("deepslate_ruby_ore", () -> new SurfaceOre("deepslate_ruby_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_SAPPHIRE_ORE = DeferredRegistration.registerBlock("deepslate_sapphire_ore", () -> new SurfaceOre("deepslate_sapphire_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_SILVER_ORE = DeferredRegistration.registerBlock("deepslate_silver_ore", () -> new SurfaceOre("deepslate_silver_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = DeferredRegistration.registerBlock("deepslate_tin_ore", () -> new SurfaceOre("deepslate_tin_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_TUNGSTEN_ORE = DeferredRegistration.registerBlock("deepslate_tungsten_ore", () -> new SurfaceOre("deepslate_tungsten_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_URANIUM_ORE = DeferredRegistration.registerBlock("deepslate_uranium_ore", () -> new SurfaceOre("deepslate_uranium_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_ZINC_ORE = DeferredRegistration.registerBlock("deepslate_zinc_ore", () -> new SurfaceOre("deepslate_zinc_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_CHAOS_ORE = DeferredRegistration.registerBlock("deepslate_chaos_ore", () -> new ChaosOre("deepslate_chaos_ore", 3f, 3f));
	
	// Andesite - Vanilla
	public static final DeferredBlock<Block> ANDESITE_QUARTZ_ORE = DeferredRegistration.registerBlock("andesite_quartz_ore", () -> new SurfaceOre("andesite_quartz_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_COAL_ORE = DeferredRegistration.registerBlock("andesite_coal_ore", () -> new SurfaceOre("andesite_coal_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_COPPER_ORE = DeferredRegistration.registerBlock("andesite_copper_ore", () -> new SurfaceOre("andesite_copper_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_DIAMOND_ORE = DeferredRegistration.registerBlock("andesite_diamond_ore", () -> new SurfaceOre("andesite_diamond_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_EMERALD_ORE = DeferredRegistration.registerBlock("andesite_emerald_ore", () -> new SurfaceOre("andesite_emerald_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_GOLD_ORE = DeferredRegistration.registerBlock("andesite_gold_ore", () -> new SurfaceOre("andesite_gold_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_IRON_ORE = DeferredRegistration.registerBlock("andesite_iron_ore", () -> new SurfaceOre("andesite_iron_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_REDSTONE_ORE = DeferredRegistration.registerBlock("andesite_redstone_ore", () -> new SurfaceRedstoneOre("andesite_redstone_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_LAPIS_ORE = DeferredRegistration.registerBlock("andesite_lapis_ore", () -> new SurfaceOre("andesite_lapis_ore", 3f, 3f));
		
	
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
	public static final DeferredBlock<Block> ANDESITE_CHAOS_ORE = DeferredRegistration.registerBlock("andesite_chaos_ore", () -> new ChaosOre("andesite_chaos_ore", 3f, 3f));
	
	// Diorite - Vanilla
	public static final DeferredBlock<Block> DIORITE_QUARTZ_ORE = DeferredRegistration.registerBlock("diorite_quartz_ore", () -> new SurfaceOre("diorite_quartz_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_COAL_ORE = DeferredRegistration.registerBlock("diorite_coal_ore", () -> new SurfaceOre("diorite_coal_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_COPPER_ORE = DeferredRegistration.registerBlock("diorite_copper_ore", () -> new SurfaceOre("diorite_copper_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_DIAMOND_ORE = DeferredRegistration.registerBlock("diorite_diamond_ore", () -> new SurfaceOre("diorite_diamond_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_EMERALD_ORE = DeferredRegistration.registerBlock("diorite_emerald_ore", () -> new SurfaceOre("diorite_emerald_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_GOLD_ORE = DeferredRegistration.registerBlock("diorite_gold_ore", () -> new SurfaceOre("diorite_gold_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_IRON_ORE = DeferredRegistration.registerBlock("diorite_iron_ore", () -> new SurfaceOre("diorite_iron_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_REDSTONE_ORE = DeferredRegistration.registerBlock("diorite_redstone_ore", () -> new SurfaceRedstoneOre("diorite_redstone_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_LAPIS_ORE = DeferredRegistration.registerBlock("diorite_lapis_ore", () -> new SurfaceOre("diorite_lapis_ore", 3f, 3f));
	
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
	public static final DeferredBlock<Block> DIORITE_CHAOS_ORE = DeferredRegistration.registerBlock("diorite_chaos_ore", () -> new ChaosOre("diorite_chaos_ore", 3f, 3f));
		
	// Granite - Vanilla
	public static final DeferredBlock<Block> GRANITE_QUARTZ_ORE = DeferredRegistration.registerBlock("granite_quartz_ore", () -> new SurfaceOre("granite_quartz_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_COAL_ORE = DeferredRegistration.registerBlock("granite_coal_ore", () -> new SurfaceOre("granite_coal_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_COPPER_ORE = DeferredRegistration.registerBlock("granite_copper_ore", () -> new SurfaceOre("granite_copper_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_DIAMOND_ORE = DeferredRegistration.registerBlock("granite_diamond_ore", () -> new SurfaceOre("granite_diamond_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_EMERALD_ORE = DeferredRegistration.registerBlock("granite_emerald_ore", () -> new SurfaceOre("granite_emerald_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_GOLD_ORE = DeferredRegistration.registerBlock("granite_gold_ore", () -> new SurfaceOre("granite_gold_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_IRON_ORE = DeferredRegistration.registerBlock("granite_iron_ore", () -> new SurfaceOre("granite_iron_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_REDSTONE_ORE = DeferredRegistration.registerBlock("granite_redstone_ore", () -> new SurfaceRedstoneOre("granite_redstone_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_LAPIS_ORE = DeferredRegistration.registerBlock("granite_lapis_ore", () -> new SurfaceOre("granite_lapis_ore", 3f, 3f));
	
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
	public static final DeferredBlock<Block> GRANITE_CHAOS_ORE = DeferredRegistration.registerBlock("granite_chaos_ore", () -> new ChaosOre("granite_chaos_ore", 3f, 3f));
	
	// Sandstone - Vanilla
	public static final DeferredBlock<Block> SANDSTONE_QUARTZ_ORE = DeferredRegistration.registerBlock("sandstone_quartz_ore", () -> new SurfaceOre("sandstone_quartz_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_COAL_ORE = DeferredRegistration.registerBlock("sandstone_coal_ore", () -> new SurfaceOre("sandstone_coal_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_COPPER_ORE = DeferredRegistration.registerBlock("sandstone_copper_ore", () -> new SurfaceOre("sandstone_copper_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_DIAMOND_ORE = DeferredRegistration.registerBlock("sandstone_diamond_ore", () -> new SurfaceOre("sandstone_diamond_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_EMERALD_ORE = DeferredRegistration.registerBlock("sandstone_emerald_ore", () -> new SurfaceOre("sandstone_emerald_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_GOLD_ORE = DeferredRegistration.registerBlock("sandstone_gold_ore", () -> new SurfaceOre("sandstone_gold_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_IRON_ORE = DeferredRegistration.registerBlock("sandstone_iron_ore", () -> new SurfaceOre("sandstone_iron_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_REDSTONE_ORE = DeferredRegistration.registerBlock("sandstone_redstone_ore", () -> new SurfaceRedstoneOre("sandstone_redstone_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_LAPIS_ORE = DeferredRegistration.registerBlock("sandstone_lapis_ore", () -> new SurfaceOre("sandstone_lapis_ore", 3f, 3f));
	
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
	public static final DeferredBlock<Block> SANDSTONE_CHAOS_ORE = DeferredRegistration.registerBlock("sandstone_chaos_ore", () -> new ChaosOre("sandstone_chaos_ore", 3f, 3f));
	
	// Sand - Vanilla
	public static final DeferredBlock<Block> SAND_QUARTZ_ORE = DeferredRegistration.registerBlock("sand_quartz_ore", () -> new GravityOre("sand_quartz_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_COAL_ORE = DeferredRegistration.registerBlock("sand_coal_ore", () -> new GravityOre("sand_coal_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_COPPER_ORE = DeferredRegistration.registerBlock("sand_copper_ore", () -> new GravityOre("sand_copper_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_DIAMOND_ORE = DeferredRegistration.registerBlock("sand_diamond_ore", () -> new GravityOre("sand_diamond_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_EMERALD_ORE = DeferredRegistration.registerBlock("sand_emerald_ore", () -> new GravityOre("sand_emerald_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_GOLD_ORE = DeferredRegistration.registerBlock("sand_gold_ore", () -> new GravityOre("sand_gold_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_IRON_ORE = DeferredRegistration.registerBlock("sand_iron_ore", () -> new GravityOre("sand_iron_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_REDSTONE_ORE = DeferredRegistration.registerBlock("sand_redstone_ore", () -> new GravityRedstoneOre("sand_redstone_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_LAPIS_ORE = DeferredRegistration.registerBlock("sand_lapis_ore", () -> new GravityOre("sand_lapis_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	
	// Modded
	public static final DeferredBlock<Block> SAND_BAUXITE_ORE = DeferredRegistration.registerBlock("sand_bauxite_ore", () -> new GravityOre("sand_bauxite_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_COBALT_ORE = DeferredRegistration.registerBlock("sand_cobalt_ore", () -> new GravityOre("sand_cobalt_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_IRIDIUM_ORE = DeferredRegistration.registerBlock("sand_iridium_ore", () -> new GravityOre("sand_iridium_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_LEAD_ORE = DeferredRegistration.registerBlock("sand_lead_ore", () -> new GravityOre("sand_lead_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_NICKEL_ORE = DeferredRegistration.registerBlock("sand_nickel_ore", () -> new GravityOre("sand_nickel_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_PLATINUM_ORE = DeferredRegistration.registerBlock("sand_platinum_ore", () -> new GravityOre("sand_platinum_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_RUBY_ORE = DeferredRegistration.registerBlock("sand_ruby_ore", () -> new GravityOre("sand_ruby_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_SAPPHIRE_ORE = DeferredRegistration.registerBlock("sand_sapphire_ore", () -> new GravityOre("sand_sapphire_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_SILVER_ORE = DeferredRegistration.registerBlock("sand_silver_ore", () -> new GravityOre("sand_silver_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_TIN_ORE = DeferredRegistration.registerBlock("sand_tin_ore", () -> new GravityOre("sand_tin_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_TUNGSTEN_ORE = DeferredRegistration.registerBlock("sand_tungsten_ore", () -> new GravityOre("sand_tungsten_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_URANIUM_ORE = DeferredRegistration.registerBlock("sand_uranium_ore", () -> new GravityOre("sand_uranium_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_ZINC_ORE = DeferredRegistration.registerBlock("sand_zinc_ore", () -> new GravityOre("sand_zinc_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_CHAOS_ORE = DeferredRegistration.registerBlock("sand_chaos_ore", () -> new GravityChaosOre("sand_chaos_ore", new ColorRGBA(14406560),
            BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND).noLootTable()));
	
	// Gravel - Vanilla
	public static final DeferredBlock<Block> GRAVEL_QUARTZ_ORE = DeferredRegistration.registerBlock("gravel_quartz_ore", () -> new GravityOre("gravel_quartz_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_COAL_ORE = DeferredRegistration.registerBlock("gravel_coal_ore", () -> new GravityOre("gravel_coal_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.5F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_COPPER_ORE = DeferredRegistration.registerBlock("gravel_copper_ore", () -> new GravityOre("gravel_copper_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.5F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_DIAMOND_ORE = DeferredRegistration.registerBlock("gravel_diamond_ore", () -> new GravityOre("gravel_diamond_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.5F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_EMERALD_ORE = DeferredRegistration.registerBlock("gravel_emerald_ore", () -> new GravityOre("gravel_emerald_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.5F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_GOLD_ORE = DeferredRegistration.registerBlock("gravel_gold_ore", () -> new GravityOre("gravel_gold_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.5F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_IRON_ORE = DeferredRegistration.registerBlock("gravel_iron_ore", () -> new GravityOre("gravel_iron_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.5F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_REDSTONE_ORE = DeferredRegistration.registerBlock("gravel_redstone_ore", () -> new GravityRedstoneOre("gravel_redstone_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.5F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_LAPIS_ORE = DeferredRegistration.registerBlock("gravel_lapis_ore", () -> new GravityOre("gravel_lapis_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.5F).sound(SoundType.GRAVEL)));
	
	// Modded
	public static final DeferredBlock<Block> GRAVEL_BAUXITE_ORE = DeferredRegistration.registerBlock("gravel_bauxite_ore", () -> new GravityOre("gravel_bauxite_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_COBALT_ORE = DeferredRegistration.registerBlock("gravel_cobalt_ore", () -> new GravityOre("gravel_cobalt_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_IRIDIUM_ORE = DeferredRegistration.registerBlock("gravel_iridium_ore", () -> new GravityOre("gravel_iridium_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_LEAD_ORE = DeferredRegistration.registerBlock("gravel_lead_ore", () -> new GravityOre("gravel_lead_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_NICKEL_ORE = DeferredRegistration.registerBlock("gravel_nickel_ore", () -> new GravityOre("gravel_nickel_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_PLATINUM_ORE = DeferredRegistration.registerBlock("gravel_platinum_ore", () -> new GravityOre("gravel_platinum_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_RUBY_ORE = DeferredRegistration.registerBlock("gravel_ruby_ore", () -> new GravityOre("gravel_ruby_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_SAPPHIRE_ORE = DeferredRegistration.registerBlock("gravel_sapphire_ore", () -> new GravityOre("gravel_sapphire_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_SILVER_ORE = DeferredRegistration.registerBlock("gravel_silver_ore", () -> new GravityOre("gravel_silver_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_TIN_ORE = DeferredRegistration.registerBlock("gravel_tin_ore", () -> new GravityOre("gravel_tin_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_TUNGSTEN_ORE = DeferredRegistration.registerBlock("gravel_tungsten_ore", () -> new GravityOre("gravel_tungsten_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_URANIUM_ORE = DeferredRegistration.registerBlock("gravel_uranium_ore", () -> new GravityOre("gravel_uranium_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_ZINC_ORE = DeferredRegistration.registerBlock("gravel_zinc_ore", () -> new GravityOre("gravel_zinc_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_CHAOS_ORE = DeferredRegistration.registerBlock("gravel_chaos_ore", () -> new GravityChaosOre("gravel_chaos_ore", new ColorRGBA(-8356741),
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL).noLootTable()));
	
	// Nether - Vanilla
	public static final DeferredBlock<Block> NETHER_COAL_ORE = DeferredRegistration.registerBlock("nether_coal_ore", () -> new NetherOre("nether_coal_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_COPPER_ORE = DeferredRegistration.registerBlock("nether_copper_ore", () -> new NetherOre("nether_copper_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_DIAMOND_ORE = DeferredRegistration.registerBlock("nether_diamond_ore", () -> new NetherOre("nether_diamond_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_EMERALD_ORE = DeferredRegistration.registerBlock("nether_emerald_ore", () -> new NetherOre("nether_emerald_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_GOLD_ORE = DeferredRegistration.registerBlock("nether_gold_ore", () -> new NetherOre("nether_gold_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_IRON_ORE = DeferredRegistration.registerBlock("nether_iron_ore", () -> new NetherOre("nether_iron_ore", 3f, 3f));
	public static final DeferredBlock<Block> NETHER_REDSTONE_ORE = DeferredRegistration.registerBlock("nether_redstone_ore", () -> new NetherRedstoneOre("nether_redstone_ore", 3f, 3f));
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
	public static final DeferredBlock<Block> NETHER_CHAOS_ORE = DeferredRegistration.registerBlock("nether_chaos_ore", () -> new NetherChaosOre("nether_chaos_ore", 3f, 3f));
	
	// End - Vanilla
	public static final DeferredBlock<Block> END_COAL_ORE = DeferredRegistration.registerBlock("end_coal_ore", () -> new EndOre("end_coal_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_COPPER_ORE = DeferredRegistration.registerBlock("end_copper_ore", () -> new EndOre("end_copper_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_DIAMOND_ORE = DeferredRegistration.registerBlock("end_diamond_ore", () -> new EndOre("end_diamond_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_EMERALD_ORE = DeferredRegistration.registerBlock("end_emerald_ore", () -> new EndOre("end_emerald_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_GOLD_ORE = DeferredRegistration.registerBlock("end_gold_ore", () -> new EndOre("end_gold_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_IRON_ORE = DeferredRegistration.registerBlock("end_iron_ore", () -> new EndOre("end_iron_ore", 3f, 3f));
	public static final DeferredBlock<Block> END_REDSTONE_ORE = DeferredRegistration.registerBlock("end_redstone_ore", () -> new EndRedstoneOre("end_redstone_ore", 3f, 3f));
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
	public static final DeferredBlock<Block> END_CHAOS_ORE = DeferredRegistration.registerBlock("end_chaos_ore", () -> new EndChaosOre("end_chaos_ore", 3f, 3f));
	
	
	/**
	 * Nugget versions of ores
	 */
	// Vanilla
	public static final DeferredBlock<Block> SURFACE_COPPER_NUGGET_ORE = DeferredRegistration.registerBlock("copper_nugget_ore", () -> new SurfaceOre("copper_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_IRON_NUGGET_ORE = DeferredRegistration.registerBlock("iron_nugget_ore", () -> new SurfaceOre("iron_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_GOLD_NUGGET_ORE = DeferredRegistration.registerBlock("gold_nugget_ore", () -> new SurfaceOre("gold_nugget_ore", 3f, 3f));
	/*
	// Modded
	public static final DeferredBlock<Block> SURFACE_BAUXITE_NUGGET_ORE = DeferredRegistration.registerBlock("bauxite_nugget_ore", () -> new SurfaceOre("bauxite_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_COBALT_NUGGET_ORE = DeferredRegistration.registerBlock("cobalt_nugget_ore", () -> new SurfaceOre("cobalt_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_IRIDIUM_NUGGET_ORE = DeferredRegistration.registerBlock("iridium_nugget_ore", () -> new SurfaceOre("iridium_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_LEAD_NUGGET_ORE = DeferredRegistration.registerBlock("lead_nugget_ore", () -> new SurfaceOre("lead_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_NICKEL_NUGGET_ORE = DeferredRegistration.registerBlock("nickel_nugget_ore", () -> new SurfaceOre("nickel_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_PLATINUM_NUGGET_ORE = DeferredRegistration.registerBlock("platinum_nugget_ore", () -> new SurfaceOre("platinum_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_SILVER_NUGGET_ORE = DeferredRegistration.registerBlock("silver_nugget_ore", () -> new SurfaceOre("silver_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_TIN_NUGGET_ORE = DeferredRegistration.registerBlock("tin_nugget_ore", () -> new SurfaceOre("tin_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_TUNGSTEN_NUGGET_ORE = DeferredRegistration.registerBlock("tungsten_nugget_ore", () -> new SurfaceOre("tungsten_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_URANIUM_NUGGET_ORE = DeferredRegistration.registerBlock("uranium_nugget_ore", () -> new SurfaceOre("uranium_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SURFACE_ZINC_NUGGET_ORE = DeferredRegistration.registerBlock("zinc_nugget_ore", () -> new SurfaceOre("zinc_nugget_ore", 3f, 3f));
	*/
	// Vanilla
	public static final DeferredBlock<Block> DEEPSLATE_COPPER_NUGGET_ORE = DeferredRegistration.registerBlock("deepslate_copper_nugget_ore", () -> new SurfaceOre("deepslate_copper_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_IRON_NUGGET_ORE = DeferredRegistration.registerBlock("deepslate_iron_nugget_ore", () -> new SurfaceOre("deepslate_iron_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_GOLD_NUGGET_ORE = DeferredRegistration.registerBlock("deepslate_gold_nugget_ore", () -> new SurfaceOre("deepslate_gold_nugget_ore", 3f, 3f));
	/*
	// Modded
	public static final DeferredBlock<Block> DEEPSLATE_BAUXITE_NUGGET_ORE = DeferredRegistration.registerBlock("deepslate_bauxite_nugget_ore", () -> new SurfaceOre("deepslate_bauxite_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_COBALT_NUGGET_ORE = DeferredRegistration.registerBlock("deepslate_cobalt_nugget_ore", () -> new SurfaceOre("deepslate_cobalt_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_IRIDIUM_NUGGET_ORE = DeferredRegistration.registerBlock("deepslate_iridium_nugget_ore", () -> new SurfaceOre("deepslate_iridium_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_LEAD_NUGGET_ORE = DeferredRegistration.registerBlock("deepslate_lead_nugget_ore", () -> new SurfaceOre("deepslate_lead_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_NICKEL_NUGGET_ORE = DeferredRegistration.registerBlock("deepslate_nickel_nugget_ore", () -> new SurfaceOre("deepslate_nickel_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_PLATINUM_NUGGET_ORE = DeferredRegistration.registerBlock("deepslate_platinum_nugget_ore", () -> new SurfaceOre("deepslate_platinum_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_SILVER_NUGGET_ORE = DeferredRegistration.registerBlock("deepslate_silver_nugget_ore", () -> new SurfaceOre("deepslate_silver_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_TIN_NUGGET_ORE = DeferredRegistration.registerBlock("deepslate_tin_nugget_ore", () -> new SurfaceOre("deepslate_tin_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_TUNGSTEN_NUGGET_ORE = DeferredRegistration.registerBlock("deepslate_tungsten_nugget_ore", () -> new SurfaceOre("deepslate_tungsten_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_URANIUM_NUGGET_ORE = DeferredRegistration.registerBlock("deepslate_uranium_nugget_ore", () -> new SurfaceOre("deepslate_uranium_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DEEPSLATE_ZINC_NUGGET_ORE = DeferredRegistration.registerBlock("deepslate_zinc_nugget_ore", () -> new SurfaceOre("deepslate_zinc_nugget_ore", 3f, 3f));
	*/
	// Vanilla
	public static final DeferredBlock<Block> ANDESITE_COPPER_NUGGET_ORE = DeferredRegistration.registerBlock("andesite_copper_nugget_ore", () -> new SurfaceOre("andesite_copper_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_IRON_NUGGET_ORE = DeferredRegistration.registerBlock("andesite_iron_nugget_ore", () -> new SurfaceOre("andesite_iron_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_GOLD_NUGGET_ORE = DeferredRegistration.registerBlock("andesite_gold_nugget_ore", () -> new SurfaceOre("andesite_gold_nugget_ore", 3f, 3f));
	/*
	// Modded
	public static final DeferredBlock<Block> ANDESITE_BAUXITE_NUGGET_ORE = DeferredRegistration.registerBlock("andesite_bauxite_nugget_ore", () -> new SurfaceOre("andesite_bauxite_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_COBALT_NUGGET_ORE = DeferredRegistration.registerBlock("andesite_cobalt_nugget_ore", () -> new SurfaceOre("andesite_cobalt_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_IRIDIUM_NUGGET_ORE = DeferredRegistration.registerBlock("andesite_iridium_nugget_ore", () -> new SurfaceOre("andesite_iridium_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_LEAD_NUGGET_ORE = DeferredRegistration.registerBlock("andesite_lead_nugget_ore", () -> new SurfaceOre("andesite_lead_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_NICKEL_NUGGET_ORE = DeferredRegistration.registerBlock("andesite_nickel_nugget_ore", () -> new SurfaceOre("andesite_nickel_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_PLATINUM_NUGGET_ORE = DeferredRegistration.registerBlock("andesite_platinum_nugget_ore", () -> new SurfaceOre("andesite_platinum_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_SILVER_NUGGET_ORE = DeferredRegistration.registerBlock("andesite_silver_nugget_ore", () -> new SurfaceOre("andesite_silver_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_TIN_NUGGET_ORE = DeferredRegistration.registerBlock("andesite_tin_nugget_ore", () -> new SurfaceOre("andesite_tin_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_TUNGSTEN_NUGGET_ORE = DeferredRegistration.registerBlock("andesite_tungsten_nugget_ore", () -> new SurfaceOre("andesite_tungsten_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_URANIUM_NUGGET_ORE = DeferredRegistration.registerBlock("andesite_uranium_nugget_ore", () -> new SurfaceOre("andesite_uranium_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> ANDESITE_ZINC_NUGGET_ORE = DeferredRegistration.registerBlock("andesite_zinc_nugget_ore", () -> new SurfaceOre("andesite_zinc_nugget_ore", 3f, 3f));
	*/
	// Vanilla
	public static final DeferredBlock<Block> DIORITE_COPPER_NUGGET_ORE = DeferredRegistration.registerBlock("diorite_copper_nugget_ore", () -> new SurfaceOre("diorite_copper_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_IRON_NUGGET_ORE = DeferredRegistration.registerBlock("diorite_iron_nugget_ore", () -> new SurfaceOre("diorite_iron_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_GOLD_NUGGET_ORE = DeferredRegistration.registerBlock("diorite_gold_nugget_ore", () -> new SurfaceOre("diorite_gold_nugget_ore", 3f, 3f));
	/*
	// Modded
	public static final DeferredBlock<Block> DIORITE_BAUXITE_NUGGET_ORE = DeferredRegistration.registerBlock("diorite_bauxite_nugget_ore", () -> new SurfaceOre("diorite_bauxite_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_COBALT_NUGGET_ORE = DeferredRegistration.registerBlock("diorite_cobalt_nugget_ore", () -> new SurfaceOre("diorite_cobalt_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_IRIDIUM_NUGGET_ORE = DeferredRegistration.registerBlock("diorite_iridium_nugget_ore", () -> new SurfaceOre("diorite_iridium_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_LEAD_NUGGET_ORE = DeferredRegistration.registerBlock("diorite_lead_nugget_ore", () -> new SurfaceOre("diorite_lead_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_NICKEL_NUGGET_ORE = DeferredRegistration.registerBlock("diorite_nickel_nugget_ore", () -> new SurfaceOre("diorite_nickel_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_PLATINUM_NUGGET_ORE = DeferredRegistration.registerBlock("diorite_platinum_nugget_ore", () -> new SurfaceOre("diorite_platinum_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_SILVER_NUGGET_ORE = DeferredRegistration.registerBlock("diorite_silver_nugget_ore", () -> new SurfaceOre("diorite_silver_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_TIN_NUGGET_ORE = DeferredRegistration.registerBlock("diorite_tin_nugget_ore", () -> new SurfaceOre("diorite_tin_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_TUNGSTEN_NUGGET_ORE = DeferredRegistration.registerBlock("diorite_tungsten_nugget_ore", () -> new SurfaceOre("diorite_tungsten_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_URANIUM_NUGGET_ORE = DeferredRegistration.registerBlock("diorite_uranium_nugget_ore", () -> new SurfaceOre("diorite_uranium_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> DIORITE_ZINC_NUGGET_ORE = DeferredRegistration.registerBlock("diorite_zinc_nugget_ore", () -> new SurfaceOre("diorite_zinc_nugget_ore", 3f, 3f));
	*/
	// Vanilla
	public static final DeferredBlock<Block> GRANITE_COPPER_NUGGET_ORE = DeferredRegistration.registerBlock("granite_copper_nugget_ore", () -> new SurfaceOre("granite_copper_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_IRON_NUGGET_ORE = DeferredRegistration.registerBlock("granite_iron_nugget_ore", () -> new SurfaceOre("granite_iron_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_GOLD_NUGGET_ORE = DeferredRegistration.registerBlock("granite_gold_nugget_ore", () -> new SurfaceOre("granite_gold_nugget_ore", 3f, 3f));
	/*
	// Modded
	public static final DeferredBlock<Block> GRANITE_BAUXITE_NUGGET_ORE = DeferredRegistration.registerBlock("granite_bauxite_nugget_ore", () -> new SurfaceOre("granite_bauxite_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_COBALT_NUGGET_ORE = DeferredRegistration.registerBlock("granite_cobalt_nugget_ore", () -> new SurfaceOre("granite_cobalt_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_IRIDIUM_NUGGET_ORE = DeferredRegistration.registerBlock("granite_iridium_nugget_ore", () -> new SurfaceOre("granite_iridium_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_LEAD_NUGGET_ORE = DeferredRegistration.registerBlock("granite_lead_nugget_ore", () -> new SurfaceOre("granite_lead_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_NICKEL_NUGGET_ORE = DeferredRegistration.registerBlock("granite_nickel_nugget_ore", () -> new SurfaceOre("granite_nickel_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_PLATINUM_NUGGET_ORE = DeferredRegistration.registerBlock("granite_platinum_nugget_ore", () -> new SurfaceOre("granite_platinum_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_SILVER_NUGGET_ORE = DeferredRegistration.registerBlock("granite_silver_nugget_ore", () -> new SurfaceOre("granite_silver_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_TIN_NUGGET_ORE = DeferredRegistration.registerBlock("granite_tin_nugget_ore", () -> new SurfaceOre("granite_tin_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_TUNGSTEN_NUGGET_ORE = DeferredRegistration.registerBlock("granite_tungsten_nugget_ore", () -> new SurfaceOre("granite_tungsten_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_URANIUM_NUGGET_ORE = DeferredRegistration.registerBlock("granite_uranium_nugget_ore", () -> new SurfaceOre("granite_uranium_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> GRANITE_ZINC_NUGGET_ORE = DeferredRegistration.registerBlock("granite_zinc_nugget_ore", () -> new SurfaceOre("granite_zinc_nugget_ore", 3f, 3f));
	*/
	// Vanilla
	public static final DeferredBlock<Block> SANDSTONE_COPPER_NUGGET_ORE = DeferredRegistration.registerBlock("sandstone_copper_nugget_ore", () -> new SurfaceOre("sandstone_copper_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_IRON_NUGGET_ORE = DeferredRegistration.registerBlock("sandstone_iron_nugget_ore", () -> new SurfaceOre("sandstone_iron_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_GOLD_NUGGET_ORE = DeferredRegistration.registerBlock("sandstone_gold_nugget_ore", () -> new SurfaceOre("sandstone_gold_nugget_ore", 3f, 3f));
	/*
	// Modded
	public static final DeferredBlock<Block> SANDSTONE_BAUXITE_NUGGET_ORE = DeferredRegistration.registerBlock("sandstone_bauxite_nugget_ore", () -> new SurfaceOre("sandstone_bauxite_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_COBALT_NUGGET_ORE = DeferredRegistration.registerBlock("sandstone_cobalt_nugget_ore", () -> new SurfaceOre("sandstone_cobalt_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_IRIDIUM_NUGGET_ORE = DeferredRegistration.registerBlock("sandstone_iridium_nugget_ore", () -> new SurfaceOre("sandstone_iridium_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_LEAD_NUGGET_ORE = DeferredRegistration.registerBlock("sandstone_lead_nugget_ore", () -> new SurfaceOre("sandstone_lead_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_NICKEL_NUGGET_ORE = DeferredRegistration.registerBlock("sandstone_nickel_nugget_ore", () -> new SurfaceOre("sandstone_nickel_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_PLATINUM_NUGGET_ORE = DeferredRegistration.registerBlock("sandstone_platinum_nugget_ore", () -> new SurfaceOre("sandstone_platinum_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_SILVER_NUGGET_ORE = DeferredRegistration.registerBlock("sandstone_silver_nugget_ore", () -> new SurfaceOre("sandstone_silver_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_TIN_NUGGET_ORE = DeferredRegistration.registerBlock("sandstone_tin_nugget_ore", () -> new SurfaceOre("sandstone_tin_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_TUNGSTEN_NUGGET_ORE = DeferredRegistration.registerBlock("sandstone_tungsten_nugget_ore", () -> new SurfaceOre("sandstone_tungsten_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_URANIUM_NUGGET_ORE = DeferredRegistration.registerBlock("sandstone_uranium_nugget_ore", () -> new SurfaceOre("sandstone_uranium_nugget_ore", 3f, 3f));
	public static final DeferredBlock<Block> SANDSTONE_ZINC_NUGGET_ORE = DeferredRegistration.registerBlock("sandstone_zinc_nugget_ore", () -> new SurfaceOre("sandstone_zinc_nugget_ore", 3f, 3f));
	*/
	// Sand - Vanilla
	public static final DeferredBlock<Block> SAND_COPPER_NUGGET_ORE = DeferredRegistration.registerBlock("sand_copper_nugget_ore", () -> new GravityOre("sand_copper_nugget_ore", new ColorRGBA(14406560),
			BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_GOLD_NUGGET_ORE = DeferredRegistration.registerBlock("sand_gold_nugget_ore", () -> new GravityOre("sand_gold_nugget_ore", new ColorRGBA(14406560),
			BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_IRON_NUGGET_ORE = DeferredRegistration.registerBlock("sand_iron_nugget_ore", () -> new GravityOre("sand_iron_nugget_ore", new ColorRGBA(14406560),
			BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	/*
	// Modded
	public static final DeferredBlock<Block> SAND_BAUXITE_NUGGET_ORE = DeferredRegistration.registerBlock("sand_bauxite_nugget_ore", () -> new GravityOre("sand_bauxite_nugget_ore", new ColorRGBA(14406560),
			BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_COBALT_NUGGET_ORE = DeferredRegistration.registerBlock("sand_cobalt_nugget_ore", () -> new GravityOre("sand_cobalt_nugget_ore", new ColorRGBA(14406560),
			BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_IRIDIUM_NUGGET_ORE = DeferredRegistration.registerBlock("sand_iridium_nugget_ore", () -> new GravityOre("sand_iridium_nugget_ore", new ColorRGBA(14406560),
			BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_LEAD_NUGGET_ORE = DeferredRegistration.registerBlock("sand_lead_nugget_ore", () -> new GravityOre("sand_lead_nugget_ore", new ColorRGBA(14406560),
			BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_NICKEL_NUGGET_ORE = DeferredRegistration.registerBlock("sand_nickel_nugget_ore", () -> new GravityOre("sand_nickel_nugget_ore", new ColorRGBA(14406560),
			BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_PLATINUM_NUGGET_ORE = DeferredRegistration.registerBlock("sand_platinum_nugget_ore", () -> new GravityOre("sand_platinum_nugget_ore", new ColorRGBA(14406560),
			BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_SILVER_NUGGET_ORE = DeferredRegistration.registerBlock("sand_silver_nugget_ore", () -> new GravityOre("sand_silver_nugget_ore", new ColorRGBA(14406560),
			BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_TIN_NUGGET_ORE = DeferredRegistration.registerBlock("sand_tin_nugget_ore", () -> new GravityOre("sand_tin_nugget_ore", new ColorRGBA(14406560),
			BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_TUNGSTEN_NUGGET_ORE = DeferredRegistration.registerBlock("sand_tungsten_nugget_ore", () -> new GravityOre("sand_tungsten_nugget_ore", new ColorRGBA(14406560),
			BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_URANIUM_NUGGET_ORE = DeferredRegistration.registerBlock("sand_uranium_nugget_ore", () -> new GravityOre("sand_uranium_nugget_ore", new ColorRGBA(14406560),
			BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	public static final DeferredBlock<Block> SAND_ZINC_NUGGET_ORE = DeferredRegistration.registerBlock("sand_zinc_nugget_ore", () -> new GravityOre("sand_zinc_nugget_ore", new ColorRGBA(14406560),
			BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(0.5F).sound(SoundType.SAND)));
	*/
	// Gravel - Vanilla
	public static final DeferredBlock<Block> GRAVEL_COPPER_NUGGET_ORE = DeferredRegistration.registerBlock("gravel_copper_nugget_ore", () -> new GravityOre("gravel_copper_nugget_ore", new ColorRGBA(-8356741),
			BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.5F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_GOLD_NUGGET_ORE = DeferredRegistration.registerBlock("gravel_gold_nugget_ore", () -> new GravityOre("gravel_gold_nugget_ore", new ColorRGBA(-8356741),
			BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.5F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_IRON_NUGGET_ORE = DeferredRegistration.registerBlock("gravel_iron_nugget_ore", () -> new GravityOre("gravel_iron_nugget_ore", new ColorRGBA(-8356741),
			BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.5F).sound(SoundType.GRAVEL)));
	/*
	// Modded
	public static final DeferredBlock<Block> GRAVEL_BAUXITE_NUGGET_ORE = DeferredRegistration.registerBlock("gravel_bauxite_nugget_ore", () -> new GravityOre("gravel_bauxite_nugget_ore", new ColorRGBA(-8356741),
			BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_COBALT_NUGGET_ORE = DeferredRegistration.registerBlock("gravel_cobalt_nugget_ore", () -> new GravityOre("gravel_cobalt_nugget_ore", new ColorRGBA(-8356741),
			BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_IRIDIUM_NUGGET_ORE = DeferredRegistration.registerBlock("gravel_iridium_nugget_ore", () -> new GravityOre("gravel_iridium_nugget_ore", new ColorRGBA(-8356741),
			BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_LEAD_NUGGET_ORE = DeferredRegistration.registerBlock("gravel_lead_nugget_ore", () -> new GravityOre("gravel_lead_nugget_ore", new ColorRGBA(-8356741),
			BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_NICKEL_NUGGET_ORE = DeferredRegistration.registerBlock("gravel_nickel_nugget_ore", () -> new GravityOre("gravel_nickel_nugget_ore", new ColorRGBA(-8356741),
			BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_PLATINUM_NUGGET_ORE = DeferredRegistration.registerBlock("gravel_platinum_nugget_ore", () -> new GravityOre("gravel_platinum_nugget_ore", new ColorRGBA(-8356741),
			BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_SILVER_NUGGET_ORE = DeferredRegistration.registerBlock("gravel_silver_nugget_ore", () -> new GravityOre("gravel_silver_nugget_ore", new ColorRGBA(-8356741),
			BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_TIN_NUGGET_ORE = DeferredRegistration.registerBlock("gravel_tin_nugget_ore", () -> new GravityOre("gravel_tin_nugget_ore", new ColorRGBA(-8356741),
			BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_TUNGSTEN_NUGGET_ORE = DeferredRegistration.registerBlock("gravel_tungsten_nugget_ore", () -> new GravityOre("gravel_tungsten_nugget_ore", new ColorRGBA(-8356741),
			BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_URANIUM_NUGGET_ORE = DeferredRegistration.registerBlock("gravel_uranium_nugget_ore", () -> new GravityOre("gravel_uranium_nugget_ore", new ColorRGBA(-8356741),
			BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	public static final DeferredBlock<Block> GRAVEL_ZINC_NUGGET_ORE = DeferredRegistration.registerBlock("gravel_zinc_nugget_ore", () -> new GravityOre("gravel_zinc_nugget_ore", new ColorRGBA(-8356741),
			BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(0.6F).sound(SoundType.GRAVEL)));
	*/
		
	/**
	 * Solid Blocks
	 */
	
	// Solid
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
	public static final DeferredBlock<Block> STEEL_BLOCK = DeferredRegistration.registerBlock("steel_block", () -> new SolidBlock("steel_block", 5f, 6f));
	public static final DeferredBlock<Block> TIN_BLOCK = DeferredRegistration.registerBlock("tin_block", () -> new SolidBlock("tin_block", 5f, 6f));
	public static final DeferredBlock<Block> TUNGSTEN_BLOCK = DeferredRegistration.registerBlock("tungsten_block", () -> new SolidBlock("tungsten_block", 5f, 6f));
	public static final DeferredBlock<Block> URANIUM_BLOCK = DeferredRegistration.registerBlock("uranium_block", () -> new SolidBlock("uranium_block", 5f, 6f));
	public static final DeferredBlock<Block> ZINC_BLOCK = DeferredRegistration.registerBlock("zinc_block", () -> new SolidBlock("zinc_block", 5f, 6f));
	
	// Raw
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
