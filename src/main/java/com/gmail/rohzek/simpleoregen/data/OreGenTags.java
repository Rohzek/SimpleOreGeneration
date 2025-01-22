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

public class OreGenTags 
{
	public static class Blocks
	{
		// Define tags for blocks
		public static final TagKey<Block> BAUXITE_ORES = createTag("ores/bauxite");
		public static final TagKey<Block> ALUMINUM_ORES = createTag("ores/aluminum");
		public static final TagKey<Block> ALUMINIUM_ORES = createTag("ores/aluminium");
		public static final TagKey<Block> COBALT_ORES = createTag("ores/cobalt");
		public static final TagKey<Block> IRIDIUM_ORES = createTag("ores/iridium");
		public static final TagKey<Block> LEAD_ORES = createTag("ores/lead");
		public static final TagKey<Block> NICKEL_ORES = createTag("ores/nickel");
		public static final TagKey<Block> PLATINUM_ORES = createTag("ores/platinum");
		public static final TagKey<Block> RUBY_ORES = createTag("ores/ruby");
		public static final TagKey<Block> SAPPHIRE_ORES = createTag("ores/sapphire");
		public static final TagKey<Block> SILVER_ORES = createTag("ores/silver");
		public static final TagKey<Block> TIN_ORES = createTag("ores/tin");
		public static final TagKey<Block> TUNGSTEN_ORES = createTag("ores/tungsten");
		public static final TagKey<Block> URANIUM_ORES = createTag("ores/uranium");
		public static final TagKey<Block> ZINC_ORES = createTag("ores/zinc");
		public static final TagKey<Block> CHAOS_ORES = createTag("ores/chaos");
		public static final TagKey<Block> RAINBOW_ORES = createTag("ores/rainbow");
		public static final TagKey<Block> RANDOM_ORES = createTag("ores/random");
		
		public static final TagKey<Block> BAUXITE_BLOCKS = createTag("storage_blocks/bauxite");
		public static final TagKey<Block> ALUMINUM_BLOCKS = createTag("storage_blocks/aluminum");
		public static final TagKey<Block> ALUMINIUM_BLOCKS = createTag("storage_blocks/aluminium");
		public static final TagKey<Block> COBALT_BLOCKS = createTag("storage_blocks/cobalt");
		public static final TagKey<Block> IRIDIUM_BLOCKS = createTag("storage_blocks/iridium");
		public static final TagKey<Block> LEAD_BLOCKS = createTag("storage_blocks/lead");
		public static final TagKey<Block> NICKEL_BLOCKS = createTag("storage_blocks/nickel");
		public static final TagKey<Block> PLATINUM_BLOCKS = createTag("storage_blocks/platinum");
		public static final TagKey<Block> RUBY_BLOCKS = createTag("storage_blocks/ruby");
		public static final TagKey<Block> SAPPHIRE_BLOCKS = createTag("storage_blocks/sapphire");
		public static final TagKey<Block> SILVER_BLOCKS = createTag("storage_blocks/silver");
		public static final TagKey<Block> STEEL_BLOCKS = createTag("storage_blocks/steel");
		public static final TagKey<Block> TIN_BLOCKS = createTag("storage_blocks/tin");
		public static final TagKey<Block> TUNGSTEN_BLOCKS = createTag("storage_blocks/tungsten");
		public static final TagKey<Block> URANIUM_BLOCKS = createTag("storage_blocks/uranium");
		public static final TagKey<Block> ZINC_BLOCKS = createTag("storage_blocks/zinc");
		
		public static final TagKey<Block> BAUXITE_RAW_BLOCKS = createTag("storage_blocks/raw_bauxite");
		public static final TagKey<Block> ALUMINUM_RAW_BLOCKS = createTag("storage_blocks/raw_aluminum");
		public static final TagKey<Block> ALUMINIUM_RAW_BLOCKS = createTag("storage_blocks/raw_aluminium");
		public static final TagKey<Block> COBALT_RAW_BLOCKS = createTag("storage_blocks/raw_cobalt");
		public static final TagKey<Block> IRIDIUM_RAW_BLOCKS = createTag("storage_blocks/raw_iridium");
		public static final TagKey<Block> LEAD_RAW_BLOCKS = createTag("storage_blocks/raw_lead");
		public static final TagKey<Block> NICKEL_RAW_BLOCKS = createTag("storage_blocks/raw_nickel");
		public static final TagKey<Block> PLATINUM_RAW_BLOCKS = createTag("storage_blocks/raw_platinum");
		public static final TagKey<Block> SILVER_RAW_BLOCKS = createTag("storage_blocks/raw_silver");
		public static final TagKey<Block> TIN_RAW_BLOCKS = createTag("storage_blocks/raw_tin");
		public static final TagKey<Block> TUNGSTEN_RAW_BLOCKS = createTag("storage_blocks/raw_tungsten");
		public static final TagKey<Block> URANIUM_RAW_BLOCKS = createTag("storage_blocks/raw_uranium");
		public static final TagKey<Block> ZINC_RAW_BLOCKS = createTag("storage_blocks/raw_zinc");
		
		public static final TagKey<Block> FLOWERS = createTag("flowers");
		
