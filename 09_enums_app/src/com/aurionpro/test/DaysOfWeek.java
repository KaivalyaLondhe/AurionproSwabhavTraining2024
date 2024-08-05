package com.aurionpro.test;

public enum DaysOfWeek {
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY;
	
	public static void main(String[] args) {
		DaysOfWeek day = DaysOfWeek.MONDAY;
		
		switch (day) {
		case MONDAY:
			System.out.println("It is monday today");
			break;

		default:System.out.println("Not a valid day");
			break;
		}
	}
}
