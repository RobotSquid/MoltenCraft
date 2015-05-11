package com.robotsquid.moltencraft.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;

public class TileNightMaker extends TileEntity
{
    private EntityPlayer playerUsed;

    public EntityPlayer getUsed()
    {
        return playerUsed;
    }

    public void setUsed(EntityPlayer player)
    {
        playerUsed = player;
    }
}
