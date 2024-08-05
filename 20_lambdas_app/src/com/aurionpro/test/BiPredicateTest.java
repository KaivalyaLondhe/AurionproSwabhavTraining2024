package com.aurionpro.test;

import java.util.function.BiPredicate;

public class BiPredicateTest {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> greaterBiPredicate = (Integer number1, Integer number2) -> (number1>number2);
		
		System.out.println(greaterBiPredicate.test(10, 20));
	}
}
