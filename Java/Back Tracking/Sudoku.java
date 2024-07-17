package back_tracking;

public class Sudoku {


    public static boolean solveSudoku(int[][] board, int row, int column) {
        if (row == board.length) {
            return true;
        }

        int nextColumn = column+1, nextRow = row;

        if(column == board[0].length-1){
            nextRow = row+1;
            nextColumn = 0;
        }

        if(board[row][column]!=0){
            return solveSudoku(board, nextRow, nextColumn);
        }

        for (int digit = 1; digit < 10; digit++) {
            if(isSafeToPlace(board, row, column, digit)) {
                board[row][column] = digit;
                if(solveSudoku(board, nextRow, nextColumn)){
                    return true;
                }
                board[row][column] = 0;
            }
        }
        return false;
    }


    public static boolean isSafeToPlace(int[][] board, int i, int j, int num) {

        for(int row = 0; row < board.length; row++) {
            if (board[row][j] == num) {
                return false;
            }
        }

        for (int column = 0; column < board[0].length; column++) {
            if (board[i][column] == num) {
                return false;
            }
        }

        for (int row = i-(i%3); row < i-(i%3)+3; row++) {
            for(int column = j-(j%3); column < j-(j%3)+3; j++){
                if (board[row][column] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudokuBoard(int[][] board) {
        for(int[] row :  board){
            System.out.println(" -------------------------------------");
            System.out.print(" | ");
            for(int number: row){
                System.out.print(number+" | ");
            }
            System.out.println();
        }
        System.out.println(" -------------------------------------");
    }

    public static void main(String[] args) {
        int[][] sudokuBoard = {
                {0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };


        if(solveSudoku(sudokuBoard, 0, 0)){
            System.out.println("Solution Exists");
            printSudokuBoard(sudokuBoard);
        }else {
            System.out.println("Solution Doesn't Exists");
        }
    }
}
