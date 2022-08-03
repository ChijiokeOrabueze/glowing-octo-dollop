package com.dufuna.demos;

public class TicTacToe1
{
    private static String[][] board = new String[3][3];
    public static  String PLAYER = "X";
    public static boolean IS_WON = false;


    public void play(int row, int col)
    {
        if(board[row][col] == null)
        {
            board[row][col] = PLAYER;

            if (PLAYER == "X")
                PLAYER = "O";
            else
                PLAYER = "X";

        }
//        if (board[0][0] != null && board[0][0] == board[0][1] && board[0][0] == board[0][2])
//        {
//            IS_WON = true;
//        }
//        if (board[1][0] != null && board[1][0] == board[1][1] && board[1][0] == board[1][2])
//        {
//            IS_WON = true;
//        }
//        if (board[2][0] != null && board[2][0] == board[2][1] && board[2][0] == board[2][2])
//        {
//            IS_WON = true;
//        }

        for (int i=0; i< board.length; i++)
        {
            if (board[i][0] != null && board[i][0] == board[i][1] && board[i][0] == board[i][2])
            {
                IS_WON = true;
            }
        }
    }

}
