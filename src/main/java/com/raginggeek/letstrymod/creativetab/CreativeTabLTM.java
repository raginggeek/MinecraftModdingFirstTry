package com.raginggeek.letstrymod.creativetab;

import com.raginggeek.letstrymod.init.ModItems;
import com.raginggeek.letstrymod.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLTM {
	public static final CreativeTabs LTM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.mapleLeaf;
		}
		
		
	};

}
