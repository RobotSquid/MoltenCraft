package com.robotsquid.moltencraft.tool.hoe;

import com.robotsquid.moltencraft.MoltenCraft;
import com.robotsquid.moltencraft.reference.Reference;
import net.minecraft.item.ItemHoe;

public class HoeMC extends ItemHoe
{
    public HoeMC(ToolMaterial material, String unlocalizedName)
    {
        super(material);
        this.setCreativeTab(MoltenCraft.MOLTENCRAFT_TAB);
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
