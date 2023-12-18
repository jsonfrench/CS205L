package edu.monmouth.lab2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

import edu.monmouth.coffeemaker.*;

public class Lab2 {

	public static void main(String[] args) {
		
		final int REDIRECT_ERROR = -1;
		final int ARGS_ERROR = -2;
		
		
		//validate command line args and redirect output to file specified in args[]
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
			System.exit(REDIRECT_ERROR);	
			} catch (IndexOutOfBoundsException e) {
			System.err.println(e.getMessage() + "Number of command line arguments not equal to one");
			e.printStackTrace();
			System.exit(ARGS_ERROR);					
			}
			
		
		//create new instances of coffee makers
		BasicCoffeeMaker bcm1 = new BasicCoffeeMaker("Cuisinart");
		BasicCoffeeMaker bcm2 = new BasicCoffeeMaker("Nespresso");
		BasicCoffeeMaker bcm3 = new BasicCoffeeMaker("Savante");
		BasicCoffeeMaker bcm4 = new BasicCoffeeMaker("Peteccino");
		PremiumCoffeeMaker pcm1 = new PremiumCoffeeMaker(true, 64);
		PremiumCoffeeMaker pcm2 = new PremiumCoffeeMaker(false, 32);
		PremiumCoffeeMaker pcm3 = new PremiumCoffeeMaker(true, 100);
		PremiumCoffeeMaker pcm4 = new PremiumCoffeeMaker(false, 12);
		
		///////////////////////
		//Basic Coffee Makers//
		///////////////////////		

		//create list of basic coffee makers
		List<BasicCoffeeMaker> basic_coffee_makers= new LinkedList<BasicCoffeeMaker>();
		
		//add basic coffee makers to the list
		basic_coffee_makers.add(bcm1);
		basic_coffee_makers.add(bcm2);
		basic_coffee_makers.add(bcm3);
		basic_coffee_makers.add(bcm4);
		
		//enhanced for loop
		for(CoffeeMaker coffee_maker : basic_coffee_makers) {
			System.out.printf("%s%n", coffee_maker);
		}
		
		//list iterator
		Iterator<BasicCoffeeMaker> basic_coffee_maker_iterator = basic_coffee_makers.iterator();
		while (basic_coffee_maker_iterator.hasNext()) {
			System.out.printf("%s%n", basic_coffee_maker_iterator.next());
		}
		
		//linked list size() and get()
		for (int i = 0; i < basic_coffee_makers.size(); i++) {
			System.out.printf("%s%n", basic_coffee_makers.get(i));
		}
		
		BasicCoffeeMaker notInList = new BasicCoffeeMaker("NotInList");
		BasicCoffeeMaker inList = new BasicCoffeeMaker("Cuisinart");
		
		System.out.printf("is %s in the list? %s%n", notInList, basic_coffee_makers.contains(notInList));
		System.out.printf("is %s in the list? %s%n", inList, basic_coffee_makers.contains(inList));
		
		//sort list using collections method
		Collections.sort(basic_coffee_makers);

		//print sorted list
		for(CoffeeMaker coffee_maker : basic_coffee_makers) {
			System.out.printf("%s%n", coffee_maker);
		}

		/////////////////////////
		//Premium Coffee Makers//
		/////////////////////////		
		
		//create list of premium coffee makers
		List<PremiumCoffeeMaker> premium_coffee_makers= new LinkedList<PremiumCoffeeMaker>();

		//add premium coffee makers to the list
		premium_coffee_makers.add(pcm1);
		premium_coffee_makers.add(pcm2);
		premium_coffee_makers.add(pcm3);
		premium_coffee_makers.add(pcm4);
		
		//enhanced for loop
		for(CoffeeMaker coffee_maker : premium_coffee_makers) {
			System.out.printf("%s%n", coffee_maker);
		}
		
		//list iterator
		Iterator<PremiumCoffeeMaker> premium_coffee_maker_iterator = premium_coffee_makers.iterator();
		while (premium_coffee_maker_iterator.hasNext()) {
			System.out.printf("%s%n", premium_coffee_maker_iterator.next());
		}
		
		//linked list size() and get()
		for (int i = 0; i < premium_coffee_makers.size(); i++) {
			System.out.printf("%s%n", premium_coffee_makers.get(i));
		}

		//sort list using collections method
		Collections.sort(premium_coffee_makers);

		//print sorted list
		for(CoffeeMaker coffee_maker : premium_coffee_makers) {
			System.out.printf("%s%n", coffee_maker);
		}


		
	}
}
