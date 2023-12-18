package edu.monmouth.lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {

		//1. validate 1 command line argument
		//2. and redirect output to file specified in args[]
		try {
			PrintStream newIO = new PrintStream(new FileOutputStream(args[0]));
			if(args.length > 1) {
				throw new IndexOutOfBoundsException();
			}
			System.setOut(newIO);
			System.setErr(newIO);
			} catch (FileNotFoundException e) {
			System.err.println(e.getMessage() + "Cannot redirect STDERR or STDOUT");
			e.printStackTrace();
			System.exit(Lab3Constants.REDIRECT_ERROR);	
			} catch (IndexOutOfBoundsException e) {
			System.err.println(e.getMessage() + "Number of command line arguments not equal to one");
			e.printStackTrace();
			System.exit(Lab3Constants.ARGS_ERROR);					
			}
			
		
		//3. make array of 10 competitors
		Competitor[] competitors = new Competitor[Lab3Constants.SIZE];
		
		//4. read contents from golf.txt
		try {
		      File infile = new File(Lab3Constants.GOLF_FILE);
		      Scanner reader = new Scanner(infile);
        //5. Create competitors for each line in the file
		      int i=0;
		      while (reader.hasNextLine()) {
		        String data = reader.nextLine();
		        String[] fields = data.split(",");
		        try {									//check if name field is empty
			        if(fields[0].length() < 1) {
			        	throw new NumberFormatException();
			        }
					competitors[i] = (new Competitor(fields[0], Integer.parseInt(fields[1])));
				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.printf("%s ", e);
					System.err.printf("Not enough values in the line.%n");
					e.printStackTrace();
					continue;
				} catch (NumberFormatException e) {
					System.err.printf("Field contains invalid characters.%n");
					e.printStackTrace();
					continue;
				}
		        i++;
		      }
	      //6. close file
		      reader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("Failed to retrieve file.");
		      e.printStackTrace();
		      System.exit(Lab3Constants.FILE_READ_ERR);
		    }
		
		//7. sort using arrays class
		Arrays.sort(competitors);		
		for(Competitor c : competitors) {
			System.out.printf("%s%n", c);
		}
		
		//8. make a priorityqueue for golfers
		PriorityQueue<Competitor> golfers = new PriorityQueue<Competitor>();
		
		//9. iterate and add competitors
		for(Competitor c : competitors) {
			golfers.add(c);
		}
		
		//10. use poll() to print leader 
		System.out.printf("Golfing leader: %s%n", golfers.poll());
		
		//12. make priorityqueue of bowlers
		PriorityQueue<Competitor> bowlers = new PriorityQueue<Competitor>(
				Lab3Constants.SIZE, new BowlerComparator());
		
		//13. open bowling.txt
		try {
		      File infile = new File(Lab3Constants.BOWLING_FILE);
		      Scanner reader = new Scanner(infile);
		      int i=0;
		      //14. read all the lines and add all the competitors
		      while (reader.hasNextLine()) {
		        String data = reader.nextLine();
		        String[] fields = data.split(",");
		        try {									//check if name field is empty
			        if(fields[0].length() < 1) {
			        	throw new NumberFormatException();
			        }
					bowlers.add(new Competitor(fields[0], Integer.parseInt(fields[1])));
				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.printf("%s ", e);
					System.err.printf("Not enough values in the line.%n");
					e.printStackTrace();
					continue;
				} catch (NumberFormatException e) {
					System.err.printf("Data contains invalid characters.%n");
					e.printStackTrace();
					continue;
				}
		        i++;
		      }
	      //15. close file
		      reader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("Failed to retrieve file.");
		      e.printStackTrace();
		      System.exit(Lab3Constants.FILE_READ_ERR);
		    }
		
		//16. print the single GREATEST SCORE of the bowlers
		System.out.printf("Bowling leader: %s%n", bowlers.poll());
		
		//17. iterator iterator iterator iterator iterator 
		Iterator<Competitor> bowler_iter = bowlers.iterator();
		while (bowler_iter.hasNext()) {
			System.out.printf("%s%n", bowler_iter.next());
		}


		
		
	}
}
