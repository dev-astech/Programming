package Array.TwoDArray;

import java.util.Scanner;

public class LargestAndSmallestIn2dArray {

    //[smallest and largest both element can be find through single loop]

    //function for finding the largest element in 2d array
    public static void largestIn2dArray(int[][] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int[] row : array) {
            for (int element : row) {
                if (max < element) {
                    max = element;
                }
                /*if(min>element){
                    min = element;
                }*/
            }
        }
        System.out.println("Largest element in given 2d array is: " + max);
//        System.out.println("smallest element in given 2d array is: "+min);
    }

    //function for finding largest element in 2d array
    public static void smallestIn2dArray(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int[] row : array) {
            for (int element : row) {
                if (min > element) {
                    min = element;
                }
            }
        }
        System.out.println("smallest element in given 2d array is: " + min);
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
        largestIn2dArray(array);
        smallestIn2dArray(array);
    }
}
