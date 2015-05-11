package com.robotsquid.moltencraft.block.compressed;

import com.robotsquid.moltencraft.block.BlockCompressedMC;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlockWitherium extends BlockCompressedMC
{
    public BlockWitherium()
    {
        super("blockWitherium", 5.0F, 3);
    }

    @Override
    public void onEntityWalking(World world, int x, int y, int z, Entity entity)
    {
        if (entity instanceof EntityPlayer)
            ((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.wither.id, 160, 0));
    }
}
