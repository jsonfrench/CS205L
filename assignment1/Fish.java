package edu.monmouth.assignment1;

public class Fish implements Animal {
	
	protected String color;

	public Fish() {
		color = "silver";
	}
	
	public Fish(String color) {
		this.color = color;
	}
		
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

    @Override
    public void move() {
        System.out.printf("flap fins%n");
    }
    
    @Override
    public void makeSound() {
        System.out.printf("blub blub%n");
    }

    @Override
    public String toString() {
    	return "Fish color = " + color;
    }
}
