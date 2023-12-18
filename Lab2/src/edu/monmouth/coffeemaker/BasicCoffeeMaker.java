package edu.monmouth.coffeemaker;

public class BasicCoffeeMaker implements CoffeeMaker, Comparable<BasicCoffeeMaker>{
	
	private String name;
	
	public BasicCoffeeMaker(String name) {
		setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return(name);
	}
	
	public void brew() {
		System.out.printf("I'm  a basic coffee maker, I'll brew your coffee. %n");		
	}

	@Override
	public String toString() {
		return "BasicCoffeeMaker [name=" + name + "]";
	}
	
	@Override
	public int compareTo(BasicCoffeeMaker basic_coffee_maker) {
		return this.name.compareTo(basic_coffee_maker.name);
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof BasicCoffeeMaker)) {
			return false;
		}
		BasicCoffeeMaker that = (BasicCoffeeMaker) obj;
		return this.name.equals(that.name);
	}
	
}
