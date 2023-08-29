package com.exploudont.tamagotchi.listener;

import java.util.EventListener;

/**
 * Interface definition for a callback to be invoked when a the Tamagotchi is bored.
 */
public interface TamagotchiBoredListener extends EventListener {
	
	/**
	 * Called when the status has bored.
	 */
	public void onBored();
}