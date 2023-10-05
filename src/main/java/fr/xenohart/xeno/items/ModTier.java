package fr.xenohart.xeno.items;

import fr.xenohart.xeno.items.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ForgeTier;

import java.util.function.Supplier;

public class ModTier{
    public static final ForgeTier RUBY = new ForgeTier(1, 1500, 1f, 4f, 10, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.RUBY.get()));
    public static final ForgeTier EMERALD = new ForgeTier(1, 1500, 1f, 4f, 10, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.EMERALD));
    public static final ForgeTier SAPHIR = new ForgeTier(1, 1500, 1f, 4f, 10, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.SAPHIR.get()));
    public static final ForgeTier OBSIDIAN = new ForgeTier(1, 1500, 1f, 4f, 10, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.OBSIDIAN_INGOT.get()));
    public static final ForgeTier SILVER = new ForgeTier(1, 1500, 1f, 4f, 10, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.SILVER_INGOT.get()));
    public static final ForgeTier STEEL = new ForgeTier(1, 1500, 1f, 4f, 10, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.STEEL_INGOT.get()));

}
