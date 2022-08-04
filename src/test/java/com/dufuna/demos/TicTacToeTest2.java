package com.dufuna.demos;

import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


/**
 * • X always goes first
 * • Players alternate placing X's and O's on the board
 * • Players cannot play on a played position
 * • A player with three X's or O's in a row (horizontally, vertically, or diagonally) wins
 * • If all nine squares are filled and neither player achieves three in a row, the game is
 * a draw
 */
public class TicTacToeTest2
{

    @Test
    void does_X_always_go_first()
    {
        TicTacToe2 tictac = new TicTacToe2();
        String expected= "X";
        String actual = tictac.PLAYER;
        assertEquals(expected, actual);
    }

    @Test
    void do_players_alternate()
    {
        TicTacToe2 tictac = new TicTacToe2();
        String player1= tictac.PLAYER;
        tictac.play(1,2);
        String player2 = tictac.PLAYER;
        assertNotEquals(player1, player2);
    }

    @Test
    void can_players_play_on_a_played_position1()
    {
        TicTacToe2 tictac = new TicTacToe2();
        String player1= tictac.PLAYER;
        tictac.play(1,2);
        String player2 = tictac.PLAYER;
        tictac.play(1,2);
        assertNotEquals(player1, player2);
    }

    @Test
    void can_players_play_on_a_played_position2()
    {
        TicTacToe2 tictac = new TicTacToe2();
        tictac.play(1,2);
        tictac.play(1,2);
        tictac.play(1,0);
        String player4 = tictac.PLAYER;
        tictac.play(1,2);
        String player5 = tictac.PLAYER;
        assertEquals(player4, player5);
    }

    @Test
    void checks_for_horizontal_win()
    {
        TicTacToe2 tictac = new TicTacToe2();
        tictac.play(0,0);
        tictac.play(1,0);
        tictac.play(0,1);
        tictac.play(2,1);
        tictac.play(0,2);
        boolean status = tictac.isWin;

        assertEquals(true, status);
    }

    @Test
    void checks_for_verical_win()
    {
        TicTacToe2 tictac = new TicTacToe2();
        tictac.play(0,0);
        tictac.play(2,2);
        tictac.play(1,0);
        tictac.play(2,1);
        tictac.play(2,0);
        boolean status = tictac.isWin;

        assertEquals(true, status);
    }

    @Test
    void checks_for_diagonal_win()
    {
        TicTacToe2 tictac = new TicTacToe2();
        tictac.play(0,0);
        tictac.play(2,0);
        tictac.play(1,1);
        tictac.play(2,1);
        tictac.play(2,2);
        boolean status = tictac.isWin;

        assertEquals(true, status);
    }

    @Test
    void checks_for_draw_when_board_is_full()
    {
        TicTacToe2 tictac = new TicTacToe2();
        tictac.play(0,0);
        tictac.play(0,1);
        tictac.play(0,2);
        tictac.play(2,0);
        tictac.play(1,1);
        tictac.play(2,2);
        tictac.play(2,1);
        tictac.play(1,0);
        tictac.play(1,2);
        boolean draw = tictac.isDraw;

        assertEquals(true, draw);
    }

}
