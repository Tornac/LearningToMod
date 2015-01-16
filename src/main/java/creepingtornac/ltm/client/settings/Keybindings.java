package creepingtornac.ltm.client.settings;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

public class Keybindings {

	public static KeyBinding charge = new KeyBinding(KeyLTM.CHARGE,
			Keyboard.KEY_C, KeyLTM.CATEGORY);
	public static KeyBinding release = new KeyBinding(KeyLTM.RELEASE,
			Keyboard.KEY_V, KeyLTM.CATEGORY);

}
