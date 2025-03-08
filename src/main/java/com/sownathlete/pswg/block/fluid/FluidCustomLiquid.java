package com.sownathlete.pswg.block.fluid;

import net.minecraftforge.fluids.Fluid;

public class FluidCustomLiquid extends Fluid {
    private boolean isAcid;


    public FluidCustomLiquid(String fluidName) {
        super(fluidName);

    }

    @Override
    public Fluid setLuminosity(int luminosity) {
        this.luminosity = luminosity;
        return this;
    }

    @Override
    public Fluid setTemperature(int temperature) {
        this.temperature = temperature;
        return this;
    }

    @Override
    public Fluid setDensity(int density) {
        this.density = density;
        return this;
    }

    @Override
    public Fluid setViscosity(int viscosity) {
        this.viscosity = viscosity;
        return this;
    }

    // Add a getter and setter for the isAcid field.
    public boolean getIsAcid() {
        return this.isAcid;
    }

    public void setIsAcid(boolean isAcid) {
        this.isAcid = isAcid;
    }
}
