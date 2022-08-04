package com.dufuna.demos;

import java.util.Objects;

public class TicTacToe2
{
    String PLAYER ;
    String[][] board ;
    boolean isDraw = false;
    boolean isWin = false;
    int count;

    public TicTacToe2()
    {
        PLAYER = "X";
        board = new String[3][3];
        count = 0;
    }

    public void play(int row, int col)
    {
        if(board[row][col] == null)
        {
            board[row][col] = PLAYER;

            //switching of players
            switchPlayers();

            //checks for horizontal win
            checkHorizontalWin();

            //checks vertical
            checksVerticalWin();

            //checking for diagonal win
            checkDiagonalWin();

            //checks for draw
            checksForDraw();

        }
    }

    /**
     * This method checks if there's a draw
     */
    private void checksForDraw() {
        if (!isWin && count == 3)
        {
            isDraw = true;
        }
    }

    /**
     * This checks if there's a
     * horizontal win
     */
    private void checkHorizontalWin() {
        //horizontal check
        for (String[] rowTable : board)
        {
            if(rowTable[0] == rowTable[1]
                    && rowTable[1] == rowTable[2]
                    && rowTable[2] != null)
            {
                isWin = true;
                break;
            }
            else if
            (rowTable[0] != null
            && rowTable[1] != null
            && rowTable[2] != null)
            {
                count ++;
            }
        }
    }

    /**
     * This method checks if there's
     * a diagonal win
     */
    private void checkDiagonalWin()
    {
        if ((board[0][0] == board[1][1] &&
                board[1][1] == board[2][2] &&
                board[2][2] != null) ||
                board[0][2] == board[1][1]
                && board[1][1] == board[2][0]
                && board[2][0] != null
        )
        {
            isWin = true;
        }
    }

    /**
     * This method checks if there's
     * a vertical win
     */
    private void checksVerticalWin()
    {
        //vertical check
        for (int i=0; i<board.length; i++)
        {
            if (board[0][i] == board[1][i]
                    && board[1][i] == board[2][i]
                    && board[0][i] != null
            )
            {
                isWin = true;
            }
        }
    }

    /**
     * This method switches players after every
     * call of the play method
     */
    private void switchPlayers()
    {
        if (PLAYER.equals("X"))
        {
            PLAYER = "O";
            return;
        }
        PLAYER = "X";
    }

    /**
     * gets the value of a cell in a board
     * @param row to consider
     * @param col to consider
     * @return the value
     */
    public Object cellValue(int row, int col)
    {
        return board[row][col];
    }

    /**
     *
     * @return length of row
     */
    public int rowLength()
    {
        return board.length;
    }

    /**
     *
     * @return length of board column
     */
    public  int colLength()
    {
        return board[1].length;
    }
}
