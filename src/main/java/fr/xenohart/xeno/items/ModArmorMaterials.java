package fr.xenohart.xeno.items;

import fr.xenohart.xeno.XenoMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    RUBY("ruby", 13, new int[]{2, 3, 5, 3}, 21,SoundEvents.ARMOR_EQUIP_GOLD, 0.5F, 0.0F, () -> { return Ingredient.of(ModItems.RUBY.get());  }),
    EMERALD("emerald", 13, new int[]{2, 3, 5, 3}, 21,SoundEvents.ARMOR_EQUIP_GOLD, 0.5F, 0.0F, () -> { return Ingredient.of(Items.EMERALD);  }),
    SAPHIR("saphir", 13, new int[]{2, 3, 5, 3}, 21,SoundEvents.ARMOR_EQUIP_GOLD, 0.5F, 0.0F, () -> { return Ingredient.of(ModItems.SAPHIR.get());  }),
    OBSIDIAN("obsidian", 13, new int[]{2, 3, 5, 3}, 21,SoundEvents.ARMOR_EQUIP_GOLD, 0.5F, 0.0F, () -> { return Ingredient.of(ModItems.OBSIDIAN_INGOT.get());  }),
    SILVER("silver", 13, new int[]{2, 3, 5, 3}, 21,SoundEvents.ARMOR_EQUIP_GOLD, 0.5F, 0.0F, () -> { return Ingredient.of(ModItems.SILVER_INGOT.get());  }),
    STEEL("steel", 13, new int[]{2, 3, 5, 3}, 21,SoundEvents.ARMOR_EQUIP_GOLD, 0.5F, 0.0F, () -> { return Ingredient.of(ModItems.STEEL_INGOT.get());  });


    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue,
                      SoundEvent sound, float toughness,
                      float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = Lazy.of(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return XenoMod.MODID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
