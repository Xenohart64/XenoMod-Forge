package fr.xenohart.xeno.data;

import fr.xenohart.xeno.XenoMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, XenoMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        super.addTags();
    }
}
