package edu.monmouth.card;

public class Card {
	
	private Rank rank; 
	private Suit suit; 
	public static final int MAX_RANK = 13; 
	public static final int MIN_RANK = 1; 
	public static final int MAX_SUIT =  4; 
	public static final int MIN_SUIT = 1;
	
	public Card (Rank rank, Suit suit) {
		setRank(rank);
		setSuit(suit);
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	@Override
	public String toString() {
		return this.getRank() + " of " + this.getSuit() + "S"; 
	}
	
}
