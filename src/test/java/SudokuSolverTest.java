import games.SudokuSolver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SudokuSolverTest {

    SudokuSolver test;
    SudokuBoards boards;
    SolvedBoards solvedBoards;



    @BeforeEach // Class Instances
    public void setup() {
        test = new SudokuSolver();
        boards = new SudokuBoards();
        solvedBoards = new SolvedBoards();
    }



    @Test
    public void allBoardsPrintTest() {  // Not always correct atm
        solveBoard1Test();
        solveBoard2Test();
        solveBoard3Test();
        solveBoard4Test();
        solveBoard5Test();
        solveBoard6Test();
        solveBoard7Test();
        solveBoard8Test();
    }

    @Test
    public void allBoardsAssertTest() { // Correct Automated Tests
        assertTrue(test.solveBoard(boards.board1)); // Easy
        assertTrue(test.solveBoard(boards.board2)); // Easy
        assertTrue(test.solveBoard(boards.board3)); // Medium
        assertTrue(test.solveBoard(boards.board4)); // Medium
        assertTrue(test.solveBoard(boards.board5));
        assertTrue(test.solveBoard(boards.board6));
        assertTrue(test.solveBoard(boards.board7));
        assertTrue(test.solveBoard(boards.board8));
    }

    @Test
    public void solveBoard1Test() {

        test.printBoard(boards.board1);
        if (test.solveBoard(boards.board1)) {
            System.out.println();
            System.out.println("Solved board 1 successfully!");
            System.out.println();
        } else {
            System.out.println("Invalid board");
        }test.printBoard(boards.board1);
    }

    @Test
    public void solveBoard2Test() {
        if (test.solveBoard(boards.board2)) {
            System.out.println();
            System.out.println("Solved board 2 successfully!");
            System.out.println();
        } else {
            System.out.println("Invalid board");
        }
    }

    @Test
    public void solveBoard3Test() {
        if (test.solveBoard(boards.board3)) {
            System.out.println();
            System.out.println("Solved board 3 successfully!");
            System.out.println();
        } else {
            System.out.println("Invalid board");
        }
    }

    @Test
    public void solveBoard4Test() {
        if (test.solveBoard(boards.board4)) {
            System.out.println();
            System.out.println("Solved board 4 successfully!");
            System.out.println();
        } else {
            System.out.println("Invalid board");
        }
    }

    @Test
    public void solveBoard5Test() {
        if (test.solveBoard(boards.board5)) {
            System.out.println();
            System.out.println("Solved board 5 successfully!");
            System.out.println();
        } else {
            System.out.println("Invalid board");
        }
    }

    @Test
    public void solveBoard6Test() {
        if (test.solveBoard(boards.board6)) {
            System.out.println();
            System.out.println("Solved board 6 successfully!");
            System.out.println();
        } else {
            System.out.println("Invalid board");
        }
    }

    @Test
    public void solveBoard7Test() {
        if (test.solveBoard(boards.board7)) {
            System.out.println();
            System.out.println("Solved board 7 successfully!");
            System.out.println();
        } else {
            System.out.println("Invalid board");
        }
    }

    @Test
    public void solveBoard8Test() {
        if (test.solveBoard(boards.board8)) {
            System.out.println();
            System.out.println("Solved board 8 successfully!");
            System.out.println();
        } else {
            System.out.println("Invalid board");
        }
    }
}
