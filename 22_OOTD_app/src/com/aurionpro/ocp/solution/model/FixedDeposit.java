package com.aurionpro.ocp.solution.model;

import com.aurionpro.ocp.violation.model.SimpleInterestCalculator;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principle;
	private int duration;
	private IFestivalInterest interest;
	public FixedDeposit(int accountNumber, String name, double principle, int duration, IFestivalInterest interest) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.interest = interest;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public IFestivalInterest getInterest() {
		return interest;
	}
	public void setInterest(IFestivalInterest interest) {
		this.interest = interest;
	}
	public double calculateSimpleInterestRate() {
		return CalculateFixedDeposit.calculateSimpleInterest(principle, duration, interest);
	}
}
