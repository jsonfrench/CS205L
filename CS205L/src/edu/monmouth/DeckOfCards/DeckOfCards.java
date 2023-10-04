package edu.monmouth.DeckOfCards;

public class DeckOfCards {
	public static void main(String[] args) {
		
		Deck deck = new Deck();		
		
				
		System.out.printf("%s%n", deck.toString());
		deck.shuffle();
		System.out.printf("%s%n", deck.toString());
		System.out.printf("%s%n", deck.cards_left());
		System.out.printf("%s%n", deck.draw().getRank() + " of " + deck.draw().getSuit() + "S");
		System.out.printf("%s%n", deck.cards_left());
		System.out.printf("%s%n", deck.draw().getRank() + " of " + deck.draw().getSuit() + "S");

	}
}
