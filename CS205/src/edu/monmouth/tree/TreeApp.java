package edu.monmouth.tree;

import java.util.*;
import java.io.*;

public class TreeApp {
   public static void main(String[] args) {
	   
		final int REDIRECT_ERROR = -1;
		final int ARGS_ERROR = -2;
		final int FNF_ERROR = -3;
		
	   
		FileReader reader = null;
       // verify there is 1 and only 1 command line argument
		try {
			reader = new FileReader(args[0]);
			if(args.length != 1) {
				throw new IndexOutOfBoundsException();
			}
			} catch (FileNotFoundException e) {
			System.err.println(e.getMessage() + "Cannot locate " + args[0]);
			e.printStackTrace();
			System.exit(FNF_ERROR);	
			} catch (IndexOutOfBoundsException e) {
			System.err.println(e.getMessage() + "\nSupplied " + args.length + " arguments, expected 1");
			e.printStackTrace();
			System.exit(ARGS_ERROR);	
			} 
		
		// load the properties file using command line argument
		Properties properties = new Properties();
		try {
			properties.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	   
       // list all properties to System.out
       properties.list(System.out);
       
       // obtain the value of log_file_name property
       String logfile = properties.getProperty("log_file_name");
            
       // redirect stdout & stderr to the value of log_file_name

       /*
       try {
			PrintStream newIO = new PrintStream(new FileOutputStream(logfile));	
			System.setOut(newIO);
			System.setErr(newIO);
			} catch (FileNotFoundException e) {
			System.err.println(e.getMessage() + " Cannot redirect STDERR or STDOUT ");
			e.printStackTrace();
			System.exit(REDIRECT_ERROR);	
			}		
			*/

       
		// obtain the value of node_values property
		String node_values = properties.getProperty("node_values");
	
		// create an instance of the Tree class
		Tree tree = new Tree();
		// verify min, max and find operate on an empty tree
	  	tree.min();
	  	tree.max();
	 	tree.find(10);
		
		// parse the key / value pairs of node_values and insert into tree
	 	String[] kvpairs = node_values.split(";");
	 	String[][] b = new String[kvpairs.length][2];
	 	for (int i = 0; i < kvpairs.length; i++) {
	 		String key_or_value[] = kvpairs[i].split(",");
	 		
	 	}
	
      	// print out the keys using inorder
	 	tree.traverse(2);
      
      
	 	// determine if the value 12 is in the tree

	 	// determine if the value 80 is in the tree
     
	 	// print out the minimum value in the tree 

	 	// print out the maximum value in the tree      
      
      
      } 
   }  