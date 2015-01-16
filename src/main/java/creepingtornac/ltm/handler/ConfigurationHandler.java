package creepingtornac.ltm.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import creepingtornac.ltm.ref.Reference;
import creepingtornac.ltm.util.LogHelper;

public class ConfigurationHandler {

   public static Configuration configuration;
   public static boolean testValue = false;

   public static void init(File configFile) {
      if (configuration == null) {
         configuration = new Configuration(configFile);
         loadConfigurations();
      }
   }

   private static void loadConfigurations() {
      LogHelper.info("applying configs");
      testValue = configuration.getBoolean("testValue",
            Configuration.CATEGORY_GENERAL, testValue, "this is a test value");
      if (configuration.hasChanged()) configuration.save();
      LogHelper.info("configs applied");
   }

   @SubscribeEvent
   public void onConfigurationChangedEvent(
         ConfigChangedEvent.OnConfigChangedEvent event) {
      if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
         // Resync configs
         loadConfigurations();
         LogHelper.info("the configs have been changed and re-applied");
      }
   }
}
