package edu.monmouth.CaesarCipher;

public class Lab1 {

	public static void main(String[] args) {
		String message = "welcome to data structures";
		//String message = "abcdefghijklmnopqrstuvwxyz";
		short offset = 4;
		
		Cipher cipher = new Cipher(message, offset);
		String encodedMessage = cipher.encode(offset);
		
		System.out.println("Encoded message: " + encodedMessage);
		System.out.println("Decoded message: " + cipher.decode(encodedMessage, offset));
		
	}

}
