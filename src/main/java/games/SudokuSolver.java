package games;

public class SudokuSolver {

    public final int gridSize = 9;


    /**
     * Utility method used to print the grid that makes up the Sudoku board.
     * @param board The board to be printed, completed or not.
     */
    public void printBoard(int[][] board) {
        for (int row = 0; row < gridSize; row++) {
            if ( row % 3 == 0 && row != 0) System.out.println("---------------");
            for (int col = 0; col < gridSize; col++) {
                if (col % 3 == 0 && col != 0) System.out.print(" | ");
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }


    /**
     * Simple helper method for the Sudoku solver to check if a number already exists in a row.
     * @param board The board that's being worked on.
     * @param number The number to check for in the row.
     * @param row Row on the board to be checked.
     * @return True if the number is already in the row, false if it is not in the row.
     */
    public boolean isNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < gridSize; i++) {
            if (board[row][i] == number) return true;
        }
        return false;
    }

    /**
     * Simple helper method for the Sudoku solver to check if a number already exists in a column.
     * @param board The board that's being worked on.
     * @param number The number to check for in the column.
     * @param col The column on the board to be checked.
     * @return True if the number is already in the column, false if it is not.
     */
    public boolean isNumberInCol(int[][] board, int number, int col) {
        for (int i = 0; i < gridSize; i++) {
            if (board[i][col] == number) return true;
        }
        return false;
    }

    /**
     * Simple helper method for the Sudoku solver to check if a number already exists in the 3x3 quadrant.
     * @param board The board that's being solved.
     * @param number The number to be checked for in the quadrant.
     * @param row The row in the quadrant to be checked.
     * @param col The column in the quadrant to be checked.
     * @return True if the number is already in the quadrant, false if it is not.
     */
    public boolean isNumberInBox(int[][] board, int number, int row, int col) {
        int localBoxRow = row - row % 3;
        int localBoxCol = col - col % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxCol; j < localBoxCol + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * A simple utility method that gets called everytime a number is tried in the board that checks if the attempted number
     * is already present in the row, column, and 3x3 quadrant.
     * It works by calling the other helper methods for each check.
     * @param board The board that's being solved.
     * @param number The number that's being checked in the row, column, and quadrant.
     * @param row The row to be checked.
     * @param col The column to be checked.
     * @return True if the number is in a valid space, false if it is not.
     */
    public boolean isValidPlacement(int[][] board, int number, int row, int col) {
        return !isNumberInRow(board, number, row) &&
                !isNumberInCol(board, number, col) &&
                !isNumberInBox(board, number, row, col);
    }

    /**
     * The main solver method that is used to solve a valid Sudoku board of any difficulty.
     * Must be a valid, solvable board in the form of a 2D array.
     * @param board The valid Sudoku board that needs to be solved.
     * @return True if the board was solved correctly, false if it was not.
     */
    public boolean solveBoard(int[][] board) {
        for (int row = 0; row < gridSize; row++) { // Iterates down a row one space at a time.
            for (int col = 0; col < gridSize; col++) { // Iterates down a colum one space at time.
                if (board[row][col] == 0) {
                    for (int numberToTry = 1; numberToTry <= gridSize; numberToTry++) {
                        if (isValidPlacement(board, numberToTry, row, col)) {
                            board[row][col] = numberToTry;

                            if (solveBoard(board)) {
                                return true;
                            } else {
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }




}
