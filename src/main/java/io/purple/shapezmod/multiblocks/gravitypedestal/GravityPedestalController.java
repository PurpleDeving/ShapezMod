package io.purple.shapezmod.multiblocks.gravitypedestal;

import io.purple.purplelib.multiblock.ControllerBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class GravityPedestalController extends ControllerBlock {


    public GravityPedestalController(Properties properties) {
        super(properties);
    }


    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new GravityPedestalEntity(blockPos, blockState);
    }


    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (!level.isClientSide && level.getBlockEntity(pos) instanceof GravityPedestalEntity blockEntity) {
            blockEntity.incrementCounter();
            player.sendSystemMessage(Component.literal("Counter: " + blockEntity.getCounter()));
        }
        return ItemInteractionResult.sidedSuccess(level.isClientSide);
    }



    // TODO 2. Look at X3R for Rendering
    // TODO 3. Right click when not assembled should give message (maybe ControllerBlock function)
    // TODO 4. Look at pedestal mod for how to float thingy
    // TODO 5. Change thingy to corresponding black hole. How can it grow? What happens if there are blocks there ?
    // TODO 6. Look at vacuum hopper for how to "eat" items
    // TODO 7. Internal "recipe" handler ? What even is a recipe for this? How to store in save what progress was made? How often do you store that?
    // TODO 8. How to even send items in ? If it just absorbs then it needs items to be launched, or all people will just use a lame dropper from above?
    // TODO 9. Alternatively some guided floating ?
    // TODO 10. Differentiation from this MB to all of the mod ? IDK ? > Will this be the absolute main thing, or just 1 thing ?
    // TODO 11. Interaction of the system ? Possible other MB with Base + Terminal
    // TODO 12. Interaction of the system with FTB Quests or Gamestages etc.?
    // TODO 13. JEI interaction for recipe and how to build/total cost
    // TODO 14. Make the base a more interesting model and not a full block
}
