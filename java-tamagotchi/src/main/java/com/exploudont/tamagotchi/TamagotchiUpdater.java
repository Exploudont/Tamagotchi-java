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
	}
	
	@Override
	public void run() {
		// 10 minute
		//final long SLEEPING_TIME = 10 * 60 * 1000;
		final long SLEEPING_TIME = 30 * 1000;
		final long TOLLEANCE = 3 * 1000;
		
		long total_time = 0;
		
		while(true) {
			tama.update();
			
			long start_time = System.currentTimeMillis();;
			long delta_time = 0;
			
			try {
				Thread.sleep(SLEEPING_TIME);
			} catch(InterruptedException e) {}
			
			delta_time = System.currentTimeMillis() - start_time;
			total_time += delta_time;
			
			if(total_time < SLEEPING_TIME)
				continue;
			
			total_time = 0;
			tama.grow();
			
			Logger.global.log(Level.FINER, "Updater has update the values");
		}
	}
	
	private Tamagotchi tama;
}