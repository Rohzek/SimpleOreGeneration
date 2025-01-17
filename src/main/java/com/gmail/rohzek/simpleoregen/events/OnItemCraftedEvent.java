package com.gmail.rohzek.simpleoregen.events;

import java.util.Set;

import com.gmail.rohzek.simpleoregen.items.OreGenItems;
import com.gmail.rohzek.simpleoregen.lib.LogHelper;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
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
				LogHelper.Debug("Player is crafting with heart diamond!");
				
				ItemStack output = event.getCrafting();
				HolderLookup.Provider provider = world.registryAccess();
				HolderLookup.RegistryLookup<Enchantment> enchanter = provider.lookupOrThrow(Registries.ENCHANTMENT);
				
				// Add tooltip that mentions being crafted with a heart diamond
				//output.addToTooltip(null, null, null, null); ?
				//output.set(DataComponents.LORE, null); ?
				
				// Evnetually change to a custom enchantment of type: Healing; Same as mending but player health on XP gain
				output.enchant(enchanter.get(Enchantments.MENDING).get(), 1);
				
				// Change item's rarity
				output.set(DataComponents.RARITY, Rarity.EPIC);
			}
		}
	}
}
