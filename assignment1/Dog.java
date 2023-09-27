package edu.monmouth.assignment1;

public class Dog implements Animal {
	
	protected String fur_color;

	public Dog() {
		fur_color = "brown";
	}
	
	public Dog(String fur_color) {
		this.fur_color = fur_color;
	}

	public String getFur_color() {
		return fur_color;
	}

	public void setFur_color(String fur_color) {
		this.fur_color = fur_color;
	}

	@Override
	public void move() {
		System.out.printf("walk%n");
	}

	@Override
	public void makeSound() {
		System.out.printf("woof!%n");
	}
	
	@Override 
	public String toString() {
		return "Dog fur_color = " + fur_color;
	}
}
