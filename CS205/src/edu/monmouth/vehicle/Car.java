package edu.monmouth.vehicle;

public class Car implements Vehicle {
	
	private int engineSize; 
	
	public Car() {
		this.engineSize = 0; 
	}

	public Car(int engineSize) {
		this.engineSize = engineSize;
	} 
	
	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public void go() {
		System.out.printf("Turn 4 wheels%n");
	}

	@Override
	public void stop() {
		System.out.printf("apply brakes%n");
	}

	@Override
	public String toString() {
		return "Car [engineSize=" + engineSize + "]";
	}
	

}
