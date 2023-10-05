package fr.xenohart.xeno.data;

import fr.xenohart.xeno.XenoMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, XenoMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("ruby_block", modLoc("block/ruby_block"));
        withExistingParent("ruby_ore", modLoc("block/ruby_ore"));

        withExistingParent("saphir_block", modLoc("block/saphir_block"));
        withExistingParent("saphir_ore", modLoc("block/saphir_ore"));

        withExistingParent("silver_block", modLoc("block/silver_block"));
        withExistingParent("silver_ore", modLoc("block/silver_ore"));

        withExistingParent("quicksand", modLoc("block/quicksand"));

        withExistingParent("cherry_blossom_leaves", modLoc("block/cherry_blossom_leaves"));
        withExistingParent("cherry_blossom_plank", modLoc("block/cherry_blossom_plank"));
        withExistingParent("cherry_blossom_log", modLoc("block/cherry_blossom_log"));

        withExistingParent("palm_tree_leaves", modLoc("block/palm_tree_leaves"));
        withExistingParent("palm_tree_log", modLoc("block/palm_tree_log"));

        withExistingParent("red_autumnal_leaves", modLoc("block/red_autumnal_leaves"));
        withExistingParent("orange_autumnal_leaves", modLoc("block/orange_autumnal_leaves"));
        withExistingParent("yellow_autumnal_leaves", modLoc("block/yellow_autumnal_leaves"));
        withExistingParent("brown_autumnal_leaves", modLoc("block/brown_autumnal_leaves"));

        withExistingParent("rainbow_wool", modLoc("block/rainbow_wool"));
        withExistingParent("rainbow_carpet", modLoc("block/rainbow_carpet"));

        withExistingParent("redstone_block_black", modLoc("block/redstone_block_black"));
        withExistingParent("redstone_block_blue", modLoc("block/redstone_block_blue"));
        withExistingParent("redstone_block_brown", modLoc("block/redstone_block_brown"));
        withExistingParent("redstone_block_cyan", modLoc("block/redstone_block_cyan"));
        withExistingParent("redstone_block_gray", modLoc("block/redstone_block_gray"));
        withExistingParent("redstone_block_green", modLoc("block/redstone_block_green"));
        withExistingParent("redstone_block_light_blue", modLoc("block/redstone_block_light_blue"));
        withExistingParent("redstone_block_light_gray", modLoc("block/redstone_block_light_gray"));
        withExistingParent("redstone_block_lime", modLoc("block/redstone_block_lime"));
        withExistingParent("redstone_block_magenta", modLoc("block/redstone_block_magenta"));
        withExistingParent("redstone_block_orange", modLoc("block/redstone_block_orange"));
        withExistingParent("redstone_block_pink", modLoc("block/redstone_block_pink"));
        withExistingParent("redstone_block_purple", modLoc("block/redstone_block_purple"));
        withExistingParent("redstone_block_white", modLoc("block/redstone_block_white"));
        withExistingParent("redstone_block_yellow", modLoc("block/redstone_block_yellow"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        ModelFile itemHandheld = getExistingFile(mcLoc("item/handheld"));

        builder(itemGenerated, "red_autumnal_sapling");
        builder(itemGenerated, "orange_autumnal_sapling");
        builder(itemGenerated, "yellow_autumnal_sapling");
        builder(itemGenerated, "brown_autumnal_sapling");
        builder(itemGenerated, "cherry_blossom_sapling");
        builder(itemGenerated, "buttercup");

        builder(itemGenerated, "ruby");
        builder(itemHandheld, "ruby_sword");
        builder(itemHandheld, "ruby_shovel");
        builder(itemHandheld, "ruby_pickaxe");
        builder(itemHandheld, "ruby_axe");
        builder(itemHandheld, "ruby_hoe");
        builder(itemGenerated, "ruby_helmet");
        builder(itemGenerated, "ruby_chestplate");
        builder(itemGenerated, "ruby_leggings");
        builder(itemGenerated, "ruby_boots");

        builder(itemGenerated, "saphir");
        builder(itemHandheld, "saphir_sword");
        builder(itemHandheld, "saphir_shovel");
        builder(itemHandheld, "saphir_pickaxe");
        builder(itemHandheld, "saphir_axe");
        builder(itemHandheld, "saphir_hoe");
        builder(itemGenerated, "saphir_helmet");
        builder(itemGenerated, "saphir_chestplate");
        builder(itemGenerated, "saphir_leggings");
        builder(itemGenerated, "saphir_boots");

        builder(itemGenerated, "obsidian_ingot");
        builder(itemHandheld, "obsidian_sword");
        builder(itemHandheld, "obsidian_shovel");
        builder(itemHandheld, "obsidian_pickaxe");
        builder(itemHandheld, "obsidian_axe");
        builder(itemHandheld, "obsidian_hoe");
        builder(itemGenerated, "obsidian_helmet");
        builder(itemGenerated, "obsidian_chestplate");
        builder(itemGenerated, "obsidian_leggings");
        builder(itemGenerated, "obsidian_boots");

        builder(itemGenerated, "silver_ingot");
        builder(itemHandheld, "silver_sword");
        builder(itemHandheld, "silver_shovel");
        builder(itemHandheld, "silver_pickaxe");
        builder(itemHandheld, "silver_axe");
        builder(itemHandheld, "silver_hoe");

        builder(itemGenerated, "steel_ingot");

        builder(itemHandheld, "emerald_sword");
        builder(itemHandheld, "emerald_shovel");
        builder(itemHandheld, "emerald_pickaxe");
        builder(itemHandheld, "emerald_axe");
        builder(itemHandheld, "emerald_hoe");
        builder(itemGenerated, "emerald_helmet");
        builder(itemGenerated, "emerald_chestplate");
        builder(itemGenerated, "emerald_leggings");
        builder(itemGenerated, "emerald_boots");

        builder(itemGenerated, "diamond_apple");
        builder(itemGenerated, "saphir_apple");
        builder(itemGenerated, "emerald_apple");

        builder(itemGenerated, "banana");
        builder(itemGenerated, "pear");
        builder(itemGenerated, "strawberry");
        builder(itemGenerated, "peach");
        builder(itemGenerated, "mango");
        builder(itemGenerated, "orange");
        builder(itemGenerated, "sandwich");
        builder(itemGenerated, "coconut");

        builder(itemHandheld, "frost_bow");
        builder(itemHandheld, "fire_bow");

        builder(itemGenerated, "mud_bucket");

        builder(itemGenerated, "smelly_egg");

        builder(itemGenerated, "redstone_dust_blue");
        builder(itemGenerated, "redstone_dust_black");
        builder(itemGenerated, "redstone_dust_brown");
        builder(itemGenerated, "redstone_dust_cyan");
        builder(itemGenerated, "redstone_dust_gray");
        builder(itemGenerated, "redstone_dust_green");
        builder(itemGenerated, "redstone_dust_light_blue");
        builder(itemGenerated, "redstone_dust_light_gray");
        builder(itemGenerated, "redstone_dust_lime");
        builder(itemGenerated, "redstone_dust_magenta");
        builder(itemGenerated, "redstone_dust_orange");
        builder(itemGenerated, "redstone_dust_pink");
        builder(itemGenerated, "redstone_dust_purple");
        builder(itemGenerated, "redstone_dust_white");
        builder(itemGenerated, "redstone_dust_yellow");

        builder(itemGenerated, "horse_armor_netherite");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name){
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
