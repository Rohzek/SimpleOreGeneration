package com.gmail.rohzek.blocks;

import java.util.HashSet;
import java.util.Set;
import com.gmail.rohzek.lib.Reference;
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
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.registry.IForgeRegistry;

@ObjectHolder(Reference.MODID)
public class SGBlocks 
{
	public static Block CHESHIREROSE = new CheshireRose("cheshireRose").setRegistryName("cheshireRose");
	public static ItemBlock CHESHIREROSEITEM = new ItemBlock(CHESHIREROSE);
	
	public static Block BRONZE_BLOCK = new SolidBlock("bronzeBlock");
	public static ItemBlock BRONZE_BLOCK_ITEM = new ItemBlock(BRONZE_BLOCK);
	
	public static void registerRenders()
	{
		registerRender(CHESHIREROSE);
		
		registerRender(BRONZE_BLOCK);
	}
	
	public static void registerOreDict()
	{
		OreDictionary.registerOre("flowerCheshireRose", CHESHIREROSE);
		
		OreDictionary.registerOre("blockBronze", BRONZE_BLOCK);
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
					CHESHIREROSE,
					BRONZE_BLOCK,
			};

			registry.registerAll(blocks);
		}
		
		@SubscribeEvent
		public static void registerItemBlocks(RegistryEvent.Register<Item> event) 
		{
			final ItemBlock[] items = 
			{
				CHESHIREROSEITEM,
				BRONZE_BLOCK_ITEM,
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
