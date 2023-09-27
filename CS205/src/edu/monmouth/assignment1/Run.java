package edu.monmouth.assignment1;

import java.util.Arrays;

public class Run {

	public static void main(String[] args) {
		
		final int NUMBER_OF_ANIMALS = 6; 
		
		Animal[] animals = new Animal[NUMBER_OF_ANIMALS];
		
		animals[0] = new Dog("brindle");
		animals[1] = new GuardDog((short) 5); // <-- i have to cast this or else it gives me an error, which is dumb
		animals[2] = new ShowDog("dachshund");
		animals[3] = new Fish("yellow");
		animals[4] = new TankFish(20);
		animals[5] = new OceanFish(true);
		
		for (Animal animal: animals) {
			animal.move();
		}
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].makeSound();
		}
		
		int i = 0;
		while (i < animals.length) {
			System.out.printf("%s%n", animals[i].toString());
			i++;
		}
		
		System.out.printf(Arrays.toString(animals));

	}
}
