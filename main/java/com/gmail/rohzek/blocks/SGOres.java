package com.gmail.rohzek.blocks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(Reference.MODID)
public class SGOres
{	
	public static SurfaceOreBlock[] surfaceOres = 
	{
		new SurfaceOreBlock("surfaceAluminumOre"),
		new SurfaceOreBlock("surfaceArditeOre"),
		new SurfaceOreBlock("surfaceCertusQuartzOre"),
		new SurfaceOreBlock("surfaceChargedCertusQuartzOre"),
		new SurfaceOreBlock("surfaceCobaltOre"),
		new SurfaceOreBlock("surfaceCopperOre"),
		new SurfaceOreBlock("surfaceDilithiumOre"),
		new SurfaceOreBlock("surfaceIridiumOre"),
		new SurfaceOreBlock("surfaceLeadOre"),
		new SurfaceOreBlock("surfaceMagnetiteOre"),
		new SurfaceOreBlock("surfaceNickelOre"),
		new SurfaceOreBlock("surfaceQuartzOre"),
		new SurfaceOreBlock("surfaceSilverOre"),
		new SurfaceOreBlock("surfaceTinOre"),
		new SurfaceOreBlock("surfaceUraniumOre"),
		new SurfaceOreBlock("surfacePyriteOre"),
		new SurfaceOreBlock("surfaceCinnabarOre"),
		new SurfaceOreBlock("surfaceRubyOre"),
		new SurfaceOreBlock("surfaceRutileOre"),
		new SurfaceOreBlock("surfaceSapphireOre"),
		new SurfaceOreBlock("surfaceSphaleriteOre"),
		new SurfaceOreBlock("surfaceTungstenOre"),
		new SurfaceOreBlock("surfaceSheldoniteOre"),
		new SurfaceOreBlock("surfacePeridotOre"),
		new SurfaceOreBlock("surfaceSodaliteOre"),
		new SurfaceOreBlock("surfaceZincOre")
	};
	
	public static NetherOreBlock[] netherOres = 
	{
		new NetherOreBlock("netherAluminumOre"),
		new NetherOreBlock("netherArditeOre"),
		new NetherOreBlock("netherCertusQuartzOre"),
		new NetherOreBlock("netherChargedCertusQuartzOre"),
		new NetherOreBlock("netherCoalOre"),
		new NetherOreBlock("netherCobaltOre"),
		new NetherOreBlock("netherCopperOre"),
		new NetherOreBlock("netherCinnabarOre"),
		new NetherOreBlock("netherDiamondOre"),
		new NetherOreBlock("netherDilithiumOre"),
		new NetherOreBlock("netherEmeraldOre"),
		new NetherOreBlock("netherIridiumOre"),
		new NetherOreBlock("netherIronOre"),
		new NetherOreBlock("netherGoldOre"),
		new NetherOreBlock("netherLapisOre"),
		new NetherOreBlock("netherLeadOre"),
		new NetherOreBlock("netherMagnetiteOre"),
		new NetherOreBlock("netherNickelOre"),
		new NetherOreBlock("netherOsmiumOre"),
		new NetherOreBlock("netherPyriteOre"),
		new NetherOreBlock("netherQuartzOre"),
		new NetherOreBlock("netherRedstoneOre"),
		new NetherOreBlock("netherSilverOre"),
		new NetherOreBlock("netherSphaleriteOre"),
		new NetherOreBlock("netherTinOre"),
		new NetherOreBlock("netherUraniumOre"),
		new NetherOreBlock("netherGalenaOre"),
		new NetherOreBlock("netherRubyOre"),
		new NetherOreBlock("netherRutileOre"),
		new NetherOreBlock("netherSapphireOre"),
		new NetherOreBlock("netherTungstenOre"),
		new NetherOreBlock("netherSheldoniteOre"),
		new NetherOreBlock("netherPeridotOre"),
		new NetherOreBlock("netherSodaliteOre"),
		new NetherOreBlock("netherZincOre")
	};
	
