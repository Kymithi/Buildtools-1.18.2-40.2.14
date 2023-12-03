package net.kymithi.buildtools.block.entity;

import net.kymithi.buildtools.BuildTools;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFallingBlockEntities {
    public static final DeferredRegister<FallingBlockEntity> ProblemArea =
            DeferredRegister.create(ForgeRegistries./*ProblemArea*/, BuildTools.MOD_ID)

    //public static void register(IEventBus eventBus) {
    //    Placeholder.register(eventBus);

}
