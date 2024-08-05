package com.aurionpro.model;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	
	public Employee() {
		employeeId = 1;
		name = "User";
		salary = 10000;
	}
	
	public Employee(int id, String n, double s) {
		employeeId = id;
		name = n;
		salary = s;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary >0)
			this.salary = salary;
		else
			System.out.println("Salary cannot be negative");
	}
	public void details() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + name);
		System.out.println("Salary: " + salary);
		
	}
	
}
