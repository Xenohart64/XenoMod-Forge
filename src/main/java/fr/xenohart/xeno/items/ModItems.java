package fr.xenohart.xeno.items;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.fluid.ModFluids;
import fr.xenohart.xeno.util.Registration;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    //obsidian
    public static final RegistryObject<Item> OBSIDIAN_INGOT = Registration.ITEMS.register("obsidian_ingot", () -> new Item(defaultBuilderMiscellaneous()));
    public static final RegistryObject<Item> OBSIDIAN_SWORD = Registration.ITEMS.register("obsidian_sword", () -> new SwordItem(ModTier.OBSIDIAN, 2, -2.4f, defaultBuilderCombat().stacksTo(1)));
    public static final RegistryObject<Item> OBSIDIAN_SHOVEL = Registration.ITEMS.register("obsidian_shovel", () -> new ShovelItem(ModTier.OBSIDIAN, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = Registration.ITEMS.register("obsidian_pickaxe", () -> new PickaxeItem(ModTier.OBSIDIAN, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> OBSIDIAN_AXE = Registration.ITEMS.register("obsidian_axe", () -> new AxeItem(ModTier.OBSIDIAN, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> OBSIDIAN_HOE = Registration.ITEMS.register("obsidian_hoe", () -> new HoeItem(ModTier.OBSIDIAN, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> OBSIDIAN_HELMET = Registration.ITEMS.register("obsidian_helmet", () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.HEAD, defaultBuilderCombat()));
    public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = Registration.ITEMS.register("obsidian_chestplate", () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.CHEST, defaultBuilderCombat()));
    public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = Registration.ITEMS.register("obsidian_leggings", () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.LEGS, defaultBuilderCombat()));
    public static final RegistryObject<Item> OBSIDIAN_BOOTS = Registration.ITEMS.register("obsidian_boots", () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.FEET, defaultBuilderCombat()));
//    public static final RegistryObject<Item> HORSE_ARMOR_OBSIDIAN = Registration.ITEMS.register("horse_armor_obsidian", () -> new ModHorseArmorItem(11, CustomArmorTiers.OBSIDIAN.getName(), unstackable()));

    //silver
    public static final RegistryObject<Item> SILVER_INGOT = Registration.ITEMS.register("silver_ingot", () -> new Item(defaultBuilderMiscellaneous()));
    public static final RegistryObject<Item> SILVER_SWORD = Registration.ITEMS.register("silver_sword", () -> new SwordItem(ModTier.SILVER, 2, -2.4f, defaultBuilderCombat().stacksTo(1)));
    public static final RegistryObject<Item> SILVER_SHOVEL = Registration.ITEMS.register("silver_shovel", () -> new ShovelItem(ModTier.SILVER, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> SILVER_PICKAXE = Registration.ITEMS.register("silver_pickaxe", () -> new PickaxeItem(ModTier.SILVER, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> SILVER_AXE = Registration.ITEMS.register("silver_axe", () -> new AxeItem(ModTier.SILVER, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> SILVER_HOE = Registration.ITEMS.register("silver_hoe", () -> new HoeItem(ModTier.SILVER, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
//    public static final RegistryObject<Item> SILVER_HELMET = Registration.ITEMS.register("silver_helmet", () -> new ArmorItem(CustomArmorTiers.SILVER, EquipmentSlotType.HEAD, defaultBuilderCombat()));
//    public static final RegistryObject<Item> SILVER_CHESTPLATE = Registration.ITEMS.register("silver_chestplate", () -> new ArmorItem(CustomArmorTiers.SILVER, EquipmentSlotType.CHEST, defaultBuilderCombat()));
//    public static final RegistryObject<Item> SILVER_LEGGINGS = Registration.ITEMS.register("silver_leggings", () -> new ArmorItem(CustomArmorTiers.SILVER, EquipmentSlotType.LEGS, defaultBuilderCombat()));
//    public static final RegistryObject<Item> SILVER_BOOTS = Registration.ITEMS.register("silver_boots", () -> new ArmorItem(CustomArmorTiers.SILVER, EquipmentSlotType.FEET, defaultBuilderCombat()));
//    public static final RegistryObject<Item> HORSE_ARMOR_SILVER = Registration.ITEMS.register("horse_armor_silver", () -> new ModHorseArmorItem(11, CustomArmorTiers.SILVER.getName(), unstackable()));


    //steel
    public static final RegistryObject<Item> STEEL_INGOT = Registration.ITEMS.register("steel_ingot", () -> new Item(defaultBuilderMiscellaneous()));
//    public static final RegistryObject<Item> STEEL_SWORD = Registration.ITEMS.register("steel_sword", () -> new SwordItem(CustomItemTiers.STEEL, 2, -2.4f, defaultBuilderCombat().maxStackSize(1)));
//    public static final RegistryObject<Item> STEEL_SHOVEL = Registration.ITEMS.register("steel_shovel", () -> new ShovelItem(CustomItemTiers.STEEL, 2, -2.4f, defaultBuilderTools().maxStackSize(1)));
//    public static final RegistryObject<Item> STEEL_PICKAXE = Registration.ITEMS.register("steel_pickaxe", () -> new PickaxeItem(CustomItemTiers.STEEL, 2, -2.4f, defaultBuilderTools().maxStackSize(1)));
//    public static final RegistryObject<Item> STEEL_AXE = Registration.ITEMS.register("steel_axe", () -> new AxeItem(CustomItemTiers.STEEL, 2, -2.4f, defaultBuilderTools().maxStackSize(1)));
//    public static final RegistryObject<Item> STEEL_HOE = Registration.ITEMS.register("steel_hoe", () -> new HoeItem(CustomItemTiers.STEEL, 2, -2.4f, defaultBuilderTools().maxStackSize(1)));
//    public static final RegistryObject<Item> STEEL_HELMET = Registration.ITEMS.register("steel_helmet", () -> new ArmorItem(CustomArmorTiers.STEEL, EquipmentSlotType.HEAD, defaultBuilderCombat()));
//    public static final RegistryObject<Item> STEEL_CHESTPLATE = Registration.ITEMS.register("steel_chestplate", () -> new ArmorItem(CustomArmorTiers.STEEL, EquipmentSlotType.CHEST, defaultBuilderCombat()));
//    public static final RegistryObject<Item> STEEL_LEGGINGS = Registration.ITEMS.register("steel_leggings", () -> new ArmorItem(CustomArmorTiers.STEEL, EquipmentSlotType.LEGS, defaultBuilderCombat()));
//    public static final RegistryObject<Item> STEEL_BOOTS = Registration.ITEMS.register("steel_boots", () -> new ArmorItem(CustomArmorTiers.STEEL, EquipmentSlotType.FEET, defaultBuilderCombat()));
//    public static final RegistryObject<Item> HORSE_ARMOR_STEEL = Registration.ITEMS.register("horse_armor_steel", () -> new ModHorseArmorItem(11, CustomArmorTiers.STEEL.getName(), unstackable()));


    //ruby
    public static final RegistryObject<Item> RUBY = Registration.ITEMS.register("ruby", () -> new Item(defaultBuilderMiscellaneous()));
    public static final RegistryObject<Item> RUBY_SWORD = Registration.ITEMS.register("ruby_sword", () -> new SwordItem(ModTier.RUBY, 2, -2.4f, defaultBuilderCombat().stacksTo(1)));
    public static final RegistryObject<Item> RUBY_SHOVEL = Registration.ITEMS.register("ruby_shovel", () -> new ShovelItem(ModTier.RUBY, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> RUBY_PICKAXE = Registration.ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModTier.RUBY, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> RUBY_AXE = Registration.ITEMS.register("ruby_axe", () -> new AxeItem(ModTier.RUBY, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> RUBY_HOE = Registration.ITEMS.register("ruby_hoe", () -> new HoeItem(ModTier.RUBY, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> RUBY_HELMET = Registration.ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.HEAD, defaultBuilderCombat()));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = Registration.ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST, defaultBuilderCombat()));
    public static final RegistryObject<Item> RUBY_LEGGINGS = Registration.ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS, defaultBuilderCombat()));
    public static final RegistryObject<Item> RUBY_BOOTS = Registration.ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET, defaultBuilderCombat()));
//    public static final RegistryObject<Item> HORSE_ARMOR_RUBY = Registration.ITEMS.register("horse_armor_ruby", () -> new ModHorseArmorItem(11, CustomArmorTiers.RUBY.getName(), unstackable()));


    //saphir
    public static final RegistryObject<Item> SAPHIR = Registration.ITEMS.register("saphir", () -> new Item(defaultBuilderMiscellaneous()));
    public static final RegistryObject<Item> SAPHIR_SWORD = Registration.ITEMS.register("saphir_sword", () -> new SwordItem(ModTier.SAPHIR, 2, -2.4f, defaultBuilderCombat().stacksTo(1)));
    public static final RegistryObject<Item> SAPHIR_SHOVEL = Registration.ITEMS.register("saphir_shovel", () -> new ShovelItem(ModTier.SAPHIR, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> SAPHIR_PICKAXE = Registration.ITEMS.register("saphir_pickaxe", () -> new PickaxeItem(ModTier.SAPHIR, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> SAPHIR_AXE = Registration.ITEMS.register("saphir_axe", () -> new AxeItem(ModTier.SAPHIR, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> SAPHIR_HOE = Registration.ITEMS.register("saphir_hoe", () -> new HoeItem(ModTier.SAPHIR, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> SAPHIR_APPLE = Registration.ITEMS.register("saphir_apple", () -> new Item(defaultBuilderFood().food(Foods.ENCHANTED_GOLDEN_APPLE)));
    public static final RegistryObject<Item> SAPHIR_HELMET = Registration.ITEMS.register("saphir_helmet", () -> new ArmorItem(ModArmorMaterials.SAPHIR, EquipmentSlot.HEAD, defaultBuilderCombat()));
    public static final RegistryObject<Item> SAPHIR_CHESTPLATE = Registration.ITEMS.register("saphir_chestplate", () -> new ArmorItem(ModArmorMaterials.SAPHIR, EquipmentSlot.CHEST, defaultBuilderCombat()));
    public static final RegistryObject<Item> SAPHIR_LEGGINGS = Registration.ITEMS.register("saphir_leggings", () -> new ArmorItem(ModArmorMaterials.SAPHIR, EquipmentSlot.LEGS, defaultBuilderCombat()));
    public static final RegistryObject<Item> SAPHIR_BOOTS = Registration.ITEMS.register("saphir_boots", () -> new ArmorItem(ModArmorMaterials.SAPHIR, EquipmentSlot.FEET, defaultBuilderCombat()));
//    public static final RegistryObject<Item> HORSE_ARMOR_SAPHIR = Registration.ITEMS.register("horse_armor_saphir", () -> new ModHorseArmorItem(11, CustomArmorTiers.SAPHIR.getName(), unstackable()));


    //emerald
    public static final RegistryObject<Item> EMERALD_SWORD = Registration.ITEMS.register("emerald_sword", () -> new SwordItem(ModTier.EMERALD, 2, -2.4f, defaultBuilderCombat().stacksTo(1)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = Registration.ITEMS.register("emerald_shovel", () -> new ShovelItem(ModTier.EMERALD, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = Registration.ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModTier.EMERALD, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> EMERALD_AXE = Registration.ITEMS.register("emerald_axe", () -> new AxeItem(ModTier.EMERALD, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> EMERALD_HOE = Registration.ITEMS.register("emerald_hoe", () -> new HoeItem(ModTier.EMERALD, 2, -2.4f, defaultBuilderTools().stacksTo(1)));
    public static final RegistryObject<Item> EMERALD_APPLE = Registration.ITEMS.register("emerald_apple", () -> new Item(defaultBuilderFood().food(Foods.ENCHANTED_GOLDEN_APPLE)));
    public static final RegistryObject<Item> EMERALD_HELMET = Registration.ITEMS.register("emerald_helmet", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD, defaultBuilderCombat()));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = Registration.ITEMS.register("emerald_chestplate", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST, defaultBuilderCombat()));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = Registration.ITEMS.register("emerald_leggings", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS, defaultBuilderCombat()));
    public static final RegistryObject<Item> EMERALD_BOOTS = Registration.ITEMS.register("emerald_boots", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.FEET, defaultBuilderCombat()));
//    public static final RegistryObject<Item> HORSE_ARMOR_EMERALD = Registration.ITEMS.register("horse_armor_emerald", () -> new ModHorseArmorItem(11, CustomArmorTiers.EMERALD.getName(), unstackable()));

//    public static final RegistryObject<Item> AMETHYST_SWORD = Registration.ITEMS.register("amethyst_sword", () -> new SwordItem(CustomItemTiers.AMETHYST, 2, -2.4f, defaultBuilderCombat().maxStackSize(1)));
//    public static final RegistryObject<Item> AMETHYST_SHOVEL = Registration.ITEMS.register("amethyst_shovel", () -> new ShovelItem(CustomItemTiers.AMETHYST, 2, -2.4f, defaultBuilderTools().maxStackSize(1)));
//    public static final RegistryObject<Item> AMETHYST_PICKAXE = Registration.ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(CustomItemTiers.AMETHYST, 2, -2.4f, defaultBuilderTools().maxStackSize(1)));
//    public static final RegistryObject<Item> AMETHYST_AXE = Registration.ITEMS.register("amethyst_axe", () -> new AxeItem(CustomItemTiers.AMETHYST, 2, -2.4f, defaultBuilderTools().maxStackSize(1)));
//    public static final RegistryObject<Item> AMETHYST_HOE = Registration.ITEMS.register("amethyst_hoe", () -> new HoeItem(CustomItemTiers.AMETHYST, 2, -2.4f, defaultBuilderTools().maxStackSize(1)));
//    public static final RegistryObject<Item> AMETHYST_APPLE = Registration.ITEMS.register("amethyst_apple", () -> new Item(defaultBuilderFood().food(Foods.ENCHANTED_GOLDEN_APPLE)));
//    public static final RegistryObject<Item> AMETHYST_HELMET = Registration.ITEMS.register("amethyst_helmet", () -> new ArmorItem(CustomArmorTiers.AMETHYST, EquipmentSlotType.HEAD, defaultBuilderCombat()));
//    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = Registration.ITEMS.register("amethyst_chestplate", () -> new ArmorItem(CustomArmorTiers.AMETHYST, EquipmentSlotType.CHEST, defaultBuilderCombat()));
//    public static final RegistryObject<Item> AMETHYST_LEGGINGS = Registration.ITEMS.register("amethyst_leggings", () -> new ArmorItem(CustomArmorTiers.AMETHYST, EquipmentSlotType.LEGS, defaultBuilderCombat()));
//    public static final RegistryObject<Item> AMETHYST_BOOTS = Registration.ITEMS.register("amethyst_boots", () -> new ArmorItem(CustomArmorTiers.AMETHYST, EquipmentSlotType.FEET, defaultBuilderCombat()));
//    public static final RegistryObject<Item> HORSE_ARMOR_AMETHYST = Registration.ITEMS.register("horse_armor_amethyst", () -> new ModHorseArmorItem(11, CustomArmorTiers.AMETHYST.getName(), unstackable()));

//    public static final RegistryObject<Item> COPPER_SWORD = Registration.ITEMS.register("copper_sword", () -> new SwordItem(CustomItemTiers.COPPER, 2, -2.4f, defaultBuilderCombat().maxStackSize(1)));
//    public static final RegistryObject<Item> COPPER_SHOVEL = Registration.ITEMS.register("copper_shovel", () -> new ShovelItem(CustomItemTiers.COPPER, 2, -2.4f, defaultBuilderTools().maxStackSize(1)));
//    public static final RegistryObject<Item> COPPER_PICKAXE = Registration.ITEMS.register("copper_pickaxe", () -> new PickaxeItem(CustomItemTiers.COPPER, 2, -2.4f, defaultBuilderTools().maxStackSize(1)));
//    public static final RegistryObject<Item> COPPER_AXE = Registration.ITEMS.register("copper_axe", () -> new AxeItem(CustomItemTiers.COPPER, 2, -2.4f, defaultBuilderTools().maxStackSize(1)));
//    public static final RegistryObject<Item> COPPER_HOE = Registration.ITEMS.register("copper_hoe", () -> new HoeItem(CustomItemTiers.COPPER, 2, -2.4f, defaultBuilderTools().maxStackSize(1)));
//    public static final RegistryObject<Item> COPPER_HELMET = Registration.ITEMS.register("copper_helmet", () -> new ArmorItem(CustomArmorTiers.COPPER, EquipmentSlotType.HEAD, defaultBuilderCombat()));
//    public static final RegistryObject<Item> COPPER_CHESTPLATE = Registration.ITEMS.register("copper_chestplate", () -> new ArmorItem(CustomArmorTiers.COPPER, EquipmentSlotType.CHEST, defaultBuilderCombat()));
//    public static final RegistryObject<Item> COPPER_LEGGINGS = Registration.ITEMS.register("copper_leggings", () -> new ArmorItem(CustomArmorTiers.COPPER, EquipmentSlotType.LEGS, defaultBuilderCombat()));
//    public static final RegistryObject<Item> COPPER_BOOTS = Registration.ITEMS.register("copper_boots", () -> new ArmorItem(CustomArmorTiers.COPPER, EquipmentSlotType.FEET, defaultBuilderCombat()));
//    public static final RegistryObject<Item> HORSE_ARMOR_COPPER = Registration.ITEMS.register("horse_armor_copper", () -> new ModHorseArmorItem(11, CustomArmorTiers.COPPER.getName(), unstackable()));


    //diamond
    public static final RegistryObject<Item> DIAMOND_APPLE = Registration.ITEMS.register("diamond_apple", () -> new Item(defaultBuilderFood().food(Foods.ENCHANTED_GOLDEN_APPLE)));


    //public static final RegistryObject<Item> HORSE_ARMOR_NETHERITE = Registration.ITEMS.register("horse_armor_netherite", () -> new ModHorseArmorItem(11, ArmorMaterial.NETHERITE.getName(), unstackable()));

    //food
    public static final RegistryObject<Item> BANANA = Registration.ITEMS.register("banana", () -> new Item(defaultBuilderFood().food(Foods.APPLE)));
    public static final RegistryObject<Item> PEAR = Registration.ITEMS.register("pear", () -> new Item(defaultBuilderFood().food(Foods.APPLE)));
    public static final RegistryObject<Item> STRAWBERRY = Registration.ITEMS.register("strawberry", () -> new Item(defaultBuilderFood().food(Foods.APPLE)));
    public static final RegistryObject<Item> PEACH = Registration.ITEMS.register("peach", () -> new Item(defaultBuilderFood().food(Foods.APPLE)));
    public static final RegistryObject<Item> MANGO = Registration.ITEMS.register("mango", () -> new Item(defaultBuilderFood().food(Foods.APPLE)));
    public static final RegistryObject<Item> ORANGE = Registration.ITEMS.register("orange", () -> new Item(defaultBuilderFood().food(Foods.APPLE)));
    public static final RegistryObject<Item> SANDWICH = Registration.ITEMS.register("sandwich", () -> new Item(defaultBuilderFood().food(Foods.BREAD)));
    public static final RegistryObject<Item> COCONUT = Registration.ITEMS.register("coconut", () -> new Item(defaultBuilderFood().food(Foods.APPLE)));
//    public static final RegistryObject<Item> CHERRY = Registration.ITEMS.register("cherry", () -> new Item(defaultBuilderFood().food(Foods.APPLE)));


//    public static final RegistryObject<Item> FROST_BOW = Registration.ITEMS.register("frost_bow", () -> new BowItem((defaultBuilderCombat().stacksTo(1)).maxDamage(384)));
//    public static final RegistryObject<Item> FIRE_BOW = Registration.ITEMS.register("fire_bow", () -> new BowItem((defaultBuilderCombat().stacksTo(1)).maxDamage(384)));
//
//
    public static final RegistryObject<Item> MUD_BUCKET = Registration.ITEMS.register("mud_bucket", () -> new BucketItem(ModFluids.MUD_FLUID, unstackable()));

//    public static final RegistryObject<ForgeSpawnEggItem> BOAR_SPAWNING_EGG = Registration.ITEMS.register("boar_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.BOAR, 0xF02F4A,0x7034F1, defaultBuilderMiscellaneous()));
//    public static final RegistryObject<ForgeSpawnEggItem> DUCK_SPAWNING_EGG = Registration.ITEMS.register("duck_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.DUCK, 0xF02F4A,0x7034F1, defaultBuilderMiscellaneous()));
//    public static final RegistryObject<ForgeSpawnEggItem> MOOBLOOM_SPAWNING_EGG = Registration.ITEMS.register("moobloom_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.MOOBLOOM, 0xF02F4A,0x7034F1, defaultBuilderMiscellaneous()));
//    public static final RegistryObject<ForgeSpawnEggItem> CLUCKSHROOM_SPAWNING_EGG = Registration.ITEMS.register("cluckshroom_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.CLUCKSHROOM, 0xF02F4A,0x7034F1, defaultBuilderMiscellaneous()));
//    //public static final RegistryObject<ModSpawnEggItem> HORNED_SHEEP_SPAWNING_EGG = Registration.ITEMS.register("horned_sheep_spawn_egg", () -> new ModSpawnEggItem(ModEntityTypes.HORNED_SHEEP, 0xF02F4A,0x7034F1, defaultBuilderMiscellaneous()));
//    public static final RegistryObject<ForgeSpawnEggItem> RAINBOW_SHEEP_SPAWNING_EGG = Registration.ITEMS.register("rainbow_sheep_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.RAINBOW_SHEEP, 0xF02F4A,0x7034F1, defaultBuilderMiscellaneous()));
//    public static final RegistryObject<ForgeSpawnEggItem> JOLLY_LLAMA_SPAWNING_EGG = Registration.ITEMS.register("jolly_llama_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.JOLLY_LLAMA, 0xF02F4A,0x7034F1, defaultBuilderMiscellaneous()));
//    public static final RegistryObject<ForgeSpawnEggItem> WOOLY_COW_SPAWNING_EGG = Registration.ITEMS.register("wooly_cow_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.WOOLY_COW, 0xF02F4A,0x7034F1, defaultBuilderMiscellaneous()));
//    public static final RegistryObject<ForgeSpawnEggItem> BONE_SPIDER_SPAWNING_EGG = Registration.ITEMS.register("bone_spider_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.BONE_SPIDER, 0xF02F4A,0x7034F1, defaultBuilderMiscellaneous()));
//    //public static final RegistryObject<ModSpawnEggItem> BOULDERING_ZOMBIE_SPAWNING_EGG = Registration.ITEMS.register("bouldering_zombie_spawn_egg", () -> new ModSpawnEggItem(ModEntityTypes.BOULDERING_ZOMBIE, 0xF02F4A,0x7034F1, defaultBuilderMiscellaneous()));
//    //public static final RegistryObject<ModSpawnEggItem> LOBBER_ZOMBIE_SPAWNING_EGG = Registration.ITEMS.register("lobber_zombie_spawn_egg", () -> new ModSpawnEggItem(ModEntityTypes.LOBBER_ZOMBIE, 0xF02F4A,0x7034F1, defaultBuilderMiscellaneous()));
//    public static final RegistryObject<ForgeSpawnEggItem> VILER_WITCH_SPAWNING_EGG = Registration.ITEMS.register("viler_witch_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.VILER_WITCH, 0xF02F4A,0x7034F1, defaultBuilderMiscellaneous()));
//    public static final RegistryObject<ForgeSpawnEggItem> BEAR_SPAWNING_EGG = Registration.ITEMS.register("bear_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.BEAR, 0xF02F4A,0x7034F1, defaultBuilderMiscellaneous()));


    public static final RegistryObject<Item> SMELLY_EGG = Registration.ITEMS.register("smelly_egg", () -> new EggItem(defaultBuilderMiscellaneous()));


    public static Item.Properties defaultBuilderDecoration() { return new Item.Properties().tab(XenoMod.XENO_DECORATION); }

    public static Item.Properties defaultBuilderRedstone() { return new Item.Properties().tab(XenoMod.XENO_REDSTONE); }

    public static Item.Properties defaultBuilderCombat() {
        return new Item.Properties().tab(XenoMod.XENO_COMBAT);
    }

    public static Item.Properties defaultBuilderTools() {
        return new Item.Properties().tab(XenoMod.XENO_TOOLS);
    }

    public static Item.Properties defaultBuilderFood() {
        return new Item.Properties().tab(XenoMod.XENO_FOOD);
    }

    public static Item.Properties defaultBuilderMiscellaneous() { return new Item.Properties().tab(XenoMod.XENO_MISCELLANEOUS); }

    public static Item.Properties unstackable() {
        return defaultBuilderMiscellaneous().stacksTo(1);
    }

    public static void register(){ }
}