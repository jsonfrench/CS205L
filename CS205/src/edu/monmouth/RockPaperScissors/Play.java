package edu.monmouth.RockPaperScissors; 

import java.util.*;


public class Play {

	public static void main(String[] args) {
		
		//variables 
		boolean done = false; 
		String rps_throw = ""; 
		int rps_number;
		int cpu_number; 

		//imports
		Random random = new Random();
		RockPaperScissors rps = new RockPaperScissors();
		
		//game loop
		while (!done) {			
			
			System.out.printf("Begin!%n", null);
			
			rps_throw = rps.chooseThrow();
			
			if (rps_throw.equals("quit")) {
				done = true; 
				System.out.printf("Thanks for playing!%n"); 
				continue;
			}
			
			rps_number = rps.ToNumber(rps_throw);
			
			cpu_number = (int) (Math.random() * 3); 
	
			System.out.printf("Player:\tCPU:%n%s\t%s%n", rps_throw, rps.ToThrow(cpu_number));
			
			System.out.printf("%s%n%n", rps.CalculateResult(rps_number, cpu_number));
			
		} 
		
	}

}
