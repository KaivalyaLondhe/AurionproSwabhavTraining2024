package com.aurionpro.srp.violation.model;

public class Invoice {
	private String id;
	private String description;
	private double amount;
	private double tax;
	double calculateTax;
	public Invoice(String id, String description, double amount, double tax) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double calculateTax(double tax, double amount) {
		
		return calculateTax = (amount*tax)/100;
	}
	public String printInvoice() {
		
		
			return "Invoice [id=" + id + ", description=" + description + ", amount=" + amount + ", tax=" + tax + ", Tax to be paid= " + calculateTax+"]";
		}
	
	
}