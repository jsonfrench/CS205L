package edu.monmouth.hw3;
import edu.monmouth.book.*;
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class HW3 {

	public static void main(String[] args) {
		
		/*
		try {
			PrintStream newIO = new PrintStream(HW3Constants.output_file);	
			System.setOut(newIO);
			System.setErr(newIO);
			} catch (FileNotFoundException e) {
			System.err.println(e.getMessage() + " Cannot redirect STDERR or STDOUT ");
			e.printStackTrace();
			System.exit(HW3Constants.err_redirect);	
			}
		*/
		
		//create lists for strings a books
		List<String> strings_arraylist = new ArrayList<String>();
		List<String> strings_linkedlist = new LinkedList<String>(); 
		List<Book> books_arraylist = new ArrayList<Book>();
		List<Book> books_linkedlist = new LinkedList<Book>(); 
		
		//read contents from string.txt
		try {
		      File infile = new File(HW3Constants.string_file);
		      Scanner reader = new Scanner(infile);
		      while (reader.hasNextLine()) {
		        String data = reader.nextLine();
		        strings_arraylist.add(data);
		        strings_linkedlist.add(data);
		      }
		      reader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("Failed to retrieve file.");
		      e.printStackTrace();
		      System.exit(HW3Constants.err_read_file);
		    }
		
		/*
		for (String s: strings_arraylist) {
			System.out.printf("%s%n", s);
		}
		for (String s: strings_linkedlist) {
			System.out.printf("%s%n", s);
		}
		*/
		
		//read contents from book.txt
		try {
		      File infile = new File(HW3Constants.book_file);
		      Scanner reader = new Scanner(infile);
		      while (reader.hasNextLine()) {
		        String data = reader.nextLine();
		        String[] a = data.split(",");
		        try {
					books_arraylist.add(new Book(Integer.parseInt(a[2]), BookTypes.valueOf(a[1]), a[0], Double.parseDouble(a[3])));
					books_linkedlist.add(new Book(Integer.parseInt(a[2]), BookTypes.valueOf(a[1]), a[0], Double.parseDouble(a[3])));
				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.printf("%s ", e);
					System.err.printf("Not enough values in the line.%n");
					e.printStackTrace();
				} catch (BookException e) {
					e.printStackTrace();
				} catch (NumberFormatException e) {
					System.err.printf("Number contains invalid characters.%n");
					e.printStackTrace();
				}
		      }
		      reader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("Failed to retrieve file.");
		      e.printStackTrace();
		      System.exit(HW3Constants.err_read_file);
		    }
		
		/*
		 * Use the following (ArrayList): 
		 * isEmpty
		 * remove (using index)
		 * size
		 * add
		 * iterator
		 * listIterator (iterate in reverse order)
		 * 
		 * Use the following (LinkedList):
		 * add
		 * listIterator (iterate in reverse order
		 * iterator
		 * contains and remove - 1) with a book object in the list 2) with a book that isn't in the list
		 */
		
		//arraylist methods
		System.out.printf("%nArraylist methods:%n===============%n");
		
		//isEmpty
		System.out.printf("Is strings empty? %s %n", strings_linkedlist.isEmpty());
		System.out.printf("Is books empty? %s %n", books_linkedlist.isEmpty());
		
		//remove
		System.out.printf("Removing %s from strings...%n", strings_linkedlist.get(0));
		strings_linkedlist.remove(0);
		
		//size
		System.out.printf("Size of strings: %s%n", strings_linkedlist.size());
		System.out.printf("Size of books: %s%n", books_linkedlist.size());
		
		//add
		strings_arraylist.add("Homework 3");
		try {
			books_arraylist.add(new Book(500, BookTypes.HARDBACK, "Bible", 20.00));
		} catch (BookException e) {
			e.printStackTrace();
		}
		
		//iterator
		Iterator<String> string_arrlist_iter = strings_arraylist.iterator();
		while (string_arrlist_iter.hasNext()) {
			System.out.printf("%s%n", string_arrlist_iter.next());
		}
		
		ListIterator<String> string_arrlist_listiter = strings_arraylist.listIterator(strings_arraylist.size());
		while (string_arrlist_listiter.hasPrevious()) {
			System.out.printf("%s%n", string_arrlist_listiter.previous());
		}
		
		//linkedlist methods
		System.out.printf("%nLinkedlist methods:%n===============%n");
		
		//add 
		strings_linkedlist.add("Data Structures");
		try {
			books_arraylist.add(new Book(20, BookTypes.HARDBACK, "The Communist Manifesto", 100.00));
		} catch (BookException e) {
			e.printStackTrace();
		}

		//iterator
		Iterator<Book> book_linkedlist_iter = books_linkedlist.iterator();
		while (book_linkedlist_iter.hasNext()) {
			System.out.printf("%s%n", book_linkedlist_iter.next());
		}
		
		//contains and remove
		Book special_book = books_linkedlist.get(0);
		System.out.printf("Is %s in books_linkedlist? %s%n", special_book.toString(), books_linkedlist.contains(special_book));
		System.out.printf("Removing %s...%n", special_book.toString());
		books_linkedlist.remove(special_book);
		System.out.printf("Is %s in books_linkedlist? %s%n", special_book.toString(), books_linkedlist.contains(special_book));
		
		ListIterator<Book> book_linkedlist_listiter = books_linkedlist.listIterator(books_linkedlist.size());
		while (book_linkedlist_listiter.hasPrevious()) {
			System.out.printf("%s%n", book_linkedlist_listiter.previous());
		}
		
		
	}
}