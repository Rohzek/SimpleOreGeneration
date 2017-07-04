package com.gmail.rohzek.blocks;

import java.util.HashSet;
import java.util.Set;

import com.gmail.rohzek.lib.Reference;
import com.gmail.rohzek.util.LogHelper;
import com.gmail.rohzek.util.json.JsonLoadICBlocks;
import com.gmail.rohzek.util.json.JsonLoaderIEBlocks;
import com.gmail.rohzek.util.json.JsonNeutralModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.common.registry.IForgeRegistry;
import net.minecraftforge.oredict.OreDictionary;

@ObjectHolder(Reference.MODID)
public class SGOres
{
	// Surface Ores
	public static Block SURFACE_BAUXITE_ORE = new SurfaceOreBlock("surfaceBauxiteOre");
	public static Block SURFACE_COPPER_ORE = new SurfaceOreBlock("surfaceCopperOre");
	public static Block SURFACE_LEAD_ORE = new SurfaceOreBlock("surfaceLeadOre");
	public static Block SURFACE_NICKEL_ORE = new SurfaceOreBlock("surfaceNickelOre");
	public static Block SURFACE_SILVER_ORE = new SurfaceOreBlock("surfaceSilverOre");
	public static Block SURFACE_TIN_ORE = new SurfaceOreBlock("surfaceTinOre");
	public static Block SURFACE_URANIUM_ORE = new SurfaceOreBlock("surfaceUraniumOre");
	
	// Nether Ores
	public static Block NETHER_BAUXITE_ORE = new NetherOreBlock("netherBauxiteOre");
	public static Block NETHER_COAL_ORE = new NetherOreBlock("netherCoalOre");
	public static Block NETHER_COPPER_ORE = new NetherOreBlock("netherCopperOre");
	public static Block NETHER_DIAMOND_ORE = new NetherOreBlock("netherDiamondOre");
	public static Block NETHER_EMERALD_ORE = new NetherOreBlock("netherEmeraldOre");
	public static Block NETHER_IRON_ORE = new NetherOreBlock("netherIronOre");
	public static Block NETHER_GOLD_ORE = new NetherOreBlock("netherGoldOre");
	public static Block NETHER_LAPIS_ORE = new NetherOreBlock("netherLapisOre");
	public static Block NETHER_LEAD_ORE = new NetherOreBlock("netherLeadOre");
	public static Block NETHER_NICKEL_ORE = new NetherOreBlock("netherNickelOre");
	public static Block NETHER_QUARTZ_ORE = new NetherOreBlock("netherQuartzOre");
	public static Block NETHER_REDSTONE_ORE = new NetherOreBlock("netherRedstoneOre");
	public static Block NETHER_SILVER_ORE = new NetherOreBlock("netherSilverOre");
	public static Block NETHER_TIN_ORE = new NetherOreBlock("netherTinOre");
	public static Block NETHER_URANIUM_ORE = new NetherOreBlock("netherUraniumOre");
	
	// End Ores
	public static Block END_BAUXITE_ORE = new EndOreBlock("endBauxiteOre");
	public static Block END_COAL_ORE = new EndOreBlock("endCoalOre");
	public static Block END_COPPER_ORE = new EndOreBlock("endCopperOre");
	public static Block END_DIAMOND_ORE = new EndOreBlock("endDiamondOre");
	public static Block END_EMERALD_ORE = new EndOreBlock("endEmeraldOre");
	public static Block END_IRON_ORE = new EndOreBlock("endIronOre");
	public static Block END_GOLD_ORE = new EndOreBlock("endGoldOre");
	public static Block END_LAPIS_ORE = new EndOreBlock("endLapisOre");
	public static Block END_LEAD_ORE = new EndOreBlock("endLeadOre");
	public static Block END_NICKEL_ORE = new EndOreBlock("endNickelOre");
	public static Block END_REDSTONE_ORE = new EndOreBlock("endRedstoneOre");
	public static Block END_SILVER_ORE = new EndOreBlock("endSilverOre");
	public static Block END_TIN_ORE = new EndOreBlock("endTinOre");
	public static Block END_URANIUM_ORE = new EndOreBlock("endUraniumOre");
	
