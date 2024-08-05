package com.aurionpro.srp.solution.test;

import com.aurionpro.srp.solution.model.Invoice;
import com.aurionpro.srp.solution.model.InvoicePrinter;
import com.aurionpro.srp.solution.model.TaxCalculator;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("123", "Food", 300, 12);
		TaxCalculator taxCalculator = new TaxCalculator(invoice);
		InvoicePrinter invoicePrinter = new InvoicePrinter(invoice, taxCalculator);
		invoicePrinter.invoicePrinter();
}
}
