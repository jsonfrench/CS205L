package edu.monmouth.improvedCipher;

import java.util.*;

public class Lab1a {
	
	public static void main(String args[]) {
			
		String message = "monmouth";
		String cipher_alphabet = "qazwsxedcrfvbgtyhnmjuiklop"; 		

		SubstitutionCipher cipher = new SubstitutionCipher(message, cipher_alphabet);
	
		System.out.printf("message: %s%n", message);
		System.out.printf("encoded: %s%n", cipher.Encode());
		
	}
}