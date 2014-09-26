package com.raginggeek.letstrymod.client.handler;

import com.raginggeek.letstrymod.client.settings.Keybindings;
import com.raginggeek.letstrymod.reference.Key;
import com.raginggeek.letstrymod.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {
	
	private static Key getPressedKeybinding()
	{
		if (Keybindings.charge.isPressed())
		{
			return Key.CHARGE;
		}
		else if (Keybindings.release.isPressed())
		{
			return Key.RELEASE;
		}
		return Key.UNKNOWN;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
	{
		LogHelper.info(getPressedKeybinding());
	}
}
