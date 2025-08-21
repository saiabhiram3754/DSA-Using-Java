public class Sodoku {

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // Row wise
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }
        }

        // Column wise
        for (int j = 0; j < 9; j++) {
            if (sudoku[j][col] == digit) {
                return false;
            }
        }

        // 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int r = sr; r < sr + 3; r++) {
            for (int c = sc; c < sc + 3; c++) {
                if (sudoku[r][c] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean SudokuSolver(int sudoku[][], int row, int col) {
        // base case
        if (row == 9) {                   //row == 9 && col == 0 also possiblecondition
            return true;
        }

        int newRow = row, newCol = col + 1;
        if (newCol == 9) {
            newRow = newRow + 1;
            newCol = 0;
        }

        // if current cell is already filled 
        if (sudoku[row][col] != 0) {
            return SudokuSolver(sudoku, newRow, newCol);
        }

        // try placing digits
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (SudokuSolver(sudoku, newRow, newCol)) {
                    return true;
                }
                // backtrack logic
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void PrintSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3},
        };

        if (SudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exists:");
            PrintSudoku(sudoku);
        } else {
            System.out.println("No solution found.");
        }
    }
}
