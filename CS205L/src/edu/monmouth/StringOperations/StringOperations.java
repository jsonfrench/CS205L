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
		;
	}

	public String uppersOnly() {
		return null;
	}

	public int numberOfVowels() {
		return 0;
	}

	public String numberOfConsonants() {
		return null;
	}
	public String reverseString() {
		return null;
	}

}
