package com.aurionpro.model;

public class TicTacToeFacade {
	private Board board;
	private Player currentPlayer;

	public TicTacToeFacade() {
		this.board = new Board();
		this.currentPlayer = new Player('X');
		board.introduction();
	}

	public void startGame() {
		board.gameLogic(currentPlayer);
	}


}
	