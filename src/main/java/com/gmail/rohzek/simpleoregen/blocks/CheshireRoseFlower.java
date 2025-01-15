package com.gmail.rohzek.simpleoregen.blocks;

import java.util.List;
import java.util.Random;

import com.gmail.rohzek.simpleoregen.lib.LogHelper;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;

public class CheshireRoseFlower extends FlowerBlock
{	
	 public CheshireRoseFlower(String name) 
	 {
		 this(makeEffectList(MobEffects.REGENERATION, 3f), BlockBehaviour.Properties.of().sound(SoundType.PINK_PETALS).instabreak().noCollission()
				                                            .offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	 }
	 
	 public CheshireRoseFlower(SuspiciousStewEffects suspiciousStewEffects, BlockBehaviour.Properties properties) 
	 {
		 super(suspiciousStewEffects, properties);
	 }

	 protected static SuspiciousStewEffects makeEffectList(Holder<MobEffect> effect, float seconds) 
	 {
		 return new SuspiciousStewEffects(List.of(new SuspiciousStewEffects.Entry(effect, Mth.floor(seconds * 20.0F))));
	 }
	 
	 @Override
	 protected void entityInside(BlockState state, Level world, BlockPos pos, Entity entity) 
	 {
		 if(entity instanceof Player) 
		 {
			 Player player = (Player)entity;
			 LogHelper.Debug("Player " + player.getDisplayName().getString() + " is inside of a cheshire rose!");
			 player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 2, 0, false, false));
			 
			 if(world.isClientSide) 
			 {
				 // Spawn hearts
				//world.addParticle(ParticleTypes.HEART, pos.getX(), pos.getY(), pos.getZ(), 1, 1, 1);
				 spawnHearts(world, pos);
			 }
		 }
	 }
	 
	 /**
	  * From old version of mod, doesn't work 101% the same, but good enough.
	  */
	 private void spawnHearts(Level world, BlockPos pos)
	 {
		 Random rand = new Random();
		 int posX = pos.getX(), posY = pos.getY(), posZ = pos.getZ();
		 float width = 1f, height = 1f;
		 
		 for (int i = 0; i < 2; ++i)
		 {
			 double d0 = rand.nextGaussian() * 0.02D;
			 double d1 = rand.nextGaussian() * 0.02D;
			 double d2 = rand.nextGaussian() * 0.02D;
			 world.addParticle(ParticleTypes.HEART, 
					 posX + (double)(rand.nextFloat() * width * 2.0F) - (double)width, 
					 posY + 0.5D + (double)(rand.nextFloat() * height), 
					 posZ + (double)(rand.nextFloat() * width * 2.0F) - (double)width, d0, d1, d2);
		 }
	 }
}
