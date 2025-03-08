package com.sownathlete.pswg.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import com.sownathlete.pswg.Galaxies;

public class BlockCustomTransparent extends Block {
    private final String textureName;
    private final String renderLayer;
    private IIcon blockIcon;

    public BlockCustomTransparent(String name, String textureName, Material material, float hardness, String harvestTool, int harvestLevel, Block.SoundType stepSound, String renderLayer) {
        super(material);
        this.textureName = textureName;
        this.renderLayer = renderLayer;
        setBlockName(name);
        setHardness(hardness);
        setHarvestLevel(harvestTool, harvestLevel);
        setStepSound(stepSound);
        this.setCreativeTab(Galaxies.TabBlocks); // Set creative tab
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("pswg:" + this.textureName); // Register the correct texture
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return this.blockIcon;
    }

    @Override
    public boolean isOpaqueCube() {
        return false; // Makes the block non-solid for transparency
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false; // Allows transparency to be rendered
    }

    @Override
    public int getRenderBlockPass() {
        return this.renderLayer.equals("TRANSLUCENT") ? 1 : 0; // TRANSLUCENT blocks require 2-pass rendering
    }

    /**
     * Prevents rendering inner faces when adjacent to the same block
     */
    @Override
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
        Block adjacentBlock = world.getBlock(x, y, z);
        return adjacentBlock != this; // Hides faces when adjacent to the same block
    }
}
