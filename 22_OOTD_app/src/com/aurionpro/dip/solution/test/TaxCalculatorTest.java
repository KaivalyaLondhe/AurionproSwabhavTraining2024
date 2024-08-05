package com.aurionpro.dip.solution.test;

import com.aurionpro.dip.solution.model.DBLogger;
import com.aurionpro.dip.solution.model.NetworkLogger;
import com.aurionpro.dip.violation.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalculator tax = new TaxCalculator(10, 20,new DBLogger(), new NetworkLogger());
		tax.calculateTax(100, 0);
	}
	
}
