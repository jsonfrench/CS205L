package edu.monmouth.hw4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import edu.monmouth.book.*;
import edu.monmouth.hw3.HW3Constants;

import java.util.*;

public class BookHW4 {
	public static void main(String args[]) {
		// validate 2 command line arguments are passed in
		// first argument is the name of the data file
		// second argument is the name of the file to which stdout & stderr are redirected
		String read_file = "";
		String redirect_file = "";
		try {
			read_file = args[0];
			redirect_file = args[1];			 
		} catch (IndexOutOfBoundsException e) {
			System.err.printf("Not enough command line arguments were supplied. %n");
			e.printStackTrace();			
		}		
		
		// redirect stdout & stderr to specified file
/*
		try {
			PrintStream newIO = new PrintStream(redirect_file);	
			System.setOut(newIO);
			System.setErr(newIO);
			} catch (FileNotFoundException e) {
			System.err.println(e.getMessage() + " Cannot redirect STDERR or STDOUT ");
			e.printStackTrace();
			System.exit(HW4Constants.REDIRECT_ERROR);	
			}
*/		
		// create a HashSet that contains Book objects (name it bookSet)
		Set<Book> bookSet = new HashSet<Book>();
		
		// open and read the data file, creating Book objects (if valid)
		// for each Book object created, add the Book object to the HashSet.
		try {
		      File infile = new File(read_file);
		      Scanner reader = new Scanner(infile);
		      while (reader.hasNextLine()) {
		        String data = reader.nextLine();
		        String[] a = data.split(",");
		        try {
		        	Book book = new Book(Integer.parseInt(a[2]), BookTypes.valueOf(a[1]), a[0], Double.parseDouble(a[3]));
					if (bookSet.add(book) == true) {
						System.out.println("successfully added book to HashSet");
					} else {
						System.out.println("Book was not added to HashSet");
					}
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
		      System.exit(HW4Constants.FILE_READ_ERROR);
		    }

		
		// after data file is read and valid Book objects added to Hashset iterate over HashSet 
		// printing each Book object 
		
		for (Book book : bookSet) {
			System.out.printf("%s%n", book);
		}

		
		/*
		
		
		// determine if the following 2 books are in the HashSet
		Book bookToFind = null;
		try {
			bookToFind = new Book(829, 23.95, "The Soloman Curse", BookTypes.HARDBACK);
			if(bookSet.contains(bookToFind)== true) {
				System.out.println(bookToFind + "\nExists in bookSet");
			} else {
				System.out.println(bookToFind + "\nDoes not exist in bookSet");
			}
			bookToFind = new Book(629, 87.00, "The BigBang Theory", BookTypes.HARDBACK);
			if(bookSet.contains(bookToFind)== true) {
				System.out.println(bookToFind + "\nExists in bookSet");
			} else {
				System.out.println(bookToFind + "\nDoes not exist in bookSet");
			}
		} catch (BookException e) {
			System.err.println("Cannot create a Book object from these values:\n" + bookToFind + e.getMessage());
		}
		
		
		
		*/
		
	}
}

