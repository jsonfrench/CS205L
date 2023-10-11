package edu.monmouth.book;

public class Book {
	
	int number_of_pages; 
	BookTypes book_type; 
	String title; 
	double price; 
	
	public Book(int number_of_pages, BookTypes book_type, String title, double price) throws BookException{
		setNumber_of_pages(number_of_pages);
		setBook_type(book_type);
		setTitle(title);
		setPrice(price);
	}

	public int getNumber_of_pages() {
		return number_of_pages;
	}

	public void setNumber_of_pages(int number_of_pages) throws BookException{
		if (number_of_pages < 0) {
			throw new BookException("Number of pages must be greater than zero");
		}
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

	public void setTitle(String title) throws BookException {
		if (title == null || title.length() > 0) {
			throw new BookException("Title is null or has length zero");
		}
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws BookException {
		if (price < 0) {
			throw new BookException("Price cannot be negative");
		}
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "number_of_pages=" + number_of_pages + " book_type=" + book_type + " title=" + title + " price=" + price;
	}

}