package fr.xenohart.xeno.enchantment;


import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

import java.util.List;

public class BoomerangEnchantment extends Enchantment {
    public BoomerangEnchantment(Rarity rarityIn, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(rarityIn, pCategory, pApplicableSlots);
    }

    @Override
    public int getMinCost(int level) {
        return 5 + 10 * (level - 1);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    private static boolean handled = false;

    @Override
    public void doPostAttack(LivingEntity user, Entity target, int level) {
        if (handled){
            handled = false;
            return;
        }
        if (!(user instanceof Player) || !(target instanceof LivingEntity))return;
        Player player = (Player)user;
        if (5 * Math.random() > level) return;
        List<ItemStack> inventory = player.inventoryMenu.getItems();
        for (ItemStack stack : inventory) {
            if (!(stack.getItem() == Items.ARROW || stack.getItem() == Items.TIPPED_ARROW))
                continue;
            ItemStack add = stack.copy();
            add.setCount(1);
            player.addItem(add);
            break;
        }
        handled = true;
    }
}
