package edu.monmouth.DeckOfCards;

public class Card {
	
	private int rank; 
	private int suit; 
	public static final int MAX_RANK = 13; 
	public static final int MIN_RANK = 1; 
	public static final int MAX_SUIT =  4; 
	public static final int MIN_SUIT = 1;
	
	public Card (int rank, int suit) {
		setRank(rank);
		setSuit(suit);
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}
	
	

}
