package ru.konyakpivo.bunmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(BunMod.MODID)
public class BunMod {
    public static final String MODID = "bunmod";

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            Item bun = new ItemFood(1, 0.1F, false)
                    .setRegistryName(new ResourceLocation(MODID, "bun"))
                    .setTranslationKey(MODID + ".bun");
            event.getRegistry().register(bun);
        }
    }
}
