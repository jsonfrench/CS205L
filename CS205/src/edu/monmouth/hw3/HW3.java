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
				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.printf("%s ", e);
					System.err.printf("Not enough values in the line.%n");
					e.printStackTrace();
				} catch (BookException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		      }
		      reader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("Failed to retrieve file.");
		      e.printStackTrace();
		      System.exit(HW3Constants.err_read_file);
		    }
		
		for (Book b : books_arraylist) {
			System.out.printf("%s%n", b.toString());
		}
		
		
		
	}
}
