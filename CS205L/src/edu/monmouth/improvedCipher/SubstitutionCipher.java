package edu.monmouth.improvedCipher;

public class SubstitutionCipher {

	String message;
	String cipher_alphabet; 
	String alphabet = "abcdefghijklmnopqrstubwxyz";
	
	public SubstitutionCipher(String message, String cipher_alphabet) {
		this.message = message;
		this.cipher_alphabet = cipher_alphabet;
	}
	
	public String Encode() {		
		StringBuilder encoded_message = new StringBuilder(); 
		
		for (char letter : message.toCharArray()) {
			for (int i = 1; i < alphabet.toCharArray().length; i++) {
				if (letter == alphabet.toCharArray()[i]) {
					encoded_message.append(cipher_alphabet.toCharArray()[i]);
					//System.out.print(i + ", appending " + cipher_alphabet.toCharArray()[i] + "\n");	<-- check what value of i and appended letter is
					break;
					}
			}
		}
		return encoded_message.toString();
	}

}
