package com.aurionpro.ocp.solution.model;

public class CalculateFixedDeposit {
	private int accountNumber;
	private String name;
	private double principle;
	private int duration;
	private IFestivalInterest interest;
	FixedDeposit fixedDeposit = new FixedDeposit(accountNumber, name, principle, duration, interest);
	public static double calculateSimpleInterest(double principle, int duration, IFestivalInterest interest) {
		return  (principle*duration*interest.getInterestRate())/100;
	}
}
