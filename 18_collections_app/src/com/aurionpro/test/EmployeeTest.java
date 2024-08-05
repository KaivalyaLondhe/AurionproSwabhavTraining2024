package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.model.Employee;
import com.aurionpro.model.EmployeeComparator;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(1, "Kaivalya", 32903);
		Employee employee2 = new Employee(5, "Sarvesh", 35000);
		Employee employee3 = new Employee(3, "Nishank", 31303);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		System.out.println("Unsorted list is");
		System.out.println(employees);
		System.out.println("\n");
		
		System.out.println("----------Sort by Employee Id--------");
		Collections.sort(employees, new EmployeeComparator.employeeIdComparator());
		for(Employee employee : employees)
			System.out.println(employee);
		
		System.out.println("------------Sort by Name------------");
		Collections.sort(employees, new EmployeeComparator.nameComparator());
		for(Employee employee : employees)
			System.out.println(employee);
		
		System.out.println("-------------Sort by Salary-------------");
		Collections.sort(employees, new EmployeeComparator.salaryComparator());
		for(Employee employee : employees)
			System.out.println(employee);
	}

}
