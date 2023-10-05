package fr.xenohart.xeno.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.List;

public class BoomerangEnchantment extends Enchantment {
    public BoomerangEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
        super(rarityIn, typeIn, slots);
    }

    @Override
    public int getMinEnchantability(int level) {
        return 5 + 10 * (level - 1);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    private static boolean handled = false;

    @Override
    public void onEntityDamaged(LivingEntity user, Entity target, int level) {
        if (handled){
            handled = false;
            return;
        }
        if (!(user instanceof PlayerEntity) || !(target instanceof LivingEntity))return;
        PlayerEntity player = (PlayerEntity)user;
        if (5 * Math.random() > level) return;
        List<ItemStack> inventory = player.inventory.mainInventory;
        for (ItemStack stack : inventory) {
            if (!(stack.getItem() == Items.ARROW || stack.getItem() == Items.TIPPED_ARROW))
                continue;
            ItemStack add = stack.copy();
            add.setCount(1);
            player.addItemStackToInventory(add);
            break;
        }
        handled = true;
    }
}
