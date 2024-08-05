package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,21,34,47,50);
		
		Stream<Integer> numberStream = numbers.stream();
		System.out.println("Printing all numbers");
		numberStream.forEach((number)-> System.out.println(number));
		
		System.out.println("Printing only odd numbers");
		List<Integer> oddNumbersAbove30 = numbers.stream()
			   .filter((number)->(number%2!=0))
			   .filter((number)-> (number>30))
			   .collect(Collectors.toList());
		
		oddNumbersAbove30.stream()
						 .forEach((number)->System.out.println(number));
		
		List<Integer> squareNumbers = numbers.stream()
											.map((number)->number*number)
											.collect(Collectors.toList());
		
		squareNumbers.forEach((number)->System.out.println(number));;
		
		int sum = numbers.stream().reduce(0,(number1,number2)->number1+number2);
		System.out.println("Sum is: " +sum);
		
		
		List<Integer> sortedNumbers =numbers.stream()
											.sorted()
											.limit(3)
											.collect(Collectors.toList());
		sortedNumbers.stream()
					 .forEach((number)->System.out.println(number));
		
//		sortedNumbers.stream().sorted(Comparator.reverseOrder());
		
//		//Other method is to use Collections.reverseOrder();
//		List<Integer>sortedInReverse = numbers.stream()
//											  .sorted()
//											  .collect(Collectors.toList());

		
		Optional<Integer> max = numbers.stream().max((number1,number2)->number1-number2);
		if(max.isPresent())
			System.out.println("Max is: " + max.get());
		
		Optional<Integer> min = numbers.stream().min((number1,number2) -> number1-number2);
		if(min.isPresent())
			System.out.println("Min is: " + min.get());
			   
	}
}