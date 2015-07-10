package com.robotsquid.moltencraft.creativetab;

import com.robotsquid.moltencraft.init.ModTools;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMC extends CreativeTabs
{
    public CreativeTabMC(int id, String unlocalizedName)
    {
        super(id, unlocalizedName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return ModTools.fluidWrench;
    }
}