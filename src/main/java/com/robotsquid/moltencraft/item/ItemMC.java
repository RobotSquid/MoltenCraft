package com.robotsquid.moltencraft.item;

import com.robotsquid.moltencraft.creativetab.CreativeTabMC;
import com.robotsquid.moltencraft.utility.StringHelper;
import net.minecraft.item.Item;

public class ItemMC extends Item
{
    public ItemMC(String unlocalizedName, int maxStackSize)
    {
        super();
        this.setCreativeTab(CreativeTabMC.MOLTENCRAFT_TAB);
        this.setUnlocalizedName(StringHelper.getModUnlocalizedName(unlocalizedName));
        this.setTextureName(StringHelper.getModUnlocalizedName(unlocalizedName));
        this.setMaxStackSize(maxStackSize);
    }
}