package com.mv.ltm.client.settings;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import com.mv.ltm.ref.Names;

public class Keybindings {

   public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE,
         Keyboard.KEY_C, Names.Keys.CATEGORY);
   public static KeyBinding release = new KeyBinding(Names.Keys.RELEASE,
         Keyboard.KEY_V, Names.Keys.CATEGORY);

}
