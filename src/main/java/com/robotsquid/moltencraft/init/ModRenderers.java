package com.robotsquid.moltencraft.init;

import com.robotsquid.moltencraft.entity.EntityLaserBeam;
import com.robotsquid.moltencraft.entity.EntityWitherPearl;
import com.robotsquid.moltencraft.render.RenderLaserBeam;
import com.robotsquid.moltencraft.render.RenderNightMaker;
import com.robotsquid.moltencraft.tileentity.TileNightMaker;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderSnowball;

@SideOnly(Side.CLIENT)
public class ModRenderers
{
    public static void init()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityWitherPearl.class, new RenderSnowball(ModItems.witherPearl));
        RenderingRegistry.registerEntityRenderingHandler(EntityLaserBeam.class, new RenderLaserBeam());

        ClientRegistry.bindTileEntitySpecialRenderer(TileNightMaker.class, new RenderNightMaker());
    }
}