		private static TagKey<Block> createTag(String name)
		{
			return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Reference.MODID, name));
		}
	}
	
	public static class Items
	{
		// Define tags for items
		public static final TagKey<Item> COALS = createTag("materials/coal");
		public static final TagKey<Item> DIAMONDS = createTag("gems/diamond");
		public static final TagKey<Item> RUBIES = createTag("gems/ruby");
		public static final TagKey<Item> SAPPHIRES = createTag("gems/sapphire");
		
		public static final TagKey<Item> RAW_BAUXITES = createTag("raw_materials/bauxite");
		public static final TagKey<Item> RAW_ALUMINUMS = createTag("raw_materials/aluminum");
		public static final TagKey<Item> RAW_ALUMINIUMS = createTag("raw_materials/aluminium");
		public static final TagKey<Item> RAW_COBALTS = createTag("raw_materials/cobalt");
		public static final TagKey<Item> RAW_IRIDIUMS = createTag("raw_materials/iridium");
		public static final TagKey<Item> RAW_LEADS = createTag("raw_materials/lead");
		public static final TagKey<Item> RAW_NICKELS = createTag("raw_materials/nickel");
		public static final TagKey<Item> RAW_PLATINUMS = createTag("raw_materials/platinum");
		public static final TagKey<Item> RAW_SILVERS = createTag("raw_materials/silver");
		public static final TagKey<Item> RAW_TINS = createTag("raw_materials/tin");
		public static final TagKey<Item> RAW_TUNGSTENS = createTag("raw_materials/tungsten");
		public static final TagKey<Item> RAW_URANIUMS = createTag("raw_materials/uranium");
		public static final TagKey<Item> RAW_ZINCS = createTag("raw_materials/zinc");
		
		public static final TagKey<Item> BAUXITE_INGOTS = createTag("ingots/bauxite");
		public static final TagKey<Item> ALUMINUM_INGOTS = createTag("ingots/aluminum");
		public static final TagKey<Item> ALUMINIUM_INGOTS = createTag("ingots/aluminium");
		public static final TagKey<Item> BRONZE_INGOTS = createTag("ingots/bronze");
		public static final TagKey<Item> COBALT_INGOTS = createTag("ingots/cobalt");
		public static final TagKey<Item> IRIDIUM_INGOTS = createTag("ingots/iridium");
		public static final TagKey<Item> LEAD_INGOTS = createTag("ingots/lead");
		public static final TagKey<Item> NICKEL_INGOTS = createTag("ingots/nickel");
		public static final TagKey<Item> PLATINUM_INGOTS = createTag("ingots/platinum");
		public static final TagKey<Item> SILVER_INGOTS = createTag("ingots/silver");
		public static final TagKey<Item> STEEL_INGOTS = createTag("ingots/steel");
		public static final TagKey<Item> TIN_INGOTS = createTag("ingots/tin");
		public static final TagKey<Item> TUNGSTEN_INGOTS = createTag("ingots/tungsten");
		public static final TagKey<Item> URANIUM_INGOTS = createTag("ingots/uranium");
		public static final TagKey<Item> ZINC_INGOTS = createTag("ingots/zinc");
		
		public static final TagKey<Item> BAUXITE_NUGGETS = createTag("nuggets/bauxite/");
		public static final TagKey<Item> ALUMINUM_NUGGETS = createTag("nuggets/aluminum");
		public static final TagKey<Item> ALUMINIUM_NUGGETS = createTag("nuggets/aluminium");
		public static final TagKey<Item> BRONZE_NUGGETS = createTag("nuggets/bronze");
		public static final TagKey<Item> COBALT_NUGGETS = createTag("nuggets/cobalt");
		public static final TagKey<Item> COPPER_NUGGETS = createTag("nuggets/copper");
		public static final TagKey<Item> IRIDIUM_NUGGETS = createTag("nuggets/iridium");
		public static final TagKey<Item> LEAD_NUGGETS = createTag("nuggets/lead");
		public static final TagKey<Item> NICKEL_NUGGETS = createTag("nuggets/nickel");
		public static final TagKey<Item> PLATINUM_NUGGETS = createTag("nuggets/platinum");
		public static final TagKey<Item> SILVER_NUGGETS = createTag("nuggets/silver");
		public static final TagKey<Item> STEEL_NUGGETS = createTag("nuggets/steel");
		public static final TagKey<Item> TIN_NUGGETS = createTag("nuggets/tin");
		public static final TagKey<Item> TUNGSTEN_NUGGETS = createTag("nuggets/tungsten");
		public static final TagKey<Item> URANIUM_NUGGETS = createTag("nuggets/uranium");
		public static final TagKey<Item> ZINC_NUGGETS = createTag("nuggets/zinc");
		
		public static final TagKey<Item> TOOL_HANDLES = createTag("rods/tool_handle");
					
		private static TagKey<Item> createTag(String name)
		{
			return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Reference.MODID, name));
		}
	}
	
	public static class Biomes
	{
		// Define tags for biomes
		public static final TagKey<Biome> CHESHIREROSE_BIOMES = createTag("biomes/cheshirerose");
		public static final TagKey<Biome> ROSE_BIOMES = createTag("biomes/rose_biomes");
		
		public static final TagKey<Biome> ALL_BIOMES = createTag("biomes/all");
		
		private static TagKey<Biome> createTag(String name)
		{
			return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Reference.MODID, name));
		}
	}
}
