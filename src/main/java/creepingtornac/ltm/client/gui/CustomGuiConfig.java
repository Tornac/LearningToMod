package creepingtornac.ltm.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;
import creepingtornac.ltm.handler.ConfigurationHandler;
import creepingtornac.ltm.ref.Reference;

public class CustomGuiConfig extends GuiConfig {

   public CustomGuiConfig(GuiScreen parentScreen) {
      // This mess of a constructor is used to allow the mod to make use of the
      // ingame config editor, which is pretty neat.
      super(parentScreen, new ConfigElement(
            ConfigurationHandler.configuration
                  .getCategory(Configuration.CATEGORY_GENERAL))
            .getChildElements(), Reference.MOD_ID, false, false, GuiConfig
            .getAbridgedConfigPath(ConfigurationHandler.configuration
                  .toString()));
   }

}
