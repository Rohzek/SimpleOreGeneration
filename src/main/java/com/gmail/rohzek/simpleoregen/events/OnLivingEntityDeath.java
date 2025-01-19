package com.gmail.rohzek.simpleoregen.events;

import com.gmail.rohzek.simpleoregen.enchantments.ModEnchantments;

import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.item.enchantment.Enchantment;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDropsEvent;
import net.neoforged.neoforge.event.entity.living.LivingExperienceDropEvent;

@EventBusSubscriber
public class OnLivingEntityDeath 
{
	@SuppressWarnings("resource")
	@SubscribeEvent
	public static void onLivingEntityDeath(LivingDropsEvent event) 
	{
		
		if(event.getSource().is(DamageTypes.PLAYER_ATTACK)) 
		{
			HolderLookup.Provider provider = Minecraft.getInstance().level.registryAccess();
			HolderLookup.RegistryLookup<Enchantment> enchanter = provider.lookupOrThrow(Registries.ENCHANTMENT);
			
			var source = event.getSource();
			if(source != null) 
			{
				var weapon = source.getWeaponItem();
				var enchants = weapon.getAllEnchantments(enchanter);
				var madnesslevel = enchants.getLevel(enchanter.get(ModEnchantments.MADNESS).get());
				
				if(!enchants.isEmpty()) 
				{
					if(madnesslevel >= 1) 
					{
						event.getDrops().clear();
					}
				}
			}
		}
	}
	
	@SuppressWarnings("resource")
	@SubscribeEvent
	public static void onLivingEntityDeath(LivingExperienceDropEvent event) 
	{
		HolderLookup.Provider provider = Minecraft.getInstance().level.registryAccess();
		HolderLookup.RegistryLookup<Enchantment> enchanter = provider.lookupOrThrow(Registries.ENCHANTMENT);

		var player = event.getAttackingPlayer();
		
		if(player != null) 
		{
			var weapon = player.getInventory().getItem(player.getInventory().selected);
			
			if(weapon != null) 
			{
				var enchants = weapon.getAllEnchantments(enchanter);
				var madnesslevel = enchants.getLevel(enchanter.get(ModEnchantments.MADNESS).get());
				
				if(!enchants.isEmpty()) 
				{
					if(madnesslevel >= 1) 
					{
						event.setDroppedExperience(0);
					}
				}
			}
		}
	}
}