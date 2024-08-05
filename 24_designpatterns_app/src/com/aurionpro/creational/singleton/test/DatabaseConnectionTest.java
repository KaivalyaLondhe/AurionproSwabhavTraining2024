package com.aurionpro.creational.singleton.test;

import com.aurionpro.creational.singleton.model.DatabaseConnection;

public class DatabaseConnectionTest {
	
	public static void main(String[] args) {
		DatabaseConnection databaseConnection1 = DatabaseConnection.getDatabaseConnection();
		databaseConnection1.connectionStatus();
		
		DatabaseConnection databaseConnection2 = DatabaseConnection.getDatabaseConnection();
		databaseConnection2.connectionStatus();
		
		
	}
}