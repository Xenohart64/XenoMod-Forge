package fr.xenohart.xeno.data;

import fr.xenohart.xeno.XenoMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, XenoMod.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        String locale = this.getName().replace("Languages: ", "");
        switch (locale){
            case"en_us":

                //ItemGroup
                add("itemGroup.xeno_block", "Xeno Building Blocks");
                add("itemGroup.xeno_decoration", "Xeno Decoration Blocks");
                add("itemGroup.xeno_redstone", "Xeno Redstone");
                add("itemGroup.xeno_miscellaneous", "Xeno Miscellaneous");
                add("itemGroup.xeno_food", "Xeno Foodstuffs");
                add("itemGroup.xeno_tools", "Xeno Tools");
                add("itemGroup.xeno_combat", "Xeno Combat");

                //Blocks
                add("block.xeno.ruby_block", "Ruby Block");
                add("block.xeno.ruby_ore", "Ruby Ore");

                add("block.xeno.saphir_block", "Saphirre Block");
                add("block.xeno.saphir_ore", "Saphirre Ore");

                add("block.xeno.silver_block", "Silver Block");
                add("block.xeno.silver_ore", "Silver Ore");

                add("block.xeno.quicksand", "Quicksand");

                add("block.xeno.cherry_blossom_leaves", "Cherry Blossom Leaves");
                add("block.xeno.cherry_blossom_plank", "Cherry Blossom Plank");
                add("block.xeno.cherry_blossom_log", "Cherry Blossom Log");
                add("block.xeno.cherry_blossom_sapling", "Cherry Blossom Sapling");

                add("block.xeno.palm_tree_leaves", "Palm Tree Leaves");
                add("block.xeno.palm_tree_log", "Palm Tree Log");

                add("block.xeno.red_autumnal_leaves", "Red Autumnal Leaves");
                add("block.xeno.red_autumnal_sapling", "Red Autumnal Sapling");
                add("block.xeno.orange_autumnal_leaves", "Orange Autumnal Leaves");
                add("block.xeno.orange_autumnal_sapling", "Orange Autumnal Sapling");
                add("block.xeno.yellow_autumnal_leaves", "Yellow Autumnal Leaves");
                add("block.xeno.yellow_autumnal_sapling", "Yellow Autumnal Sapling");
                add("block.xeno.brown_autumnal_leaves", "Brown Autumnal Leaves");
                add("block.xeno.brown_autumnal_sapling", "Brown Autumnal Sapling");

                add("block.xeno.buttercup", "Buttercup");

                add("block.xeno.rainbow_wool", "Rainbow Wool");
                add("block.xeno.rainbow_carpet", "Rainbow Carpet");

                add("block.xeno.redstone_block_black", "Block Of Black Redstone");
                add("block.xeno.redstone_block_blue", "Block Of Blue Redstone");
                add("block.xeno.redstone_block_brown", "Block Of Brown Redstone");
                add("block.xeno.redstone_block_cyan", "Block Of Cyan Redstone");
                add("block.xeno.redstone_block_gray", "Block Of Gray Redstone");
                add("block.xeno.redstone_block_green", "Block Of Green Redstone");
                add("block.xeno.redstone_block_light_blue", "Block Of Light Blue Redstone");
                add("block.xeno.redstone_block_light_gray", "Block Of Light Gray Redstone");
                add("block.xeno.redstone_block_lime", "Block Of Lime Redstone");
                add("block.xeno.redstone_block_magenta", "Block Of Magenta Redstone");
                add("block.xeno.redstone_block_orange", "Block Of Orange Redstone");
                add("block.xeno.redstone_block_pink", "Block Of Pink Redstone");
                add("block.xeno.redstone_block_purple", "Block Of Purple Redstone");
                add("block.xeno.redstone_block_white", "Block Of White Redstone");
                add("block.xeno.redstone_block_yellow", "Block Of Yellow Redstone");

                add("block.xeno.redstone_dust_black", "Black Redstone");
                add("block.xeno.redstone_dust_blue", "Blue Redstone");
                add("block.xeno.redstone_dust_brown", "Brown Redstone");
                add("block.xeno.redstone_dust_cyan", "Cyan Redstone");
                add("block.xeno.redstone_dust_gray", "Gray Redstone");
                add("block.xeno.redstone_dust_green", "Green Redstone");
                add("block.xeno.redstone_dust_light_blue", "Light Blue Redstone");
                add("block.xeno.redstone_dust_light_gray", "Light Gray Redstone");
                add("block.xeno.redstone_dust_lime", "Lime Redstone");
                add("block.xeno.redstone_dust_magenta", "Magenta Redstone");
                add("block.xeno.redstone_dust_orange", "Orange Redstone");
                add("block.xeno.redstone_dust_pink", "Pink Redstone");
                add("block.xeno.redstone_dust_purple", "Purple Redstone");
                add("block.xeno.redstone_dust_white", "White Redstone");
                add("block.xeno.redstone_dust_yellow", "Yellow Redstone");

                //Items
                add("item.xeno.obsidian_ingot", "Obsidian Ingot");
                add("item.xeno.steel_ingot", "Steel Ingot");
                add("item.xeno.silver_ingot", "Silver Ingot");
                add("item.xeno.ruby", "Ruby");
                add("item.xeno.saphir", "Saphirre");
                add("item.xeno.mud_bucket", "Mud Bucket");
                add("item.xeno.smelly_egg", "Smelly Egg");
                add("item.xeno.horse_armor_netherite", "Netherite Armor Horse");


                add("item.xeno.saphir_apple", "Saphirre Apple");
                add("item.xeno.emerald_apple", "Emerald Apple");
                add("item.xeno.diamond_apple", "Diamond Apple");
                add("item.xeno.banana", "Banana");
                add("item.xeno.pear", "Pear");
                add("item.xeno.strawberry", "Strawberry");
                add("item.xeno.peach", "Peach");
                add("item.xeno.mango", "Mango");
                add("item.xeno.orange", "Orange");
                add("item.xeno.sandwich", "Sandwich");
                add("item.xeno.coconut", "Coconut");

                add("item.xeno.obsidian_shovel", "Obsidian Shovel");
                add("item.xeno.obsidian_pickaxe", "Obsidian Pickaxe");
                add("item.xeno.obsidian_axe", "Obsidian Axe");
                add("item.xeno.obsidian_hoe", "Obsidian Hoe");

                add("item.xeno.silver_shovel", "Silver Shovel");
                add("item.xeno.silver_pickaxe", "Silver Pickaxe");
                add("item.xeno.silver_axe", "Silver Axe");
                add("item.xeno.silver_hoe", "Silver Hoe");

                add("item.xeno.ruby_shovel", "Ruby Shovel");
                add("item.xeno.ruby_pickaxe", "Ruby Pickaxe");
                add("item.xeno.ruby_axe", "Ruby Axe");
                add("item.xeno.ruby_hoe", "Ruby Hoe");

                add("item.xeno.saphir_shovel", "Saphirre Shovel");
                add("item.xeno.saphir_pickaxe", "Saphirre Pickaxe");
                add("item.xeno.saphir_axe", "Saphirre Axe");
                add("item.xeno.saphir_hoe", "Saphirre Hoe");

                add("item.xeno.emerald_shovel", "Emerald Shovel");
                add("item.xeno.emerald_pickaxe", "Emerald Pickaxe");
                add("item.xeno.emerald_axe", "Emerald Axe");
                add("item.xeno.emerald_hoe", "Emerald Hoe");

                add("item.xeno.obsidian_sword", "Obsidian Sword");
                add("item.xeno.obsidian_helmet", "Obsidian Helmet");
                add("item.xeno.obsidian_chestplate", "Obsidian Chestplate");
                add("item.xeno.obsidian_leggins", "Obsidian Leggings");
                add("item.xeno.obsidian_boots", "Obsidian Boots");

                add("item.xeno.saphir_sword", "Saphirre Sword");
                add("item.xeno.saphir_helmet", "Saphirre Helmet");
                add("item.xeno.saphir_chestplate", "Saphirre Chestplate");
                add("item.xeno.saphir_leggins", "Saphirre Leggings");
                add("item.xeno.saphir_boots", "Saphirre Boots");

                add("item.xeno.ruby_sword", "Ruby Sword");
                add("item.xeno.ruby_helmet", "Ruby Helmet");
                add("item.xeno.ruby_chestplate", "Ruby Chestplate");
                add("item.xeno.ruby_leggins", "Ruby Leggings");
                add("item.xeno.ruby_boots", "Ruby Boots");

                add("item.xeno.emerald_sword", "Emerald Sword");
                add("item.xeno.emerald_helmet", "Emerald Helmet");
                add("item.xeno.emerald_chestplate", "Emerald Chestplate");
                add("item.xeno.emerald_leggins", "Emerald Leggings");
                add("item.xeno.emerald_boots", "Emerald Boots");
                break;
            case"fr_fr":
                break;
            default:
                break;
        }
    }
}
