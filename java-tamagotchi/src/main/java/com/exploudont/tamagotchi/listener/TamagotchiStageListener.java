package com.exploudont.tamagotchi.listener;

import com.exploudont.tamagotchi.Stage;

import java.util.EventListener;

/**
 * Interface definition for a callback to be invoked when a the Tamagotchi's stage change.
 */
public interface TamagotchiStageListener extends EventListener {

	/**
	 * Called when the stage has been changed.
	 *
	 * @param stage the new stage
	 */
	public void onStageChange(Stage stage);
}