package com.gmail.rohzek.simpleoregen.items.itemtypes;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;

public class OreGenArmor extends ArmorItem
{
	public OreGenArmor(Holder<ArmorMaterial> material, Type type, int durability) 
	{
		super(material, type, new Item.Properties().stacksTo(1).durability(type.getDurability(durability)));
	}
}
