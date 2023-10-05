package fr.xenohart.xeno.enchantment;

import fr.xenohart.xeno.util.Registration;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;

public class ModEnchantments {
    public static final RegistryObject<Enchantment> LIFESTEAL = Registration.ENCHANTMENTS.register("life_steal", () -> new LifeStealEnchantment(Enchantment.Rarity.RARE, EnchantmentType.WEAPON, new EquipmentSlotType[]{
            EquipmentSlotType.MAINHAND})
    );

    public static final RegistryObject<Enchantment> ETERNAL = Registration.ENCHANTMENTS.register("eternal", () -> new LifeStealEnchantment(Enchantment.Rarity.RARE, EnchantmentType.BREAKABLE, new EquipmentSlotType[]{
            EquipmentSlotType.MAINHAND})
    );

    public static final RegistryObject<Enchantment> BOOMERANG = Registration.ENCHANTMENTS.register("boomerang", () -> new BoomerangEnchantment(Enchantment.Rarity.RARE, EnchantmentType.BOW, new EquipmentSlotType[]{
            EquipmentSlotType.MAINHAND})
    );

    public static final RegistryObject<Enchantment> CURSEDJUMPING = Registration.ENCHANTMENTS.register("cursed_jumping", () -> new CursedJumpingEnchantment(Enchantment.Rarity.RARE, EnchantmentType.WEAPON, new EquipmentSlotType[]{
            EquipmentSlotType.MAINHAND})
    );
    public static void register() {}
}
