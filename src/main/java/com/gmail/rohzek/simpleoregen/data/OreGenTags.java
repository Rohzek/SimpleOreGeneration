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
		
		public static final TagKey<Block> PAXEL_MINEABLE = createTag("mineable/paxel");
		
		private static TagKey<Block> createTag(String name)
		{
			return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Reference.MODID, name));
		}
	}
	
	public static class Items
	{
		// Define tags for items
		public static final TagKey<Item> PLANKS = createTag("planks");
		public static final TagKey<Item> STONES = createTag("stones");
		public static final TagKey<Item> COALS = createTag("materials/coal");
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
		
		public static final TagKey<Item> BAUXITE_NUGGETS = createTag("nuggets/bauxite");
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
		
		public static final TagKey<Item> BAUXITE_PICKAXES = createTag("pickaxes/bauxite");
		public static final TagKey<Item> ALUMINUM_PICKAXES = createTag("pickaxes/aluminum");
		public static final TagKey<Item> ALUMINIUM_PICKAXES = createTag("pickaxes/aluminium");
		public static final TagKey<Item> BRONZE_PICKAXES = createTag("pickaxes/bronze");
		public static final TagKey<Item> COBALT_PICKAXES = createTag("pickaxes/cobalt");
		public static final TagKey<Item> COPPER_PICKAXES = createTag("pickaxes/copper");
		public static final TagKey<Item> IRIDIUM_PICKAXES = createTag("pickaxes/iridium");
		public static final TagKey<Item> LEAD_PICKAXES = createTag("pickaxes/lead");
		public static final TagKey<Item> NICKEL_PICKAXES = createTag("pickaxes/nickel");
		public static final TagKey<Item> PLATINUM_PICKAXES = createTag("pickaxes/platinum");
		public static final TagKey<Item> SILVER_PICKAXES = createTag("pickaxes/silver");
		public static final TagKey<Item> STEEL_PICKAXES = createTag("pickaxes/steel");
		public static final TagKey<Item> TIN_PICKAXES = createTag("pickaxes/tin");
		public static final TagKey<Item> TUNGSTEN_PICKAXES = createTag("pickaxes/tungsten");
		public static final TagKey<Item> URANIUM_PICKAXES = createTag("pickaxes/uranium");
		public static final TagKey<Item> ZINC_PICKAXES = createTag("pickaxes/zinc");
		
		public static final TagKey<Item> BAUXITE_AXES = createTag("axes/bauxite");
		public static final TagKey<Item> ALUMINUM_AXES = createTag("axes/aluminum");
		public static final TagKey<Item> ALUMINIUM_AXES = createTag("axes/aluminium");
		public static final TagKey<Item> BRONZE_AXES = createTag("axes/bronze");
		public static final TagKey<Item> COBALT_AXES = createTag("axes/cobalt");
		public static final TagKey<Item> COPPER_AXES = createTag("axes/copper");
		public static final TagKey<Item> IRIDIUM_AXES = createTag("axes/iridium");
		public static final TagKey<Item> LEAD_AXES = createTag("axes/lead");
		public static final TagKey<Item> NICKEL_AXES = createTag("axes/nickel");
		public static final TagKey<Item> PLATINUM_AXES = createTag("axes/platinum");
		public static final TagKey<Item> SILVER_AXES = createTag("axes/silver");
		public static final TagKey<Item> STEEL_AXES = createTag("axes/steel");
		public static final TagKey<Item> TIN_AXES = createTag("axes/tin");
		public static final TagKey<Item> TUNGSTEN_AXES = createTag("axes/tungsten");
		public static final TagKey<Item> URANIUM_AXES = createTag("axes/uranium");
		public static final TagKey<Item> ZINC_AXES = createTag("axes/zinc");
		
		public static final TagKey<Item> BAUXITE_SHOVELS = createTag("shovels/bauxite");
		public static final TagKey<Item> ALUMINUM_SHOVELS = createTag("shovels/aluminum");
		public static final TagKey<Item> ALUMINIUM_SHOVELS = createTag("shovels/aluminium");
		public static final TagKey<Item> BRONZE_SHOVELS = createTag("shovels/bronze");
		public static final TagKey<Item> COBALT_SHOVELS = createTag("shovels/cobalt");
		public static final TagKey<Item> COPPER_SHOVELS = createTag("shovels/copper");
		public static final TagKey<Item> IRIDIUM_SHOVELS = createTag("shovels/iridium");
		public static final TagKey<Item> LEAD_SHOVELS = createTag("shovels/lead");
		public static final TagKey<Item> NICKEL_SHOVELS = createTag("shovels/nickel");
		public static final TagKey<Item> PLATINUM_SHOVELS = createTag("shovels/platinum");
		public static final TagKey<Item> SILVER_SHOVELS = createTag("shovels/silver");
		public static final TagKey<Item> STEEL_SHOVELS = createTag("shovels/steel");
		public static final TagKey<Item> TIN_SHOVELS = createTag("shovels/tin");
		public static final TagKey<Item> TUNGSTEN_SHOVELS = createTag("shovels/tungsten");
		public static final TagKey<Item> URANIUM_SHOVELS = createTag("shovels/uranium");
		public static final TagKey<Item> ZINC_SHOVELS = createTag("shovels/zinc");
		
		public static final TagKey<Item> BAUXITE_SWORDS = createTag("swords/bauxite");
		public static final TagKey<Item> ALUMINUM_SWORDS = createTag("swords/aluminum");
		public static final TagKey<Item> ALUMINIUM_SWORDS = createTag("swords/aluminium");
		public static final TagKey<Item> BRONZE_SWORDS = createTag("swords/bronze");
		public static final TagKey<Item> COBALT_SWORDS = createTag("swords/cobalt");
		public static final TagKey<Item> COPPER_SWORDS = createTag("swords/copper");
		public static final TagKey<Item> IRIDIUM_SWORDS = createTag("swords/iridium");
		public static final TagKey<Item> LEAD_SWORDS = createTag("swords/lead");
		public static final TagKey<Item> NICKEL_SWORDS = createTag("swords/nickel");
		public static final TagKey<Item> PLATINUM_SWORDS = createTag("swords/platinum");
		public static final TagKey<Item> SILVER_SWORDS = createTag("swords/silver");
		public static final TagKey<Item> STEEL_SWORDS = createTag("swords/steel");
		public static final TagKey<Item> TIN_SWORDS = createTag("swords/tin");
		public static final TagKey<Item> TUNGSTEN_SWORDS = createTag("swords/tungsten");
		public static final TagKey<Item> URANIUM_SWORDS = createTag("swords/uranium");
		public static final TagKey<Item> ZINC_SWORDS = createTag("swords/zinc");
		
		public static final TagKey<Item> BAUXITE_SHIELDS = createTag("shields/bauxite");
		public static final TagKey<Item> ALUMINUM_SHIELDS = createTag("shields/aluminum");
		public static final TagKey<Item> ALUMINIUM_SHIELDS = createTag("shields/aluminium");
		public static final TagKey<Item> BRONZE_SHIELDS = createTag("shields/bronze");
		public static final TagKey<Item> COBALT_SHIELDS = createTag("shields/cobalt");
		public static final TagKey<Item> COPPER_SHIELDS = createTag("shields/copper");
		public static final TagKey<Item> IRIDIUM_SHIELDS = createTag("shields/iridium");
		public static final TagKey<Item> LEAD_SHIELDS = createTag("shields/lead");
		public static final TagKey<Item> NICKEL_SHIELDS = createTag("shields/nickel");
		public static final TagKey<Item> PLATINUM_SHIELDS = createTag("shields/platinum");
		public static final TagKey<Item> SILVER_SHIELDS = createTag("shields/silver");
		public static final TagKey<Item> STEEL_SHIELDS = createTag("shields/steel");
		public static final TagKey<Item> TIN_SHIELDS = createTag("shields/tin");
		public static final TagKey<Item> TUNGSTEN_SHIELDS = createTag("shields/tungsten");
		public static final TagKey<Item> URANIUM_SHIELDS = createTag("shields/uranium");
		public static final TagKey<Item> ZINC_SHIELDS = createTag("shields/zinc");
		
		public static final TagKey<Item> BAUXITE_PAXELS = createTag("paxels/bauxite");
		public static final TagKey<Item> ALUMINUM_PAXELS = createTag("paxels/aluminum");
		public static final TagKey<Item> ALUMINIUM_PAXELS = createTag("paxels/aluminium");
		public static final TagKey<Item> BRONZE_PAXELS = createTag("paxels/bronze");
		public static final TagKey<Item> COBALT_PAXELS = createTag("paxels/cobalt");
		public static final TagKey<Item> COPPER_PAXELS = createTag("paxels/copper");
		public static final TagKey<Item> IRIDIUM_PAXELS = createTag("paxels/iridium");
		public static final TagKey<Item> LEAD_PAXELS = createTag("paxels/lead");
		public static final TagKey<Item> NICKEL_PAXELS = createTag("paxels/nickel");
		public static final TagKey<Item> PLATINUM_PAXELS = createTag("paxels/platinum");
		public static final TagKey<Item> SILVER_PAXELS = createTag("paxels/silver");
		public static final TagKey<Item> STEEL_PAXELS = createTag("paxels/steel");
		public static final TagKey<Item> TIN_PAXELS = createTag("paxels/tin");
		public static final TagKey<Item> TUNGSTEN_PAXELS = createTag("paxels/tungsten");
		public static final TagKey<Item> URANIUM_PAXELS = createTag("paxels/uranium");
		public static final TagKey<Item> ZINC_PAXELS = createTag("paxels/zinc");
		
		public static final TagKey<Item> BAUXITE_HOES = createTag("hoes/bauxite");
		public static final TagKey<Item> ALUMINUM_HOES = createTag("hoes/aluminum");
		public static final TagKey<Item> ALUMINIUM_HOES = createTag("hoes/aluminium");
		public static final TagKey<Item> BRONZE_HOES = createTag("hoes/bronze");
		public static final TagKey<Item> COBALT_HOES = createTag("hoes/cobalt");
		public static final TagKey<Item> COPPER_HOES = createTag("hoes/copper");
		public static final TagKey<Item> IRIDIUM_HOES = createTag("hoes/iridium");
		public static final TagKey<Item> LEAD_HOES = createTag("hoes/lead");
		public static final TagKey<Item> NICKEL_HOES = createTag("hoes/nickel");
		public static final TagKey<Item> PLATINUM_HOES = createTag("hoes/platinum");
		public static final TagKey<Item> SILVER_HOES = createTag("hoes/silver");
		public static final TagKey<Item> STEEL_HOES = createTag("hoes/steel");
		public static final TagKey<Item> TIN_HOES = createTag("hoes/tin");
		public static final TagKey<Item> TUNGSTEN_HOES = createTag("hoes/tungsten");
		public static final TagKey<Item> URANIUM_HOES = createTag("hoes/uranium");
		public static final TagKey<Item> ZINC_HOES = createTag("hoes/zinc");
		
		public static final TagKey<Item> BAUXITE_HELMETS = createTag("helmets/bauxite");
		public static final TagKey<Item> ALUMINUM_HELMETS = createTag("helmets/aluminum");
		public static final TagKey<Item> ALUMINIUM_HELMETS = createTag("helmets/aluminium");
		public static final TagKey<Item> BRONZE_HELMETS = createTag("helmets/bronze");
		public static final TagKey<Item> COBALT_HELMETS = createTag("helmets/cobalt");
		public static final TagKey<Item> COPPER_HELMETS = createTag("helmets/copper");
		public static final TagKey<Item> IRIDIUM_HELMETS = createTag("helmets/iridium");
		public static final TagKey<Item> LEAD_HELMETS = createTag("helmets/lead");
		public static final TagKey<Item> NICKEL_HELMETS = createTag("helmets/nickel");
		public static final TagKey<Item> PLATINUM_HELMETS = createTag("helmets/platinum");
		public static final TagKey<Item> SILVER_HELMETS = createTag("helmets/silver");
		public static final TagKey<Item> STEEL_HELMETS = createTag("helmets/steel");
		public static final TagKey<Item> TIN_HELMETS = createTag("helmets/tin");
		public static final TagKey<Item> TUNGSTEN_HELMETS = createTag("helmets/tungsten");
		public static final TagKey<Item> URANIUM_HELMETS = createTag("helmets/uranium");
		public static final TagKey<Item> ZINC_HELMETS = createTag("helmets/zinc");
		
		public static final TagKey<Item> BAUXITE_CHESTPLATES = createTag("chestplates/bauxite");
		public static final TagKey<Item> ALUMINUM_CHESTPLATES = createTag("chestplates/aluminum");
		public static final TagKey<Item> ALUMINIUM_CHESTPLATES = createTag("chestplates/aluminium");
		public static final TagKey<Item> BRONZE_CHESTPLATES = createTag("chestplates/bronze");
		public static final TagKey<Item> COBALT_CHESTPLATES = createTag("chestplates/cobalt");
		public static final TagKey<Item> COPPER_CHESTPLATES = createTag("chestplates/copper");
		public static final TagKey<Item> IRIDIUM_CHESTPLATES = createTag("chestplates/iridium");
		public static final TagKey<Item> LEAD_CHESTPLATES = createTag("chestplates/lead");
		public static final TagKey<Item> NICKEL_CHESTPLATES = createTag("chestplates/nickel");
		public static final TagKey<Item> PLATINUM_CHESTPLATES = createTag("chestplates/platinum");
		public static final TagKey<Item> SILVER_CHESTPLATES = createTag("chestplates/silver");
		public static final TagKey<Item> STEEL_CHESTPLATES = createTag("chestplates/steel");
		public static final TagKey<Item> TIN_CHESTPLATES = createTag("chestplates/tin");
		public static final TagKey<Item> TUNGSTEN_CHESTPLATES = createTag("chestplates/tungsten");
		public static final TagKey<Item> URANIUM_CHESTPLATES = createTag("chestplates/uranium");
		public static final TagKey<Item> ZINC_CHESTPLATES = createTag("chestplates/zinc");
		
		public static final TagKey<Item> BAUXITE_LEGGINGS = createTag("leggings/bauxite");
		public static final TagKey<Item> ALUMINUM_LEGGINGS = createTag("leggings/aluminum");
		public static final TagKey<Item> ALUMINIUM_LEGGINGS = createTag("leggings/aluminium");
		public static final TagKey<Item> BRONZE_LEGGINGS = createTag("leggings/bronze");
		public static final TagKey<Item> COBALT_LEGGINGS = createTag("leggings/cobalt");
		public static final TagKey<Item> COPPER_LEGGINGS = createTag("leggings/copper");
		public static final TagKey<Item> IRIDIUM_LEGGINGS = createTag("leggings/iridium");
		public static final TagKey<Item> LEAD_LEGGINGS = createTag("leggings/lead");
		public static final TagKey<Item> NICKEL_LEGGINGS = createTag("leggings/nickel");
		public static final TagKey<Item> PLATINUM_LEGGINGS = createTag("leggings/platinum");
		public static final TagKey<Item> SILVER_LEGGINGS = createTag("leggings/silver");
		public static final TagKey<Item> STEEL_LEGGINGS = createTag("leggings/steel");
		public static final TagKey<Item> TIN_LEGGINGS = createTag("leggings/tin");
		public static final TagKey<Item> TUNGSTEN_LEGGINGS = createTag("leggings/tungsten");
		public static final TagKey<Item> URANIUM_LEGGINGS = createTag("leggings/uranium");
		public static final TagKey<Item> ZINC_LEGGINGS = createTag("leggings/zinc");
		
		public static final TagKey<Item> BAUXITE_BOOTS = createTag("boots/bauxite");
		public static final TagKey<Item> ALUMINUM_BOOTS = createTag("boots/aluminum");
		public static final TagKey<Item> ALUMINIUM_BOOTS = createTag("boots/aluminium");
		public static final TagKey<Item> BRONZE_BOOTS = createTag("boots/bronze");
		public static final TagKey<Item> COBALT_BOOTS = createTag("boots/cobalt");
		public static final TagKey<Item> COPPER_BOOTS = createTag("boots/copper");
		public static final TagKey<Item> IRIDIUM_BOOTS = createTag("boots/iridium");
		public static final TagKey<Item> LEAD_BOOTS = createTag("boots/lead");
		public static final TagKey<Item> NICKEL_BOOTS = createTag("boots/nickel");
		public static final TagKey<Item> PLATINUM_BOOTS = createTag("boots/platinum");
		public static final TagKey<Item> SILVER_BOOTS = createTag("boots/silver");
		public static final TagKey<Item> STEEL_BOOTS = createTag("boots/steel");
		public static final TagKey<Item> TIN_BOOTS = createTag("boots/tin");
		public static final TagKey<Item> TUNGSTEN_BOOTS = createTag("boots/tungsten");
		public static final TagKey<Item> URANIUM_BOOTS = createTag("boots/uranium");
		public static final TagKey<Item> ZINC_BOOTS = createTag("boots/zinc");
		
		public static final TagKey<Item> ARMORS = createTag("armors");
		public static final TagKey<Item> TOOLS = createTag("tools");
		
		public static final TagKey<Item> TOOL_HANDLES = createTag("rods/tool_handle");
		public static final TagKey<Item> SMITHING_TEMPLATES = createTag("templates/normal");
		public static final TagKey<Item> NETHERITE_TEMPLATES = createTag("templates/netherite");
					
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
