package edu.monmouth.lab1;

import java.util.*;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import edu.monmouth.employee.*;

public class Lab1Lecture {
    public static void main(String[] args) {
	// direct standard out & err to Lab1Lecture.txt

    	try {
			PrintStream newIO = new PrintStream("Lab1Lecture1.txt");	//<-- i know i should use a constant, but it didn't say to make a constants file
			System.setOut(newIO);
			System.setErr(newIO);
			} catch (FileNotFoundException e) {
			System.err.println(e.getMessage() + " Cannot redirect STDERR or STDOUT ");
			e.printStackTrace();
			System.exit(-1);	//<-- yucky hard coded int
			}

		
	// declare a List that stores Employee objects in a LinkedList
		
		LinkedList<Employee> employee_list = new LinkedList<Employee>();
			    	
    	// construct a SalaryEmployee with a yearly salary of $30,000
    	SalaryEmployee salaryEmployee1 = new SalaryEmployee(30000);
    	
    	// construct a SalaryEmployee with a yearly salary of $35,000
    	SalaryEmployee salaryEmployee2 = new SalaryEmployee(35000);
    	
    	// construct a PieceEmployee that gets paid $60 per piece made
    	PieceEmployee pieceEmployee1 = new PieceEmployee(60);
    	// set the number of pieces made this month to 2,000
    	pieceEmployee1.setPiecesMade(2000);
    	
    	// construct a PieceEmployee that gets paid $40 per piece made
    	PieceEmployee pieceEmployee2 = new PieceEmployee(40);
    	// set the number of pieces made this month to 3,500
    	pieceEmployee2.setPiecesMade(3500);
    	
    	// construct a SalaryEmployee with a yearly salary of $100,000
    	SalaryEmployee salaryEmployee3 = new SalaryEmployee(100000);
    	
    	// construct a SalesEmployee with a yearly base of $60,000
    	SalesEmployee salesEmployee = new SalesEmployee(60000);
    	// set this month's commission to $30,000
    	salesEmployee.setCommission(30000);
    	
    	// add these Employees to the list
    	employee_list.add(salaryEmployee1);
    	employee_list.add(salaryEmployee2);
    	employee_list.add(pieceEmployee1);
    	employee_list.add(pieceEmployee2);
    	employee_list.add(salaryEmployee3);
    	employee_list.add(salesEmployee);
    	
    			
	System.out.println("Iterating forward through list");
	// using an Iterator, iterate forward thru the list, printing each Employee's attributes
	Iterator<Employee> it = employee_list.iterator();
	while(it.hasNext()) {
		System.out.printf("%s%n", it.next().toString());
	}
	
	System.out.println("Iterating forward here is each monthlyPay");
	// using an Iterator, iterate thru the list, printing each Employee's monthly pay
	while(it.hasNext()) {
		System.out.printf("%s%n", it.next().getMonthlyPay());
	}
	
	
	// remove salaryEmployee1 from the list
	employee_list.remove();
		
	System.out.println("Iterating forward after removal");
	// using an Iterator, iterate thru the list, printing each Employee's attributes
	while(it.hasNext()) {
		System.out.printf("%s%n", it.next().toString());
	}
			
	// declare an array of references to Employee objects
	Employee[] emp_arr;
	
	// sized to the number of Employee objects in the List

	emp_arr = new Employee[5];
	// using a List method, transfer the List to the array
	
	emp_arr = employee_list.toArray(new Employee[employee_list.size()]);

	System.out.println("Contents of array");	
	// iterate thru the array, printing out each Employee's attributes
	for (Employee e: emp_arr) {
		System.out.printf("%s%n", e.toString());
	}
	
    }

}
