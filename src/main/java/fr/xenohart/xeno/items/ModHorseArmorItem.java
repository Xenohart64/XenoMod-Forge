package fr.xenohart.xeno.items;

import net.minecraft.item.HorseArmorItem;
import net.minecraft.util.ResourceLocation;

public class ModHorseArmorItem extends HorseArmorItem {

    public ModHorseArmorItem(int armorValue, String tierArmor, Properties builder) {
        super(armorValue, new ResourceLocation("xeno:textures/entity/horse/armor/horse_armor_" + tierArmor + ".png"), builder);
    }

    public ModHorseArmorItem(int armorValue, ResourceLocation texture, Properties builder) {
        super(armorValue, texture, builder);
    }
}