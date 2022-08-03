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

            //horizontal check
            for (String[] rowTable : board) {
                if(rowTable[0] == rowTable[1] &&
                    rowTable[1] == rowTable[2] &&
                    rowTable[2] != null){
                    status = true;
                }
            }

            //vertical check
            for (int i=0; i<board.length; i++) {
                if (board[0][i] == board[1][i] &&
                        board[1][i] == board[2][i] &&
                        board[0][i] != null
                )
                {
                    status = true;
                }
            }

            for (int i=0; i<board.length; i++) {
                if (board[i][i] == board[i][i] &&
                        board[i][i] == board[i][i] &&
                        board[i][i] != null
                )
                {
                    status = true;
                }
            }
        }
    }
}
