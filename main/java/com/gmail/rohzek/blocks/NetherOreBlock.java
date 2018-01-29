package com.gmail.rohzek.blocks;

import java.util.List;
import java.util.Random;

import com.gmail.rohzek.items.SGItems;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import appeng.client.render.effects.ChargedOreFX;
import appeng.core.AEConfig;
import appeng.core.AppEng;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Allows you to change things about ALL of the Nether ores specifically
 * @author Rohzek
 *
 */
public class NetherOreBlock extends GenericBlock
{
	private static int aggroRange, coalDrop, diamondDrop, emeraldDrop, lapisDrop, quartzDrop, redstoneDrop, rubyDrop, sapphireDrop;
	private static Item drop;
	
	public NetherOreBlock(String unlocalizedName)
	{
		super(unlocalizedName, Material.ROCK, 3f, 15f);
		this.setRegistryName(unlocalizedName);
		
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		this.aggroRange = ConfigurationManager.aggroRangePigmen;
		
		if(ConfigurationManager.dropVanillaQuartz)
		{
			drop = Items.QUARTZ;
		}
		else
		{
			drop = SGItems.QUARTZ;
		}
	}
	
	public static void setDropRates()
	{
		if(ConfigurationManager.zombiePigsAttack)
		{
			coalDrop = 3;
			diamondDrop = 3;
			emeraldDrop = 3;
			lapisDrop = 6;
			quartzDrop = 3;
			redstoneDrop = 4;
			
			rubyDrop = 2;
			sapphireDrop = 2;
		}
		else
		{
			coalDrop = 1;
			diamondDrop = 1;
			emeraldDrop = 1;
			lapisDrop = 4;
			quartzDrop = 1;
			redstoneDrop = 1;
			
			rubyDrop = 1;
			sapphireDrop = 1;
		}
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == SGOres.getBlockNether("coal") ? Items.COAL :
        	   this == SGOres.getBlockNether("diamond") ? Items.DIAMOND :
        	   this == SGOres.getBlockNether("emerald") ? Items.EMERALD :
        	   this == SGOres.getBlockNether("lapis") ? Items.DYE : 
        	   this == SGOres.getBlockNether("quartz") ? drop :
        	   this == SGOres.getBlockNether("redstone") ? Items.REDSTONE :
        	   this == SGOres.getBlockNether("ruby") ? SGItems.RUBY :
        	   this == SGOres.getBlockNether("sapphire") ? SGItems.SAPPHIRE :
        	   Item.getItemFromBlock(this);
    }
	
	@Override
	public int quantityDropped(Random random)
    {
		return  this == SGOres.getBlockNether("coal")     ? 1 + random.nextInt(coalDrop) :
     	   		this == SGOres.getBlockNether("diamond")  ? 1 + random.nextInt(diamondDrop) : 
     	   		this == SGOres.getBlockNether("emerald")  ? 1 + random.nextInt(emeraldDrop) :
     	   		this == SGOres.getBlockNether("lapis")    ? 4 + random.nextInt(lapisDrop) :
     	   		this == SGOres.getBlockNether("quartz")   ? 1 + random.nextInt(quartzDrop) :
     	   		this == SGOres.getBlockNether("redstone") ? 4 + random.nextInt(redstoneDrop) :
     	   		this == SGOres.getBlockNether("ruby") ? 1 + random.nextInt(rubyDrop) :
     	   		this == SGOres.getBlockNether("sapphire") ? 1 + random.nextInt(rubyDrop) :
     	   		1;
    }
	
	@Override
	public int damageDropped(IBlockState state)
    {
        return this == SGOres.getBlockNether("lapis") ? EnumDyeColor.BLUE.getDyeDamage() : 0;
    }
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{
		if(this == SGOres.getBlockNether("lapis"))
		{
			return new ItemStack(Item.getItemFromBlock(SGOres.getBlockNether("lapis")));
		}
		else
		{
			return super.getPickBlock(state, target, world, pos, player);
		}
	}
	
	@Override
    public boolean isFireSource(World world, BlockPos blockPos, EnumFacing facing) {
        return facing == EnumFacing.UP;
    }
	
	@Override
	public void harvestBlock(World world, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te, ItemStack stack) 
	{
		super.harvestBlock(world, player, pos, state, te, stack);
		
		if(ConfigurationManager.zombiePigsAttack)
		{
			angerPigmen(player, world, pos);
		}
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

            if (this == SGOres.getBlockNether("coal"))
            {
                i = MathHelper.getInt(rand, 0, 2);
            }
            
            else if (this == SGOres.getBlockNether("diamond"))
            {
                i = MathHelper.getInt(rand, 3, 7);
            }
            
            else if (this == SGOres.getBlockNether("emerald"))
            {
                i = MathHelper.getInt(rand, 3, 7);
            }
            
            else if (this == SGOres.getBlockNether("lapis"))
            {
                i = MathHelper.getInt(rand, 2, 5);
            }
            
            else if (this == SGOres.getBlockNether("quartz"))
            {
                i = MathHelper.getInt(rand, 2, 5);
            }
            
            else if (this == SGOres.getBlockNether("ruby"))
            {
                i = MathHelper.getInt(rand, 3, 7);
            }
            
            else if (this == SGOres.getBlockNether("sapphire"))
            {
                i = MathHelper.getInt(rand, 3, 7);
            }

            return i;
        }
        return 0;
    }
	
	public int getAggroRange()
	{
		return aggroRange;
	}
	
	private void angerPigmen(EntityPlayer player, World world, BlockPos pos)
	{
		int x = pos.getX(), y = pos.getY(), z = pos.getZ();
		
		List<?> list = world.getEntitiesWithinAABB(EntityPigZombie.class, new AxisAlignedBB(x - aggroRange, y - aggroRange, z - aggroRange, x + aggroRange, y + aggroRange, z + aggroRange));
		
		for(int i = 0; i < list.size(); i++)
		{
			Entity entity = (Entity)list.get(i);
			if(entity instanceof EntityPigZombie)
			{
				EntityPigZombie zombiePig = (EntityPigZombie)entity;
				zombiePig.setRevengeTarget(player);
				LogHelper.debug("Zombie pigs aggro applied to: " + player.getDisplayNameString());
			}
		}
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

		if(AppEng.proxy.shouldAddParticles(r) && this == SGOres.getBlockNether("chargedcertusquartz"))
		{
			final ChargedOreFX fx = new ChargedOreFX(w, pos.getX() + xOff, pos.getY() + yOff, pos.getZ() + zOff, 0.0f, 0.0f, 0.0f);
			Minecraft.getMinecraft().effectRenderer.addEffect(fx);
		}
	}
}
