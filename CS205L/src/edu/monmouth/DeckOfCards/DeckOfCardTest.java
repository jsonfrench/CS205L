package edu.monmouth.DeckOfCards;

import java.util.Arrays;

public class DeckOfCardTest {

	public static void main(String args[] ) {
		
		int cards_in_hand = 0;
		try {
			cards_in_hand = Integer.valueOf(args[0]);
		} catch (IndexOutOfBoundsException err) {
			System.err.printf("Args[] array must have at least 1 element: %s%n", err);
		}
		
		Deck deck = new Deck();

		Card player1Hand[] = deck.deal(cards_in_hand);
		System.out.printf("%s%n", Arrays.toString(player1Hand));
		Card player2Hand[] = deck.deal(cards_in_hand);
		System.out.printf("%s%n", Arrays.toString(player2Hand));
		Card player3Hand[] = deck.deal(cards_in_hand);
		System.out.printf("%s%n", Arrays.toString(player3Hand));
		Card player4Hand[] = deck.deal(cards_in_hand);
		System.out.printf("%s%n", Arrays.toString(player4Hand));
		
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
