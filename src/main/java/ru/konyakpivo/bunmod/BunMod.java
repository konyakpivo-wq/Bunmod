package ru.konyakpivo.bunmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = BunMod.MODID, name = BunMod.NAME, version = BunMod.VERSION, acceptedMinecraftVersions = "[1.13.2]")
@Mod.EventBusSubscriber
public class BunMod {
    public static final String MODID = "bunmod";
    public static final String NAME = "Bun Mod";
    public static final String VERSION = "1.0.0";

    private static final Food BUN_FOOD = new Food.Builder()
            .hunger(1)
            .saturation(0.1F)
            .build();

    public static Item BUN;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        BUN = new Item(new Item.Properties()
                .food(BUN_FOOD)
                .group(CreativeTabs.FOOD))
                .setRegistryName(new ResourceLocation(MODID, "bun"));
        event.getRegistry().register(BUN);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(
                BUN, 0,
                new net.minecraft.client.renderer.block.model.ModelResourceLocation(
                        new ResourceLocation(MODID, "bun"), "inventory"));
    }
}
