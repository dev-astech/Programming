package Array.TwoDArray;

import java.util.Scanner;

public class DiagonalSum {


    //function for finding left & right diagonal sum
    public static int diagonalSum(int[][] array) {
        int rows = array.length - 1;
        int columns = array[0].length - 1;
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        int diagonalSum = 0;

//            for (int i = 0; i <= rows; i++) {
//                for (int j = 0; j <= columns; j++) {
//                    if (i == j) {
//                        leftDiagonalSum += array[i][j];
//                    }
//                    else if (i == columns - j) {
//                        rightDiagonalSum += array[i][j];
//                    }
//                }
//            }

        for (int i = 0; i <= rows; i++) {
            diagonalSum += array[i][i];
            if (i != columns - i) {
                diagonalSum += array[i][columns - i];
            }
        }
        System.out.println("Left Diagonal Sum: " + leftDiagonalSum);
        System.out.print("Right Diagonal Sum: " + rightDiagonalSum);
        return diagonalSum;
    }


    // function for printing a 2d array
    public static void print2dArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // function for taking inputs in 2d array
    public static void inputIn2dArray(int[][] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Enter element at [" + i + ", " + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
    }

    //main function
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        inputIn2dArray(array);
        print2dArray(array);
        System.out.println("The Diagonal sum is: " + diagonalSum(array));
    }
}