	public static EndOreBlock[] endOres = 
	{
		new EndOreBlock("endAluminumOre"),
		new EndOreBlock("endArditeOre"),
		new EndOreBlock("endCertusQuartzOre"),
		new EndOreBlock("endChargedCertusQuartzOre"),
		new EndOreBlock("endCoalOre"),
		new EndOreBlock("endCobaltOre"),
		new EndOreBlock("endCopperOre"),
		new EndOreBlock("endDiamondOre"),
		new EndOreBlock("endDilithiumOre"),
		new EndOreBlock("endEmeraldOre"),
		new EndOreBlock("endIridiumOre"),
		new EndOreBlock("endIronOre"),
		new EndOreBlock("endGoldOre"),
		new EndOreBlock("endLapisOre"),
		new EndOreBlock("endLeadOre"),
		new EndOreBlock("endMagnetiteOre"),
		new EndOreBlock("endNickelOre"),
		new EndOreBlock("endOsmiumOre"),
		new EndOreBlock("endQuartzOre"),
		new EndOreBlock("endRedstoneOre"),
		new EndOreBlock("endSilverOre"),
		new EndOreBlock("endTinOre"),
		new EndOreBlock("endUraniumOre"),
		new EndOreBlock("endGalenaOre"),
		new EndOreBlock("endRubyOre"),
		new EndOreBlock("endRutileOre"),
		new EndOreBlock("endSapphireOre"),
		new EndOreBlock("endPyriteOre"),
		new EndOreBlock("endCinnabarOre"),
		new EndOreBlock("endSphaleriteOre"),
		new EndOreBlock("endTungstenOre"),
		new EndOreBlock("endSheldoniteOre"),
		new EndOreBlock("endPeridotOre"),
		new EndOreBlock("endSodaliteOre"),
		new EndOreBlock("endZincOre")
	};
	
	static int size = surfaceOres.length + netherOres.length + endOres.length;
	static final Block[] someBlocks = new Block[size];
	
	public static SurfaceOreBlock getBlockSurface(String blockName)
	{
		for(SurfaceOreBlock block : surfaceOres )
		{
			if(block.getName().toLowerCase().contains(blockName.toLowerCase()))
			{
				return block;
			}
		}
		
		return null;
	}
	
	public static NetherOreBlock getBlockNether(String blockName)
	{
		for(NetherOreBlock block : netherOres )
		{
			if(block.getName().toLowerCase().contains(blockName.toLowerCase()))
			{
				return block;
			}
		}
		
		return null;
	}
	
	public static EndOreBlock getBlockEnd(String blockName)
	{
		for(EndOreBlock block : endOres )
		{
			if(block.getName().toLowerCase().contains(blockName.toLowerCase()))
			{
				return block;
			}
		}
		
		return null;
	}
	
	public static void registerRenders()
	{
		for(SurfaceOreBlock block : surfaceOres)
		{
			registerRender(block);
		}
		
		for(NetherOreBlock block : netherOres)
		{
			registerRender(block);
		}
		
		for(EndOreBlock block : endOres)
		{
			registerRender(block);
		}
	}
	
	public static void registerOreDict()
	{
		for(SurfaceOreBlock block : surfaceOres)
		{
			OreDictionary.registerOre("ore" + block.getName().substring(7, block.getName().length() - 3), block);
		}
		
		for(NetherOreBlock block : netherOres)
		{
			OreDictionary.registerOre("ore" + block.getName().substring(6, block.getName().length() - 3), block);
		}
		
		for(EndOreBlock block : endOres)
		{
			OreDictionary.registerOre("ore" + block.getName().substring(3, block.getName().length() - 3), block);
		}
		
		OreDictionary.registerOre("oreCertusQuartz", getBlockSurface("chargedcertusquartz"));
		OreDictionary.registerOre("oreCertusQuartz", getBlockNether("chargedcertusquartz"));
		OreDictionary.registerOre("oreCertusQuartz", getBlockEnd("chargedcertusquartz"));
		
		OreDictionary.registerOre("oreTitanium", getBlockSurface("rutile"));
		OreDictionary.registerOre("oreTitanium", getBlockNether("rutile"));
		OreDictionary.registerOre("oreTitanium", getBlockEnd("rutile"));
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
			
			List<Block> tempList = new ArrayList<Block>();
			
			for(Block block : surfaceOres)
			{
				tempList.add(block);
			}
			
			for(Block block : netherOres)
			{
				tempList.add(block);
			}
			
			for(Block block : endOres)
			{
				tempList.add(block);
			}

			for(int i = 0; i < tempList.size(); i++)
			{
				someBlocks[i] = tempList.get(i);
			}

			registry.registerAll(someBlocks);
		}
		
		@SubscribeEvent
		public static void registerItemBlocks(RegistryEvent.Register<Item> event) 
		{	
			ItemBlock[] someItems = new ItemBlock[size];
			
			for(int i = 0; i < someItems.length; i++)
			{
				someItems[i] = new ItemBlock(someBlocks[i]);
			}
			
			final ItemBlock[] items = {};

			final IForgeRegistry<Item> registry = event.getRegistry();

			for (final ItemBlock item : someItems) 
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
}