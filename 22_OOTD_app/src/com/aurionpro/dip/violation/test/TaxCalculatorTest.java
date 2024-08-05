package com.aurionpro.dip.violation.test;

import com.aurionpro.dip.violation.model.DBLogger;
import com.aurionpro.dip.violation.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalculator tax = new TaxCalculator(10, 20, new DBLogger());
		tax.calculateTax(100, 0);
	}
	
}