	// Surface Ore Items
	public static ItemBlock SURFACE_BAUXITE_ORE_ITEM = new ItemBlock(SURFACE_BAUXITE_ORE);
	public static ItemBlock SURFACE_COPPER_ORE_ITEM = new ItemBlock(SURFACE_COPPER_ORE);
	public static ItemBlock SURFACE_LEAD_ORE_ITEM = new ItemBlock(SURFACE_LEAD_ORE);
	public static ItemBlock SURFACE_NICKEL_ORE_ITEM = new ItemBlock(SURFACE_NICKEL_ORE);
	public static ItemBlock SURFACE_SILVER_ORE_ITEM = new ItemBlock(SURFACE_SILVER_ORE);
	public static ItemBlock SURFACE_TIN_ORE_ITEM = new ItemBlock(SURFACE_TIN_ORE);
	public static ItemBlock SURFACE_URANIUM_ORE_ITEM = new ItemBlock(SURFACE_URANIUM_ORE);
	
	// Nether Ore Items 
	public static ItemBlock NETHER_BAUXITE_ORE_ITEM = new ItemBlock(NETHER_BAUXITE_ORE);
	public static ItemBlock NETHER_COAL_ORE_ITEM = new ItemBlock(NETHER_COAL_ORE);
	public static ItemBlock NETHER_COPPER_ORE_ITEM = new ItemBlock(NETHER_COPPER_ORE);
	public static ItemBlock NETHER_DIAMOND_ORE_ITEM = new ItemBlock(NETHER_DIAMOND_ORE);
	public static ItemBlock NETHER_EMERALD_ORE_ITEM = new ItemBlock(NETHER_EMERALD_ORE);
	public static ItemBlock NETHER_IRON_ORE_ITEM = new ItemBlock(NETHER_IRON_ORE);
	public static ItemBlock NETHER_GOLD_ORE_ITEM = new ItemBlock(NETHER_GOLD_ORE);
	public static ItemBlock NETHER_LAPIS_ORE_ITEM = new ItemBlock(NETHER_LAPIS_ORE);
	public static ItemBlock NETHER_LEAD_ORE_ITEM = new ItemBlock(NETHER_LEAD_ORE);
	public static ItemBlock NETHER_NICKEL_ORE_ITEM = new ItemBlock(NETHER_NICKEL_ORE);
	public static ItemBlock NETHER_QUARTZ_ORE_ITEM = new ItemBlock(NETHER_QUARTZ_ORE);
	public static ItemBlock NETHER_REDSTONE_ORE_ITEM = new ItemBlock(NETHER_REDSTONE_ORE);
	public static ItemBlock NETHER_SILVER_ORE_ITEM = new ItemBlock(NETHER_SILVER_ORE);
	public static ItemBlock NETHER_TIN_ORE_ITEM = new ItemBlock(NETHER_TIN_ORE);
	public static ItemBlock NETHER_URANIUM_ORE_ITEM = new ItemBlock(NETHER_URANIUM_ORE);
	
	// End Ore Items
	public static ItemBlock END_BAUXITE_ORE_ITEM = new ItemBlock(END_BAUXITE_ORE);
	public static ItemBlock END_COAL_ORE_ITEM = new ItemBlock(END_COAL_ORE);
	public static ItemBlock END_COPPER_ORE_ITEM = new ItemBlock(END_COPPER_ORE);
	public static ItemBlock END_DIAMOND_ORE_ITEM = new ItemBlock(END_DIAMOND_ORE);
	public static ItemBlock END_EMERALD_ORE_ITEM = new ItemBlock(END_EMERALD_ORE);
	public static ItemBlock END_IRON_ORE_ITEM = new ItemBlock(END_IRON_ORE);
	public static ItemBlock END_GOLD_ORE_ITEM = new ItemBlock(END_GOLD_ORE);
	public static ItemBlock END_LAPIS_ORE_ITEM = new ItemBlock(END_LAPIS_ORE);
	public static ItemBlock END_LEAD_ORE_ITEM = new ItemBlock(END_LEAD_ORE);
	public static ItemBlock END_NICKEL_ORE_ITEM = new ItemBlock(END_NICKEL_ORE);
	public static ItemBlock END_REDSTONE_ORE_ITEM = new ItemBlock(END_REDSTONE_ORE);
	public static ItemBlock END_SILVER_ORE_ITEM = new ItemBlock(END_SILVER_ORE);
	public static ItemBlock END_TIN_ORE_ITEM = new ItemBlock(END_TIN_ORE);
	public static ItemBlock END_URANIUM_ORE_ITEM = new ItemBlock(END_URANIUM_ORE);
	
