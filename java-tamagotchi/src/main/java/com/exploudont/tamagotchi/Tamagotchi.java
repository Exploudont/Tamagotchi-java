package com.exploudont.tamagotchi;

import com.exploudont.tamagotchi.listener.*;

/**
 * Define the Tamagotchi's operations.
 *
 * Tamagotchi use the event paradigm to communicate.
 */
public interface Tamagotchi {
	
	/**
	 * Feed the Tamagotchi pet.
	 */
	public void feed();

	/**
	 * Play with the Tamagotchi pet.
	 */	
	public void play();

	/**
	 * Talk with the Tamagotchi pet.
	 * Return the words it sayd.
	 *
	 * @return return the {@code String} rappresentation of the words it sayd.
	 */	
	public String talk();

	/**
	 * Clean the Tamagotchi.
	 */	
	public void clean();

	/**
	 * Return the actual stage of the Tamagotchi.
	 *
	 * @return the stage of the Tamagotchi pet
	 */	
	public Stage getStage();
	
	/**
	 * Return the actual status of the Tamagotchi.
	 *
	 * @return the status of the Tamagotchi pet
	 */	
	public Status getStatus();
	
	/**
	 * Return if the Tamagotchi is alive.
	 *
	 * @return return {@code true} only if the tamagotchi is alive
	 */
	public boolean isAlive();
	
	/**
	 * Update the Tamagotchi's values.
	 * Tamagotchi evolves during time.
	 */
	public void update();
	
	/**
	 * Set the Tamagotchi listener.
	 * The listener will be notified if the stage change.
	 *
	 * @param listener the listener
	 */
	public void setTamagotchiStageListener(TamagotchiStageListener listener);
	
	/**
	 * Set the Tamagotchi listener.
	 * The listener will be notified if the status change.
	 *
	 * @param listener the listener
	 */
	public void setTamagotchiStatusListener(TamagotchiStatusListener listener);
	
	/**
	 * Set the Tamagotchi listener.
	 * The listener will be notified if the poop change.
	 *
	 * @param listener the listener
	 */
	public void setTamgotchiPoopListener(TamgotchiPoopListener listener);
	
}