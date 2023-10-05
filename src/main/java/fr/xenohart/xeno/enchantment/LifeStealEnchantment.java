package fr.xenohart.xeno.enchantment;

import fr.xenohart.xeno.XenoMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = XenoMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LifeStealEnchantment extends Enchantment {

    protected LifeStealEnchantment(Rarity rarityIn, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(rarityIn, pCategory, pApplicableSlots);
    }

    @Override
    public int getMinCost(int level) {
        return 15;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

//    @SubscribeEvent
//    public static void onAttack(LivingHurtEvent event) {
//        if (event.getSource().getTrueSource() instanceof PlayerEntity) {
//            PlayerEntity player = (PlayerEntity) event.getSource().getTrueSource();
//            LivingEntity entity = event.getEntityLiving();
//            float damage = event.getAmount();
//            entity.attackEntityFrom(DamageSource.GENERIC, damage*1.5f);
//            player.heal(damage);
//        }
//    }
}
