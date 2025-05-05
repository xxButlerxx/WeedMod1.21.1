package net.alex.weedmod.item;

import net.alex.weedmod.WeedMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.alex.weedmod.block.ModBlocks;
public class ModItemGroups {


    public static final ItemGroup WEED_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WeedMod.MOD_ID, "weed_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.WEED_LEAF))
                    .displayName(Text.translatable("itemgroup.weedmod.weed_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WEED_LEAF);
                        entries.add(ModItems.CANNABIS);
                        entries.add(ModItems.COIN);
                    }).build());


    public static final ItemGroup WEED_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WeedMod.MOD_ID, "weed_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.WeedBlock))
                    .displayName(Text.translatable("itemgroup.weedmod.weed_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.WeedBlock);
                    }).build());




    public static void registerItemGroups(){



        WeedMod.LOGGER.info("Registering item groups");


    }
}
