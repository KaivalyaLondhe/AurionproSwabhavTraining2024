package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the HRMS portal");
		System.out.println("Enter total number of employees");
		int totalEmployees = scanner.nextInt();
		
		Employee employees[] = new Employee[totalEmployees];
		
		// TODO Auto-generated method stub
		for(int i=0;i<employees.length;i++) {
			System.out.print("Please enter your EmployeeID: \t");
			int employeeId = scanner.nextInt();
			System.out.print("Please enter you name: \t");
			String name = scanner.next();
			System.out.println("Please enter your salary: \t");
			int salary = scanner.nextInt();
			employees[i] = new Employee(employeeId, name, salary);
		}
		for(int i=0;i<employees.length;i++) {
			employees[i].details();
		}
//		employee1.details();
//		System.out.print("Please enter your EmployeeID: \t");
//		int employeeId = scanner.nextInt();
//		System.out.print("Please enter you name: \t");
//		String name = scanner.next();
//		System.out.println("Please enter your salary: \t");
//		int salary = scanner.nextInt();
//		Employee employee2 = new Employee(employeeId, name, salary);
//		employee2.details();
//		
//		System.out.println("Select the employee you want to fetch the details for: 1 or 2");
//		int detailsSelection = scanner.nextInt();
//		switch (detailsSelection) {
//		case 1:
//			employee1.details();
//			break;
//		case 2:
//			employee2.details();
//			break;
//		default:
//			System.out.println("Please enter valid number");
//		}
		
		}
	
}
