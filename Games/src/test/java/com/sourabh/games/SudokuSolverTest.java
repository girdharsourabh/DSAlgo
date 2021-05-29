package com.sourabh.games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SudokuSolverTest {

    int[][] board2 = {
            {3, 7, 0, 9, 0, 6, 4, 0, 0},
            {4, 2, 0, 1, 5, 8, 0, 0, 0},
            {5, 0, 0, 3, 0, 7, 0, 8, 0},
            {6, 0, 3, 8, 0, 0, 0, 9, 0},
            {0, 0, 0, 0, 9, 4, 8, 0, 0},
            {0, 8, 0, 0, 1, 0, 6, 0, 7},
            {0, 3, 2, 4, 6, 9, 1, 0, 0},
            {7, 4, 0, 0, 0, 0, 3, 6, 0},
            {0, 9, 6, 0, 0, 5, 0, 0, 0}
    };

    int[][] board1 = {
            {8, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 3, 6, 0, 0, 0, 0, 0},
            {0, 7, 0, 0, 9, 0, 2, 0, 0},
            {0, 5, 0, 0, 0, 7, 0, 0, 0},
            {0, 0, 0, 0, 4, 5, 7, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 3, 0},
            {0, 0, 1, 0, 0, 0, 0, 6, 8},
            {0, 0, 8, 5, 0, 0, 0, 1, 0},
            {0, 9, 0, 0, 0, 0, 4, 0, 0}
    };

    int[][] returnBoard1 = {
            {8, 1, 2, 7, 5, 3, 6, 4, 9},
            {9, 4, 3, 6, 8, 2, 1, 7, 5},
            {6, 7, 5, 4, 9, 1, 2, 8, 3},
            {1, 5, 4, 2, 3, 7, 8, 9, 6},
            {3, 6, 9, 8, 4, 5, 7, 2, 1},
            {2, 8, 7, 1, 6, 9, 5, 3, 4},
            {5, 2, 1, 9, 7, 4, 3, 6, 8},
            {4, 3, 8, 5, 2, 6, 9, 1, 7},
            {7, 9, 6, 3, 1, 8, 4, 5, 2},
    };

    SudokuSolver solver;

    @BeforeAll
    public void setup() {
        solver = new SudokuSolver();
    }

    @Test
    void solveSudoku1() {
        solver.solveSudoku(board1, 0, 0);

    }

    @Test
    void solveSudoku2() {
        solver.solveSudoku(board2, 0, 0);

    }
}