package com.gmail.rohzek.simpleoregen.data;

import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;

public class OreGenTags 
{
	public static class Blocks
	{
		// Define tags for blocks
		public static final TagKey<Block> BAUXITE_ORES = createTag("ores_bauxite");
		public static final TagKey<Block> ALUMINUM_ORES = createTag("_bauxite");
		public static final TagKey<Block> ALUMINIUM_ORES = createTag("_bauxite");
		
		public static final TagKey<Block> BRONZE_BLOCKS = createTag("bronze_blocks");
		public static final TagKey<Block> STEEL_BLOCKS = createTag("steel_blocks");
		
		private static TagKey<Block> createTag(String name)
		{
			//Tags.Items.STORAGE_BLOCKS_IRON
			/*
			Tags.Blocks.ORES_LAPIS
			public static final TagKey<Block> ORE_RATES_SPARSE = tag("ore_rates/sparse");
	        public static final TagKey<Block> ORES = tag("ores");
	        public static final TagKey<Block> ORES_COAL = tag("ores/coal");
	        public static final TagKey<Block> ORES_COPPER = tag("ores/copper");
	        public static final TagKey<Block> ORES_DIAMOND = tag("ores/diamond");
	        public static final TagKey<Block> ORES_EMERALD = tag("ores/emerald");
	        public static final TagKey<Block> ORES_GOLD = tag("ores/gold");
	        public static final TagKey<Block> ORES_IRON = tag("ores/iron");
	        public static final TagKey<Block> ORES_LAPIS = tag("ores/lapis");
	        public static final TagKey<Block> ORES_NETHERITE_SCRAP = tag("ores/netherite_scrap");
	        public static final TagKey<Block> ORES_QUARTZ = tag("ores/quartz");
	        public static final TagKey<Block> ORES_REDSTONE = tag("ores/redstone");
			
			public static final TagKey<Item> RAW_MATERIALS = tag("raw_materials");
	        public static final TagKey<Item> RAW_MATERIALS_COPPER = tag("raw_materials/copper");
	        public static final TagKey<Item> RAW_MATERIALS_GOLD = tag("raw_materials/gold");
	        public static final TagKey<Item> RAW_MATERIALS_IRON = tag("raw_materials/iron");*/
			//public static final TagKey<Item> GEMS_DIAMOND = tag("gems/diamond");
			return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Reference.MODID, name));
		}
	}
	
	public static class Items
	{
		// Define tags for items
		public static final TagKey<Item> COALS = createTag("coals");
		public static final TagKey<Item> DIAMONDS = createTag("diamonds");
		public static final TagKey<Item> RUBIES = createTag("rubies");
		public static final TagKey<Item> SAPPHIRES = createTag("sapphires");
		
		public static final TagKey<Item> RAW_BAUXITES = createTag("raw_bauxites");
		public static final TagKey<Item> RAW_ALUMINUMS = createTag("raw_bauxites");
		public static final TagKey<Item> RAW_ALUMINIUMS = createTag("raw_bauxites");
		public static final TagKey<Item> RAW_COBALTS = createTag("raw_cobalts");
		public static final TagKey<Item> RAW_IRIDIUMS = createTag("raw_iridiums");
		public static final TagKey<Item> RAW_LEADS = createTag("raw_leads");
		public static final TagKey<Item> RAW_NICKELS = createTag("raw_nickels");
		public static final TagKey<Item> RAW_PLATINUMS = createTag("raw_platinums");
		public static final TagKey<Item> RAW_SILVERS = createTag("raw_silvers");
		public static final TagKey<Item> RAW_TINS = createTag("raw_tins");
		public static final TagKey<Item> RAW_TUNGSTENS = createTag("raw_tungstens");
		public static final TagKey<Item> RAW_URANIUMS = createTag("raw_uraniums");
		public static final TagKey<Item> RAW_ZINCS = createTag("raw_zincs");
		
		public static final TagKey<Item> BAUXITE_INGOTS = createTag("bauxite_ingots");
		public static final TagKey<Item> ALUMINUM_INGOTS = createTag("bauxite_ingots");
		public static final TagKey<Item> ALUMINIUM_INGOTS = createTag("bauxite_ingots");
		public static final TagKey<Item> BRONZE_INGOTS = createTag("bronze_ingots");
		public static final TagKey<Item> COBALT_INGOTS = createTag("cobalt_ingots");
		public static final TagKey<Item> IRIDIUM_INGOTS = createTag("iridium_ingots");
		public static final TagKey<Item> LEAD_INGOTS = createTag("lead_ingots");
		public static final TagKey<Item> NICKEL_INGOTS = createTag("nickel_ingots");
		public static final TagKey<Item> PLATINUM_INGOTS = createTag("platinum_ingots");
		public static final TagKey<Item> SILVER_INGOTS = createTag("silver_ingots");
		public static final TagKey<Item> STEEL_INGOTS = createTag("steel_ingots");
		public static final TagKey<Item> TIN_INGOTS = createTag("tin_ingots");
		public static final TagKey<Item> TUNGSTEN_INGOTS = createTag("tungsten_ingots");
		public static final TagKey<Item> URANIUM_INGOTS = createTag("uranium_ingots");
		public static final TagKey<Item> ZINC_INGOTS = createTag("zinc_ingots");
		
		public static final TagKey<Item> BAUXITE_NUGGETS = createTag("bauxite_nuggets");
		public static final TagKey<Item> ALUMINUM_NUGGETS = createTag("bauxite_nuggets");
		public static final TagKey<Item> ALUMINIUM_NUGGETS = createTag("bauxite_nuggets");
		public static final TagKey<Item> BRONZE_NUGGETS = createTag("bronze_nuggets");
		public static final TagKey<Item> COBALT_NUGGETS = createTag("cobalt_nuggets");
		public static final TagKey<Item> COPPER_NUGGETS = createTag("copper_nuggets");
		public static final TagKey<Item> IRIDIUM_NUGGETS = createTag("iridium_nuggets");
		public static final TagKey<Item> LEAD_NUGGETS = createTag("lead_nuggets");
		public static final TagKey<Item> NICKEL_NUGGETS = createTag("nickel_nuggets");
		public static final TagKey<Item> PLATINUM_NUGGETS = createTag("platinum_nuggets");
		public static final TagKey<Item> SILVER_NUGGETS = createTag("silver_nuggets");
		public static final TagKey<Item> STEEL_NUGGETS = createTag("steel_nuggets");
		public static final TagKey<Item> TIN_NUGGETS = createTag("tin_nuggets");
		public static final TagKey<Item> TUNGSTEN_NUGGETS = createTag("tungsten_nuggets");
		public static final TagKey<Item> URANIUM_NUGGETS = createTag("uranium_nuggets");
		public static final TagKey<Item> ZINC_NUGGETS = createTag("zinc_nuggets");
		
		public static final TagKey<Item> TOOL_HANDLES = createTag("tool_handles");
					
		private static TagKey<Item> createTag(String name)
		{
			return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Reference.MODID, name));
		}
	}
	
	public static class Biomes
	{
		// Define tags for biomes
		public static final TagKey<Biome> CHESHIREROSE_BIOMES = createTag("cheshirerose_biomes");
		public static final TagKey<Biome> ROSE_BIOMES = createTag("rose_biomes");
		
		public static final TagKey<Biome> ALL_BIOMES = createTag("all_biomes");
		
		private static TagKey<Biome> createTag(String name)
		{
			return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Reference.MODID, name));
		}
	}
}
