package com.gmail.rohzek.simpleoregen.items.itemtypes;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class OreGenAxe extends AxeItem
{
	Tier tool_tier;
	
	public OreGenAxe(Tier tool_tier, String name) 
	{
		super(tool_tier, new Item.Properties().stacksTo(1).durability(tool_tier.getUses()));
		this.tool_tier = tool_tier;
	}
	
	@Override
	public Tier getTier() 
	{
		return tool_tier;
	}
}
