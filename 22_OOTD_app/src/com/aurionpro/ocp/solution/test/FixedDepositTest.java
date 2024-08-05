package com.aurionpro.ocp.solution.test;

import com.aurionpro.ocp.solution.model.DiwaliInterestRate;
import com.aurionpro.ocp.solution.model.FixedDeposit;

public class FixedDepositTest {
public static void main(String[] args) {
	FixedDeposit fixedDeposit = new FixedDeposit(123, "Kaivalya", 1000, 2, new DiwaliInterestRate());
	
	System.out.println(fixedDeposit.calculateSimpleInterestRate());
}
}
