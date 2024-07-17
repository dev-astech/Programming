package back_tracking;

public class NQueens {

    static int count = 0; //for count total number of ways to arrange N queens on NxN board


    // for finding if there is any one solution exists or not
    public static boolean nQueens(char[][] board, int row) {

        if (row == board.length) {
            return true;
        }

        for (int column = 0; column < board.length; column++) {
            if (isSafeToPlace(board, row, column)) {
                board[row][column] = 'Q';
                if(nQueens(board, row + 1)){
                    return true;
                }else {
                    board[row][column] = 'X';
                }
            }
        }
        return false;
    }


    //for finding all possible solutions
    public static void nQueensAllPossible(char[][] board, int row) {

        if (row == board.length) {
            printBoard(board);
            count++;
            return;
        }

        for (int column = 0; column < board.length; column++) {
            if (isSafeToPlace(board, row, column)) {
                board[row][column] = 'Q';
                nQueensAllPossible(board, row + 1);
                board[row][column] = 'X';
            }
        }
    }

    //for checking if a position is safe for placing queen or not
    public static boolean isSafeToPlace(char[][] board, int i, int j) {
        for (int row = i - 1; row >= 0; row--) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        for (int row = i - 1, column = j - 1; row >= 0 && column >= 0; row--, column--) {
            if (board[row][column] == 'Q') {
                return false;
            }
        }

        for (int row = i - 1, column = j + 1; row >= 0 && column < board.length; row--, column++) {
            if (board[row][column] == 'Q') {
                return false;
            }
        }
        return true;
    }

    //for printing the board
    public static void printBoard(char[][] board) {
        System.out.println("-----------Chess Board-----------");
        for (char[] row : board) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    //for initialising board with X
    public static void initialiseEmptyBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                board[row][column] = 'X';
            }
        }
    }

    public static void main(String[] args) {
        int n = 9;
        char[][] board = new char[n][n];

        initialiseEmptyBoard(board);

        System.out.println("--------All Possible Solutions--------\n");
        nQueensAllPossible(board, 0);

        System.out.println("\n\n--------Count of total possible solutions--------");
        System.out.println("Total no. of ways are: "+count);

        initialiseEmptyBoard(board);

        System.out.println("\n\n--------Print one solution if there is exist any solution--------");
        if(nQueens(board, 0)){
            System.out.println("Solution is Possible");
            printBoard(board);
        }else {
            System.out.println("Solution is Not Possible");
        }
    }
}
