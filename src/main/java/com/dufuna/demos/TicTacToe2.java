package com.dufuna.demos;

import java.util.Scanner;

public class TicTacToe2
{

    static String PLAYER = "X";
    static String[][] board = new String[3][3];
    static boolean isDraw = false;
    static boolean isWin = false;

    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        while(!isWin && !isDraw)
        {
            int whichPlayer;
            if (PLAYER == "X")
                whichPlayer = 1;
            else{
                whichPlayer = 2;
            }
            System.out.println("player " + whichPlayer + " enter row number >> ");
            int row = key.nextInt();
            System.out.println("player " + whichPlayer + " enter col number >> ");
            int col = key.nextInt();
            play(row,col);


            System.out.println(" ___________");
            for(int i=0; i< board.length ; i++)
            {
                System.out.print("| ");
                for(int j = 0; j < board[i].length; j++)
                {
                    if (board[i][j] == null)
                        System.out.print(" _ ");
                    else
                        System.out.print(board[i][j] + " ");
                }
                System.out.print(" |");
                System.out.println();
            }
            System.out.println(" __________");
        }

    boolean status = false;

    public static void play(int row, int col)
    {
        if(board[row][col] == null)
        {
            board[row][col] = PLAYER;

            if (PLAYER == "X")
                PLAYER = "O";
            else
                PLAYER = "X";
            int count = 0;
            //horizontal check
            for (String[] rowTable : board) {
                if(rowTable[0] == rowTable[1] &&
                    rowTable[1] == rowTable[2] &&
                    rowTable[2] != null){
                    status = true;
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

            //vertical check
            for (int i=0; i<board.length; i++) {
                if (board[0][i] == board[1][i] &&
                        board[1][i] == board[2][i] &&
                        board[0][i] != null
                )
                {

            }

            for (int i=0; i<board.length; i++) {
                if (board[i][i] == board[i][i] &&
                        board[i][i] == board[i][i] &&
                        board[i][i] != null
                )
                {
                    status = true;
                    break;
                }
            }
            if (!isWin && count == 3){
                isDraw = true;
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
}
