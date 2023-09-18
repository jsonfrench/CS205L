package edu.monmouth.StringOperations;

public class StringOperations {
	
	String value; 
	
	public StringOperations (String value) {
		this.value = value; 
	}
	
	public void printCharacters() {
		System.out.printf("%s%n", value);
	}

	public String lettersOnly() {
		StringBuilder return_value = new StringBuilder();
		
		for (char c: value.toCharArray()) {
			if (Character.isLetter(c)) {
				return_value.append(c);
			}
		}
		return return_value.toString();		
	}

	public void printUppers() {
		StringBuilder return_value = new StringBuilder();
		
		for (char c: value.toCharArray()) {
			if (Character.isUpperCase(c)) {
				return_value.append(c);
			}
		}
		System.out.printf("%s%n", return_value.toString());	
	}

	public String uppersOnly() {
		StringBuilder return_value = new StringBuilder();
		
		for (char c: value.toCharArray()) {
			if (Character.isUpperCase(c)) {
				return_value.append(c);
			}
		}
		return return_value.toString();	
	}

	public int numberOfVowels() {
		StringBuilder return_value = new StringBuilder(); 
		
		int num_vowels = 0;
		
		char[] vowels = {'a','e','i','o','u'}; 
		
		for(char letter : value.toLowerCase().toCharArray()) {
			for (char vowel : vowels) {
				num_vowels += (letter==vowel) ? 1 : 0;
			}
		}
		
		return num_vowels;
	}

	public int numberOfConsonants() {
		StringBuilder return_value = new StringBuilder(); 
		
		int num_consonants = 0;
		
		char[] vowels = {'a','e','i','o','u'}; 
		
		for(char letter : value.toLowerCase().toCharArray()) {
			for (char vowel : vowels) {
				num_consonants += (letter!=vowel) ? 1 : 0;
			}
		}
		
		return num_consonants;
	}
	public String reverseString() {
		StringBuilder return_value = new StringBuilder();
		
		char[] temp = value.toCharArray(); 
		
		for (int i = temp.length - 1; i >= 0; i--) {
			if (Character.isLetter(temp[i])) {
				return_value.append(temp[i]);
			}
		}
		return return_value.toString();		
	}

}
