package fr.xenohart.xeno.tools;//package fr.xenohart.xeno.tools;
//
//import fr.xenohart.xeno.items.ModItems;
//import net.minecraft.item.IItemTier;
//import net.minecraft.item.Items;
//import net.minecraft.item.crafting.Ingredient;
//import net.minecraft.world.item.crafting.Ingredient;
//
//import java.util.function.Supplier;
//
//public enum CustomItemTiers implements IItemTier {
//    RUBY(4, 1561, 9.0F, 3.5F, 10, () -> { return Ingredient.fromItems(ModItems.RUBY.get());}),
//    SAPHIR(4, 1561, 9.0F, 3.5F, 10, () -> { return Ingredient.fromItems(ModItems.SAPHIR.get());}),
//    EMERALD(4, 1561, 9.0F, 3.5F, 10, () -> { return Ingredient.fromItems(Items.EMERALD);}),
//    SILVER(4, 1561, 9.0F, 3.5F, 10, () -> { return Ingredient.fromItems(ModItems.SILVER_INGOT.get());}),
//    OBSIDIAN(4, 1561, 9.0F, 3.5F, 10, () -> { return Ingredient.fromItems(ModItems.OBSIDIAN_INGOT.get());}),
//    STEEL(4, 1561, 9.0F, 3.5F, 10, () -> { return Ingredient.fromItems(ModItems.OBSIDIAN_INGOT.get());});
//
//    private final int harvestLevel;
//    private final int maxUses;
//    private final float efficiency;
//    private final float attackDamage;
//    private final int enchantability;
//    private final Supplier<Ingredient> repairMaterial;
//
//    CustomItemTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
//        this.harvestLevel = harvestLevel;
//        this.maxUses = maxUses;
//        this.efficiency = efficiency;
//        this.attackDamage = attackDamage;
//        this.enchantability = enchantability;
//        this.repairMaterial = repairMaterial;
//    }
//
//    @Override
//    public int getMaxUses() {
//        return maxUses;
//    }
//
//    @Override
//    public float getEfficiency() {
//        return efficiency;
//    }
//
//    @Override
//    public float getAttackDamage() {
//        return attackDamage;
//    }
//
//    @Override
//    public int getHarvestLevel() {
//        return harvestLevel;
//    }
//
//    @Override
//    public int getEnchantability() {
//        return enchantability;
//    }
//
//    @Override
//    public Ingredient getRepairMaterial() {
//        return this.repairMaterial.get();
//    }
//}
