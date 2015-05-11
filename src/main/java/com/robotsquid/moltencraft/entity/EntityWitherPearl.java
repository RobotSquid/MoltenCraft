package com.robotsquid.moltencraft.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityWitherPearl extends EntityThrowable
{
    public EntityWitherPearl(World world)
    {
        super(world);
    }

    public EntityWitherPearl(World world, EntityLivingBase player)
    {
        super(world, player);
    }

    protected void onImpact(MovingObjectPosition position)
    {
        if (!worldObj.isRemote)
        {
            worldObj.setWorldTime(13000);
            if (position.entityHit != null)
            {
                worldObj.addWeatherEffect(new EntityLightningBolt(worldObj, position.entityHit.posX, position.entityHit.posY, position.entityHit.posZ));
            }
            else
            {
                worldObj.addWeatherEffect(new EntityLightningBolt(worldObj, position.blockX, position.blockY, position.blockZ));
            }

            String message = String.format("%s %s", this.getThrower().getCommandSenderName(), "threw a wither pearl which changed the world to night");
            MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(message));
        }

        this.setDead();
    }
}
