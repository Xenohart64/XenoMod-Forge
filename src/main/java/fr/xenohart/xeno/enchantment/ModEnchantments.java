package fr.xenohart.xeno.enchantment;

import fr.xenohart.xeno.util.Registration;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final RegistryObject<Enchantment> LIFESTEAL = Registration.ENCHANTMENTS.register("life_steal", () -> new LifeStealEnchantment(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, new EquipmentSlot[]{
            EquipmentSlot.MAINHAND})
    );

    public static final RegistryObject<Enchantment> ETERNAL = Registration.ENCHANTMENTS.register("eternal", () -> new EternalEnchantment(Enchantment.Rarity.RARE, EnchantmentCategory.BREAKABLE, new EquipmentSlot[]{
            EquipmentSlot.MAINHAND})
    );

    public static final RegistryObject<Enchantment> BOOMERANG = Registration.ENCHANTMENTS.register("boomerang", () -> new BoomerangEnchantment(Enchantment.Rarity.RARE, EnchantmentCategory.BOW, new EquipmentSlot[]{
            EquipmentSlot.MAINHAND})
    );

//    public static final RegistryObject<Enchantment> CURSEDJUMPING = Registration.ENCHANTMENTS.register("cursed_jumping", () -> new CursedJumpingEnchantment(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, new EquipmentSlot[]{
//            EquipmentSlot.MAINHAND})
//    );
    public static void register() {}
}
