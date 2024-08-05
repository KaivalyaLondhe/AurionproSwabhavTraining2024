package com.aurionpro.test;

import java.util.function.BiConsumer;

public class BiConsumerTest {
	public static void main(String[] args) {
		BiConsumer<Integer,Integer> greaterNumberBiConsumer = (Integer number1, Integer number2)->{
			if(number1>number2) {
				System.out.println( number1 + " is greater than " + number2);
				return;
			}
			System.out.println(number2 + " is greater than " + number1);
		};
		greaterNumberBiConsumer.accept(10,20);
	}
}
