package com.gmail.rohzek.simpleoregen.entity.client;

import com.gmail.rohzek.simpleoregen.entity.CheshireCat;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CheshireCatRenderer extends MobRenderer<CheshireCat, EntityModel<CheshireCat>>
{

	public CheshireCatRenderer(Context context, EntityModel<CheshireCat> model, float shadowRadius) 
	{
		super(context, model, shadowRadius);
	}
	
	@Override
    public ResourceLocation getTextureLocation(CheshireCat entity) 
	{
        return entity.getTextureId();
    }
}
