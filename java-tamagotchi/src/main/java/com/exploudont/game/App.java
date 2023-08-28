package com.exploudont.game;

import com.exploudont.tamagotchi.Tamagotchi;
import com.exploudont.tamagotchi.TamagotchiFactory;

/**
 * Example of usage.
 */
public class App {
	
	public static void main( String[] args ) {
		Tamagotchi tama = TamagotchiFactory.create();
		Menu.startMenu(tama);
	}
}
