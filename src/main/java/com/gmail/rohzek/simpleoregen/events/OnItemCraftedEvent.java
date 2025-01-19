package com.gmail.rohzek.simpleoregen.events;

import java.util.List;
import java.util.Random;
import java.util.Set;

import com.gmail.rohzek.simpleoregen.enchantments.ModEnchantments;
import com.gmail.rohzek.simpleoregen.items.OreGenItems;
import com.gmail.rohzek.simpleoregen.lib.LogHelper;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.component.ItemLore;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

@EventBusSubscriber
public class OnItemCraftedEvent 
{
	@SubscribeEvent
	public static void onItemCraftedEvent(PlayerEvent.ItemCraftedEvent event) 
	{
		Level world = event.getEntity().level();
		
		if(!world.isClientSide()) 
		{
			if(event.getInventory().hasAnyOf(Set.of(OreGenItems.HEART_DIAMOND.get()))) 
			{
				ItemStack output = event.getCrafting();
				HolderLookup.Provider provider = world.registryAccess();
				HolderLookup.RegistryLookup<Enchantment> enchanter = provider.lookupOrThrow(Registries.ENCHANTMENT);
				
				LogHelper.Debug("Player is crafting a " + output.getDisplayName() + " with heart diamond!");
				
				// Add tooltip that mentions being crafted with a heart diamond or something
				output.set(DataComponents.LORE, new ItemLore(List.of(getQuote())));
				
				if(output.getItem() instanceof SwordItem) 
				{
					output.enchant(enchanter.get(ModEnchantments.MADNESS).get(), 1);
					/*
					var damage = output.getOrDefault(DataComponents.ATTRIBUTE_MODIFIERS, Attributes.ATTACK_DAMAGE);
					output.set(DataComponents.ATTRIBUTE_MODIFIERS.codec().fieldOf("").g, 0);
					var mods = damage.modifiers();
					DataComponents.ATTRIBUTE_MODIFIERS.CODEC.INT.fieldOf("");
					*/
				}
				
				
				// Change item's rarity
				output.set(DataComponents.RARITY, Rarity.EPIC);
			}
		}
	}
	
	static Component getQuote() 
	{
		String id = "text.simpleoregen.alice_quotes.";
		var lore = List.of("madness", "curious", "that_depends", "doesn't_matter", "who_am_i", "can't_explain");
		
		Random rand = new Random();
		
		return Component.translatable(id + lore.get(rand.nextInt(lore.size())));
	}
}
