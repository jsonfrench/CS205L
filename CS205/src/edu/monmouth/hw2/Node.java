package edu.monmouth.hw2;
public class Node 
{
  /* change this attribute to store a reference to a Book */
	private String info;
  private Node next;
  
  /* change this constructor so it accepts a reference to a Book */
  public Node(String info) {
    this.info = info;
    next = null;
  }
 
  /* change this method so it accepts a reference to  Book */
  public void setInfo(String info) {
    this.info = info;
  }

  /* change this method so it returns a reference to a Book */
  public String getInfo() {
    return info;
  }

  public void setNext(Node link) {
    this.next = link;
  }

  public Node getNext() {
    return next;
  }
  
  @Override 
  public String toString() {
	  /* change to invoke Book's toString */
	  return info;
  }
}
