package net.kymithi.buildtools;

import com.mojang.logging.LogUtils;
import net.kymithi.buildtools.block.ModBlocks;
import net.kymithi.buildtools.block.entity.ModFallingBlockEntities;
import net.kymithi.buildtools.item.ModItems;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(BuildTools.MOD_ID)
public class BuildTools {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "buildtools";

    public BuildTools() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        //ModFallingBlockEntities.register(eventBus);

        eventBus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
