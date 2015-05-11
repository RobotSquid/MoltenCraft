package com.robotsquid.moltencraft.block;

import com.robotsquid.moltencraft.creativetab.CreativeTabMC;
import com.robotsquid.moltencraft.utility.StringHelper;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public abstract class BlockTileEntityMC extends BlockContainer
{
    public BlockTileEntityMC(Material material, String unlocalizedName, float hardness)
    {
        super(material);
        this.setCreativeTab(CreativeTabMC.MOLTENCRAFT_TAB);
        this.setBlockName(StringHelper.getModUnlocalizedName(unlocalizedName));
        this.setBlockTextureName(StringHelper.getModUnlocalizedName(unlocalizedName));
        this.setHardness(hardness);
    }
}
