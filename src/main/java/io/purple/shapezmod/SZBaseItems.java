package io.purple.shapezmod;

import io.purple.purplelib.dependency.DependMod;
import io.purple.purplelib.item.BasicItem;
import net.minecraft.world.item.Item;

import static io.purple.purplelib.registry.PLRegistry.ITEMS;
import static io.purple.shapezmod.ShapezMod.SZMod;

public class SZBaseItems {

    public static void init(){



        BasicItem.addBasicItem(SZMod,"testname", new Item.Properties());
    }
}
