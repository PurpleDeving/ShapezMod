package io.purple.shapezmod.multiblocks.gravitypedestal;

import io.purple.purplelib.multiblock.ControllerBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import static io.purple.shapezmod.ShapezMod.PLMod;

public class GravityPedestalEntity extends ControllerBlockEntity {

    private int counter;

    public GravityPedestalEntity(BlockPos pos, BlockState blockState) {
        super(PLMod.getBEManager().getBlockEntityType("gravitypedestalentity"), pos, blockState);
    }


    public void incrementCounter() {
        counter++;
        setChanged(); // Forces the Server to not ignore the chunk of this entity during saving.
    }

    public int getCounter() {
        return counter;
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        counter = tag.getInt("counter");
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.putInt("counter", this.counter);
    }
}
