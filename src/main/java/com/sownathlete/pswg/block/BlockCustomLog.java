package com.sownathlete.pswg.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.sownathlete.pswg.Galaxies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCustomLog extends BlockLog {
    private IIcon topIcon;
    private IIcon frontIcon;

    public BlockCustomLog(String name, float hardness, String harvestTool, int harvestLevel, Block.SoundType stepSound) {
        super();
        setBlockName(name);
        setBlockTextureName("galaxies:" + name);
        setHardness(hardness);
        setHarvestLevel(harvestTool, harvestLevel);
        setStepSound(stepSound);
        this.setCreativeTab(Galaxies.TabBlocks); // Set the creative tab
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.topIcon = iconRegister.registerIcon("pswg:" + getUnlocalizedName().substring(5) + "_top");
        this.frontIcon = iconRegister.registerIcon("pswg:" + getUnlocalizedName().substring(5));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        int orientation = meta & 12; // Using bitwise AND to get orientation bits

        if (orientation == 0) {
            // Standing upright (y-axis)
            if (side == 0 || side == 1) {
                return this.topIcon;
            }
            return this.frontIcon;
        } else if (orientation == 4) {
            // Lying on the side (x-axis)
            if (side == 4 || side == 5) {
                return this.topIcon;
            }
            return this.frontIcon;
        } else if (orientation == 8) {
            // Lying flat (z-axis)
            if (side == 2 || side == 3) {
                return this.topIcon;
            }
            return this.frontIcon;
        }

        // Fallback
        return this.frontIcon;
    }

    @Override
    public boolean rotateBlock(World world, int x, int y, int z, ForgeDirection axis) {
        return super.rotateBlock(world, x, y, z, axis);
    }

    // ... other overridden or additional methods ...
}
