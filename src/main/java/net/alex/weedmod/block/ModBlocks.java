package net.alex.weedmod.block;

import net.alex.weedmod.WeedMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
public class ModBlocks {

    public static Block WeedBlock = registerBlock("weed_block",
            new Block(AbstractBlock.Settings.create().strength(0.2F).sounds(BlockSoundGroup.AZALEA_LEAVES).burnable()));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(WeedMod.MOD_ID,name), block);
    }





    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(WeedMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks() {
        WeedMod.LOGGER.info("Registering Blocks");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(WeedBlock);
        });

        FlammableBlockRegistry.getDefaultInstance().add(WeedBlock, 30, 60);

    }

}
