package fr.xenohart.xeno.armor;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.items.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum CustomArmorTiers implements IArmorMaterial {

    RUBY("ruby", 33, new int[]{4, 6, 7, 3}, 18,2.0f, () -> { return Ingredient.fromItems(ModItems.RUBY.get());}),
    EMERALD("emerald", 33, new int[]{4, 6, 7, 3}, 18,2.0f, () -> { return Ingredient.fromItems(Items.EMERALD);}),
    SAPHIR("saphir", 33, new int[]{4, 6, 7, 3}, 18,2.0f, () -> { return Ingredient.fromItems(ModItems.SAPHIR.get());}),
    OBSIDIAN("obsidian", 33, new int[]{4, 6, 7, 3}, 18,2.0f, () -> { return Ingredient.fromItems(ModItems.OBSIDIAN_INGOT.get());}),
    SILVER("silver", 33, new int[]{4, 6, 7, 3}, 18,2.0f, () -> { return Ingredient.fromItems(ModItems.SILVER_INGOT.get());}),
    STEEL("steel", 33, new int[]{4, 6, 7, 3}, 18,2.0f, () -> { return Ingredient.fromItems(ModItems.STEEL_INGOT.get());});




    private static final int[] MAX_DAMAGE_ARRAY = new int[]{11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    CustomArmorTiers(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, float toughness, Supplier<Ingredient> repairMaterial){
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()]*this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return null;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
