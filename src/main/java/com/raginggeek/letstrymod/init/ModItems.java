package com.raginggeek.letstrymod.init;

import com.raginggeek.letstrymod.item.ItemLTM;
import com.raginggeek.letstrymod.item.ItemMapleLeaf;
import com.raginggeek.letstrymod.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final ItemLTM mapleLeaf = new ItemMapleLeaf();
	
	public  static void init()
	{
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
