package net.jdoh.startermod.item;

import net.jdoh.startermod.StarterMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StarterMod.MOD_ID);

    public static final RegistryObject<Item> PLANT_FIBRE = ITEMS.register("plant_fibre",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRT_PILE = ITEMS.register("dirt_pile",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
