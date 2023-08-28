package com.exploudont.tamagotchi;

/**
 * Define the basic statistics of a Tamagotchi.
 */
public class Statistics {
	
	/**
	 * Create a new {@code Statistics} object using.
	 * the object will created with default values.
	 */
	public Statistics() {
		food = 0;
		bored = 0;
		poop = 0;
		age = 0;
	}
	
	/**
	 * Return the food statistic value.
	 *
	 * @return the food statistic value 
	 */
	public int getFood() {
		return this.food;
	}
	
	/**
	 * Set the food statistic value.
	 *
	 * @param food the food value
	 */
	public void setFood(int food) {
		this.food = food;
	}

	/**
	 * Return the bored statistic value.
	 *
	 * @return the bored statistic value 
	 */
	public int getBored() {
		return this.bored;
	}
	
	/**
	 * Set the bored statistic value.
	 *
	 * @param bored the bored value
	 */
	public void setBored(int bored) {
		this.bored = bored;
	}

	/**
	 * Return the poop statistic value.
	 *
	 * @return the poop statistic value 
	 */	
	public int getPoop() {
		return this.poop;
	}

	/**
	 * Set the poop statistic value.
	 *
	 * @param poop the poop value
	 */
	public void setPoop(int poop) {
		this.poop = poop;
	}

	/**
	 * Return the age statistic value.
	 *
	 * @return the age statistic value 
	 */	
	public int getAge() {
		return this.age;
	}

	/**
	 * Set the age statistic value.
	 *
	 * @param age the age value
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("food> " + getFood());
		sb.append("\nbored> " + getBored());
		sb.append("\npoop> " + getPoop());
		sb.append("\nage> " + getAge());
		
		return sb.toString();
	}
	
	public int food;
	public int bored;
	public int poop;
	public int age;
}