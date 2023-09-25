package edu.monmouth.CaesarCipher;

public class Cipher {
	
	private String message;
	private short offset; 
	
	public Cipher(String message, short offset) {
		this.message = message; 
		this.offset = offset; 
	}
	
	private void setMessage(StringBuilder message) {
		this.message = message.toString();
	}
	
	public String encode(int offset) {
		StringBuilder encoded_message = new StringBuilder(); 
		
		for (char letter : message.toCharArray()) {
			if (letter != ' ') {
				
			encoded_message.append(
					(char) (((letter - 71 - offset) % 26) + 71 + 26)	// <--- this is where the magic happens 
					//(char) ((letter - 'a' - offset) % 26 + 'a')	//<-- there might be some way to use 'a', i've seen someone else do it
					);
			}
			else {
				encoded_message.append(' ');
			}
		}		
		setMessage(encoded_message);
		return encoded_message.toString(); 
	}

	public String decode(String encoded_message, int offset) {
		return encode(offset * -1);
	}

}
