package com.aurionpro.model;

public class Player {
    private char symbol;

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void switchPlayer() {
        if (this.symbol == 'X') {
            this.symbol = 'O';
            return;
        }
        this.symbol = 'X';
    }

    public boolean play(int row, int column, char[][] board) {
        if (board[row][column] == '-') {
            board[row][column] = symbol;
            return true;
        }
        System.out.println("That move cannot be performed");
        return false;
    }
}