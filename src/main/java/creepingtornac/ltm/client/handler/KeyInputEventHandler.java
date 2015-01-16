package creepingtornac.ltm.client.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import creepingtornac.ltm.client.settings.KeyLTM;
import creepingtornac.ltm.client.settings.Keybindings;
import creepingtornac.ltm.util.LogHelper;

public class KeyInputEventHandler {

	private static KeyLTM.Key getPressedKey() {
		if (Keybindings.charge.isPressed()) {
			return KeyLTM.Key.CHARGE;
		}
		if (Keybindings.release.isPressed()) {
			return KeyLTM.Key.RELEASE;
		}

		return KeyLTM.Key.UNKNOWN;
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void handleKeyInputEvent(KeyInputEvent event) {
		KeyLTM.Key key = getPressedKey();
		if (key != KeyLTM.Key.UNKNOWN) {
			LogHelper.info(key);
		}
	}
}
