package edu.monmouth.DeckOfCards;

import java.util.Random;

public class Deck {
	
	Random random = new Random();
	
	Card[] deck = new Card[DeckConstants.MAX_DECK_LENGTH];
	
	public Deck() {
		for (int suit = Card.MIN_SUIT; suit <= Card.MAX_SUIT; suit++) {
			for (int rank = Card.MIN_RANK; rank <= Card.MAX_RANK; rank++) {
				deck[rank - 1 + (suit - 1) * Card.MAX_RANK] = new Card(Rank.values()[rank-1], Suit.values()[suit-1]);		//<-- dumb math trick to avoid a counter variable 
			}
		}
	}
	
	public void shuffle() {
		for (int i = 0; i < deck.length - 1; i++) {
			int j = (int) (Math.random() * (deck.length - i) + i); //pick number between i and list length
			Card temp = deck[i];	// swap j and i
			deck[i] = deck[j];
			deck[j] = temp;
		}
	}
	
	public Card draw() throws DeckException {
		
		if(deck.length == 0) {
			//return null;
			throw new DeckException();
		}
		
		int draw_index = random.nextInt(deck.length);
		Card drawn_card = deck[draw_index];
		deck[draw_index] = null;
		
		Card new_deck[] = new Card[deck.length - 1];
		int counter = 0;
		for (int i = 0; i < deck.length; i++) {
			if (deck[i] != null) {
				new_deck[counter] = deck[i];	
				counter++;
			}
		}
		this.deck = new_deck;
		return drawn_card;		
	}
	
	public Card[] deal(int cards_in_hand) throws DeckException {
		Card[] return_array = new Card[cards_in_hand];
		for (int i = 0; i < cards_in_hand; i++) {
			return_array[i] = draw();
		}
		return return_array;		
	}
	
	public int cards_left() {
		return deck.length;
	}

	@Override
	public String toString() {
		StringBuilder return_string = new StringBuilder();
		for (Card card : deck) {
			if (card != null) {
				return_string.append(card.toString() + " ");
			} 
			else {
				return_string.append("null, ");				
			}
		}
		return return_string.toString();
	}
}