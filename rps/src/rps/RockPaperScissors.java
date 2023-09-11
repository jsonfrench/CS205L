package rps;

import java.util.Scanner;

public class RockPaperScissors {
	
	Scanner input = new Scanner(System.in); 
	String user_throw;
	
	public String chooseThrow() {

		user_throw = input.nextLine().toLowerCase();
		
		if (!(user_throw.equals("rock") || user_throw.equals("paper") || user_throw.equals("scissors") || user_throw.equals("quit"))) {
			chooseThrow();
		}
		return (user_throw);
		
	}
	
	public String ToThrow(int move) {
		
		if (move == 0) {
			return "rock";
		}
		else if (move == 1) {
			return "paper";
		}
		else if (move == 2) {
			return "scissors";
		}
		
		System.out.printf("An error has occurred!%n", null);
		return "rock";

	} 
	
	public int ToNumber(String move) {

		if (move.equals("rock")) {
			return 0;
		}
		else if (move.equals("paper")) {
			return 1;
		}
		else if (move.equals("scissors")) {
			return 2;			
		}
		
		System.out.printf("An error has occurred!%n", null);
		return 0;
		
	}
	
	public String CalculateResult(int player, int cpu) {

		if (player == cpu) {
			return "Draw";
		}
		else if (player == 0) {		//rock
			if (cpu == 1) {			//paper - lose
				return "Lose";
			}
			else if (cpu == 2) {	//scissors - win
				return "Win"; 
			}
		}
		else if (player == 1) {		//paper
			if (cpu == 0) {			//rock - win
				return "Win";
			}
			else if (cpu == 2) {	//scissors - loose
				return "Lose"; 
			}
		}
		else if (player == 2) {		//scissors 
			if (cpu == 0) {			//rock - lose
				return "Lose";
			}
			else if (cpu == 1) {	//paper - win
				return "Win"; 
			}
		}
		return "error";
		
	}

}
