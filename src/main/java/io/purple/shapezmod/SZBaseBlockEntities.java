package io.purple.shapezmod;

import io.purple.shapezmod.multiblocks.gravitypedestal.GravityPedestalEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import static io.purple.shapezmod.ShapezMod.PLMod;

public class SZBaseBlockEntities {

    public static void init(){

        PLMod.getBEManager().addBlockEntity(
                "gravitypedestalentity",
                () -> BlockEntityType.Builder.of(
                    GravityPedestalEntity::new,
                    PLMod.getBManager().getBlock("gravitypedestalcontroller")
        )
        .build(null));
    }
}
