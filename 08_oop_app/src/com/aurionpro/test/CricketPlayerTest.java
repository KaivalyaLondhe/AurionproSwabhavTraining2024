package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.CricketPlayer;

public class CricketPlayerTest {

	public static void main(String[] args) {
		CricketPlayer players[] = new CricketPlayer[3];

		for (int i = 0; i < players.length; i++) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome!");
			System.out.println("Please enter your PlayerID");
			int playerId = scanner.nextInt();
			System.out.println("Please enter your name");
			String name = scanner.next();
			System.out.println("Please enter number of matches");
			int numberOfMatches = scanner.nextInt();
			System.out.println("Please enter runs");
			int runs = scanner.nextInt();
			System.out.println("Please enter number of wickets");
			int numberOfWickets = scanner.nextInt();

			players[i] = new CricketPlayer(playerId, name, numberOfMatches, runs, numberOfWickets);

		}
		for (int i = 0; i < players.length; i++) {
			players[i].display();
			players[i].calculateAverage();
		}

	}

}