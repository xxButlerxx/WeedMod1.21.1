package net.alex.weedmod.item;

import net.alex.weedmod.WeedMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item WEED_LEAF = registerItem("weed_leaf", new Item(new Item.Settings()));
    public static final Item CANNABIS = registerItem("cannabis", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WeedMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        WeedMod.LOGGER.info("Registering ModItems");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(WEED_LEAF);
            entries.add(CANNABIS);
        });
    }




}
