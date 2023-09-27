package edu.monmouth.assignment1;

public class ShowDog extends Dog{
	
	private String breed; 

	public ShowDog() {
		breed = "mix";
	}
	
	public ShowDog(String breed) {
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
    public void move() {
    	System.out.printf("prance%n");
    }
    
    @Override
    public void makeSound() {
    	System.out.printf("yelp!%n");
	}
    
    @Override
    public String toString() {
    	return "ShowDog breed = " + breed;
    }
}
