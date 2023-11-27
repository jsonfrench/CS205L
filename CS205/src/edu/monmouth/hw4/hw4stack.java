package edu.monmouth.hw4;

import java.io.*;
import java.util.*;

public class hw4stack {

	public static void main(String[] args) {
						
		final int FILE_NOT_FOUND_ERR = -4;
		final int REDIRECT_ERROR = -3;
		final int COMMAND_ERR = -2;
		final int OUT_OF_BOUNDS_ERR = -1;
		
		//validate 1 command line argument 
		try {
			if(args.length != 1) {
				throw new Error();
			}
		} catch (IndexOutOfBoundsException e) {
			System.err.printf("Not enough command line arguments were supplied. %n");
			e.printStackTrace();
			System.exit(OUT_OF_BOUNDS_ERR);
		} catch (Error e) {
			System.err.printf("Expected 1 command line argument, got %s. %n", args.length);
			e.printStackTrace();
			System.exit(COMMAND_ERR);
		}

		//read contents of StackPalindrome.properties
		String logfile = "";
		try {
			File infile = new File(args[0]); 
			Scanner reader = new Scanner(infile);
		      while (reader.hasNextLine()) {
		        String data = reader.nextLine();
		        String[] a = data.split("=");
		        logfile = a[0];	
		      }
		      reader.close();
		    } catch (FileNotFoundException e) {
		      System.err.println("Failed to retrieve file.");
		      e.printStackTrace();
		      System.exit(FILE_NOT_FOUND_ERR);
		    }

		//redirect output to StackPalindromwLog.txt
		try {
			PrintStream newIO = new PrintStream(new FileOutputStream(logfile));	
			System.setOut(newIO);
			System.setErr(newIO);
			} catch (FileNotFoundException e) {
			System.err.println(e.getMessage() + " Cannot redirect STDERR or STDOUT ");
			e.printStackTrace();
			System.exit(REDIRECT_ERROR);	
			}		
		
		Stack<Character> stack = new Stack<Character>();
		
		//go through each of the words in the properties file and determine if they are a pelindrome
		try {
			File infile = new File(hw4stack.class.getClassLoader().getResource("StackPalindrome.properties").getFile()); 
			Scanner reader = new Scanner(infile);
		      while (reader.hasNextLine()) {
		        String data = reader.nextLine();
		        String [] b = data.split("=");		//separate "words=" from the list of words
		        String[] a = b[1].split(",");		//create an array containing each word that we want to test
		        for (String word : a) {

		        	for (char c : word.toCharArray()){
		    			stack.push(c);
		    		}
		    		
		    		StringBuilder reversed = new StringBuilder();
		    		
		    		for (char c : word.toCharArray()){
		    			reversed.append(stack.pop());
		    		}
		    		
		    		if(reversed.toString().equals(word)) {
		    			System.out.printf("%s is a palindrome%n", word);
		    		} else {
		    			System.out.printf("%s is not a palindrome%n", word);
		    		}
		        }
		        break;
		      }
		      reader.close();
		    } catch (FileNotFoundException e) {
		      System.err.println("Failed to retrieve file.");
		      e.printStackTrace();
		      System.exit(FILE_NOT_FOUND_ERR);
		    }		
	}
}
