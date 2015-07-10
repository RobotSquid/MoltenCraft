package com.robotsquid.moltencraft.tool;

import com.robotsquid.moltencraft.MoltenCraft;
import com.robotsquid.moltencraft.reference.Reference;
import net.minecraft.item.Item;

public class ToolFluidWrench extends Item
{
    public ToolFluidWrench()
    {
        super();
        this.setCreativeTab(MoltenCraft.MOLTENCRAFT_TAB);
        this.setUnlocalizedName(getModUnlocalizedName("fluidWrench"));
        this.setTextureName(getModUnlocalizedName("fluidWrench"));
        this.setMaxStackSize(1);
        this.isFull3D();
    }

    protected String getModUnlocalizedName(String unlocalizedName)
    {
        return String.format("%s:%s", Reference.MOD_ID.toLowerCase(), unlocalizedName);
    }
}
