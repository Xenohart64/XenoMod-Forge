package fr.xenohart.xeno.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CursedJumpingEnchantment extends Enchantment {
    protected CursedJumpingEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
        super(rarityIn, typeIn, slots);
    }

    @Override
    public int getMinEnchantability(int level) {
        return 15;
    }


    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public void onEntityDamaged(LivingEntity user, Entity target, int level)  {
        if (target instanceof LivingEntity) ((LivingEntity) target).
                addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 40, 127));
    }
}
