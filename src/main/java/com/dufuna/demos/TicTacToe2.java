package com.dufuna.demos;

public class TicTacToe2
{

    String PLAYER = "X";
    String[][] board = new String[3][3];

    boolean status = false;
    boolean isDraw = false;

    public void play(int row, int col)
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
            for (String[] rowTable : board) {
                if(rowTable[0] == rowTable[1] &&
                    rowTable[1] == rowTable[2] &&
                    rowTable[2] != null){
                    status = true;
                    break;
                }else if (rowTable[0] != null && rowTable[1] != null && rowTable[2] != null) {
                    drawStreak+=1;
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
        }
    }
}
