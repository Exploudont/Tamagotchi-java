package com.exploudont.tamagotchi;

import com.exploudont.tamagotchi.listener.*;

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * This class provides a skeletal implementation of the {@code Tamagotchi} interface to minimize the effort required to implement this interface.
 */
public abstract class AbstractTamagotchi implements Tamagotchi {
	
	@Override
	public synchronized void feed() {
		statistics.food++;
	}
	
	@Override
	public synchronized void play() {
		int random = (int) Math.random();
		int tmp = statistics.bored - ( random % 2 );
		statistics.bored = Math.max(0, tmp);
	}
	
	@Override
	public synchronized String talk() {
		statistics.bored = Math.max(0, statistics.bored-1);
		return "Hello! I'm talking!";
	}
	
	@Override
	public synchronized void clean() {
		statistics.poop = Math.max(0, statistics.poop-1);
	}
	
	@Override
	public synchronized Stage getStage() {
		return this.stage;
	}
	
	@Override
	public synchronized Status getStatus() {
		return this.status;
	}
	
	@Override
	public synchronized boolean isAlive() {
		return getStatus() != Status.DIE;
	}
	
	@Override
	public void setTamagotchiStageListener(TamagotchiStageListener listener) {
		this.stage_listener = listener;
		Logger.global.log(Level.FINE, "Setted the Stage listener.");
	}
	
	@Override
	public void setTamagotchiStatusListener(TamagotchiStatusListener listener) {
		this.status_listener = listener;
		Logger.global.log(Level.FINE, "Setted the Status listener.");
	}
	
	@Override
	public void setTamgotchiPoopListener(TamgotchiPoopListener listener) {
		this.poop_listener = listener;
		Logger.global.log(Level.FINE, "Setted the Poop listener.");
	}
	
	@Override
	public abstract void update();
	
	/**
	 * Set the {@code Stage} of the Tamagotchi.
	 * If the stage has changed the listener will notified (if setted).
	 *
	 * @param stage the {@code Stage}
	 */
	protected synchronized void setStage(Stage stage) {
		if(stage != this.stage) {
			this.stage = stage;
			callStageListener();
		}
	}
	
	/**
	 * Set the {@code Status} of the Tamagotchi.
	 * If the status has changed the listener will notified (if setted).
	 *
	 * @param status the {@code Status}
	 */
	protected synchronized void setStatus(Status status) {
		if(status != this.status) {
			this.status = status;
			callStatusListener();
		}
	}
	
	/**
	 * Call the stage listener if associated.
	 */
	protected void callStageListener() {
		if(stage_listener != null) {
			Logger.global.log(Level.FINE, "Calling the Stage listener.");
			stage_listener.onStageChange(getStage());
		}
	}

	/**
	 * Call the status listener if associated.
	 */	
	protected void callStatusListener() {
		if(status_listener != null) {
			Logger.global.log(Level.FINE, "Calling the Status listener.");
			status_listener.onStatusChange(getStatus());
		}
	}

	/**
	 * Call the poop listener if associated.
	 */	
	protected void callPoopListener() {
		if(poop_listener != null) {
			Logger.global.log(Level.FINE, "Calling the Poop listener.");
			poop_listener.onPoopChange(statistics.getPoop());
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Statistics>\n");
		sb.append(statistics.toString());
		sb.append("\nStage> " + getStage());
		sb.append("\nStatus> " + getStatus());
		
		return sb.toString();
	}
	
	
	protected Statistics statistics;
	protected Stage stage;
	protected Status status;
	
	protected TamagotchiStageListener stage_listener;
	protected TamagotchiStatusListener status_listener;
	protected TamgotchiPoopListener poop_listener;
}