package Array.TwoDArray;

import java.util.Scanner;

public class SearchIn2dArray {

    public static void search(int[][] array, int key) {
        boolean flag = false;
//        for(int i=0;i< array.length;){
//            for(int j=array[0].length-1;j>=0;){
//                if(key<array[i][j]){
//                    j--;
//                }else if(key>array[i][j]){
//                    i++;
//                }else {
//                    System.out.print(key+" is present at index ["+i+", "+j+"]");
//                    flag = true;
//                    break;
//                }
//            }
//            if(flag){
//                break;
//            }
//        }

        int i = 0;
        int j = array[0].length - 1;

        while (i < array.length && j >= 0) {
            if (key < array[i][j]) {
                j--;
            } else if (key > array[i][j]) {
                i++;
            } else {
                System.out.print(key + " is present at index [" + i + ", " + j + "]");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.print("key not found");
        }

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [][]array = new int[3][3];
//        inputIn2dArray(array);
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print2dArray(array);
        System.out.print("Enter a key to search: ");
        int key = sc.nextInt();
        search(array, key);

    }
}
