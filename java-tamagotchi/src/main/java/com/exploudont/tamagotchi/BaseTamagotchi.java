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
		
		tamagotchi_updater = new TamagotchiUpdater(this);
		tamagotchi_updater.start();
	}
	
	protected synchronized int sickness() {
		return statistics.getPoop()
		 		+ statistics.getBored()
		 		+ Math.max(0, statistics.getAge()-32)
		 		+ Math.abs(statistics.getFood()-2);
	}
	
	@Override
	public synchronized void update() {
		updateStatistics();
		updateStatus();
		updateStage();
	}
	
	protected synchronized void updateStatistics() {
		int random;
		
		statistics.setAge(statistics.getAge() + 1);
		
		random = (int) Math.random();
		statistics.setBored(statistics.getBored() + random % 2);
		
		statistics.setFood(Math.max(0, statistics.getFood()-2));
		
		random = (int) Math.random();
		statistics.setPoop(statistics.getPoop() + random % 2);
		
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