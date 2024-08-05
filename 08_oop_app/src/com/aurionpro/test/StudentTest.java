package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the details for first student");
		Student student1 = new Student();
		System.out.println("Enter your roll number");
		int rollnumber1 = scanner.nextInt();
		student1.setRollNumber(rollnumber1);
		System.out.println("Enter your name");
		String name1 = scanner.next();
		student1.setName(name1);
		System.out.println("Enter your age");
		int age1 = scanner.nextInt();
		student1.setAge(age1);
		System.out.println("Enter your percentage");
		double percentage1 = scanner.nextDouble();
		student1.setPercentage(percentage1);
		
		System.out.println("Enter the details for second student");
		Student student2 = new Student();
		System.out.println("Enter your roll number");
		int rollnumber2 = scanner.nextInt();
		student2.setRollNumber(rollnumber2);
		System.out.println("Enter your name");
		String name2 = scanner.next();
		student2.setName(name2);
		System.out.println("Enter your age");
		int age2 = scanner.nextInt();
		student2.setAge(age2);
		System.out.println("Enter your percentage");
		double percentage2 = scanner.nextDouble();
		student2.setPercentage(percentage2);
		
		System.out.println("For student 1 the details are:");
		System.out.println("Name: " +student1.getName());
		System.out.println("Age: " +student1.getAge());
		System.out.println("Roll No: " +student1.getRollNumber());
		System.out.println("Percentage: " +student1.getPercentage());
		
		System.out.println("For student 2 the details are:");
		System.out.println("Name: " +student2.getName());
		System.out.println("Age: " +student2.getAge());
		System.out.println("Roll No: " +student2.getRollNumber());
		System.out.println("Percentage: " +student2.getPercentage());
		
		
		
	}
}
