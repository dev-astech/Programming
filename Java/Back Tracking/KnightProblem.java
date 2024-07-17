package back_tracking;

import java.util.Scanner;

public class KnightProblem {

    final static int []verticalMoves = {2, 1, -1, -2, -2, -1, 1, 2};
    final static int []horizontalMoves = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void waysToCoverBoard(int N) {

        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++){
            for(int j =0; j < N; j++){
                board[i][j] = -1;
            }
        }

        board[0][0] = 0;

        if(!isOnRightWay(board, 0, 0, 1)){
            System.out.print("Solution Does not Exist");
            return;
        }

        print(board);
    }

    public static boolean isOnRightWay(int[][] board, int i, int j, int count) {
        if(count == board.length*board[0].length){
            return true;
        }

        int nextI, nextJ;

        for(int k = 0; k<horizontalMoves.length; k++){
            nextI = i+verticalMoves[k];
            nextJ = j+horizontalMoves[k];
            if(isSafeToMove(board, nextI, nextJ)){
                board[nextI][nextJ] = count;
                if(isOnRightWay(board, nextI, nextJ, count+1)){
                    return true;
                }
                else {
                    board[nextI][nextJ] = -1;
                }
            }
        }
        return false;
    }


    public static boolean isSafeToMove(int[][] board, int i, int j) {
        return (i>=0) && (i<board.length) && (j>=0) && (j<board[0].length) && (board[i][j]==-1);

    }

    //print matrix
    public static void print(int[][] maze) {
        for(int []row : maze){
            for(int col: row){
                System.out.print(col+"\t\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of Board: ");
        int N = sc.nextInt();
        waysToCoverBoard(N);
    }
}
