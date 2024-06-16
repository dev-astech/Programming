package Array.Sorting;

public class SelectionSort {

    //Selection sort for sorting an array in Ascending order
    public static void selectionSortAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int index = smallestNumberIndex(array, j);
                if (array[i] > array[index]) {
                    swap(array, i, index);
                }
            }
        }
    }

    //Selection sort for sorting an array in Descending order
    public static void selectionSortDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int index = maximumNumberIndex(array, j);
                if (array[i] < array[index]) {
                    swap(array, i, index);
                }
            }
        }
    }

    //Function for finding index of the minimum no. in remained array
    public static int smallestNumberIndex(int[] array, int start) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = start; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    //Function for finding index of the maximum no. in remained array
    public static int maximumNumberIndex(int[] array, int start) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = start; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    //function for swapping values of an array
    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    //function for printing an array
    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    //main function
    public static void main(String[] args) {
        int[] arr = {5, 3, -2, 4, 1, 6};
        System.out.print("Given Array: ");
        printArray(arr);
        selectionSortAsc(arr);
        System.out.print("Sorted in Ascending order: ");
        printArray(arr);
        selectionSortDesc(arr);
        System.out.print("Sorted in Descending order: ");
        printArray(arr);
    }
}
