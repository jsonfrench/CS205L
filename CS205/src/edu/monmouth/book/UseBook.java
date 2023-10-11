package edu.monmouth.book;

public class UseBook {
	public static void main(String[] args) {
		Book b1 = null;
		Book b2 = null;
		try {
		b1 = new Book(90, BookTypes.HARDBACK, "Lord of theFlies", 8.99);
		System.out.println(b1);
		b2 = new Book(287, BookTypes.SOFTBACK, null, 15.40);
		System.out.println(b2);
		} catch(BookException e) {
		System.err.println(e.getMessage());
		}
		try {
		b1.setNumber_of_pages(-9);
		} catch(BookException e) {
		System.err.println(e.getMessage());
		}
	}

}
