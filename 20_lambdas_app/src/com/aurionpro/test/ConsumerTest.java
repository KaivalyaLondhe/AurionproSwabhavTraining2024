package com.aurionpro.test;
import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<Integer> squareNumberConsumer = (Integer number)-> {
			System.out.println("Square of the number is: " + number*number);
		};
		squareNumberConsumer.accept(20);
		
		Consumer<Integer> oddOrEven = (Integer number)->{
			if(!(number%2==0)){
					System.out.println("Number is Odd");
					return;
			}
			System.out.println("Number is even");
		};
		oddOrEven.accept(21);
	}
}
