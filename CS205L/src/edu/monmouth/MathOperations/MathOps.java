package edu.monmouth.MathOperations;

public class MathOps {

	public double triangleArea(int base, int height) {
		return 0.5 * base * height;
	}

	public double circleArea(int radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	public double circleCircumference(int radius) {
		return 2 * Math.PI * radius;
	}

	public String powersOfTwo(int number_of_powers) {
		StringBuilder return_string = new StringBuilder();
		
		for(int i = 0; i < number_of_powers; i++) {
			return_string.append(i + ": " +  Math.pow(2, i) + "\n");
		}
		return return_string.toString();
	}
}
