package com.sownathlete.pswg.container;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import com.sownathlete.pswg.block.fluid.BlockFluidCustom;
import com.sownathlete.pswg.block.fluid.FluidCustomLiquid;
import com.sownathlete.pswg.item.ItemCustomBucket;

public class SwgFluids {
    private static Map<String, Fluid> registeredFluids = new HashMap<>();
    private static Map<String, BlockFluidCustom> registeredFluidBlocks = new HashMap<>();

    public static void register() {
    }

    public static <T extends FluidCustomLiquid> T registerFluid(Class<T> fluidClass, String name, boolean gaseous, int density, int viscosity, int luminosity, int temperature, boolean isAcid) {
        // Create an instance of the fluid using reflection.
        T fluid;
        try {
            Constructor<T> constructor = fluidClass.getConstructor(String.class);
            fluid = constructor.newInstance(name);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        fluid.setDensity(density);
        fluid.setViscosity(viscosity);
        fluid.setLuminosity(luminosity);
        fluid.setTemperature(temperature);
        fluid.setIsAcid(isAcid); // Set the isAcid flag.

        // Register the fluid with the FluidRegistry.
        FluidRegistry.registerFluid(fluid);

        // Create and register the corresponding block.
        BlockFluidCustom blockFluid = new BlockFluidCustom(fluid, Material.water); // Replace Material.water with the appropriate material for your fluid.
        blockFluid.setBlockName(name); // Make sure this is unique.
        GameRegistry.registerBlock(blockFluid, name);

        // Add the block to the map of registered fluid blocks.
        registeredFluidBlocks.put(name, blockFluid);

        // Create and register the corresponding bucket.
        ItemCustomBucket bucketItem = new ItemCustomBucket(blockFluid);
        bucketItem.setUnlocalizedName(name + "_bucket"); // Make sure this is unique.
        GameRegistry.registerItem(bucketItem, name + "_bucket");

        // Register the bucket in the Forge BucketHandler.
        FluidContainerRegistry.registerFluidContainer(fluid, new ItemStack(bucketItem), FluidContainerRegistry.EMPTY_BUCKET);

        // Store the registered fluid in the HashMap using its name as the key
        registeredFluids.put(name, fluid);

        return fluid;
    }

    public static Map<String, Fluid> getRegisteredFluids() {
        return registeredFluids;
    }

    public static Fluid getRegisteredFluid(String fluidName) {
        return registeredFluids.get(fluidName);
    }

    public static BlockFluidCustom getRegisteredFluidBlock(String fluidName) {
        return registeredFluidBlocks.get(fluidName);
    }
}