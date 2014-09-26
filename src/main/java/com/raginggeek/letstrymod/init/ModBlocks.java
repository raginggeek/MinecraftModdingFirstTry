package com.raginggeek.letstrymod.init;

import com.raginggeek.letstrymod.block.BlockEnderBrick;
import com.raginggeek.letstrymod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	public static final BlockEnderBrick enderBrick = new BlockEnderBrick();
	
	public static void init()
	{
		GameRegistry.registerBlock(enderBrick, "EnderBrick");
	}
}
