package com.aurionpro.test;

import java.util.Scanner;

public class PIGDiceGame {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		playGame();

	}

	private static void playGame() {

		int turn = 0;

		int totalScore = 0;

		Scanner scanner = new Scanner(System.in);

		while (totalScore < 20) {

			turn++;

			System.out.println("Turn: " + turn);

			totalScore = processTurn(scanner, totalScore);

		}

		endGame(turn);

		scanner.close();

	}

	private static int processTurn(Scanner scanner, int totalScore) {

		int turnScore = 0;

		boolean turnOver = false;

		while (!turnOver) {

			char input = getUserInput(scanner);

			if (input == 'r') {
				
				turnScore(turnScore, turnOver);
				

			} if (input == 'h') {

				totalScore = whenHold(totalScore, turnScore);

				turnOver = true;

			}

		}

		return totalScore;

	}
	private static void turnScore(int turnScore, boolean turnOver) {
		
		turnScore = whenRoll(turnScore);
		
		if (turnScore == 0) {
			
			turnOver = true;
			
		}
	}


	private static char getUserInput(Scanner scanner) {

		System.out.print("Roll or Hold? (r/h) ");

		return scanner.next().charAt(0);

	}

	private static int dieRoll() {

		return (int) (6.0 * Math.random() + 1);

	}

	private static int whenRoll(int turnScore) {

		int die = dieRoll();

		System.out.println("Die: " + die);

		if (die == 1) {

			System.out.println("Turn Over. No Score.");

			return 0;

		}
		return turnScore + die;

		

	}

	private static int whenHold(int totalScore, int turnScore) {

		totalScore += turnScore;

		System.out.println("Score for turn: " + turnScore);

		System.out.println("Total Score: " + totalScore);

		return totalScore;

	}

	private static void endGame(int turn) {

		System.out.println("You finished in " + turn + " turns.");

		System.out.println("Game Over!");

	}
	
//	    public static void main(String[] args) {
//
//	        playGame();
//
//	    }
//
//	    private static void playGame() {
//
//	        int turn = 0;
//
//	        int totalScore = 0;
//
//	        Scanner scanner = new Scanner(System.in);
//
//	        
//
//	        while (totalScore < 20) {
//
//	            turn++;
//
//	            System.out.println("Turn: " + turn);
//
//	            totalScore = processTurn(scanner, totalScore);
//
//	        }
//
//	        
//
//	        endGame(turn);
//
//	        scanner.close();
//
//	    }
//
//	    private static int processTurn(Scanner scanner, int totalScore) {
//
//	        int turnScore = 0;
//
//	        boolean turnOver = false;
//
//	        while (!turnOver) {
//
//	            char input = getUserInput(scanner);
//
//	            turnOver = executeAction(input, scanner, turnScore);
//
//	            if (input == 'h') {
//
//	                totalScore = updateTotalScore(totalScore, turnScore);
//
//	            }
//
//	        }
//
//	        return totalScore;
//
//	    }
//
//	    private static boolean executeAction(char input, Scanner scanner, int turnScore) {
//
//	        if (input == 'r') {
//
//	            return handleRollAction(turnScore);
//
//	        } else if (input == 'h') {
//
//	            handleHoldAction(turnScore);
//
//	            return true;
//
//	        }
//
//	        return false;
//
//	    }
//
//	    private static char getUserInput(Scanner scanner) {
//
//	        System.out.print("Roll or Hold? (r/h) ");
//
//	        return scanner.next().charAt(0);
//
//	    }
//
//	    private static int dieRoll() {
//
//	        return (int) (6.0 * Math.random() + 1);
//
//	    }
//
//	    private static boolean handleRollAction(int turnScore) {
//
//	        int die = dieRoll();
//
//	        System.out.println("Die: " + die);
//
//	        if (die == 1) {
//
//	            System.out.println("Turn Over. No Score.");
//
//	            return true;
//
//	        } else {
//
//	            turnScore += die;
//
//	            return false;
//
//	        }
//
//	    }
//
//	    private static void handleHoldAction(int turnScore) {
//
//	        System.out.println("Score for turn: " + turnScore);
//
//	    }
//
//	    private static int updateTotalScore(int totalScore, int turnScore) {
//
//	        totalScore += turnScore;
//
//	        System.out.println("Total Score: " + totalScore);
//
//	        return totalScore;
//
//	    }
//
//	    private static void endGame(int turn) {
//
//	        System.out.println("You finished in " + turn + " turns.");
//
//	        System.out.println("Game Over!");
//
//	    }

}
