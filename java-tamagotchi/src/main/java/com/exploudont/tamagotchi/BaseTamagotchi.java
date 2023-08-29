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
		updateStatus();
		updateStage();
		
		if(isBored())
			callBoredListener();
	}
	
	protected synchronized void updateStatus() {
		int sickness = sickness();
		setStatus(calculateStatus(sickness));
	}
	
	protected synchronized void updateStage() {
		int age = statistics.getAge();
		setStage(calculateStage(age));
	}
	
	
	protected static Stage calculateStage(int age) {
		
		if(age < 2)
			return Stage.EGG;
		
		if(age < 4)
			return Stage.KID;
		
		if(age < 30)
			return Stage.ADULT;
		
		return Stage.OLD;
	}
	
	protected static Status calculateStatus(int sickness) {
		if(sickness < 2)
			return Status.HEALTHY;
		
		if(sickness < 4)
			return Status.SICK;
		
		if(sickness < 8)
			return Status.VERY_SICK;
		
		return Status.DIE;
	}
}