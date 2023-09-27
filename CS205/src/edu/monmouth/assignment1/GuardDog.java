package edu.monmouth.assignment1;

public class GuardDog extends Dog{
	
	private short meanness; // <-- aggressiveness?
	
	public GuardDog() {
		meanness = 0;
	}

	public GuardDog(short meanness) {
		this.meanness = meanness;
	}
	
	public short getMeanness() {
		return meanness;
	}

	public void setMeanness(short meanness) {
		this.meanness = meanness;
	}

	@Override
    public void move() {
        System.out.printf("attack!%n");
	}

	@Override
    public void makeSound() {
        System.out.printf("bark!%n");
    }
	
	@Override
	public String toString() {
		return "GuardDog meanness = " + meanness;
	}
}
