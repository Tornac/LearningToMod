package creepingtornac.ltm.client.gui;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import cpw.mods.fml.client.IModGuiFactory;

public class GuiFactory implements IModGuiFactory {

   // Returning the class of the custom GuiConfig I inherited from.
   @Override
   public Class<? extends GuiScreen> mainConfigGuiClass() {
      return CustomGuiConfig.class;
   }

   @Override
   public void initialize(Minecraft minecraftInstance) {
      // TODO Auto-generated method stub

   }

   @Override
   public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public RuntimeOptionGuiHandler getHandlerFor(
         RuntimeOptionCategoryElement element) {
      // TODO Auto-generated method stub
      return null;
   }

}
