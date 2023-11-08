package edu.monmouth.DeckOfCards;

import java.util.Random;

import edu.monmouth.card.Card;
import edu.monmouth.card.Rank;
import edu.monmouth.card.Suit;

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
	
	public int get_hand_value(Card[] hand) {
		int value_of_hand = 0;
		for (Card card: hand) {
			value_of_hand += card.getRank().ordinal()+1;
		}
		return value_of_hand;
	}
	
	public int get_lowest_player(Card[][] player_hands) {
		int[] hand_values = new int[player_hands.length];
		for (int i = 0; i < player_hands.length; i++) {			
			hand_values[i] = get_hand_value(player_hands[i]);
		}
		int return_value = hand_values[0];
		for (int i = 0; i < hand_values.length-1; i++) {
			if (hand_values[i+1] < return_value) {
				return_value = hand_values[i+1];
				//System.out.printf("replaced %s with %s%n", hand_values[i], hand_values[i+1]);
			}
		}
		return return_value;
	}

	public int get_highest_player(Card[][] player_hands) {
		int[] hand_values = new int[player_hands.length];
		for (int i = 0; i < player_hands.length; i++) {			
			hand_values[i] = get_hand_value(player_hands[i]);
		}
		int return_value = hand_values[0];
		for (int i = 0; i < hand_values.length-1; i++) {
			if (hand_values[i+1] > return_value) {
				return_value = hand_values[i+1];
				//System.out.printf("replaced %s with %s%n", hand_values[i], hand_values[i+1]);
			}
		}
		return return_value;
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