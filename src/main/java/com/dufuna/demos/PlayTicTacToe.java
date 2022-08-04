package com.dufuna.demos;

import java.util.Scanner;

public class PlayTicTacToe
{
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        TicTacToe2 game = new TicTacToe2();
        int whichPlayer = 1;
        //runs until win or draw is attained
        while (!game.isWin && !game.isDraw)
        {

            if (game.PLAYER == "X")
                whichPlayer = 1;
            else {
                whichPlayer = 2;
            }
            System.out.println("player " + whichPlayer + " enter row number >> ");
            int row = key.nextInt();
            System.out.println("player " + whichPlayer + " enter col number >> ");
            int col = key.nextInt();
            game.play(row, col);

            System.out.println(" ___________");
            for (int i = 0; i < game.rowLength(); i++) {
                System.out.print("| ");
                for (int j = 0; j < game.colLength(); j++) {
                    if (game.cellValue(i, j) == null)
                    {
                        System.out.print(" _ ");
                    }else
                         System.out.print(game.cellValue(i, j) + " ");
                }
                System.out.print(" |");
                System.out.println();
            }
            System.out.println(" __________");
        }

        if(game.isWin)
        {
            System.out.println("Player " + whichPlayer +" is the Winner !!! ");
        }

        if(game.isDraw)
        {
            System.out.println("The game is a draw !!!");
        }
    }
}
