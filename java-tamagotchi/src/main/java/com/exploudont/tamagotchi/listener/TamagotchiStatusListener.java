package com.exploudont.tamagotchi.listener;

import com.exploudont.tamagotchi.Status;

import java.util.EventListener;

/**
 * Interface definition for a callback to be invoked when a the Tamagotchi's status change.
 */
public interface TamagotchiStatusListener extends EventListener {
	
	/**
	 * Called when the status has been changed.
	 *
	 * @param status the new status
	 */
	public void onStatusChange(Status new_status);
}