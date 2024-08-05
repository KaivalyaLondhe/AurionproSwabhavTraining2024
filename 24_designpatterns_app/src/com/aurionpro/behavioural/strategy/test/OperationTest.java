package com.aurionpro.behavioural.strategy.test;

import com.aurionpro.behavioural.strategy.model.AddOperation;
import com.aurionpro.behavioural.strategy.model.MulitplyOperation;
import com.aurionpro.behavioural.strategy.model.OperationStrategy;

public class OperationTest {
	public static void main(String[] args) {
		
		OperationStrategy strategy = new OperationStrategy(new AddOperation());
		int output = strategy.doOperation(10 , 10);
		strategy.setOperation(new MulitplyOperation());
		int output2 = strategy.doOperation(10, 10);
		System.out.println(output);
		System.out.println(output2);
	}
}
