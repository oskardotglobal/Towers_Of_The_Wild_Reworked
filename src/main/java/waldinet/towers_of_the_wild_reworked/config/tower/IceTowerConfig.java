package waldinet.towers_of_the_wild_reworked.config.tower;

import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import me.shedaniel.clothconfig2.impl.builders.SubCategoryBuilder;
import net.minecraft.text.TranslatableText;

public class IceTowerConfig
{
    private boolean enabled = true;

    private int rarity = 40;

    public SubCategoryBuilder getConfigBuilder(ConfigEntryBuilder entry)
    {
        SubCategoryBuilder subCategory = entry.startSubCategory(new TranslatableText("Ice Tower"));
        // Enable Tower
        subCategory.add(
            entry.startBooleanToggle(new TranslatableText("Enabled"), enabled)
                .setDefaultValue(true)
                .setSaveConsumer(newValue -> enabled = newValue)
                .build()
        );

        // Rarity
        subCategory.add(
            entry.startIntSlider(new TranslatableText("Rarity"), rarity, 3, 200)
                .setTooltip(new TranslatableText("How rarely this tower type will spawn (low: common, high: rare)"))
                .setDefaultValue(40)
                .setSaveConsumer(newValue -> rarity = newValue)
                .build()
        );

        return subCategory;
    }
}
