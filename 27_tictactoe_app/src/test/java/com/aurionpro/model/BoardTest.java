package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.aurionpro.model.Board;
import com.aurionpro.model.Player;
import org.junit.jupiter.api.BeforeEach;

public class BoardTest {

	private Board board;
	private Player playerX;
	private Player playerO;

	@BeforeEach
	public void setup() {
		board = new Board();
		playerX = new Player('X');
		playerO = new Player('O');
	}

	@Test
	public void testInitializeBoard() {
		char[][] boardArray = board.getBoard();
		for (int i = 0; i < boardArray.length; i++) {
			for (int j = 0; j < boardArray[i].length; j++) {
				assertEquals('-', boardArray[i][j]);
			}
		}
	}

	@Test
	public void testIsBoardFull() {
		char[][] boardArray = board.getBoard();
		for (int i = 0; i < boardArray.length; i++) {
			for (int j = 0; j < boardArray[i].length; j++) {
				boardArray[i][j] = 'X';
			}
		}
		assertTrue(board.isBoardFull());

		boardArray[0][0] = '-';
		assertFalse(board.isBoardFull());
	}

	@Test
	public void testCheckWinRows() {
		char[][] boardArray = board.getBoard();
		boardArray[0][0] = 'X';
		boardArray[0][1] = 'X';
		boardArray[0][2] = 'X';
		assertTrue(board.checkWin(playerX));

		boardArray[0][0] = 'O';
		boardArray[0][1] = 'O';
		boardArray[0][2] = 'O';
		assertTrue(board.checkWin(playerO));
	}

	@Test
	public void testCheckWinColumns() {
		char[][] boardArray = board.getBoard();
		boardArray[0][0] = 'X';
		boardArray[1][0] = 'X';
		boardArray[2][0] = 'X';
		assertTrue(board.checkWin(playerX));

		boardArray[0][0] = 'O';
		boardArray[1][0] = 'O';
		boardArray[2][0] = 'O';
		assertTrue(board.checkWin(playerO));
	}

	@Test
	public void testCheckWinDiagonals() {
		char[][] boardArray = board.getBoard();
		boardArray[0][0] = 'X';
		boardArray[1][1] = 'X';
		boardArray[2][2] = 'X';
		assertTrue(board.checkWin(playerX));

		boardArray[0][2] = 'O';
		boardArray[1][1] = 'O';
		boardArray[2][0] = 'O';
		assertTrue(board.checkWin(playerO));
	}
}
