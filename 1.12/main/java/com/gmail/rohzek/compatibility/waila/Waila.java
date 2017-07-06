package com.gmail.rohzek.compatibility.waila;

import java.util.List;

import com.gmail.rohzek.blocks.NetherOreBlock;
import com.gmail.rohzek.util.ConfigurationManager;
import com.gmail.rohzek.util.LogHelper;

import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import mcp.mobius.waila.api.IWailaDataProvider;
import mcp.mobius.waila.api.IWailaRegistrar;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInterModComms;

public class Waila implements IWailaDataProvider
{	
	@Override
	public ItemStack getWailaStack(IWailaDataAccessor accessor, IWailaConfigHandler config) 
	{
		return null;
	}

	@Override
	public List<String> getWailaHead(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) 
	{
		return currenttip;
	}

	@Override
	public List<String> getWailaBody(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) 
	{
		if(ConfigurationManager.supportWaila && ConfigurationManager.zombiePigsAttack)
		{
			addTipToNetherBlock(currenttip, accessor);
		}
		
		return currenttip;
	}
	
	public static void addTipToNetherBlock(List<String> currenttip, IWailaDataAccessor accessor)
	{
		EntityPlayer player = accessor.getPlayer();
		Block block = accessor.getBlock();
		NetherOreBlock netherBlock;
		
		String part1 = "Will Aggro", part2 = " : ", part3 = "";
		
        if(block instanceof NetherOreBlock) 
        {
        	netherBlock = (NetherOreBlock)block;
        	
        	int range = netherBlock.getAggroRange();
        	
        	if(checkAggro(accessor, range))
        	{
        		part3 = TextFormatting.DARK_RED + "Zombies!";
        	}
        	else
        	{
        		part3 = TextFormatting.DARK_GREEN + "Safe";
        	}
        	
        	currenttip.add(part1 + part2 + part3);
        	
        	if(player.isSneaking())
        	{
        		currenttip.add("Aggro Range : " + range);
        	}
        }
    }
	
	private static boolean checkAggro(IWailaDataAccessor accessor, int aggroRange)
	{
		EntityPlayer player = accessor.getPlayer();
		World world = accessor.getWorld();
		BlockPos pos = accessor.getPosition();
		Block block = accessor.getBlock();
		
		int x = pos.getX(), y = pos.getY(), z = pos.getZ();
		
		List<?> list = world.getEntitiesWithinAABB(EntityPigZombie.class, new AxisAlignedBB(x - aggroRange, y - aggroRange, z - aggroRange, x + aggroRange, y + aggroRange, z + aggroRange));
		
		for(int i = 0; i < list.size(); i++)
		{
			Entity entity = (Entity)list.get(i);
			if(entity instanceof EntityPigZombie)
			{
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public List<String> getWailaTail(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) 
	{
		return currenttip;
	}

	@Override
	public NBTTagCompound getNBTData(EntityPlayerMP player, TileEntity te, NBTTagCompound tag, World world, BlockPos pos) 
	{
		return tag;
	}
	
	public static void callbackRegister(IWailaRegistrar registrar)
	{
		Waila instance = new Waila();
		registrar.registerBodyProvider(instance, NetherOreBlock.class);
	}
}
