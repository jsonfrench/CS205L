package edu.monmouth.DeckOfCards;

import java.util.Arrays;

import edu.monmouth.card.Card;
import edu.monmouth.card.Rank;

public class DeckOfCardTest {

	public static void main(String args[] ) {
		
		int cards_in_hand = 0;
		try {
			cards_in_hand = Integer.parseInt(args[0]);
		} catch (IndexOutOfBoundsException err) {
			System.err.printf("Args[] array must have at least 1 element: %s%n", err);
			System.exit(DeckConstants.EXIT_OUT_OF_BOUNDS);
		} catch (NumberFormatException err) {
			System.err.printf("Argument[0] must be of type int: %s%n", err);			
			System.exit(DeckConstants.EXIT_NOT_AN_INTEGER);
		}
		
		
		Deck deck = new Deck();
		
		Card[][] player_hands = new Card[DeckConstants.NUMBER_OF_PLAYERS][cards_in_hand];

		
		for(int i = 0; i < player_hands.length; i++) {
			try {
				player_hands[i] = deck.deal(cards_in_hand);
				System.out.printf("%s%n", Arrays.toString(player_hands[i]));
			} catch (DeckException err) {
				System.err.printf("Cannot deal cards - no cards left in deck: %n%s%n", err.getStackTrace());
				System.exit(DeckConstants.EXIT_OUT_OF_BOUNDS); 
			}
		}
		
		for (Card[] hand: player_hands) {
			System.out.printf("%s%n", deck.get_hand_value(hand));
		}
		
		System.out.printf("lowest: %s%n", deck.get_lowest_player(player_hands));
		System.out.printf("highest: %s%n", deck.get_highest_player(player_hands));
		
		/*
		try {
		Card player1Hand[] = deck.deal(cards_in_hand);
		System.out.printf("%s%n", Arrays.toString(player1Hand));
		} catch (DeckException err) {
			System.out.printf("%s%n", err);
		}
		*/
		
		/*
		Card player2Hand[] = deck.deal(cards_in_hand);
		System.out.printf("%s%n", Arrays.toString(player2Hand));
		Card player3Hand[] = deck.deal(cards_in_hand);
		System.out.printf("%s%n", Arrays.toString(player3Hand));
		Card player4Hand[] = deck.deal(cards_in_hand);
		System.out.printf("%s%n", Arrays.toString(player4Hand));
*/
		
		/*
		
		// verify Card constructor
		Card c1 = new Card(Rank.EIGHT, Suit.HEART);
		Card c2 = new Card(Rank.TWO, Suit.HEART);
		Card c3 = new Card(Rank.NINE, Suit.HEART);
		System.out.println("Card c1: " + c1);
		System.out.println("Card c2: " + c2);
		System.out.println("Card c3: " + c3);
		
		// verify Deck constructor & toString
		Deck deck = new Deck();
		System.out.println("Newly created deck:\n" + deck);
		deck.shuffle();
		System.out.println("Shuffled deck:\n" + deck);
		
		System.out.println("Draw card: " + deck.draw());
		System.out.println("Draw card: " + deck.draw());
		System.out.println("Draw card: " + deck.draw());
		int cardsLeft = deck.cards_left();
		System.out.println("cardsLeft: " + cardsLeft);
		
		
		for(int i=0; i < cardsLeft+1; i++) {
			System.out.println("Draw card: " + deck.draw());
		}
		System.out.println("Complete");
		*/
		
	}

}
