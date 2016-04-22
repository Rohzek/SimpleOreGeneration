package com.gmail.rohzek.proxys;

import com.gmail.rohzek.blocks.SGOres;

/**
 * For things that must render ONLY on client, such as the graphics for the blocks we're rendering here.
 * @author Rohzek
 *
 */
public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenders()
	{
		SGOres.registerRenders();
	}
}
