package com.aurionpro.model;

import java.util.Scanner;

public class Board {
	private static final Scanner scanner = new Scanner(System.in);
	private char[][] board;

	public Board() {
		this.board = initializeBoard();
	}

	public char[][] getBoard() {
		return board;
	}

	private char[][] initializeBoard() {
		char[][] newBoard = new char[3][3];
		for (int i = 0; i < newBoard.length; i++) {
			for (int j = 0; j < newBoard[i].length; j++) {
				newBoard[i][j] = '-';
			}
		}
		return newBoard;
	}

	public void printBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public boolean isBoardFull() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}

	public void introduction() {
		System.out.println("Welcome to the Tic Tac Toe game!!!");
		System.out.println("Player 1 plays with 'X'");
		System.out.println("Player 2 plays with 'O'");
		System.out.println("Let's begin!");
		printBoard();
	}

	public void gameLogic(Player player) {
		while (true) {
			int row = getUserInput("row");
			int column = getUserInput("column");

			if (!isValidMove(row, column)) {
				System.out.println("Invalid move. Try again.");
				continue;
			}

			player.play(row, column, board);
			printBoard();

			if (checkWin(player)) {
				if (player.getSymbol() == 'X') {
					System.out.println("Player 1 wins!");
				} else {
					System.out.println("Player 2 wins!");
				}
				return;
			}

			if (isBoardFull()) {
				System.out.println("It's a draw!");
				return;
			}

			player.switchPlayer();
		}
	}

	public boolean checkWin(Player player) {
		return checkRowsAndColumns(player) || checkDiagonals(player);
	}

	private boolean checkRowsAndColumns(Player player) {
		char symbol = player.getSymbol();
		for (int i = 0; i < board.length; i++) {
			if (isWinningRow(i, symbol) || isWinningColumn(i, symbol)) {
				return true;
			}
		}
		return false;
	}

	private boolean isWinningRow(int row, char symbol) {
		return (board[row][0] == symbol && board[row][1] == symbol && board[row][2] == symbol);
	}

	private boolean isWinningColumn(int column, char symbol) {
		return (board[0][column] == symbol && board[1][column] == symbol && board[2][column] == symbol);
	}

	private boolean checkDiagonals(Player player) {
		char symbol = player.getSymbol();
		return (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
				|| (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
	}

	private int getUserInput(String type) {
		System.out.print("Enter " + type + " number (1-3): ");
		return scanner.nextInt() - 1;
	}

	private boolean isValidMove(int row, int column) {
		return row >= 0 && row < 3 && column >= 0 && column < 3 && board[row][column] == '-';
	}
}
