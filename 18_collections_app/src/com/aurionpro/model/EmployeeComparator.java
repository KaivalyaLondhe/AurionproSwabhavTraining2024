package com.aurionpro.model;

import java.util.Comparator;

public class EmployeeComparator {
	public static class employeeIdComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee employee1, Employee employee2) {
			// TODO Auto-generated method stub
			return employee1.getEmployeeId()-employee2.getEmployeeId();
		}
		
	}
	public static class nameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee employee1, Employee employee2) {
			// TODO Auto-generated method stub
			return employee1.getName().compareTo(employee2.getName());
		}
		
	}
	public static class salaryComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee employee1, Employee employee2) {
			// TODO Auto-generated method stub
			return (int) (employee1.getSalary()-employee2.getSalary());
		}
		
	}
}
