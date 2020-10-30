package net.jasonsu.unorthodox.setup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems {
    //Samosa
    public static final RegistryObject<Item> SILVER_INGOT = Registration.ITEMS.register("samosa", () ->
        new Item(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(1.2f)
                        .build())
        ));
    static void register() {

    }
}
