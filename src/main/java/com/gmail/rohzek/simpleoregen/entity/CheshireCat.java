package com.gmail.rohzek.simpleoregen.entity;

import com.gmail.rohzek.simpleoregen.lib.Reference;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.level.Level;

public class CheshireCat extends Cat
{

	public CheshireCat(EntityType<? extends Cat> entityType, Level level) 
	{
		super(entityType, level);
	}
	
	@Override
	public ResourceLocation getTextureId() 
	{
		return ResourceLocation.fromNamespaceAndPath(Reference.MODID, "texture/entity/cat/cheshire.png");
	}
	
	/*
	public static AttributeSupplier.Builder createAttributes() 
	{
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 10d)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.FOLLOW_RANGE, 24D);
    }
    */
	
	public static AttributeSupplier.Builder createAttributes() 
	{
        return Mob.createMobAttributes()
        		.add(Attributes.MAX_HEALTH, 10.0)
        		.add(Attributes.MOVEMENT_SPEED, 0.3F)
        		.add(Attributes.ATTACK_DAMAGE, 3.0);
    }
	
	@Override
	public boolean shouldRender(double x, double y, double z) {
		// TODO Auto-generated method stub
		return super.shouldRender(x, y, z);
	}
}
