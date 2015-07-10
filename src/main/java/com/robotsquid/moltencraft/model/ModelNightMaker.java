package com.robotsquid.moltencraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNightMaker extends ModelBase
{
    //fields
    ModelRenderer FrameTop2;
    ModelRenderer FrameTop1;
    ModelRenderer FrameSide1;
    ModelRenderer FrameSide2;
    ModelRenderer FrameSide3;
    ModelRenderer FrameSide4;
    ModelRenderer PearlCube1;
    ModelRenderer FloaterBig2;
    ModelRenderer FloaterBig1;
    ModelRenderer FloaterSmall1;
    ModelRenderer FloaterSmall2;
    ModelRenderer PearlVert1;
    ModelRenderer PearlVert2;
    ModelRenderer PearlSide1;
    ModelRenderer PearlSide3;
    ModelRenderer PearlSide4;
    ModelRenderer PearlSide2;

    public ModelNightMaker()
    {
        textureWidth = 64;
        textureHeight = 32;

        FrameTop2 = new ModelRenderer(this, 0, 0);
        FrameTop2.addBox(-8F, 0F, -8F, 16, 1, 16);
        FrameTop2.setRotationPoint(0F, 23F, 0F);
        FrameTop2.setTextureSize(64, 32);
        FrameTop2.mirror = true;
        setRotation(FrameTop2, 0F, 0F, 0F);
        FrameTop1 = new ModelRenderer(this, 0, 0);
        FrameTop1.addBox(-8F, 0F, -8F, 16, 1, 16);
        FrameTop1.setRotationPoint(0F, 8F, 0F);
        FrameTop1.setTextureSize(64, 32);
        FrameTop1.mirror = true;
        setRotation(FrameTop1, 0F, 0F, 0F);
        FrameSide1 = new ModelRenderer(this, 0, 0);
        FrameSide1.addBox(0F, 0F, 0F, 1, 16, 1);
        FrameSide1.setRotationPoint(7F, 8F, 7F);
        FrameSide1.setTextureSize(64, 32);
        FrameSide1.mirror = true;
        setRotation(FrameSide1, 0F, 0F, 0F);
        FrameSide2 = new ModelRenderer(this, 0, 0);
        FrameSide2.addBox(0F, 0F, 0F, 1, 16, 1);
        FrameSide2.setRotationPoint(-8F, 8F, 7F);
        FrameSide2.setTextureSize(64, 32);
        FrameSide2.mirror = true;
        setRotation(FrameSide2, 0F, 0F, 0F);
        FrameSide3 = new ModelRenderer(this, 0, 0);
        FrameSide3.addBox(0F, 0F, 0F, 1, 16, 1);
        FrameSide3.setRotationPoint(7F, 8F, -8F);
        FrameSide3.setTextureSize(64, 32);
        FrameSide3.mirror = true;
        setRotation(FrameSide3, 0F, 0F, 0F);
        FrameSide4 = new ModelRenderer(this, 0, 0);
        FrameSide4.addBox(0F, 0F, 0F, 1, 16, 1);
        FrameSide4.setRotationPoint(-8F, 8F, -8F);
        FrameSide4.setTextureSize(64, 32);
        FrameSide4.mirror = true;
        setRotation(FrameSide4, 0F, 0F, 0F);
        PearlCube1 = new ModelRenderer(this, 17, 18);
        PearlCube1.addBox(-2F, 0F, -2F, 4, 4, 4);
        PearlCube1.setRotationPoint(0F, 14F, 0F);
        PearlCube1.setTextureSize(64, 32);
        PearlCube1.mirror = true;
        setRotation(PearlCube1, 0F, 0F, 0F);
        FloaterBig2 = new ModelRenderer(this, 0, 18);
        FloaterBig2.addBox(0F, 0F, 0F, 4, 1, 4);
        FloaterBig2.setRotationPoint(-2F, 22F, -2F);
        FloaterBig2.setTextureSize(64, 32);
        FloaterBig2.mirror = true;
        setRotation(FloaterBig2, 0F, 0F, 0F);
        FloaterBig1 = new ModelRenderer(this, 0, 18);
        FloaterBig1.addBox(0F, 0F, 0F, 4, 1, 4);
        FloaterBig1.setRotationPoint(-2F, 9F, -2F);
        FloaterBig1.setTextureSize(64, 32);
        FloaterBig1.mirror = true;
        setRotation(FloaterBig1, 0F, 0F, 0F);
        FloaterSmall1 = new ModelRenderer(this, 0, 18);
        FloaterSmall1.addBox(0F, 0F, 0F, 2, 1, 2);
        FloaterSmall1.setRotationPoint(-1F, 10F, -1F);
        FloaterSmall1.setTextureSize(64, 32);
        FloaterSmall1.mirror = true;
        setRotation(FloaterSmall1, 0F, 0F, 0F);
        FloaterSmall2 = new ModelRenderer(this, 0, 18);
        FloaterSmall2.addBox(0F, 0F, 0F, 2, 1, 2);
        FloaterSmall2.setRotationPoint(-1F, 21F, -1F);
        FloaterSmall2.setTextureSize(64, 32);
        FloaterSmall2.mirror = true;
        setRotation(FloaterSmall2, 0F, 0F, 0F);
        PearlVert1 = new ModelRenderer(this, 17, 18);
        PearlVert1.addBox(-1F, 0F, -1F, 2, 1, 2);
        PearlVert1.setRotationPoint(0F, 13F, 0F);
        PearlVert1.setTextureSize(64, 32);
        PearlVert1.mirror = true;
        setRotation(PearlVert1, 0F, 0F, 0F);
        PearlVert2 = new ModelRenderer(this, 17, 18);
        PearlVert2.addBox(-1F, 0F, -1F, 2, 1, 2);
        PearlVert2.setRotationPoint(0F, 18F, 0F);
        PearlVert2.setTextureSize(64, 32);
        PearlVert2.mirror = true;
        setRotation(PearlVert2, 0F, 0F, 0F);
        PearlSide1 = new ModelRenderer(this, 17, 18);
        PearlSide1.addBox(2F, -1F, -1F, 1, 2, 2);
        PearlSide1.setRotationPoint(0F, 16F, 0F);
        PearlSide1.setTextureSize(64, 32);
        PearlSide1.mirror = true;
        setRotation(PearlSide1, 0F, 0F, 0F);
        PearlSide3 = new ModelRenderer(this, 17, 18);
        PearlSide3.addBox(2F, -1F, -1F, 1, 2, 2);
        PearlSide3.setRotationPoint(0F, 16F, 0F);
        PearlSide3.setTextureSize(64, 32);
        PearlSide3.mirror = true;
        setRotation(PearlSide3, 0F, 3.141593F, 0F);
        PearlSide4 = new ModelRenderer(this, 17, 18);
        PearlSide4.addBox(2F, -1F, -1F, 1, 2, 2);
        PearlSide4.setRotationPoint(0F, 16F, 0F);
        PearlSide4.setTextureSize(64, 32);
        PearlSide4.mirror = true;
        setRotation(PearlSide4, 0F, 1.570796F, 0F);
        PearlSide2 = new ModelRenderer(this, 17, 18);
        PearlSide2.addBox(2F, -1F, -1F, 1, 2, 2);
        PearlSide2.setRotationPoint(0F, 16F, 0F);
        PearlSide2.setTextureSize(64, 32);
        PearlSide2.mirror = true;
        setRotation(PearlSide2, 0F, -1.570796F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        FrameTop2.render(f5);
        FrameTop1.render(f5);
        FrameSide1.render(f5);
        FrameSide2.render(f5);
        FrameSide3.render(f5);
        FrameSide4.render(f5);
        PearlCube1.render(f5);
        FloaterBig2.render(f5);
        FloaterBig1.render(f5);
        FloaterSmall1.render(f5);
        FloaterSmall2.render(f5);
        PearlVert1.render(f5);
        PearlVert2.render(f5);
        PearlSide1.render(f5);
        PearlSide3.render(f5);
        PearlSide4.render(f5);
        PearlSide2.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}