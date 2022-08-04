package com.dufuna.demos;

public class TicTacToeShow
{
    String player = "X";
    String[][] board = new String[3][3];
    boolean isWin = false;
    boolean isDraw = false;
    int count = 0;

    public void play(int row, int col)
    {

        if(board[row][col] != null)
        {
            board[row][col] = player;

            if(player == "X")
                player = "O";
            else
                player = "X";

        }

        //horizontal
        for(String[] boardRow : board )
        {
            if(boardRow[0] == boardRow[1]
            && boardRow[1] == boardRow[2]
            && boardRow[1] != null)
            {
                isWin = true;
            }
            if(boardRow[0] != null
            && boardRow[1] != null
            && boardRow[1] != null)
                count ++;
        }

        //vertical
        for(int i=0; i< 3;i++)
        {
            if(board[0][i] == board[1][i]
            && board[1][i] == board[2][i]
            && board[1][i] != null)
            {
                isWin = true;
            }
        }

        //diagonal
        if(board[0][0] == board[1][1]
        && board[1][1] == board[2][2]
        && board[1][1] != null ||

        board[0][2] == board[1][1]
                && board[1][1] == board[2][0]
                && board[1][1] != null
        )
        {
            isWin = true;
        }

        //checks if draw
        if(!isWin && count == 3)
            isDraw = true;
    }
}
