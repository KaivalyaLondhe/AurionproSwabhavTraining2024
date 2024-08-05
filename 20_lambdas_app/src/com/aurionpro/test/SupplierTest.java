package com.aurionpro.test;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier <Integer> randomNumberSupplier = () -> (int) (Math.random()*10);
		int randomNumber = 	randomNumberSupplier.get();
		System.out.println(randomNumber);
	}

}
