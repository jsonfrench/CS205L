package edu.monmouth.Lab1;
import java.io.*;

public class Lab1 {

	public static void main(String[] args) {

		// 1
		try {
			PrintStream newIO = new PrintStream(Lab1Constants.LOGFILENAME);
			System.setOut(newIO);
			System.setErr(newIO);
			} catch (FileNotFoundException e) {
			System.err.println(e.getMessage() + " Cannot redirect STDERR or STDOUT ");
			e.printStackTrace();
			System.exit(Lab1Constants.REDIRECTFAILURE);
			}
		
		// 2
		Student students[] = new Student[]{
				new Student(100,18,"John"),
				new Student(101,19,"Jane"),
				new Student(102,20,"Larry"),
				new Student(103,20,"Karen"),
				new Student(104,21,"Karl")
				};

		// 3
		System.out.printf("Number of elements in students: %s %n",  students.length);
		
		// 4
		System.out.printf("Students array:%n");
		for (Student student : students) {
			System.out.printf("%s%n", student.toString());
		}
		
		// 5 
		students[2].setAge(21);
		
		// 6
		System.out.printf("Students less than 20:%n");
		for (Student student : students) {
			if(student.getAge() < 20) {
				System.out.printf("%s%n", student.toString());				
			}
		}
		
		// 7 
		Student newStudents[] = new Student[Lab1Constants.NEW_STUDENT_SIZE];
		
		// 8
		System.arraycopy(students, Lab1Constants.SOURCE_POSITION, newStudents, Lab1Constants.DESTINATION_POSITION, newStudents.length);
		
		// 9 
		System.out.printf("newStudents array:%n");
		for (Student student : newStudents) {
			System.out.printf("%s%n", student.toString());
		}		
	
	}
}
