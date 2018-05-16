package com.gmail.rohzek.blocks;

import java.util.Random;

import com.gmail.rohzek.items.SGItems;
import com.gmail.rohzek.util.ConfigurationManager;

import appeng.client.render.effects.ChargedOreFX;
import appeng.core.AEConfig;
import appeng.core.AppEng;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SurfaceOreBlock extends GenericBlock
{	
	private static Item drop;
	
	public SurfaceOreBlock(String unlocalizedName) 
	{
		super(unlocalizedName, Material.ROCK, 3f, 15f);
		
		this.setRegistryName(unlocalizedName);
		
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	public static void setDropRates()
	{
		if(ConfigurationManager.dropVanillaQuartz)
		{
			drop = Items.QUARTZ;
		}
		else
		{
			drop = SGItems.QUARTZ;
		}
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == SGOres.getBlockSurface("surfaceQuartzOre") ? drop :
        	   this == SGOres.getBlockSurface("ruby") ? SGItems.RUBY :
        	   this == SGOres.getBlockSurface("sapphire") ? SGItems.SAPPHIRE :
        	   Item.getItemFromBlock(this);
    }
	
	@Override
	public int quantityDropped(Random random)
    {
		return this == SGOres.getBlockSurface("surfaceQuartzOre")  ? 1 + random.nextInt(3) : 1;
    }
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
	
	@Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
        {
            int i = 0;

            if (this == SGOres.getBlockSurface("quartz"))
            {
                i = MathHelper.getInt(rand, 2, 5);
            }
            
            else if (this == SGOres.getBlockSurface("ruby"))
            {
                i = MathHelper.getInt(rand, 2, 5);
            }
            
            else if (this == SGOres.getBlockSurface("sapphire"))
            {
                i = MathHelper.getInt(rand, 2, 5);
            }

            return i;
        }
        return 0;
    }
	
	@Optional.Method(modid = "appliedenergistics2")
	@Override
	@SideOnly( Side.CLIENT )
	public void randomDisplayTick( final IBlockState state, final World w, final BlockPos pos, final Random r )
	{
		if(!AEConfig.instance().isEnableEffects())
		{
			return;
		}

		double xOff = (r.nextFloat());
		double yOff = (r.nextFloat());
		double zOff = (r.nextFloat());

		switch(r.nextInt(6))
		{
			case 0:
				xOff = -0.01;
				break;
			case 1:
				yOff = -0.01;
				break;
			case 2:
				xOff = -0.01;
				break;
			case 3:
				zOff = -0.01;
				break;
			case 4:
				xOff = 1.01;
				break;
			case 5:
				yOff = 1.01;
				break;
			case 6:
				zOff = 1.01;
				break;
		}

		if(AppEng.proxy.shouldAddParticles(r) && this == SGOres.getBlockSurface("chargedcertusquartz"))
		{
			final ChargedOreFX fx = new ChargedOreFX(w, pos.getX() + xOff, pos.getY() + yOff, pos.getZ() + zOff, 0.0f, 0.0f, 0.0f);
			Minecraft.getMinecraft().effectRenderer.addEffect(fx);
		}
	}
}
