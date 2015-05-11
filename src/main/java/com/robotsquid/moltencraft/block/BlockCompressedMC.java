package com.robotsquid.moltencraft.block;

import net.minecraft.block.material.Material;

public class BlockCompressedMC extends BlockMC
{
    public BlockCompressedMC(String unlocalizedName, float hardness, int harvestLevel)
    {
        super(Material.iron, unlocalizedName, hardness);
        this.setHarvestLevel("pickaxe", harvestLevel);
    }
}
