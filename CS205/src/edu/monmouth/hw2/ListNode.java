package edu.monmouth.hw2;

public class ListNode {
	
	private Node head; 

	public ListNode() {
		head = null;
		}
  
	public Node removeFirst() {
	  /* placeholder */
		return null;
		}
  
  
	public Node first() {
	    /* placeholder */
		return null;
		}
  
	public Node last() {
	   /* placeholder */
		return null;
		}

	public void insert(String element) {
		Node newNode = new Node(element);
		newNode.setNext(head);
		head = newNode;
		}

	public void insertEnd(String element) {
	/* placeholder */
		return; 
		}
	
	public boolean isEmpty() { 
	/* placeholder */
		return true;
		}
  
	public int size() {
		/* placeholder */
		return 0;
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
