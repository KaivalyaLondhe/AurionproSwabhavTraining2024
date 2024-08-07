package com.aurionpro.ocp.violation.model;

public class SimpleInterestCalculator {
	
	private int accountNumber;
	private String name;
	private double principle;
	private int duration;
	private static FestivalType festival;
	private static int choice;
	FixedDeposit fixedDeposit = new FixedDeposit(accountNumber, name, principle, duration, festival);
	static InterestRateCalculator interestRate = new InterestRateCalculator(choice);
	
	
	public static double calculateSimpleInterest(FixedDeposit fixedDeposit) {
		return (fixedDeposit.getPrinciple()*fixedDeposit.getDuration()*interestRate.getInterestRates(festival))/100;
	}
}
