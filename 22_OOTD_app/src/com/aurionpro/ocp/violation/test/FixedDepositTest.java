package com.aurionpro.ocp.violation.test;

import com.aurionpro.ocp.violation.model.FestivalType;
import com.aurionpro.ocp.violation.model.FixedDeposit;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit(123, "Kaivalya", 400, 10, FestivalType.DIWALI);
		double simpleInterest = fixedDeposit.InterestRateCalculator();
		System.out.println(simpleInterest);
		
	}
}