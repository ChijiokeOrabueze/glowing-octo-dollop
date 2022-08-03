package com.dufuna.demos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTest1
{

    @Test
    void does_X_go_first()
    {
        TicTacToe1 game = new TicTacToe1();
        String actual = game.PLAYER;
        String expected = "X";
        assertEquals(expected, actual);
    }

    @Test
    void do_player_alternate()
    {
        TicTacToe1 game = new TicTacToe1();
        game.play(0,0);
        String actual = game.PLAYER;
        String expected = "O";
        assertEquals(expected, actual);
    }

    @Test
    void do_player_alternate_after_two_play()
    {
        TicTacToe1 game = new TicTacToe1();
        game.play(0,0);
        game.play(0,1);
        String actual = game.PLAYER;
        String expected = "X";
        assertEquals(expected, actual);
    }

    @Test
    void can_player_play_on_a_played_position()
    {
        TicTacToe1 game = new TicTacToe1();
        game.play(0,0);
        String firstPlayer = game.PLAYER;
        game.play(0,0);
        String secondPlayer = game.PLAYER;

        assertEquals(firstPlayer, secondPlayer);
    }

    @Test
    void checks_for_horizontal_win()
    {
        TicTacToe1 game = new TicTacToe1();
        boolean init_iswon = game.IS_WON;
        game.play(0,0);
        game.play(1,0);
        game.play(0,1);
        game.play(2,1);
        game.play(0,2);
        game.play(1,2);

        boolean isWon = game.IS_WON;
        assertEquals(true, isWon);
    }


}
