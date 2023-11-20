package edu.monmouth.Lab2;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lab2 {
    public static void main(String[] args) {
	State newJersey = new State("New Jersey", 130,  "Eastern Goldfinch");
	State newYork = new State("New York", 127,  "Eastern Bluebird");
	State pennsylvania = new State("Pennsylvania", 0,  "Ruffled Grouse");
	State delaware = new State("Delaware", 28,  "Blue Hen");
	State maryland = new State("Maryland", 31,  "Oriole");
	State connecticut = new State("Connecticut", 96,  "Robin");
	State newJersey2 = new State("New Jersey", 130,  "Eastern Goldfinch");	
	State[] state_arr = {newJersey, newYork, pennsylvania, delaware, maryland, connecticut, newJersey2};
	
	Governor njGov = new Governor("Murphy", 65);
	Governor nyGov = new Governor("Hochul", 64);
	Governor paGov = new Governor("Shapiro", 49);
	Governor deGov = new Governor("Carney", 66);
	Governor mdGov = new Governor("Moore", 44);
	Governor ctGov = new Governor("Lamont", 69);
	Governor[] gov_arr = {njGov, nyGov, paGov, deGov, mdGov, ctGov};

	// redirect stdout & stderr to specified file
	String redirect_file = "Lab2.txt";
	final int REDIRECT_ERROR = -1;

	try {
		PrintStream newIO = new PrintStream(redirect_file);	
		System.setOut(newIO);
		System.setErr(newIO);
		} catch (FileNotFoundException e) {
		System.err.println(e.getMessage() + " Cannot redirect STDERR or STDOUT ");
		e.printStackTrace();
		System.exit(REDIRECT_ERROR);	
		}

	// verify State hashCode and equals methods are consistent
	if (newJersey.equals(newYork)) {
		System.out.printf(".equals returns true %n");
		System.out.printf("%s %s%n", newJersey.hashCode(), newYork.hashCode());
	} else {
		System.out.printf(".equals returns flase %n");
		System.out.printf("%s %s%n", newJersey.hashCode(), newYork.hashCode());		
	}
	
	// verify Governor hashCode and equals methods are consistent
	if (njGov.equals(nyGov)) {
		System.out.printf(".equals returns true %n");
		System.out.printf("%s %s%n", njGov.hashCode(), nyGov.hashCode());
	} else {
		System.out.printf(".equals returns flase %n");
		System.out.printf("%s %s%n", njGov.hashCode(), nyGov.hashCode());		
	}
	
	// create a HashSet that can only house State objects
	Set<State> states = new HashSet<State>();
	
	// attempt to insert all 7 State objects to the HashSet
	// print whether or not the object was added or not
	
	//i did this with an array because manually adding each state
	//and checking if they were added was going to drive me insane
	for (State state: state_arr) {	
		if(states.add(state)){
			System.out.printf("object was added successfully%n");
		} else {
			System.out.printf("object was not added%n");		
		}
	}
	
	// iterate through the HashSet for each State
	Iterator<State> states_iter = states.iterator();
	while (states_iter.hasNext()) {
		System.out.printf("%s%n", states_iter.next());
	}
	
	// create a HashMap associating State and Governor objects
	Map<State, Governor> my_map = new HashMap<State, Governor>();
	
	// for the 6 unique State objects insert State and Governor objects 
	int i = 0;
	states_iter = states.iterator();
	while (states_iter.hasNext()) {
		my_map.put(states_iter.next(), gov_arr[i++]);
		}
	
	// print the number of elements in the HashMap
    System.out.printf("Elements in HashMap: %s%n", my_map.size());

	// print all elements in the HashMap
	for (State state: my_map.keySet()) {
		System.out.printf("%s: %s%n", state.toString(), my_map.get(state).toString());
	}
    
	// print the governor for newYork State object
	System.out.printf("%s%n", my_map.get(newYork));
	
	// determine if the State object newJersey exists as a key in the HashSet containing states
	System.out.printf("Does New Jersey exist? %s%n", my_map.containsKey(newJersey));
	// if it exists, print the governor
	if (my_map.containsKey(newJersey)) {
		System.out.printf("%s%n", my_map.get(newJersey));
	}
	
	State rhodeIsland = new State("Rhode Island", 40, "Rhode Island Red");
	// determine if the State object rhodeIsland exists as a key in the HashSet containing states
	System.out.printf("Does New Rhode Island exist? %s%n", my_map.containsKey(rhodeIsland));
    }
}