	public static void registerRenders()
	{
		registerRender(SURFACE_BAUXITE_ORE);
		registerRender(SURFACE_COPPER_ORE);
		registerRender(SURFACE_LEAD_ORE);
		registerRender(SURFACE_NICKEL_ORE);
		registerRender(SURFACE_SILVER_ORE);
		registerRender(SURFACE_TIN_ORE);
		registerRender(SURFACE_URANIUM_ORE);
		registerRender(NETHER_BAUXITE_ORE);
		registerRender(NETHER_COAL_ORE);
		registerRender(NETHER_COPPER_ORE);
		registerRender(NETHER_DIAMOND_ORE);
		registerRender(NETHER_EMERALD_ORE);
		registerRender(NETHER_IRON_ORE);
		registerRender(NETHER_GOLD_ORE);
		registerRender(NETHER_LAPIS_ORE);
		registerRender(NETHER_LEAD_ORE);
		registerRender(NETHER_NICKEL_ORE);
		registerRender(NETHER_QUARTZ_ORE);
		registerRender(NETHER_REDSTONE_ORE);
		registerRender(NETHER_SILVER_ORE);
		registerRender(NETHER_TIN_ORE);
		registerRender(NETHER_URANIUM_ORE);
		registerRender(END_BAUXITE_ORE);
		registerRender(END_COAL_ORE);
		registerRender(END_COPPER_ORE);
		registerRender(END_DIAMOND_ORE);
		registerRender(END_EMERALD_ORE);
		registerRender(END_IRON_ORE);
		registerRender(END_GOLD_ORE);
		registerRender(END_LAPIS_ORE);
		registerRender(END_LEAD_ORE);
		registerRender(END_NICKEL_ORE);
		registerRender(END_REDSTONE_ORE);
		registerRender(END_SILVER_ORE);
		registerRender(END_TIN_ORE);
		registerRender(END_URANIUM_ORE);
		
		registerOreDict();
	}
	
	public static void registerOreDict()
	{
		OreDictionary.registerOre("oreAluminum", SURFACE_BAUXITE_ORE);
		OreDictionary.registerOre("oreCopper", SURFACE_COPPER_ORE);
		OreDictionary.registerOre("oreLead", SURFACE_LEAD_ORE);
		OreDictionary.registerOre("oreNickel", SURFACE_NICKEL_ORE);
		OreDictionary.registerOre("oreSilver", SURFACE_SILVER_ORE);
		OreDictionary.registerOre("oreTin", SURFACE_TIN_ORE);
		OreDictionary.registerOre("oreUranium", SURFACE_URANIUM_ORE);
		OreDictionary.registerOre("oreAluminum", NETHER_BAUXITE_ORE);
		OreDictionary.registerOre("oreCoal", NETHER_COAL_ORE);
		OreDictionary.registerOre("oreCopper", NETHER_COPPER_ORE);
		OreDictionary.registerOre("oreDiamond", NETHER_DIAMOND_ORE);
		OreDictionary.registerOre("oreEmerald", NETHER_EMERALD_ORE);
		OreDictionary.registerOre("oreIron", NETHER_IRON_ORE);
		OreDictionary.registerOre("oreGold", NETHER_GOLD_ORE);
		OreDictionary.registerOre("oreLapis", NETHER_LAPIS_ORE);
		OreDictionary.registerOre("oreLead", NETHER_LEAD_ORE);
		OreDictionary.registerOre("oreNickel", NETHER_NICKEL_ORE);
		OreDictionary.registerOre("oreQuartz", NETHER_QUARTZ_ORE);
		OreDictionary.registerOre("oreRedstone", NETHER_REDSTONE_ORE);
		OreDictionary.registerOre("oreSilver", NETHER_SILVER_ORE);
		OreDictionary.registerOre("oreTin", NETHER_TIN_ORE);
		OreDictionary.registerOre("oreUranium", NETHER_URANIUM_ORE);
		OreDictionary.registerOre("oreAluminum", END_BAUXITE_ORE);
		OreDictionary.registerOre("oreCoal", END_COAL_ORE);
		OreDictionary.registerOre("oreCopper", END_COPPER_ORE);
		OreDictionary.registerOre("oreDiamond", END_DIAMOND_ORE);
		OreDictionary.registerOre("oreEmerald", END_EMERALD_ORE);
		OreDictionary.registerOre("oreIron", END_IRON_ORE);
		OreDictionary.registerOre("oreGold", END_GOLD_ORE);
		OreDictionary.registerOre("oreLapis", END_LAPIS_ORE);
		OreDictionary.registerOre("oreLead", END_LEAD_ORE);
		OreDictionary.registerOre("oreNickel", END_NICKEL_ORE);
		OreDictionary.registerOre("oreRedstone", END_REDSTONE_ORE);
		OreDictionary.registerOre("oreSilver", END_SILVER_ORE);
		OreDictionary.registerOre("oreTin", END_TIN_ORE);
		OreDictionary.registerOre("oreUranium", END_URANIUM_ORE);
	}
	
