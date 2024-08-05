package com.aurionpro.dip.violation.model;

import com.aurionpro.dip.solution.model.NetworkLogger;

public class TaxCalculator {
	private int amount;
	private int rate;
	public TaxCalculator(int amount, int rate, DBLogger dblogger) {
		super();
		this.amount = amount;
		this.rate = rate;
	}
	public TaxCalculator(int i, int j, com.aurionpro.dip.solution.model.DBLogger dbLogger,
			NetworkLogger networkLogger) {
		// TODO Auto-generated constructor stub
	}
	public int calculateTax(int amount, int rate) {
		int tax = 0;
		try {
			tax = amount/rate;
			System.out.println(tax);
		}catch(Exception e) {
			new DBLogger().log("Divide By zero");
			new NetworkLogger().log("Divided By zero");
		}
		return tax;
	}
	
	

}