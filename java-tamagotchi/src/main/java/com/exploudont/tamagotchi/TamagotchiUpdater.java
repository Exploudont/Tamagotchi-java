package com.exploudont.tamagotchi;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * Update the Tamagotchi's values.
 */
public class TamagotchiUpdater extends Thread {
	
	/**
	 * Create a new {@code TamagotchiUpdater} object.
	 *
	 * @param tama the tamagotchi objet to update
	 */
	public TamagotchiUpdater(Tamagotchi tama) {
		this.tama = tama;
		// setDaemon(true);
	}
	
	@Override
	public void run() {
		// 10 minute
		final long SLEEPING_TIME = 10 * 60 * 1000;
		
		while(true) {
			
			try {
				Thread.sleep(SLEEPING_TIME);
			} catch(InterruptedException e) {}
			
			// clean the interrupted status
			// and exit
			if(interrupted())
				break;
			
			tama.update();
			
			Logger.global.log(Level.FINER, "Updater has update the values");
		}
	}
	
	private Tamagotchi tama;
}