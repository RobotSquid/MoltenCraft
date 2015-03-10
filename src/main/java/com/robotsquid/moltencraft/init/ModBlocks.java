package com.robotsquid.moltencraft.init;

import com.robotsquid.moltencraft.block.BlockMoltenCraft;
import com.robotsquid.moltencraft.block.BlockTitanium;
import com.robotsquid.moltencraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockMoltenCraft blockTitanium = new BlockTitanium();

    public static void init()
    {
        GameRegistry.registerBlock(blockTitanium, "blockTitanium");
    }
}
