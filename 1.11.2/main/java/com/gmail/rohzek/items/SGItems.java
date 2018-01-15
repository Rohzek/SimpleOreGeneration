package com.gmail.rohzek.items;

import java.util.HashSet;
import java.util.Set;

import com.gmail.rohzek.lib.Reference;
import com.gmail.rohzek.util.LogHelper;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.IForgeRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.oredict.OreDictionary;

public class SGItems 
{
	public static final Item ALUMINUM_INGOT = new ItemIngot("aluminumIngot");
	public static final Item COPPER_INGOT = new ItemIngot("copperIngot");
	public static final Item IRIDIUM_INGOT = new ItemIngot("iridiumIngot");
	public static final Item LEAD_INGOT = new ItemIngot("leadIngot");
	public static final Item NICKEL_INGOT = new ItemIngot("nickelIngot");
	public static final Item QUARTZ = new Item().setRegistryName("quartz").setUnlocalizedName("quartz").setCreativeTab(CreativeTabs.MATERIALS);
	public static final Item SILVER_INGOT = new ItemIngot("silverIngot");
	public static final Item TIN_INGOT = new ItemIngot("tinIngot");
	public static final Item URANIUM_INGOT = new ItemIngot("uraniumIngot");
	public static final Item HEART_DIAMOND = new HeartDiamondItem("heartDiamond");
	
	public static final Item BRONZE_INGOT = new ItemIngot("bronzeIngot");
	public static final Item BRONZE_NUGGET = new ItemIngot("bronzeNugget");
	
	public static void registerRenders() 
	{
		registerRender(ALUMINUM_INGOT);
		registerRender(COPPER_INGOT);
		registerRender(IRIDIUM_INGOT);
		registerRender(LEAD_INGOT);
		registerRender(NICKEL_INGOT);
		registerRender(QUARTZ);
		registerRender(SILVER_INGOT);
		registerRender(TIN_INGOT);
		registerRender(URANIUM_INGOT);
		registerRender(HEART_DIAMOND);
		
		registerRender(BRONZE_INGOT);
		registerRender(BRONZE_NUGGET);
	}
	
	public static void registerOreDict()
	{
		OreDictionary.registerOre("ingotAluminum", ALUMINUM_INGOT);
		OreDictionary.registerOre("ingotCopper", COPPER_INGOT);
		OreDictionary.registerOre("ingotIridium", IRIDIUM_INGOT);
		OreDictionary.registerOre("ingotLead", LEAD_INGOT);
		OreDictionary.registerOre("ingotNickel", NICKEL_INGOT);
		OreDictionary.registerOre("gemQuartz", QUARTZ);
		OreDictionary.registerOre("ingotSilver", SILVER_INGOT);
		OreDictionary.registerOre("ingotTin", TIN_INGOT);
		OreDictionary.registerOre("ingotUranium", URANIUM_INGOT);
		OreDictionary.registerOre("gemDiamond", HEART_DIAMOND);
		
		OreDictionary.registerOre("ingotBronze", BRONZE_INGOT);
		OreDictionary.registerOre("nuggetBronze", BRONZE_NUGGET);
	}
	
	public static void registerRender(Item item)
	{	
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	public static void registerRender(Item item, int meta, String addon)
	{	
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName() + addon, "inventory"));
	}
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler 
	{
		public static final Set<Item> ITEMS = new HashSet<Item>();
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) 
		{
			final Item[] items =
			{
					ALUMINUM_INGOT,
					COPPER_INGOT,
					IRIDIUM_INGOT,
					LEAD_INGOT,
					NICKEL_INGOT,
					QUARTZ,
					SILVER_INGOT,
					TIN_INGOT,
					URANIUM_INGOT,
					HEART_DIAMOND,
					BRONZE_INGOT,
					BRONZE_NUGGET,
			};
			
			final IForgeRegistry<Item> registry = event.getRegistry();
			
			for (final Item item : items) 
			{
				registry.register(item);
				ITEMS.add(item);
			}
		}
	}
}