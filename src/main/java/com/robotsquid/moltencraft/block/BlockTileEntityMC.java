package com.robotsquid.moltencraft.block;

import com.robotsquid.moltencraft.MoltenCraft;
import com.robotsquid.moltencraft.utility.StringHelper;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public abstract class BlockTileEntityMC extends BlockContainer
{
    public String unlocalizedName;

    public BlockTileEntityMC(Material material, String unlocalizedName, float hardness)
    {
        super(material);
        this.setCreativeTab(MoltenCraft.MOLTENCRAFT_TAB);
        this.setBlockName(StringHelper.getModUnlocalizedName(unlocalizedName));
        this.setBlockTextureName(StringHelper.getModUnlocalizedName(unlocalizedName));
        this.unlocalizedName = unlocalizedName;
        this.setHardness(hardness);
    }
}
