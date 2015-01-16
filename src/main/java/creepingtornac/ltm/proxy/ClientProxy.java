package creepingtornac.ltm.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import creepingtornac.ltm.client.settings.Keybindings;

public class ClientProxy extends CommonProxy {

   @Override
   public void registerKeyBindings() {
      ClientRegistry.registerKeyBinding(Keybindings.charge);
      ClientRegistry.registerKeyBinding(Keybindings.release);
   }
}
