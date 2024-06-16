package Array.TwoDArray;

import java.util.Scanner;

public class SpiralPatternIn2dArray {

    //Function for printing elements of an array in spiral order
    public static void printSpiral(int[][] array) {
        int startRow = 0;
        int endRow = array.length - 1;
        int startCol = 0;
        int endCol = array[0].length - 1;


        while (startRow <= endRow && startCol <= endCol) {

            // print top row
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(array[startRow][i] + " ");
            }

            //print right column
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(array[i][endCol] + " ");
            }

            //print bottom row
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(array[endRow][i] + " ");
            }

            //print left column
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(array[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

    }


    // function for printing a 2d array
    public static void print2dArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + "      ");
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

    // main function
    public static void main(String[] args) {
        int[][] array = new int[4][2];
        inputIn2dArray(array);
        print2dArray(array);
        System.out.println();
        printSpiral(array);
    }
}
