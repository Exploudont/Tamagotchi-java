package com.exploudont.game;

import com.exploudont.tamagotchi.Tamagotchi;
import com.exploudont.tamagotchi.TamagotchiFactory;

import com.exploudont.tamagotchi.listener.TamagotchiTalkListener;

/**
 * Example of usage.
 */
public class App implements TamagotchiTalkListener {
	
	public App() {}

	public void onTalk(String phrase) {
		System.out.println("phrase> " + phrase);
	}

	public static void main(String[] args) {
		Tamagotchi tama = TamagotchiFactory.create();
		tama.setTamagotchiTalkListener(new App());
		Menu.startMenu(tama);
	}
}