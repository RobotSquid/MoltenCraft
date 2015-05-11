package com.robotsquid.moltencraft.init;

import com.robotsquid.moltencraft.MoltenCraft;
import com.robotsquid.moltencraft.entity.EntityLaserBeam;
import com.robotsquid.moltencraft.entity.EntityWitherPearl;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities
{
    public static void init()
    {
        int entityIndex = 0;

        EntityRegistry.registerModEntity(EntityWitherPearl.class, "witherPearl", ++entityIndex, MoltenCraft.instance, 64, 10, true);
        EntityRegistry.registerModEntity(EntityLaserBeam.class, "laserBeam", ++entityIndex, MoltenCraft.instance, 64, 10, true);
    }
}
