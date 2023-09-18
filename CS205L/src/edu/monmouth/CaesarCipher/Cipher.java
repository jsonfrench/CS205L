package edu.monmouth.CaesarCipher;

public class Cipher {
	
	private String message;
	private short offset; 
	
	public Cipher(String message, short offset) {
		this.message = message; 
		this.offset = offset; 
	}
	
	public String encode() {
		StringBuilder encoded_message = new StringBuilder(); 
		
		for (char letter : message.toCharArray()) {
			encoded_message.append(
					(char) ((letter - offset))
					);
		
			System.out.printf("%s: %s%n", letter, (int) letter); 
		}
		
		return encoded_message.toString(); 
	}

	public String decode(String encoded_message) {
		StringBuilder decoded_message = new StringBuilder(); 
		
		for (char letter : encoded_message.toCharArray()) {
			decoded_message.append(
					(char) ((letter + offset))
					);
		
			System.out.printf("%s: %s%n", letter, (int) letter); 
		}
		
		return decoded_message.toString(); 
	}

}
