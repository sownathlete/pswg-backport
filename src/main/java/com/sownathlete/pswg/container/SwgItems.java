/*
 * Decompiled with CFR 0.148.
 *
 * Could not load the following classes:
 *  cpw.mods.fml.common.registry.GameRegistry
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemArmor$ArmorMaterial
 *  net.minecraft.item.ItemFood
 */
package com.sownathlete.pswg.container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sownathlete.pswg.Galaxies;
import com.sownathlete.pswg.block.CustomBlockCrops;
import com.sownathlete.pswg.item.ItemCustom;
import com.sownathlete.pswg.item.ItemCustomArmor;
import com.sownathlete.pswg.item.ItemCustomAxe;
import com.sownathlete.pswg.item.ItemCustomBow;
import com.sownathlete.pswg.item.ItemCustomHoe;
import com.sownathlete.pswg.item.ItemCustomPickaxe;
import com.sownathlete.pswg.item.ItemCustomShovel;
import com.sownathlete.pswg.item.ItemCustomSword;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.Fluid;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;

public class SwgItems {
    private static final Map<String, Item> registeredItems = new HashMap<>();
    
    public static List<Item> tools = new ArrayList<Item>();
    public static List<Item> weapons = new ArrayList<Item>();
    public static List<Item> hyperdrives = new ArrayList<Item>();
    public static List<Item> materials = new ArrayList<Item>();
    public static List<Item> misc = new ArrayList<Item>();
    public static List<Item> food = new ArrayList<Item>();
    public static List<Item> story = new ArrayList<Item>();
    public static List<Item> spawning = new ArrayList<Item>();
    public static List<Item> deco = new ArrayList<Item>();
    public static List<Item> glassItems = new ArrayList<>();
    
