package edu.monmouth.assignment1;

public class Dog implements Animal {
	
	@Override
	public void move() {
		System.out.printf("walk%n");
	}
	
	@Override
	public void makeSound() {
		System.out.printf("woof!%n");
	}
}
