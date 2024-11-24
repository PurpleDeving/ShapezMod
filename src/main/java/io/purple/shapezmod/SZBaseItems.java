package io.purple.shapezmod;

import net.minecraft.world.item.Item;


import static io.purple.shapezmod.ShapezMod.PLMod;

public class SZBaseItems {

    public static void init(){


        PLMod.getIManager().addBasicItem("testname", new Item.Properties());

    }
}
