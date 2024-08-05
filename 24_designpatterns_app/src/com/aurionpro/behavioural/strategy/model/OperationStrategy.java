package com.aurionpro.behavioural.strategy.model;

public class OperationStrategy {
	IOperation operation;

	public OperationStrategy(IOperation operation) {
		super();
		this.operation = operation;
		
	}
	public int doOperation(int number1, int number2) {
		return operation.doOperation(number1, number1);
	}
	public void setOperation(IOperation operation) {
		this.operation = operation;
	}
	
	
}
