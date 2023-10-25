package edu.monmouth.hw2;

import edu.monmouth.book.*;

public class ListNode {
	
	private Node head; 

	public ListNode() {
		head = null;
		}
  
	public Node removeFirst() {
	  /* placeholder */
		if (isEmpty()) {
			return null;
		}
		Node remove = head; 
		head = head.getNext();
		return remove;
		}
  
  
	public Node first() {
	    /* placeholder */
		return head;
		}
  
	public Node last() {
	   /* placeholder */
		if (isEmpty()) {
			return null;
		}
		Node current = head; 
		while (current.getNext() != null) {
			current = current.getNext();
		}
		return current;
		}

	public void insert(Book book) {
		Node newNode = new Node(book);
		newNode.setNext(head);
		head = newNode;
		}

	public void insertEnd(Book element) {
	/* placeholder */
		Node current = head; 
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(new Node(element));
		}
	
	public boolean isEmpty() { 
		/* placeholder */
		return head==null;
		}
  
	public int size() {
		/* placeholder */
		Node current = head; 
		int count = 0;
		while (current.getNext() != null) {
			current = current.getNext();
			count++;
		}
		return count; 
		}
    
	public void clear() {
		head = null;
		}

	@Override
	public String toString() {
		StringBuilder logString = new StringBuilder();
	    Node node;
	    node = head;
	    int count = 0;
	    
    while (node != null) {
    	count++;
    	logString.append(count + " . " + node.getInfo() + "\n");
    	node = node.getNext();
    	}
    return logString.toString();
    }
}
