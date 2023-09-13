package edu.monmouth.StringOperations;

import java.util.Scanner;
public class StringLab{

    public static void main(String[] args) {
    	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Input a String: ");
	String inputString = input.next();
	
	StringOperations stringOps = new StringOperations(inputString);
	stringOps.printCharacters();
	stringOps.printUppers();
	System.out.println(stringOps.numberOfVowels());
	
    }
}