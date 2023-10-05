package fr.xenohart.xeno.data;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.blocks.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, XenoMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.tag(Tags.Blocks.ORES).add(ModBlocks.RUBY_ORE.get());
        super.addTags();
    }
}
