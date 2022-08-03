package com.dufuna.demos;

public class TicTacToe2
{

    String PLAYER = "X";
    String[][] board = new String[3][3];

    boolean status = false;

    public void play(int row, int col)
    {
        if(board[row][col] == null)
        {
            board[row][col] = PLAYER;

            if (PLAYER == "X")
                PLAYER = "O";
            else
                PLAYER = "X";

            for (String[] rowTable : board) {
                if(rowTable[0] == rowTable[1] &&
                    rowTable[1] == rowTable[2] &&
                    rowTable[2] != null){
                    status = true;
                }
            }
        }
    }
}
