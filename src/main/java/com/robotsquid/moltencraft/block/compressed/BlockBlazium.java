package com.robotsquid.moltencraft.block.compressed;

import com.robotsquid.moltencraft.block.BlockCompressedMC;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockBlazium extends BlockCompressedMC
{
    public BlockBlazium()
    {
        super("blockBlazium", 5.0F, 3);
        this.setLightLevel(50);
    }

    @Override
    public void onEntityWalking(World world, int x, int y, int z, Entity entity)
    {
        if (entity instanceof EntityPlayer)
            entity.setFire(2);
    }
}