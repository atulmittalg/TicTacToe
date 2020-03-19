package com.kata.tictactoe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TicTacToeGameTest {

    @Test
    public void shouldCreateTicTactoeGameObject(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        assertNotNull(ticTacToeGame);
    }

    @Test
    public void shouldReturnXForFirstTurnPlayed(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.playTurnAt(0,0);
        assertEquals(1, ticTacToeGame.getPlayerAtPosition(0,0));
    }
    @Test
    public void shouldReturnOWhenSecondTurnPlayed(){
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(0,1);
        assertEquals(2, ticTacToeGame.getPlayerAtPosition(0,1));
    }
}