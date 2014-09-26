package com.raginggeek.letstrymod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(ModBlocks.enderBrick),new Object[] { "iwi", "wiw", "iwi", 'w', new ItemStack(Blocks.end_stone), 'i', Items.iron_ingot });
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.mapleLeaf), "treeSapling"));
	}
}
