package com.aurionpro.srp.solution.model;

public class InvoicePrinter {
	private Invoice invoice;
	private TaxCalculator taxCalculator;
	public InvoicePrinter(Invoice invoice, TaxCalculator taxCalculator) {
		super();
		this.invoice = invoice;
		this.taxCalculator = taxCalculator;
	}
	
	public void invoicePrinter() {
		System.out.println(invoice.getId());
		System.out.println(invoice.getAmount());
		System.out.println(invoice.getDescription());
		System.out.println(invoice.getTax());
		System.out.println(invoice.getAmount()+taxCalculator.taxCalculator(invoice));
	}
}
