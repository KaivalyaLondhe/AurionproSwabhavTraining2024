package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Student;
import com.aurionpro.model.StudentComparator;

public class StudentTest {
	
	static Scanner scanner = new Scanner(System.in);
	

	private static void studentInput(List<Student> students) {
		while(students.size()<=2) {
			System.out.println("Please enter details for student");
			System.out.println("Please enter roll number");
			int rollNumber = scanner.nextInt();
			System.out.println("Please enter name");
			String name = scanner.next();
			System.out.println("Please enter percentage");
			double percentage = scanner.nextDouble();
			
			students.add(new Student(rollNumber, name, percentage));
					
			
		}
	}
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		studentInput(students);
		System.out.println("Unsorted list of students");
		for(Student student:students)
			System.out.println(student);
		System.out.println("Sorted List of Students by Roll Number");
		Collections.sort(students, new StudentComparator.StudentSortByRollNumberComparator());
		for(Student student: students)
			System.out.println(student);
		
		System.out.println("Sorted List of Students by Name");
		Collections.sort(students, new StudentComparator.StudentSortByNameComparator());
		for(Student student: students){
			System.out.println(student);
		}
		System.out.println("Sorted list of students by percentage");
		Collections.sort(students, new StudentComparator.StudentSortByPercentageComparator());
		for(Student student: students){
			System.out.println(student);
		}
		
	}

}
