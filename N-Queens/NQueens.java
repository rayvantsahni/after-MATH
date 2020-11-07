import java.util.Scanner;

public class Main
{
	
    public static void placeQueen(boolean[][] board) {
        // simply overloading the 'placeQueen' function so that when we initially call the function
        // in the main method, we don't have to pass the value of row = 0
        placeQueen(board, 0);
    }

	
    public static void placeQueen(boolean[][] board, int row) {

        // if we have reached the last row, then we just display the board and return
        if (row == board.length) {
            displayBoard(board);
            return;
        }


        // for each row, we check for each column whether that position would be a safe option for the queen
        // to be placed or not; if it is, we call the same function recursively for the next row
        // and place the next queen accordingly; if some row, we are not able to place the queen
        // then we backtrack and mark the immediate upper position as false (which denotes
        // that it was not the correct position to put a queen in, for that row); then we hop on to the
        // next column and again check if that position is suitable for the queen...

        for (int col = 0; col < board.length; col++) {
            if (queenIsSafe(board, row, col)) {
                board[row][col] = true;
                placeQueen(board, row + 1);
                board[row][col] = false;
            }

        }

    }


    private static boolean queenIsSafe(boolean[][] board, int row, int col) {
        // checks if a queen exists vertically upwards
        for (int i = row - 1; i >= 0; i--)
            if (board[i][col])
                return false;

        // checks if a queen exists diagonally upwards to the left
        int i = row - 1;
        int j = col - 1;
        while ((i >= 0) && (j >= 0)) {
            if (board[i--][j--])
                return false;
        }

        // checks if a queen exists diagonally upwards to the right
         i = row - 1;
         j = col + 1;
         while ((i >= 0) && (j < board.length)) {
             if (board[i--][j++])
                 return false;
         }

        // if there is no queen vertically upwards, diagonally left or diagonally right, then the queen is safe
        return true;
    }


    private static void displayBoard(boolean[][] board) {
        // simple looping over each row and column and printing out 'Q' if the position holds true
        // (which denotes presence of a queen) and printing out '_' if the position holds false
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j])
                    System.out.print("Q ");
                else {
                    System.out.print("_ ");
                }
            }
            // prints out a new line after each row
            System.out.println();
        }
        // prints out a new line after every solution for a particular 'n'
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N");
        int n = scanner.nextInt();

	boolean[][] board = new boolean[n][n];

	placeQueen(board);
    }
}
