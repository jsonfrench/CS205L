package edu.monmouth.hw2;

import edu.monmouth.book.*;

public class HW2 {

	public static void main(String[] args) {
		ListNode list = new ListNode();
		
		System.out.println("First: " + list.first());
		System.out.println("Removed first: " + list.removeFirst());
		System.out.println("Last: " + list.last());
		System.out.println("Entire list: \n" + list);
		
		
		Book book1 = null;
		Book book2 = null;
		Book book3 = null;
		Book book4 = null;
		
		try{
			book1 = new Book(88, BookTypes.HARDBACK, "To Kill a Mockingbird", 25.75);
			book2 = new Book(129, BookTypes.SOFTBACK, "For Whom the Bell Tolls", 15);
			book3 = new Book(239, BookTypes.HARDBACK, "Undaunted Courage", 32.50);
			book4 = new Book(12, BookTypes.HARDBACK, "Goodnight Moon", 12.50);
		} catch(BookException e) {
			System.err.println("Cannot create all books");
			System.exit(HW2Constants.BOOKFAILURE);
		}
		
		
		list.insert(book1);
		list.insert(book2);
		list.insert(book3);
		
		System.out.println("After inserting 3 books: \n" + list);
		
		 list.insertEnd(book4);
		 
		System.out.println("After adding fourth book: \n" + list);
		
		System.out.println("First: " + list.first());
		
		System.out.println("Last: " + list.last());

		System.out.println("Removed first: " + list.removeFirst());
		System.out.println("Entire list: \n" + list);
		
	}
	
}
