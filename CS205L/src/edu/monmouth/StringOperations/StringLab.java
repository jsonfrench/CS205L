package edu.monmouth.StringOperations;

import java.util.Scanner;
public class StringLab{

    public static void main(String[] args) {
    	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Input a String: ");
	String inputString = input.next();
	
	StringOperations stringOps = new StringOperations(inputString);
	System.out.printf("%s%n", stringOps.reverseString());	
	stringOps.printCharacters();
	stringOps.printUppers();
	System.out.printf("Number of vowels: %s%n", stringOps.numberOfVowels());
	
    }    
    
}