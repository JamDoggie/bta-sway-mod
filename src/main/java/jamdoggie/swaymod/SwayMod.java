package jamdoggie.swaymod;

import jamdoggie.swaymod.options.ISwayOptions;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SwayMod implements ModInitializer {
    public static final String MOD_ID = "swaymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static ISwayOptions options;
    @Override
    public void onInitialize() {
        LOGGER.info("ExampleMod initialized.");
    }
}