    public static void register() {
    	// Explosives
    	SwgItems.registerItem("thermal_detonator");

    	// Spawners (Entity Spawn Items)
    	SwgItems.registerItem("spawn_xwing_t65b");
    	SwgItems.registerItem("spawn_landspeeder_x34");
    	SwgItems.registerItem("spawn_zephyr_j");

    	// Spawn Eggs (Mob Spawners)
    	SwgItems.registerItem("spawn_faa");
    	SwgItems.registerItem("spawn_laa");
    	SwgItems.registerItem("spawn_worrt");
    	SwgItems.registerItem("spawn_bantha");
    	SwgItems.registerItem("spawn_sand_skitter");

    	// Miscellaneous Items
    	SwgItems.registerItem("mannequin");
    	SwgItems.registerItem("mannequin_wizard");
    	
    	// Blaster Items
    	SwgItems.registerItem("small_power_pack");

    	// Mob Drops (Bucket Items)
    	SwgItems.registerItem("faa_bucket");
    	SwgItems.registerItem("laa_bucket");

    	// Mob Drops (Loot Items)
    	SwgItems.registerItem("corpse_of_gorg");
    	SwgItems.registerItem("bantha_horn");
    	SwgItems.registerItem("dewback_bone");
    	SwgItems.registerItem("dewback_bone_shard");
    	SwgItems.registerItem("eye_of_sketto");
    	SwgItems.registerItem("hide");
    	SwgItems.registerItem("krayt_pearl");
    	SwgItems.registerItem("krayt_tooth");
    	SwgItems.registerItem("kreetle_husk");
    	SwgItems.registerItem("lizard_gizzard");
    	SwgItems.registerItem("squill_liver");
    	SwgItems.registerItem("tongue_of_worrt");
    	SwgItems.registerItem("tough_hide");
    	
    	// Regular Food Items
    	SwgItems.registerFood("jogan_fruit", 4, 0.3F, false);
    	SwgItems.registerFood("chasuka_leaf", 4, 0.3F, false);
    	SwgItems.registerFood("meiloorun", 4, 0.3F, false);
    	SwgItems.registerFood("mynock_wing", 3, 0.3F, false);
    	SwgItems.registerFood("cooked_mynock_wing", 8, 0.8F, false);
    	SwgItems.registerFood("bantha_chop", 3, 0.3F, false);
    	SwgItems.registerFood("cooked_bantha_chop", 8, 0.8F, false);
    	SwgItems.registerFood("nerf_chop", 3, 0.3F, false);
    	SwgItems.registerFood("cooked_nerf_chop", 8, 0.8F, false);
    	SwgItems.registerFood("gizka_chop", 3, 0.3F, false);
    	SwgItems.registerFood("cooked_gizka_chop", 8, 0.8F, false);
    	SwgItems.registerFood("flangth_takeout", 3, 0.3F, false);
    	SwgItems.registerFood("flangth_plate", 8, 0.8F, false);
    	SwgItems.registerFood("bantha_cookie", 5, 0.6F, false);
    	SwgItems.registerFood("qrikki_bread", 5, 0.6F, false);
    	SwgItems.registerFood("qrikki_waffle", 8, 0.7F, false);
    	SwgItems.registerFood("ahrisa_bowl", 4, 0.3F, false);
    	SwgItems.registerFood("black_melon", 2, 0.3F, false);
    	SwgItems.registerFood("desert_plums", 2, 0.3F, false);
    	SwgItems.registerFood("dried_poonten_grass_bushel", 2, 0.3F, false);
    	SwgItems.registerFood("haroun_bread", 5, 0.3F, false);
    	SwgItems.registerFood("hkak_bean", 2, 0.3F, false);
    	SwgItems.registerFood("pallie_fruit", 2, 0.3F, false);
    	SwgItems.registerFood("pika_fruit", 2, 0.3F, false);
    	SwgItems.registerFood("tuber", 2, 0.3F, false);
    	SwgItems.registerFood("cooked_eopie_loin", 8, 0.3F, false);
    	SwgItems.registerFood("crispy_gorg", 6, 0.3F, false);
    	SwgItems.registerFood("dewback_egg", 4, 0.3F, false);
    	SwgItems.registerFood("dewback_omelette", 6, 0.3F, false);
    	SwgItems.registerFood("jerba_rack", 4, 0.3F, false);
    	SwgItems.registerFood("jerba_rib", 8, 0.3F, false);
    	SwgItems.registerFood("krayt_meat", 6, 0.3F, false);
    	SwgItems.registerFood("raw_sketto_nugget", 2, 0.3F, false);
    	SwgItems.registerFood("roast_krayt", 8, 0.3F, false);
    	SwgItems.registerFood("ronto_chuck", 3, 0.3F, false);
    	SwgItems.registerFood("tuber_mash", 4, 0.3F, false);
    	SwgItems.registerFood("vaporator_mushroom", 2, 0.3F, false);
    	SwgItems.registerFood("worrt_egg", 2, 0.3F, false);
    	SwgItems.registerFood("deb_deb", 2, 0.3F, false);
    	SwgItems.registerFood("eopie_loin", 3, 0.3F, false);
    	SwgItems.registerFood("hubba_gourd", 2, 0.3F, false);

    	// Liquid Food Items
    	SwgItems.registerFood("death_stick_red", 3, 0.3F, false);
    	SwgItems.registerFood("death_stick_yellow", 3, 0.3F, false);
    	SwgItems.registerFood("mysterious_smoothie", 3, 0.3F, false);
    	SwgItems.registerFood("kreetlejuice", 3, 0.3F, false);
    	SwgItems.registerFood("absynthesized_malt", 3, 0.3F, false);
    	SwgItems.registerFood("coronet_cocktail", 3, 0.3F, false);
    	SwgItems.registerFood("classic_soda", 3, 0.3F, false);
    	SwgItems.registerFood("diet_soda", 3, 0.3F, false);
    	SwgItems.registerFood("citrus_soda", 3, 0.3F, false);
    	SwgItems.registerFood("bottled_water", 3, 0.3F, false);
    	SwgItems.registerFood("blue_milk", 4, 0.3F, false);
    	SwgItems.registerFood("blue_milk_glass", 4, 0.3F, false);
    	SwgItems.registerFood("blue_yogurt", 4, 0.3F, false);
    	
    	// Single Food Prep Items
    	SwgItems.registerItem("durasteel_cup");
    	SwgItems.registerItem("desh_cup");

    	// Dyed Items (Cups)
    	for (int color = 0; color < 16; color++) { // Assuming 16 dye colors like vanilla MC
    	    SwgItems.registerItem("cup_" + color);
    	}

    	// Numbered Items (Glasses)
    	for (int i = 1; i <= 10; i++) { 
    	    SwgItems.registerItem("glass_" + i);
    	}

    	// Numbered Items (Glass Bottles)
    	for (int i = 1; i <= 3; i++) { 
    	    SwgItems.registerItem("glass_bottle_" + i);
    	}

    	// Numbered Items (Plastic Bottles)
    	for (int i = 1; i <= 2; i++) { 
    	    SwgItems.registerItem("plastic_bottle_" + i);
    	}
    	
    	SwgItems.registerItem("chasuka_seeds");

    	SwgItems.registerItem("stripped_japor_branch");
    	SwgItems.registerItem("molo_flower");
    	SwgItems.registerItem("salt_pile");

    	SwgItems.registerItem("raw_beskar");
    	SwgItems.registerItem("beskar_ingot");

    	SwgItems.registerItem("raw_chromium");
    	SwgItems.registerItem("chromium_ingot");
    	SwgItems.registerItem("chromium_nugget");

    	SwgItems.registerItem("raw_cortosis");
    	SwgItems.registerItem("cortosis_ingot");

    	SwgItems.registerItem("raw_desh");
    	SwgItems.registerItem("desh_ingot");
    	SwgItems.registerItem("desh_nugget");

    	SwgItems.registerItem("raw_diatium");
    	SwgItems.registerItem("diatium_ingot");
    	SwgItems.registerItem("diatium_nugget");

    	SwgItems.registerItem("durasteel_ingot");
    	SwgItems.registerItem("durasteel_nugget");

    	SwgItems.registerItem("exonium");
    	SwgItems.registerItem("helicite_crystal");
    	SwgItems.registerItem("helicite_dust");

    	SwgItems.registerItem("raw_ionite");
    	SwgItems.registerItem("ionite_ingot");
    	SwgItems.registerItem("ionite_nugget");

    	SwgItems.registerItem("raw_kelerium");
    	SwgItems.registerItem("kelerium_ingot");

    	SwgItems.registerItem("lommite_crystal");
    	SwgItems.registerItem("lommite_dust");

    	SwgItems.registerItem("plasteel_ingot");
    	SwgItems.registerItem("plasteel_nugget");

    	SwgItems.registerItem("raw_rubindum");
    	SwgItems.registerItem("rubindum_shard");

    	SwgItems.registerItem("thorilide_crystal");
    	SwgItems.registerItem("thorilide_dust");

    	SwgItems.registerItem("raw_titanium");
    	SwgItems.registerItem("titanium_ingot");
    	SwgItems.registerItem("titanium_nugget");

    	SwgItems.registerItem("transparisteel_ingot");

    	SwgItems.registerItem("zersium_crystal");
    	SwgItems.registerItem("zersium_dust");

        SwgItems.registerToolSet("beskar", 2500, 15, SwgItems.getRegisteredItem("beskar_ingot"));
        SwgItems.registerToolSet("durasteel", 1500, 12, SwgItems.getRegisteredItem("durasteel_ingot"));
        SwgItems.registerToolSet("titanium", 2000, 13, SwgItems.getRegisteredItem("titanium_ingot"));

    	SwgItems.registerItem("electric_motor");
    	SwgItems.registerItem("turbine");
    	SwgItems.registerItem("ball_bearing");
    	SwgItems.registerItem("desh_wire");
    	SwgItems.registerItem("desh_coil");
    	SwgItems.registerItem("light_panel");
    	SwgItems.registerItem("display_panel");
    	SwgItems.registerItem("plasteel_rod");
    	SwgItems.registerItem("durasteel_rod");

    	SwgItems.registerItem("insulated_desh_cable");

    	// Assuming `DyedItems` is handled separately for dye-based registration.
    	SwgItems.registerItem("door_insert");

    	SwgItems.registerArmorSet("phase1_clonetrooper", 15, new int[]{3, 6, 5, 2}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmorSet("phase2_clonetrooper", 15, new int[]{3, 6, 5, 2}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmorSet("elite_squad", 15, new int[]{3, 6, 5, 2}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmorSet("stormtrooper", 15, new int[]{3, 6, 5, 2}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmorSet("shocktrooper", 15, new int[]{3, 6, 5, 2}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmorSet("purgetrooper", 15, new int[]{3, 6, 5, 2}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmorSet("artillerytrooper", 15, new int[]{3, 6, 5, 2}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmorSet("incineratortrooper", 15, new int[]{3, 6, 5, 2}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmorSet("sandtrooper", 15, new int[]{3, 6, 5, 2}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmorSet("deathtrooper", 15, new int[]{3, 6, 5, 2}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmorSet("scouttrooper", 15, new int[]{3, 6, 5, 2}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmorSet("hovertankpilot", 15, new int[]{3, 6, 5, 2}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmorSet("shoretrooper", 15, new int[]{3, 6, 5, 2}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmorSet("jumptrooper", 15, new int[]{3, 6, 5, 2}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));

    	SwgItems.registerItem("artillerytrooper_backpack");
    	SwgItems.registerItem("incineratortrooper_tank");
    	SwgItems.registerItem("sandtrooper_backpack");
    	SwgItems.registerItem("jumptrooper_jetpack");
    	SwgItems.registerItem("brown_specialist_backpack");
    	SwgItems.registerItem("green_specialist_backpack");
    	SwgItems.registerItem("white_light_backpack");
    	SwgItems.registerItem("green_light_backpack");
    	SwgItems.registerItem("tan_light_backpack");
    	SwgItems.registerItem("white_heavy_backpack");
    	SwgItems.registerItem("green_heavy_backpack");
    	SwgItems.registerItem("tan_heavy_backpack");
    	SwgItems.registerItem("cj33_jetpack");
    	SwgItems.registerItem("jt12_jetpack");
    	SwgItems.registerItem("z6_jetpack");
    	SwgItems.registerItem("rebel_jump_pack");

    	SwgItems.registerArmor("imperial_pilot_helmet", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmor("imperial_pilot_kit", "Chestplate", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot")); // "Kit" -> "Chestplate"
    	SwgItems.registerArmor("imperial_pilot_cadet_helmet", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmor("imperial_pilot_technical_helmet", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmor("imperial_pilot_cold_helmet", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmor("rebel_pilot_helmet", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmor("rebel_pilot_kit", "Chestplate", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot")); // "Kit" -> "Chestplate"
    	SwgItems.registerArmor("rebel_forest_helmet", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmor("rebel_tropical_helmet", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));

    	// Fixing invalid armor types:
    	SwgItems.registerArmor("black_imperial_officer_hat", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot")); // "Hat" -> "Helmet"
    	SwgItems.registerArmor("gray_imperial_officer_hat", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmor("light_gray_imperial_officer_hat", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmor("khaki_imperial_officer_hat", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));

    	// Goggles are likely headwear, so mapping to Helmet:
    	SwgItems.registerArmor("tan_goggles_cap", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot")); // "Cap" -> "Helmet"
    	SwgItems.registerArmor("gray_goggles_cap", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmor("brown_goggles_Cap", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));

    	// Fixing "Hat" to "Helmet"
    	SwgItems.registerArmor("beach_insurgence_hat", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));
    	SwgItems.registerArmor("desert_insurgence_hat", "Helmet", 15, new int[]{2, 5, 4, 1}, 10, SwgItems.getRegisteredItem("durasteel_ingot"));

    	SwgItems.registerItem("debug");
    }


    public static Item registerItem(String name) {
        if (registeredItems.containsKey(name))
            return registeredItems.get(name);
        else {
            Item item = new ItemCustom(name);
            GameRegistry.registerItem(item, name);
            registeredItems.put(name, item);
            return item;
        }
    }

    public static Item getRegisteredItem(String name) {
        return registeredItems.get(name);
    }

    public static void registerToolSet(String name, int durability, int enchantability, Item craftingIngot) {
        // Create and register tool material.
        Item.ToolMaterial material = EnumHelper.addToolMaterial(name, 3, durability, 8.0F, 3.0F, enchantability);
        Item shovel = new ItemCustomShovel(material)
                .setUnlocalizedName("pswg." + name.toLowerCase() + "_shovel")
                .setTextureName("pswg:" + name.toLowerCase() + "_shovel")
                .setCreativeTab(Galaxies.TabItems);
        Item pickaxe = new ItemCustomPickaxe(material)
                .setUnlocalizedName("pswg." + name.toLowerCase() + "_pickaxe")
                .setTextureName("pswg:" + name.toLowerCase() + "_pickaxe")
                .setCreativeTab(Galaxies.TabItems);
        Item axe = new ItemCustomAxe(material)
                .setUnlocalizedName("pswg." + name.toLowerCase() + "_axe")
                .setTextureName("pswg:" + name.toLowerCase() + "_axe")
                .setCreativeTab(Galaxies.TabItems);
        Item hoe = new ItemCustomHoe(material)
                .setUnlocalizedName("pswg." + name.toLowerCase() + "_hoe")
                .setTextureName("pswg:" + name.toLowerCase() + "_hoe")
                .setCreativeTab(Galaxies.TabItems);
        //Item sword = new ItemCustomSword(material)
        //        .setUnlocalizedName("pswg." + name.toLowerCase() + "_sword")
        //        .setTextureName("pswg:" + name.toLowerCase() + "_sword")
        //        .setCreativeTab(Galaxies.TabItems);

        // Register tools.
        GameRegistry.registerItem(shovel, name.toLowerCase() + "_shovel");
        GameRegistry.registerItem(pickaxe, name.toLowerCase() + "_pickaxe");
        GameRegistry.registerItem(axe, name.toLowerCase() + "_axe");
        GameRegistry.registerItem(hoe, name.toLowerCase() + "_hoe");
        //GameRegistry.registerItem(sword, name + "Sword");

        // Register recipes
        GameRegistry.addShapedRecipe(new ItemStack(shovel, 1), new Object[]{" A ", " B ", " B ", Character.valueOf('A'), craftingIngot, Character.valueOf('B'), Items.stick});
        GameRegistry.addShapedRecipe(new ItemStack(pickaxe, 1), new Object[]{"AAA", " B ", " B ", Character.valueOf('A'), craftingIngot, Character.valueOf('B'), Items.stick});
        GameRegistry.addShapedRecipe(new ItemStack(axe, 1), new Object[]{"AA ", "AB ", " B ", Character.valueOf('A'), craftingIngot, Character.valueOf('B'), Items.stick});
        GameRegistry.addShapedRecipe(new ItemStack(hoe, 1), new Object[]{"AA ", " B ", " B ", Character.valueOf('A'), craftingIngot, Character.valueOf('B'), Items.stick});
        //GameRegistry.addShapedRecipe(new ItemStack(sword, 1), new Object[]{" A ", " A ", " B ", Character.valueOf('A'), craftingIngot, Character.valueOf('B'), Items.stick});
    }

    // Define constants for the armor materials
    public static final ItemArmor.ArmorMaterial LEATHER = ItemArmor.ArmorMaterial.CLOTH;
    public static final ItemArmor.ArmorMaterial IRON = ItemArmor.ArmorMaterial.IRON;
    public static final ItemArmor.ArmorMaterial GOLD = ItemArmor.ArmorMaterial.GOLD;
    public static final ItemArmor.ArmorMaterial DIAMOND = ItemArmor.ArmorMaterial.DIAMOND;
    public static final ItemArmor.ArmorMaterial CHAINMAIL = ItemArmor.ArmorMaterial.CHAIN;

    // Durability variables for each armor type
    public static final int LEATHER_DURABILITY = 5;
    public static final int IRON_DURABILITY = 15;
    public static final int GOLD_DURABILITY = 7;
    public static final int DIAMOND_DURABILITY = 33;
    public static final int CHAINMAIL_DURABILITY = 12;

    // Enchantability variables for each armor type
    public static final int LEATHER_ENCHANTABILITY = 15;
    public static final int IRON_ENCHANTABILITY = 9;
    public static final int GOLD_ENCHANTABILITY = 25;
    public static final int DIAMOND_ENCHANTABILITY = 10;
    public static final int CHAINMAIL_ENCHANTABILITY = 12;

    // Reduction amounts variables for each armor type
    public static final int[] LEATHER_REDUCTION_AMOUNTS = new int[]{1, 2, 1, 1};
    public static final int[] IRON_REDUCTION_AMOUNTS = new int[]{2, 5, 3, 1};
    public static final int[] GOLD_REDUCTION_AMOUNTS = new int[]{2, 5, 3, 1};
    public static final int[] DIAMOND_REDUCTION_AMOUNTS = new int[]{3, 8, 6, 3};
    public static final int[] CHAINMAIL_REDUCTION_AMOUNTS = new int[]{2, 5, 4, 1};

    public static Item registerArmor(String name, String armorType, int durability, int[] reductionAmounts, int enchantability, Item craftingIngot) {
        String formattedName = name.toLowerCase();
        if (!armorType.equalsIgnoreCase("helmet") && !armorType.equalsIgnoreCase("chestplate") && 
            !armorType.equalsIgnoreCase("leggings") && !armorType.equalsIgnoreCase("boots")) {
            formattedName += "_" + armorType.toLowerCase();
        }
        
        if (registeredItems.containsKey(formattedName)) return registeredItems.get(formattedName);
        
        // Create and register armor material.
        ItemArmor.ArmorMaterial material = EnumHelper.addArmorMaterial(name, durability, reductionAmounts, enchantability);
        Item armor = null;
        int armorIndex = -1;
        
        switch (armorType.toLowerCase()) {
            case "helmet":
                armorIndex = 0;
                break;
            case "chestplate":
                armorIndex = 1;
                break;
            case "leggings":
                armorIndex = 2;
                break;
            case "boots":
                armorIndex = 3;
                break;
        }
        
        if (armorIndex != -1) {
            armor = new ItemCustomArmor(material, armorIndex, formattedName)
                .setUnlocalizedName("pswg." + formattedName)
                .setTextureName("pswg:" + formattedName)
                .setCreativeTab(Galaxies.TabItems);
            GameRegistry.registerItem(armor, formattedName);
            registeredItems.put(formattedName, armor);
        }
        return armor;
    }

    public static void registerArmorSet(String name, int durability, int[] reductionAmounts, int enchantability, Item craftingIngot) {
        // Create and register armor material.
        ItemArmor.ArmorMaterial material = EnumHelper.addArmorMaterial(name, durability, reductionAmounts, enchantability);
        
        // Define formatted names
        String helmetName = name.toLowerCase() + "_helmet";
        String chestplateName = name.toLowerCase() + "_chestplate";
        String leggingsName = name.toLowerCase() + "_leggings";
        String bootsName = name.toLowerCase() + "_boots";
        
        // Create and register armor items.
        Item helmet = new ItemCustomArmor(material, 0, helmetName);
        Item chestplate = new ItemCustomArmor(material, 1, chestplateName);
        Item leggings = new ItemCustomArmor(material, 2, leggingsName);
        Item boots = new ItemCustomArmor(material, 3, bootsName);
        
        // Register armor items.
        GameRegistry.registerItem(helmet, helmetName);
        GameRegistry.registerItem(chestplate, chestplateName);
        GameRegistry.registerItem(leggings, leggingsName);
        GameRegistry.registerItem(boots, bootsName);
        
        // Add to registered items map
        registeredItems.put(helmetName, helmet);
        registeredItems.put(chestplateName, chestplate);
        registeredItems.put(leggingsName, leggings);
        registeredItems.put(bootsName, boots);
        
        // Register recipes
        GameRegistry.addShapedRecipe(new ItemStack(helmet, 1), new Object[]{"AAA", "A A", "   ", 'A', craftingIngot});
        GameRegistry.addShapedRecipe(new ItemStack(chestplate, 1), new Object[]{"A A", "AAA", "AAA", 'A', craftingIngot});
        GameRegistry.addShapedRecipe(new ItemStack(leggings, 1), new Object[]{"AAA", "A A", "A A", 'A', craftingIngot});
        GameRegistry.addShapedRecipe(new ItemStack(boots, 1), new Object[]{"   ", "A A", "A A", 'A', craftingIngot});
    }

    public static Item registerWeapon(String name, String toolType, int durability, int enchantability, float damage) {
        if (registeredItems.containsKey(name + toolType)) return registeredItems.get(name + toolType);
        // Create and register tool material.
        Item.ToolMaterial material = EnumHelper.addToolMaterial(name, 3, durability, 8.0F, damage, enchantability);
        Item weapon = null;
        switch (toolType) {
            case "Sword":
                weapon = new ItemCustomSword(material).setUnlocalizedName("pswg." + name).setTextureName("pswg:" + name).setCreativeTab(Galaxies.TabItems);
                break;
            case "Axe":
                weapon = new ItemCustomAxe(material).setUnlocalizedName("pswg." + name).setTextureName("pswg:" + name).setCreativeTab(Galaxies.TabItems);
                break;
            case "Bow":
                weapon = new ItemCustomBow().setUnlocalizedName("pswg." + name).setTextureName("pswg:" + name).setCreativeTab(Galaxies.TabItems);
                break;
        }
        if (weapon != null) {
            GameRegistry.registerItem(weapon, name + toolType);
            registeredItems.put(name + toolType, weapon);
        }
        return weapon;
    }

    public static Item registerFood(String name, int hunger, float saturation, boolean canBePlanted) {
        // Register the food item
        ItemFood food = (ItemFood) new ItemFood(hunger, saturation, false)
                .setUnlocalizedName("pswg." + name)
                .setTextureName("pswg:" + name)
                .setCreativeTab(Galaxies.TabItems);
        GameRegistry.registerItem(food, name);
        registeredItems.put(name, food);

        if (canBePlanted) {
            // Register the corresponding plant block
            CustomBlockCrops plant = new CustomBlockCrops(name);
            plant.setBlockName("pswg." + name + "Plant")
            .setBlockTextureName("pswg:" + name + "Plant");
            GameRegistry.registerBlock(plant, name + "Plant");

            // Register the seeds item for planting the crop
            ItemSeeds seeds = (ItemSeeds) new ItemSeeds(plant, Blocks.farmland)
                    .setUnlocalizedName("pswg." + name + "Seeds")
                    .setTextureName("pswg:" + name + "Seeds")
                    .setCreativeTab(Galaxies.TabItems);
            GameRegistry.registerItem(seeds, name + "Seeds");

            // Adding planting recipe: 1 food item gives 1 seed item
            GameRegistry.addShapelessRecipe(new ItemStack(seeds, 1), food);

            // Modify the custom block to drop the right seeds and food
            plant.setCustomDrops(seeds, food);
        }

        return food;
    }


}
