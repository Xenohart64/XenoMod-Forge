package fr.xenohart.xeno.enchantment;

import fr.xenohart.xeno.XenoMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = XenoMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EternalEnchantment extends Enchantment {

    public EternalEnchantment(Rarity rarityIn, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(rarityIn, pCategory, pApplicableSlots);
    }

    @Override
    public int getMinCost(int level) {
        return 15;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

//    @SubscribeEvent
//    public static void itemDespawn(ItemExpireEvent event) {
//        event.setExtraLife(Integer.MAX_VALUE);
//        event.setCanceled(true);
//    }
}
