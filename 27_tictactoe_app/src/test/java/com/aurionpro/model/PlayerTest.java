package com.aurionpro.model;

import com.aurionpro.model.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testPlayerInitialization() {
        Player player = new Player('X');
        assertEquals('X', player.getSymbol());
    }

    @Test
    public void testPlayerSwitch() {
        Player player = new Player('X');
        player.switchPlayer();
        assertEquals('O', player.getSymbol());

        player.switchPlayer();
        assertEquals('X', player.getSymbol());
    }

    @Test
    public void testPlayValidMove() {
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
        Player player = new Player('X');
        boolean result = player.play(0, 0, board);
        assertTrue(result);
        assertEquals('X', board[0][0]);
    }

    @Test
    public void testPlayInvalidMove() {
        char[][] board = new char[3][3];
        board[0][0] = 'X';
        Player player = new Player('O');
        boolean result = player.play(0, 0, board);
        assertFalse(result);
    }
}