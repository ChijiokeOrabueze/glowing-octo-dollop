package com.dufuna.demos;

import java.util.Scanner;

public class TicTacToe2
{

    static String PLAYER = "X";
    static String[][] board = new String[3][3];
    static boolean isDraw = false;
    static boolean isWin = false;

<<<<<<< HEAD
    boolean status = false;
    boolean isDraw = false;
=======
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
>>>>>>> d42b35d723f9b1da2fc3a42758e0911e5b8984ee

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

    }

    public static void play(int row, int col)
    {
        if(board[row][col] == null)
        {
            board[row][col] = PLAYER;

            if (PLAYER == "X")
                PLAYER = "O";
            else
                PLAYER = "X";
            int drawStreak = 0;
            //horizontal check
            int count = 0;
            for (String[] rowTable : board)
            {
                if(rowTable[0] == rowTable[1] &&
                    rowTable[1] == rowTable[2] &&
<<<<<<< HEAD
                    rowTable[2] != null){
                    status = true;
                    break;
                }else if (rowTable[0] != null && rowTable[1] != null && rowTable[2] != null) {
                    drawStreak+=1;
=======
                    rowTable[2] != null)
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
>>>>>>> d42b35d723f9b1da2fc3a42758e0911e5b8984ee
                }
            }

            //vertical check
            for (int i=0; i<board.length; i++) {
                if (board[0][i] == board[1][i] &&
                        board[1][i] == board[2][i] &&
                        board[0][i] != null
                )
                {
<<<<<<< HEAD
                    status = true;
                    break;
                }
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
            if (!status && drawStreak == 3){
                isDraw = true;
            }
=======
                    isWin = true;
                }
            }

            //checking for diagonal win

            if ((board[0][0] == board[1][1] &&
                    board[1][1] == board[2][2] &&
                    board[2][2] != null) ||
                    (board[0][2]) == board[1][1]
                    && board[1][1] == board[2][0]
                    && board[2][0] != null
            )
            {
                isWin = true;
            }

            if (!isWin && count == 3){
                isDraw = true;
            }

>>>>>>> d42b35d723f9b1da2fc3a42758e0911e5b8984ee
        }
    }
}
