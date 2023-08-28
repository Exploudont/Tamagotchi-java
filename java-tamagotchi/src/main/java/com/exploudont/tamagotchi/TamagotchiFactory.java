package com.exploudont.tamagotchi;

/**
 * Used to create Tamagotchis.
 *
 * Use the Factory design pattern.
 */
public final class TamagotchiFactory {
	
	/**
	 * Create a Tamagotchi.
	 *
	 * @return a Tamagotchi
	 */
	public static Tamagotchi create() {
		Tamagotchi tama = new BaseTamagotchi();
		
		return tama;
	}
}