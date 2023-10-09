package edu.monmouth.book;

public class Book {
	
	int number_of_pages; 
	BookTypes book_type; 
	String title; 
	double price; 
	
	public Book(int number_of_pages, BookTypes book_type, String title, double price) {
		setNumber_of_pages(number_of_pages);
		setBook_type(book_type);
		setTitle(title);
		setPrice(price);
	}

	public int getNumber_of_pages() {
		return number_of_pages;
	}

	public void setNumber_of_pages(int number_of_pages) {
		this.number_of_pages = number_of_pages;
	}

	public BookTypes getBook_type() {
		return book_type;
	}

	public void setBook_type(BookTypes book_type) {
		this.book_type = book_type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
