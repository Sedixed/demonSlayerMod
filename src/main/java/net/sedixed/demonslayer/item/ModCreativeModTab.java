package net.sedixed.demonslayer.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {

    public static final CreativeModeTab DEMONSLAYER_TAB = new CreativeModeTab("demonslayertab") {
        @Override

        // TODO : remplacer par un katana
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SUNITE_INGOT.get());
        }
    };
}
