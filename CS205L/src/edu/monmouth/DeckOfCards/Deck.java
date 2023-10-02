package edu.monmouth.DeckOfCards;

import java.util.Random;

public class Deck {
	
	Card deck[] = new Card[DeckConstants.MAX_DECK_LENGTH];
	
	public Deck() {
		for (int suit = Card.MIN_SUIT; suit <= Card.MAX_SUIT; suit++) {
			for (int rank = Card.MIN_RANK; rank <= Card.MAX_RANK; rank++) {
				deck[rank - 1 + (suit - 1) * Card.MAX_RANK] = new Card(rank, suit);		//<-- dumb math trick to avoid a counter variable 
			}
		}
	}
	
	public void shuffle() {
		;	//shuffle cards
	}
	
	public void draw() {
		;	//draw card
	}
	
	

	@Override
	public String toString() {
		StringBuilder return_string = new StringBuilder();
		for (Card card : deck) {
			return_string.append(card.getRank() + " ");
			return_string.append(card.getSuit() + "\n");
		}
		return return_string.toString();
	}
}