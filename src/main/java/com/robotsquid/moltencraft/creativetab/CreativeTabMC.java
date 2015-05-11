package com.robotsquid.moltencraft.creativetab;

import com.robotsquid.moltencraft.init.ModTools;
import com.robotsquid.moltencraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMC
{
    public static final CreativeTabs MOLTENCRAFT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {

        @Override
        public Item getTabIconItem()
        {
            return ModTools.fluidWrench;
        }
    };
}