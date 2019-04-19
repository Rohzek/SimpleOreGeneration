package com.gmail.rohzek.compatibility;

import com.gmail.rohzek.blocks.SGBlocks;
import com.gmail.rohzek.items.SGItems;
import com.gmail.rohzek.util.LogHelper;

import moze_intel.projecte.api.ProjectEAPI;
import moze_intel.projecte.api.proxy.IEMCProxy;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class PECompat 
{
	public static void load() 
	{
		loadEMC();
	}
	
	public static void loadEMC() 
	{
		try 
		{
			Class.forName("moze_intel.projecte.api.proxy.IEMCProxy");
			
			IEMCProxy proxy = ProjectEAPI.getEMCProxy();
			
			ItemStack output = new ItemStack(SGItems.HEART_DIAMOND);
			output.addEnchantment(Enchantments.FIRE_ASPECT, 4);
			output.addEnchantment(Enchantments.UNBREAKING, 4);
			
			proxy.registerCustomEMC(output, 8192);
			proxy.registerCustomEMC(new ItemStack(SGBlocks.CHESHIREROSEITEM), 4201);
			
			proxy.registerCustomEMC(new ItemStack(SGItems.ALUMINUM_INGOT), 64);
			proxy.registerCustomEMC(new ItemStack(SGItems.COPPER_INGOT), 128);
			proxy.registerCustomEMC(new ItemStack(SGItems.HEART_DIAMOND), 8192);
			proxy.registerCustomEMC(new ItemStack(SGItems.IRIDIUM_INGOT), 4096);
			proxy.registerCustomEMC(new ItemStack(SGItems.LEAD_INGOT), 512);
			proxy.registerCustomEMC(new ItemStack(SGItems.NICKEL_INGOT), 1024);
			proxy.registerCustomEMC(new ItemStack(SGItems.PLATINUM_INGOT), 4096);
			proxy.registerCustomEMC(new ItemStack(SGItems.QUARTZ), 256);
			proxy.registerCustomEMC(new ItemStack(SGItems.RUBY), 2048);
			proxy.registerCustomEMC(new ItemStack(SGItems.SAPPHIRE), 2048);
			proxy.registerCustomEMC(new ItemStack(SGItems.SILVER_INGOT), 512);
			proxy.registerCustomEMC(new ItemStack(SGItems.TIN_INGOT), 256);
			proxy.registerCustomEMC(new ItemStack(SGItems.TITANIUM_INGOT), 1024);
			proxy.registerCustomEMC(new ItemStack(SGItems.URANIUM_INGOT), 4096);
			proxy.registerCustomEMC(new ItemStack(SGItems.ZINC_INGOT), 256);
		}
		catch( ClassNotFoundException e ) 
		{
			 LogHelper.log("ProjectE not found, but ProjectE compat is loaded?");
		}
		
		
	}
}
