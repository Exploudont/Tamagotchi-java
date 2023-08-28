package com.exploudont.tamagotchi.listener;

import java.util.EventListener;

/**
 * Interface definition for a callback to be invoked when a the Tamagotchi's poop change.
 */
public interface TamgotchiPoopListener extends EventListener {
	
	/**
	 * Called when the poop has been changed.
	 *
	 * @param poop the new poop value
	 */
	public void onPoopChange(int poop);
}