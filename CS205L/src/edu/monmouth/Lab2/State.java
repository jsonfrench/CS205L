package edu.monmouth.Lab2;

public class State {
	
	private String name;
	private int coast_length;
	private String state_bird;
	
	public State(String name, int coast_length, String state_bird) {
		setName(name);
		setCoast_length(coast_length);
		setState_bird(state_bird);

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCoast_length() {
		return coast_length;
	}
	public void setCoast_length(int coast_length) {
		this.coast_length = coast_length;
	}
	public String getState_bird() {
		return state_bird;
	}
	public void setState_bird(String state_bird) {
		this.state_bird = state_bird;
	} 
	
	@Override 
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof State)) {
			return false;
		}
		State that = (State) obj;
		return this.name.equals(that.name)
				&& this.state_bird.equals(that.state_bird)
				&& this.coast_length == that.coast_length;
	}

	@Override
	public int hashCode() {
		int return_value = 0;
		for (char c : name.toCharArray()) {
			return_value += c;
		}
		for (char c : state_bird.toCharArray()) {
			return_value += c;
		}
		return_value += coast_length;
		return return_value;		
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", coast_length=" + coast_length + ", state_bird=" + state_bird + "]";
	}
	
}
