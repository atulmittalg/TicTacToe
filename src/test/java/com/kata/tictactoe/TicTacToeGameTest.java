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
}
