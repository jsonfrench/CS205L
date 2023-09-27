package edu.monmouth.assignment1;

public class OceanFish extends Fish{
	
	private boolean saltwater;	//<-- the idea is that fish either swim in slatwater or freshwater
	 							// i forgot that all oceans are salty ... oops 
	 							// (i don't want to make another class file just to give it a different name)
	public OceanFish() {
		saltwater = true;
	}
	
	public OceanFish(boolean saltwater) {
		this.saltwater = saltwater;
	}

	public boolean isSaltwater() {
		return saltwater;
	}

	public void setSaltwater(boolean saltwater) {
		this.saltwater = saltwater;
	}

	@Override
	public void move() {
		System.out.printf("kick tail%n");
	}

	@Override
	public void makeSound() {
		System.out.printf("splash!%n");
	}
	
	@Override
	public String toString() {
		return "OceanFish saltwater = " + saltwater;
	}
	

}
