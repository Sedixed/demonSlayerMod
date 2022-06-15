package net.sedixed.demonslayer.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sedixed.demonslayer.DemonSlayer;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DemonSlayer.MOD_ID);

    public static final RegistryObject<Item> SUNITE_INGOT = ITEMS.register("sunite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.DEMONSLAYER_TAB)));

    public static final RegistryObject<Item> SUNITE_SHARD = ITEMS.register("sunite_shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.DEMONSLAYER_TAB)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
