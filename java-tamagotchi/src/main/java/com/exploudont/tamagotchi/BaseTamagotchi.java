package com.exploudont.tamagotchi;

/**
 * Basic implementation of the {@code Tamagotchi} interface.
 */
public class BaseTamagotchi extends AbstractTamagotchi {
	
	/**
	 * Create a new {@code BaseTamagotchi} Object.
	 */
	public BaseTamagotchi() {
		this.statistics = new Statistics();
		setStage(Stage.EGG);
		setStatus(Status.HEALTHY);
		//this.stage = Stage.EGG;
		//this.status = Status.HEALTHY;
		tamagotchi_updater = new TamagotchiUpdater(this);
		tamagotchi_updater.start();
	}
	
	protected synchronized int sickness() {
		return statistics.poop
		 		+ statistics.bored
		 		+ Math.max(0, statistics.age-32)
		 		+ Math.abs(statistics.food-2);
	}
	
	@Override
	public synchronized void update() {
		updateStatistics();
		updateStatus();
		updateStage();
	}
	
	protected synchronized void updateStatistics() {
		int random;
		
		statistics.age++;
		
		random = (int) Math.random();
		statistics.bored += random % 2;
		
		statistics.food = Math.max(0, statistics.food-2);
		
		random = (int) Math.random();
		statistics.poop += random % 2;
		
		callPoopListener();
	}
	
	protected synchronized void updateStatus() {
		int sickness = sickness();
		setStatus(calculateStatus(sickness));
	}
	
	protected synchronized void updateStage() {
		int sickness = sickness();
		setStage(calculateState(sickness));
	}
	
	
	protected static Stage calculateState(int sickness) {
		return Stage.ADULT;
	}
	
	protected static Status calculateStatus(int sickness) {
		return Status.HEALTHY;
	}
	
	private Thread tamagotchi_updater;
}