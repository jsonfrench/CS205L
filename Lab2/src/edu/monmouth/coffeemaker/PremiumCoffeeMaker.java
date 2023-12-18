package edu.monmouth.coffeemaker;

import java.lang.*;

public class PremiumCoffeeMaker implements CoffeeMaker, Comparable<PremiumCoffeeMaker>{
	
	private boolean has_grinder;
	private int capacity;
	
	
	
	public PremiumCoffeeMaker(boolean has_grinder, int capacity) {
		set_grinder(has_grinder);
		setCapacity(capacity);
	}

	public void set_grinder(boolean has_grinder) {
		this.has_grinder = has_grinder;
	}

	public boolean get_grinder() {
		return has_grinder;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}
	
	public void brew() {
		System.out.printf("I am a premium coffee maker, I will grind your coffee. %n");
	}

	@Override
	public String toString() {
		return "PremiumCoffeeMaker [has_grinder=" + has_grinder + ", capacity=" + capacity + "]";
	}
	
	@Override
	public int compareTo(PremiumCoffeeMaker premium_coffee_maker) {
		Integer thisint = this.capacity;
		Integer thatint = premium_coffee_maker.capacity;
		return thisint.compareTo(thatint);
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof PremiumCoffeeMaker)) {
			return false;
		}
		PremiumCoffeeMaker that = (PremiumCoffeeMaker) obj;
		return this.has_grinder==that.has_grinder
				&&this.capacity==that.capacity;
	}
		
	
	
	
}
