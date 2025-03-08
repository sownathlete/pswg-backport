package com.sownathlete.pswg.handler;

import java.util.Map;

import com.sownathlete.pswg.container.SwgFluids;
import com.sownathlete.pswg.item.ItemCustomBucket;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class BucketHandler {

    @SubscribeEvent
    public void onBucketFill(FillBucketEvent event) {

        // Iterate over all registered fluids
        for (Map.Entry<String, Fluid> entry : SwgFluids.getRegisteredFluids().entrySet()) {
            String fluidName = entry.getKey();
            Fluid fluid = entry.getValue();

            // Check if the block clicked on is the fluid's block
            if (event.world.getBlock(event.target.blockX, event.target.blockY, event.target.blockZ) == fluid.getBlock()) {

                // Check if the player is holding an empty bucket
                if (event.current.getItem() == Items.bucket) {

                    // Replace the empty bucket with a bucket filled with the custom fluid
                    event.result = new ItemStack(ItemCustomBucket.getBucketForFluid(fluidName));
                    event.world.setBlockToAir(event.target.blockX, event.target.blockY, event.target.blockZ); // remove the fluid block
                    event.setResult(Event.Result.ALLOW);  // mark the event as handled
                    return;
                }
            }
        }
    }
}
