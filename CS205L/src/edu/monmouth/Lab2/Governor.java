package edu.monmouth.Lab2;

public class Governor {
	
	private String name;
	private int age;
	
	Governor(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	
	@Override 
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Governor)) {
			return false;
		}
		Governor that = (Governor) obj;
		return this.name.equals(that.name)
				&& this.age == that.age;
	}
	
	@Override
	public int hashCode() {
		int return_value = 0;
		for (char c : name.toCharArray()) {
			return_value += c;
		}
		return_value += age;
		return return_value;		
	}

	@Override
	public String toString() {
		return "Governor [name=" + name + ", age=" + age + "]";
	}

}
