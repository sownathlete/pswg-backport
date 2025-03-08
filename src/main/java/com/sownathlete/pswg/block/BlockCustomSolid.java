package com.sownathlete.pswg.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

public class BlockCustomSolid extends BlockCustom {
    private boolean selfDropped = false;
    private Block blockDropped;
    private Item itemDropped;
    private boolean isMultiSided = false;
    private IIcon[] field_150158_M;
    private IIcon field_150159_N;
    private IIcon field_150160_O;
    private static final String[] field_150156_b = new String[]{""};
    private String textureName; // Add this field to hold the texture name

    private Item droppedItem = null;
    private int droppedMeta = 0;
    private Block droppedBlock = null;
    private int minDrops = 1;
    private int maxDrops = 1;
    private float experience = 0;

    public BlockCustomSolid(String name, Material material, float hardness, String harvestTool, int harvestLevel, Block.SoundType stepSound, boolean isMultiSided) {
        super(name, material, hardness, harvestTool, harvestLevel, stepSound);
        this.isMultiSided = isMultiSided;
        this.textureName = name; // set the texture name when the block is constructed
    }

    // Add a getter for the texture name
    @Override
    public String getTextureName() {
        return this.textureName;
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        if (selfDropped) {
            return Item.getItemFromBlock(this);
        }
        if (droppedBlock != null) {
            return Item.getItemFromBlock(droppedBlock);
        }
        return droppedItem;
    }
    
    // Set the range of drop amounts
    public void setMinMaxDrops(int min, int max) {
        this.minDrops = min;
        this.maxDrops = max;
    }

    // Set the experience to drop
    public void setExperience(float exp) {
        this.experience = exp;
    }
    
    public void setExperienceDropped(float experience) {
        this.experience = experience;
    }

    @Override
    public int getExpDrop(IBlockAccess world, int metadata, int fortune) {
        Random rand = new Random();
        return this.experience > 0 ? Math.round(this.experience + rand.nextFloat() * fortune) : 0;
    }

    @Override
    public int quantityDropped(Random random) {
        return minDrops + random.nextInt(maxDrops - minDrops + 1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        if (this.isMultiSided) {
            this.field_150158_M = new IIcon[field_150156_b.length];
            for (int i = 0; i < this.field_150158_M.length; ++i) {
                this.field_150158_M[i] = par1IconRegister.registerIcon("pswg:" + this.name + field_150156_b[i]);
            }
            this.field_150159_N = par1IconRegister.registerIcon("pswg:" + this.name + "_top");
            this.field_150160_O = par1IconRegister.registerIcon("pswg:" + this.name + "_bottom");
        } else {
            // Initialize the icons array
            this.icons = new IIcon[1];
            // For single-sided texture, simply load a single icon
            this.icons[0] = par1IconRegister.registerIcon("pswg:" + this.name);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (this.isMultiSided) {
            if (side != 1 && (side != 0 || meta != 1 && meta != 2)) {
                if (side == 0)
                    return this.field_150160_O;
                if (meta < 0 || meta >= this.field_150158_M.length) {
                    meta = 0;
                }
                return this.field_150158_M[meta];
            }
            return this.field_150159_N;
        } else
            // If the block isn't multi-sided, we just return the first icon
            return this.icons[0];
    }

    public void setSelfDropped(boolean selfDropped) {
        this.selfDropped = selfDropped;
    }

    public void setBlockDropped(Block blockDropped) {
        this.blockDropped = blockDropped;
    }

    public void setItemDropped(Item itemDropped) {
        this.itemDropped = itemDropped;
    }

    @Override
    public int damageDropped(int metadata) {
        return this.droppedMeta;
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        if (fortune > 0) {
            int bonus = random.nextInt(fortune + 2) - 1;
            if (bonus < 0) {
                bonus = 0;
            }
            return this.quantityDropped(random) * (bonus + 1);
        }
        return this.quantityDropped(random);
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();

        if(this.selfDropped) {
            drops.add(new ItemStack(Item.getItemFromBlock(this), 1, metadata));
        } else {
            if(this.blockDropped != null) {
                drops.add(new ItemStack(Item.getItemFromBlock(this.blockDropped), 1, 0)); // adjust metadata and quantity if necessary
            } else if (this.itemDropped != null) {
                drops.add(new ItemStack(this.itemDropped, 1, 0)); // adjust metadata and quantity if necessary
            }
        }

        return drops;
    }
}