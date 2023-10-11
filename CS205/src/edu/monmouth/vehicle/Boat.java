package edu.monmouth.vehicle;

public class Boat implements Vehicle {
	
	private int length; 

	public Boat() {
		this.length = 0; 
	}
	
	public Boat(int length) {
		this.length = length; 
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void go() {
		System.out.printf("Turns propeller%n");
	}

	@Override
	public void stop() {
		System.out.printf("Reverse propeller%n");
	}

	@Override
	public String toString() {
		return "Boat [length=" + length + "]";
	}

}
