package edu.monmouth.assignment1;

public class TankFish extends Fish{
	
	private int tank_size;
	
	
	public TankFish() {
		tank_size = 0;
	}

	public TankFish(int tank_size) {
		this.tank_size = tank_size;
	}

	public int getTank_size() {
		return tank_size;
	}

	public void setTank_size(int tank_size) {
		this.tank_size = tank_size;
	}
	
	@Override
	public void move() {
		System.out.printf("float around%n");
	}

	@Override
	public void makeSound() {
		System.out.printf("splish...%n");
	}
	
	@Override
	public String toString() {
		return "TankFish tank_size = " + tank_size;
	}
	
}
