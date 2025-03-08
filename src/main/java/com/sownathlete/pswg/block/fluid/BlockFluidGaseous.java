package com.sownathlete.pswg.block.fluid;

import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockFluidGaseous extends BlockFluidClassic {
    public BlockFluidGaseous(Fluid fluid, Material material) {
        super(fluid, material);
    }

    public int getFluidDensity(World world, int x, int y, int z) {
        return -1000; // A negative density causes entities to float
    }
}