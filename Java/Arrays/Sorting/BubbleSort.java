package Array.Sorting;

public class BubbleSort {

    //Bubble Sort for sorting an array in ascending order
    public static void bubbleSortAsc(int[] numbers) {
        int pass = 0;
        while (pass < numbers.length - 1) {
            for (int i = 0; i < numbers.length - pass - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swap(numbers, i, (i + 1));
                }
            }
            pass++;
        }
    }

    //Bubble Sort for sorting an array in descending order
    public static void bubbleSortDesc(int[] numbers) {
        int pass = 0;
        while (pass < numbers.length - 1) {
            for (int i = 0; i < numbers.length - pass - 1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    swap(numbers, i, (i + 1));
                }
            }
            pass++;
        }
    }

    //function for printing an array
    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    //function for swapping values of an array
    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    //main function
    public static void main(String[] args) {
        int[] arr = {5, 3, -2, 4, 1, 6};
        System.out.print("Given Array: ");
        printArray(arr);
        bubbleSortAsc(arr);
        System.out.print("Sorted in Ascending order: ");
        printArray(arr);
        bubbleSortDesc(arr);
        System.out.print("Sorted in Descending order: ");
        printArray(arr);
    }
}
