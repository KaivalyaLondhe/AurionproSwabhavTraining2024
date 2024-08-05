package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsList {
	public static void main(String[] args) {
		List<String> students = Arrays.asList("kaivalya", "saahil", "piyush", "ashish", "pratik", "sujit");
		List<String> firstThreeStudentsInAscending = students.stream().limit(3)
						 .sorted()
						 .collect(Collectors.toList());
		firstThreeStudentsInAscending.stream().forEach((student)->System.out.println(student));
		
		System.out.println("\nStudents in decending order\n");
		List<String> StudentsInDecendingOrder  = students.stream()
														.sorted(Collections.reverseOrder())
														.collect(Collectors.toList());
																		
		StudentsInDecendingOrder.stream()
							  .forEach((student)->System.out.println(student));
		CharSequence contains = new StringBuilder("a");
		System.out.println("Now only those which contain A");
		List<String> nameOfStudentsThatContainA = students.stream()
														.filter((student)->student.contains(contains))
														.limit(3)
														.sorted()
														.collect(Collectors.toList());
		nameOfStudentsThatContainA.stream()
									.forEach((student)->System.out.println(student));
		
		
//		List<String> firstThreeCharacters = students.stream()
//													.map((student)->students.subString(0,3))
//													.collect(Collectors.toList());
		
		List<String> NameContainsLessThanFourCharacters = students.stream()
													 .filter((student)->student.length()<=4)
													 .collect(Collectors.toList());
		
		NameContainsLessThanFourCharacters.stream()
							.forEach((student)->System.out.println(student));
	}
}
