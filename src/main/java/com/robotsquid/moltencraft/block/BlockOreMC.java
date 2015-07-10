package com.robotsquid.moltencraft.block;

import com.robotsquid.moltencraft.MoltenCraft;
import com.robotsquid.moltencraft.reference.Reference;

public class BlockOreMC extends net.minecraft.block.BlockOre
{
    public BlockOreMC(String unlocalizedName, float hardness, int harvestLevel)
    {
        super();
        this.setCreativeTab(MoltenCraft.MOLTENCRAFT_TAB);
        this.setBlockName(getModUnlocalizedName(unlocalizedName));
        this.setBlockTextureName(getModUnlocalizedName(unlocalizedName));
        this.setHardness(hardness);
        this.setHarvestLevel("pickaxe", harvestLevel);
    }

    protected String getModUnlocalizedName(String unlocalizedName)
    {
        return String.format("%s:%s", Reference.MOD_ID.toLowerCase(), unlocalizedName);
    }
}
