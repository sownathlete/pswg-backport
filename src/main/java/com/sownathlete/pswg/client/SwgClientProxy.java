package com.sownathlete.pswg.client;

import com.sownathlete.pswg.Galaxies;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;

@SideOnly(Side.CLIENT)
public class SwgClientProxy extends SwgCommonProxy {

    @Override
    public void doSidedThings() {
        // Assign Minecraft instance if necessary, but usually, it's redundant.
        // Galaxies.mc is unnecessary since we can call Minecraft.getMinecraft() directly.
    }

    @Override
    public void onPreload() {
        System.setProperty("fml.skipFirstTextureLoad", "false");
    }

    @Override
    public void registerRendering() {
        // Register any rendering-related logic here if needed.
    }
}
