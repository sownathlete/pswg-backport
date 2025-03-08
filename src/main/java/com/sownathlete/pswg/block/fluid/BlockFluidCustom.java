package com.sownathlete.pswg.block.fluid;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFluidCustom extends BlockFluidClassic {
    private static final Random rand = new Random();
    @SideOnly(Side.CLIENT)
    protected IIcon stillIcon;
    @SideOnly(Side.CLIENT)
    protected IIcon flowingIcon;

    private FluidCustomLiquid customFluid;  // Keep a reference to the custom fluid

    public BlockFluidCustom(Fluid fluid, Material material) {
        super(fluid, material);
        if (fluid instanceof FluidCustomLiquid) {
            this.customFluid = (FluidCustomLiquid) fluid;
        } else
            throw new IllegalArgumentException("BlockFluidCustom requires a FluidCustomLiquid instance.");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.stillIcon = iconRegister.registerIcon("pswg:" + this.fluidName + "_still");
        this.flowingIcon = iconRegister.registerIcon("pswg:" + this.fluidName + "_flow");
        this.getFluid().setIcons(this.stillIcon, this.flowingIcon);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return side != 0 && side != 1 ? this.flowingIcon : this.stillIcon;
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        if (!world.isRemote && this.customFluid.getIsAcid() && entity instanceof EntityLivingBase) {
            ((EntityLivingBase) entity).attackEntityFrom(DamageSource.generic, 0.5F);
        }
        if (entity instanceof EntityLivingBase) {
            entity.motionX += (this.rand.nextFloat() - this.rand.nextFloat()) * 0.001F;
            entity.motionY += (this.rand.nextFloat() - this.rand.nextFloat()) * 0.001F;
            entity.motionZ += (this.rand.nextFloat() - this.rand.nextFloat()) * 0.001F;
        }
    }


}
