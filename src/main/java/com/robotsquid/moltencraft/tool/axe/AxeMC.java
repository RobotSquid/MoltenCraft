package com.robotsquid.moltencraft.tool.axe;

import com.robotsquid.moltencraft.creativetab.CreativeTabMC;
import com.robotsquid.moltencraft.reference.Reference;
import net.minecraft.item.ItemAxe;

public class AxeMC extends ItemAxe
{
    public AxeMC(ToolMaterial material, String unlocalizedName)
    {
        super(material);
        this.setCreativeTab(CreativeTabMC.MOLTENCRAFT_TAB);
        this.setUnlocalizedName(getModUnlocalizedName(unlocalizedName));
        this.setTextureName(getModUnlocalizedName(unlocalizedName));
        this.setMaxStackSize(1);
        this.isFull3D();
    }

    protected String getModUnlocalizedName(String unlocalizedName)
    {
        return String.format("%s:%s", Reference.MOD_ID.toLowerCase(), unlocalizedName);
    }
}
