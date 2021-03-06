package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TicTacToeGameTest {

    private TicTacToeGame ticTacToeGame;

    @Before
    public void initializeTicTacToeGameOject(){
        ticTacToeGame = new TicTacToeGame();
    }

    @Test
    public void shouldCreateTicTactoeGameObject(){
        assertNotNull(ticTacToeGame);
    }

    @Test
    public void shouldReturnXForFirstTurnPlayed(){
        ticTacToeGame.playTurnAt(0,0);
        assertEquals(1, ticTacToeGame.getPlayerAtPosition(0,0));
    }
    @Test
    public void shouldReturnOWhenSecondTurnPlayed(){
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(0,1);
        assertEquals(2, ticTacToeGame.getPlayerAtPosition(0,1));
    }

    @Test
    public void shouldReturnXWhenThirdTurnPlayed(){
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(0,1);
        ticTacToeGame.playTurnAt(0,2);
        assertEquals(1, ticTacToeGame.getPlayerAtPosition(0,2));
    }

    @Test(expected = RuntimeException.class)
    public void shouldReturnRunTimeExceptionAlreadySpaceFilledWhenPlacingTokenAtUsedPosition(){
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(0,1);
        ticTacToeGame.playTurnAt(0,2);
        ticTacToeGame.playTurnAt(0,0);
    }
}