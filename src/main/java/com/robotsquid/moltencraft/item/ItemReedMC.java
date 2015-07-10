package com.robotsquid.moltencraft.item;

import com.robotsquid.moltencraft.MoltenCraft;
import com.robotsquid.moltencraft.utility.StringHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemReed;

public class ItemReedMC extends ItemReed
{

    public ItemReedMC(Block block, String unlocalizedName, int maxStackSize)
    {
        super(block);
        this.setCreativeTab(MoltenCraft.MOLTENCRAFT_TAB);
        this.setUnlocalizedName(StringHelper.getModUnlocalizedName(unlocalizedName));
        this.setTextureName(StringHelper.getModUnlocalizedName(unlocalizedName));
        this.setMaxStackSize(maxStackSize);
    }
}
