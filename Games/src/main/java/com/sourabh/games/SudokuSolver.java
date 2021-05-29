package com.sourabh.games;

import java.time.LocalDateTime;
import java.util.Arrays;

public class SudokuSolver {

    private static final int BOARD_SIZE = 9;
    private static final int SUBSECTION_SIZE = 3;
    private static final int BOARD_START_INDEX = 0;

    private static final int NO_VALUE = 0;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 9;



    /*public static void main(String[] args) {
        SudokuSolver solver = new SudokuSolver();
        System.out.println(LocalDateTime.now());
        solver.solveSudoku(solver.board, 0, 0);
        System.out.println(LocalDateTime.now());
    }*/

    public void printBoard(int[][] board) {
        for (int row = BOARD_START_INDEX; row < BOARD_SIZE; row++) {
            for (int column = BOARD_START_INDEX; column < BOARD_SIZE; column++) {
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
    }

    public void solveSudoku(int [][] board, int i, int j){
        if (i == BOARD_SIZE){
            printBoard(board);
            return;
        }
        int ni = 0;
        int nj = 0;

        if (j == board[0].length - 1 ){
            ni = i +1;
            nj = 0;
        } else {
            ni = i;
            nj = j +1;
        }

        if (board[i][j] != NO_VALUE){
            solveSudoku(board, ni, nj);
        } else {
            for (int po = MIN_VALUE; po <= MAX_VALUE; po++){
                if (isValid(board, i , j, po)){
                    board[i][j] = po;
                    solveSudoku(board, ni, nj);
                    board[i][j] = 0;
                }
            }
        }
    }

    private boolean isValid(int[][] board, int x, int y, int po) {
        for (int j = 0; j < BOARD_SIZE ; j ++){
            if (board[x][j] == po){
                return false;
            }
        }

        for (int i = 0; i < BOARD_SIZE ; i ++){
            if (board[i][y] == po){
                return false;
            }
        }
        int smi = x/3 * 3;
        int smj = y/3 * 3;
        for (int i = 0; i <3; i++){
            for (int j =0; j <3; j++){
                if (board[smi+i][smj +j] == po){
                    return false;
                }
            }
        }
        return true;
    }

}
