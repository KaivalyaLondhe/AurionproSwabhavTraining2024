package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class StudentTest {
	private StudentService studentService;
	private Student student;
	@BeforeEach
	void init() {
		 studentService = Mockito.mock(StudentService.class);
		 student = new Student(studentService);
	}
	@Test
	void testCalculatePercentage() {
		Mockito.when(studentService.getMarks()).thenReturn((double) 650);
		Mockito.when(studentService.getSubject()).thenReturn((double) 10);
		
		assertEquals(65.0, student.calculatePercentage());
	}

}
