package com.gmail.rohzek.simpleoregen.lib;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value=Reference.MODID, dist= Dist.CLIENT)
public class OreGenClient 
{
	public OreGenClient(IEventBus modEventBus, ModContainer modContainer) 
	{
		modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
	}
}