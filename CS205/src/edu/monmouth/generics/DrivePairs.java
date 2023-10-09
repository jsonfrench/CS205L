package edu.monmouth.generics;
import java.util.Date;

public class DrivePairs {

	public static void main(String[] args) {
		Pair<String, Double> stockSymbol;
		stockSymbol = new Pair<String, Double>("IBM", 90.21);
		System.out.printf("%s%n", stockSymbol);
		
		Pair<Integer, Date>employee;
		employee = new Pair<Integer, Date>(123, new Date());
		System.out.printf("%s%n", employee.toString());
	}

}
