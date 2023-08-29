package com.exploudont.tamagotchi.listener;

import java.util.EventListener;

/**
 * Interface definition for a callback to be invoked when a the Tamagotchi talk.
 */
public interface TamagotchiTalkListener extends EventListener {
	
	/**
	 * Called when the tamagotchi talk.
	 *
	 * @param phrase the said phrase
	 */
	public void onTalk(String phrase);
}