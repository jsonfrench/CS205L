package edu.monmouth.cardList;

import edu.monmouth.card.*;

public class CardNode 
{
	private Card card;
	private CardNode next, previous;
  
  public CardNode(Card card) {
    this.card = card;
    next = previous = null;
  }
 
  public void setCard(Card card) {
    
  }

  public Card getCard() {
	// placeholder
	return null;
  }

  public void setPrevious(CardNode link) {
	
  }

 public CardNode getPrevious() {
	// placeholder
	return null;	 
 }
	  
  public void setNext(CardNode link) {
    
  }

  public CardNode getNext() {
	// placeholder
	return null;    
  }
  
  @Override 
  public String toString() {
	// placeholder
	return "";
	  
  }
}
