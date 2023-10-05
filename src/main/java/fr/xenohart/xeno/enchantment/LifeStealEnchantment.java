package fr.xenohart.xeno.enchantment;

import fr.xenohart.xeno.XenoMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.DamageSource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = XenoMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LifeStealEnchantment extends Enchantment {

    protected LifeStealEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
        super(rarityIn, typeIn, slots);
    }

    @Override
    public int getMinEnchantability(int level) {
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