	public static void registerRender(Block block)
	{	
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler 
	{
		public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<ItemBlock>();

		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) 
		{
			final IForgeRegistry<Block> registry = event.getRegistry();

			final Block[] blocks = 
			{
					SURFACE_BAUXITE_ORE,
					SURFACE_COPPER_ORE,
					SURFACE_LEAD_ORE,
					SURFACE_NICKEL_ORE,
					SURFACE_SILVER_ORE,
					SURFACE_TIN_ORE,
					SURFACE_URANIUM_ORE,
					NETHER_BAUXITE_ORE,
					NETHER_COAL_ORE,
					NETHER_COPPER_ORE,
					NETHER_DIAMOND_ORE,
					NETHER_EMERALD_ORE,
					NETHER_IRON_ORE,
					NETHER_GOLD_ORE,
					NETHER_LAPIS_ORE,
					NETHER_LEAD_ORE,
					NETHER_NICKEL_ORE,
					NETHER_QUARTZ_ORE,
					NETHER_REDSTONE_ORE,
					NETHER_SILVER_ORE,
					NETHER_TIN_ORE,
					NETHER_URANIUM_ORE,
					END_BAUXITE_ORE,
					END_COAL_ORE,
					END_COPPER_ORE,
					END_DIAMOND_ORE,
					END_EMERALD_ORE,
					END_IRON_ORE,
					END_GOLD_ORE,
					END_LAPIS_ORE,
					END_LEAD_ORE,
					END_NICKEL_ORE,
					END_REDSTONE_ORE,
					END_SILVER_ORE,
					END_TIN_ORE,
					END_URANIUM_ORE,
			};

			registry.registerAll(blocks);
		}
		
		@SubscribeEvent
		public static void registerItemBlocks(RegistryEvent.Register<Item> event) 
		{
			final ItemBlock[] items = 
			{
					SURFACE_BAUXITE_ORE_ITEM,
					SURFACE_COPPER_ORE_ITEM,
					SURFACE_LEAD_ORE_ITEM,
					SURFACE_NICKEL_ORE_ITEM,
					SURFACE_SILVER_ORE_ITEM,
					SURFACE_TIN_ORE_ITEM,
					SURFACE_URANIUM_ORE_ITEM,
					NETHER_BAUXITE_ORE_ITEM,
					NETHER_COAL_ORE_ITEM,
					NETHER_COPPER_ORE_ITEM,
					NETHER_DIAMOND_ORE_ITEM,
					NETHER_EMERALD_ORE_ITEM,
					NETHER_IRON_ORE_ITEM,
					NETHER_GOLD_ORE_ITEM,
					NETHER_LAPIS_ORE_ITEM,
					NETHER_LEAD_ORE_ITEM,
					NETHER_NICKEL_ORE_ITEM,
					NETHER_QUARTZ_ORE_ITEM,
					NETHER_REDSTONE_ORE_ITEM,
					NETHER_SILVER_ORE_ITEM,
					NETHER_TIN_ORE_ITEM,
					NETHER_URANIUM_ORE_ITEM,
					END_BAUXITE_ORE_ITEM,
					END_COAL_ORE_ITEM,
					END_COPPER_ORE_ITEM,
					END_DIAMOND_ORE_ITEM,
					END_EMERALD_ORE_ITEM,
					END_IRON_ORE_ITEM,
					END_GOLD_ORE_ITEM,
					END_LAPIS_ORE_ITEM,
					END_LEAD_ORE_ITEM,
					END_NICKEL_ORE_ITEM,
					END_REDSTONE_ORE_ITEM,
					END_SILVER_ORE_ITEM,
					END_TIN_ORE_ITEM,
					END_URANIUM_ORE_ITEM,
			};

			final IForgeRegistry<Item> registry = event.getRegistry();

			for (final ItemBlock item : items) 
			{
				registry.register(item.setRegistryName(item.getBlock().getRegistryName()));
				ITEM_BLOCKS.add(item);
			}
		}
	}

	public static void registerTileEntities(){}

	private static void registerTileEntity(Class<? extends TileEntity> tileEntityClass, String name) 
	{
		GameRegistry.registerTileEntity(tileEntityClass, Reference.RESOURCEID + name);
	}

	private static void registerTileEntity(Class<? extends TileEntity> tileEntityClass, String name, String legacyName) 
	{
		GameRegistry.registerTileEntityWithAlternatives(tileEntityClass, Reference.RESOURCEID + name, Reference.RESOURCEID + legacyName);
	}
}