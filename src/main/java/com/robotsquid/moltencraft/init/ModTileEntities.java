package com.robotsquid.moltencraft.init;

import com.robotsquid.moltencraft.tileentity.TileNightMaker;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModTileEntities
{
    public static void init()
    {
        GameRegistry.registerTileEntity(TileNightMaker.class, "tileNightMaker");
    }
}
