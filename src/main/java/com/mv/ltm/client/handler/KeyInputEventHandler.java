package com.mv.ltm.client.handler;

import com.mv.ltm.client.settings.Keybindings;
import com.mv.ltm.ref.Key;
import com.mv.ltm.util.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class KeyInputEventHandler {
   
   private static Key getPressedKey() {
      if(Keybindings.charge.isPressed()) {
         return Key.CHARGE;
      }
      if(Keybindings.release.isPressed()) {
         return Key.RELEASE;
      }
      
      return Key.UNKNOWN;
   }

   @SubscribeEvent
   @SideOnly(Side.CLIENT)
   public void handleKeyInputEvent(KeyInputEvent event) {
      Key key = getPressedKey();
      if (key != Key.UNKNOWN) {
         LogHelper.info(key);
      }
   }
}
