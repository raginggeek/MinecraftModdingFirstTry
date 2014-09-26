package com.raginggeek.letstrymod.block;

import com.raginggeek.letstrymod.creativetab.CreativeTabLTM;
import com.raginggeek.letstrymod.reference.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class BlockLTM extends Block{

	public BlockLTM(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabLTM.LTM_TAB);
	}
	
	public BlockLTM()
	{
		this(Material.rock);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") +1));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
			return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
