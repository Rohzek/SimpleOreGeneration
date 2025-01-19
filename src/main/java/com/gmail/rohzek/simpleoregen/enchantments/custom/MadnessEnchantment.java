package com.gmail.rohzek.simpleoregen.enchantments.custom;

import java.util.List;
import java.util.Random;

import com.gmail.rohzek.simpleoregen.lib.LogHelper;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.enchantment.EnchantedItemInUse;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraft.world.phys.Vec3;

public record MadnessEnchantment() implements EnchantmentEntityEffect
{
	public static final MapCodec<MadnessEnchantment> CODEC = MapCodec.unit(MadnessEnchantment::new);
	@Override
	public void apply(ServerLevel world, int enchantmentLevel, EnchantedItemInUse item, Entity entity, Vec3 origin)
	{
		LogHelper.Debug("We're all mad here!");
		Random rand = new Random();
		var spawnloc = new BlockPos((int)entity.getX(), (int)entity.getY() + 1, (int)entity.getZ());
		
		if(enchantmentLevel == 1) 
		{
			EntityType.CAT.spawn(world, spawnloc, MobSpawnType.SPAWN_EGG);
			/*
			Cat cat = new Cat(EntityType.CAT, world);
			cat.isOwnedBy(item.owner());
			//cat.setVariant(CatVariant.RED);
			cat.setCustomName(Component.literal("Cheshire"));
			cat.spawnAtLocation(null);
			*/
		}
		if(enchantmentLevel == 2) 
		{
			var toSpawn = List.of(EntityType.ARMADILLO, EntityType.BAT, EntityType.BEE, EntityType.CAMEL, EntityType.CAT, EntityType.CHICKEN, EntityType.COW, 
					EntityType.DONKEY, EntityType.EGG, EntityType.EXPERIENCE_BOTTLE, EntityType.EXPERIENCE_ORB, EntityType.FIREWORK_ROCKET, EntityType.FOX, 
					EntityType.FROG, EntityType.GOAT, EntityType.HORSE, EntityType.LLAMA, EntityType.MOOSHROOM, EntityType.MULE, EntityType.OCELOT, 
					EntityType.PANDA, EntityType.PARROT, EntityType.PIG, EntityType.POLAR_BEAR, EntityType.RABBIT, EntityType.SHEEP, EntityType.TURTLE, 
					EntityType.WOLF);
			
			
			
			toSpawn.get(rand.nextInt(toSpawn.size())).spawn(world, spawnloc, MobSpawnType.TRIGGERED);
		}
		
		if(!entity.getType().equals(EntityType.PLAYER) && 
				!entity.getType().equals(EntityType.ENDER_DRAGON) && 
				!entity.getType().equals(EntityType.WITHER ) &&
				!entity.getType().equals(EntityType.ELDER_GUARDIAN) &&
				!entity.getType().equals(EntityType.WARDEN))
		{
			entity.setInvisible(true);
			entity.teleportTo(0, -(Integer.MAX_VALUE), 0);
		}
		else 
		{
			entity.teleportTo(entity.getX() + rand.nextInt(30), entity.getY() + rand.nextInt(5), entity.getZ() + rand.nextInt(30));
		}
	}

	@Override
	public MapCodec<? extends EnchantmentEntityEffect> codec() 
	{
		return CODEC;
	}

}
