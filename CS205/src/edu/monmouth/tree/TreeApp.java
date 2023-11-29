package edu.monmouth.tree;


public class TreeApp {
   public static void main(String[] args) {
       // verify there is 1 and only 1 command line argument
       
       // load the properties file using command line argument
       properties = args[0];
	   
       // list all properties to System.out
       properties.list(System.out);
       
       // obtain the value of log_file_name property
            
       // redirect stdout & stderr to the value of log_file_name
       
	// obtain the value of node_values property
	
	// create an instance of the Tree class
	Tree tree = new Tree();
	// verify min, max and find operate on an empty tree
  	tree.min();
  	tree.max();
 	tree.find(10);
	
	// parse the key / value pairs of node_values and insert into tree
	
      	// print out the keys using inorder
	tree.traverse(2);
      
      
      // determine if the value 12 is in the tree

      // determine if the value 80 is in the tree
     
	// print out the minimum value in the tree 

	// print out the maximum value in the tree      
      
      
      } 
   }  