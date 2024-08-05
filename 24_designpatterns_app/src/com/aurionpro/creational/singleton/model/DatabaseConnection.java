
package com.aurionpro.creational.singleton.model;

public class DatabaseConnection {
	
	private static DatabaseConnection databaseConnection;
	
	private DatabaseConnection() {
		System.out.println("Database connection successful!");
	}
	
	public void connectionStatus() {
		System.out.println("Database connection failed");
	}
	public static DatabaseConnection getDatabaseConnection() {
		if(databaseConnection==null)
			databaseConnection = new DatabaseConnection();
		return databaseConnection;
	}

}