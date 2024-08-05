package com.aurionpro.model;

public class Student {
	private StudentService studentService;
	
	public Student(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	public double calculatePercentage() {
		return (studentService.getMarks()*studentService.getSubject())/100;
	}
}
