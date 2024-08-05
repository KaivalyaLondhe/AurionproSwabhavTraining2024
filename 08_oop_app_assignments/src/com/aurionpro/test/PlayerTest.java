package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Player;

public class PlayerTest {

	static Scanner scanner = new Scanner(System.in);

	private static void playerCreation(int numberOfPlayers, Player[] players) {

		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.print("Please enter your player ID: ");
			int playerId = scanner.nextInt();
			System.out.print("Please enter your name: ");
			String name = scanner.next();
			System.out.print("Please enter total number of matches you have played: ");
			int matches = scanner.nextInt();
			System.out.print("Please enter total number of runs you have scored: ");
			int runs = scanner.nextInt();
			System.out.print("Please enter total number of wickets you have taken: ");
			int wickets = scanner.nextInt();
			players[i] = new Player(playerId, name, matches, runs, wickets);
			System.out.println("Player added successfully");
		}

	}

	private static void getMaximumAveragePlayer(Player[] players) {
		double maximumAverage = 0;
		int temp = 0;
		for (Player player : players) {
			if (player.calculateAverage() < maximumAverage) {
				maximumAverage = player.calculateAverage();
				temp++;
			}
		}
		System.out.println("They player with the maximum average is: " + players[temp].getName() + "\n");

	}

	private static void display(Player[] players) {
		for (int i = 0; i < players.length; i++) {
			for (int j = 0; j < players.length - i - 1; j++) {
				if (players[j].calculateAverage() > players[j + 1].calculateAverage()) {
					Player temp = players[j];
					players[j] = players[j + 1];
					players[j + 1] = temp;
				}
			}
		}
		for (Player player : players) {
			System.out.println("Name: " + player.getName() + "\t Average: " + player.calculateAverage());
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter the number of players you wish to add: ");

		int numberOfPlayers = scanner.nextInt();
		Player players[] = new Player[numberOfPlayers];
		playerCreation(numberOfPlayers, players);
		getMaximumAveragePlayer(players);
		display(players);

	}
}
