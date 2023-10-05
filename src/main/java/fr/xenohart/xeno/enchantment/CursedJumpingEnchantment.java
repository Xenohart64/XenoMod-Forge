package fr.xenohart.xeno.enchantment;//package fr.xenohart.xeno.enchantment;
//
//
//import net.minecraft.client.renderer.EffectInstance;
//import net.minecraft.world.entity.Entity;
//import net.minecraft.world.entity.EquipmentSlot;
//import net.minecraft.world.entity.LivingEntity;
//import net.minecraft.world.item.enchantment.Enchantment;
//import net.minecraft.world.item.enchantment.EnchantmentCategory;
//
//public class CursedJumpingEnchantment extends Enchantment {
//    protected CursedJumpingEnchantment(Rarity rarityIn, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
//        super(rarityIn, pCategory, pApplicableSlots);
//    }
//
//    @Override
//    public int getMinCost(int level) {
//        return 15;
//    }
//
//
//    @Override
//    public int getMaxLevel() {
//        return 1;
//    }
//
//    @Override
//    public void onEntityDamaged(LivingEntity user, Entity target, int level)  {
//        if (target instanceof LivingEntity) ((LivingEntity) target).addEffect(new EffectInstance(Effect.JUMP_BOOST, 40, 127));
//    }
//}
