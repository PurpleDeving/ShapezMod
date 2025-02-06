package io.purple.shapezmod;

import io.purple.purplelib.multiblock.ControllerBlock;
import io.purple.shapezmod.multiblocks.gravitypedestal.GravityPedestalController;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static io.purple.shapezmod.ShapezMod.PLMod;

public class SZBaseBlocks {


    public static void init() {

        BlockBehaviour.Properties defaultProps = BlockBehaviour.Properties.of();

        PLMod.getBManager().addBasicBlock("testblock");
        //PLMod.getBManager().addBasicController("controllerbase");
        PLMod.getBManager().addAdvancedBlock("gravitypedestalcontroller", ()-> new GravityPedestalController(defaultProps));
    }
}
