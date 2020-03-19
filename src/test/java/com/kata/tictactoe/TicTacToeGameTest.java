package com.kata.tictactoe;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeGameTest {

    @Test
    public void shouldCreateTicTactoeGameObject(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        assertNotNull(ticTacToeGame);
    }

    @Test
    public void shouldReturnXForFirstTurnPlayed(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        assertEquals(1, ticTacToeGame.getPlayerAtPosition());
    }
}