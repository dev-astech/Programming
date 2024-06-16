package Array.Sorting;

public class InsertionSort {

    //Insertion Sort for sorting an array in ascending order
    public static void insertionSortAsc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentIndex = i + 1;
            int temp = array[currentIndex];
            while (currentIndex != 0) {
                if (array[currentIndex] < array[currentIndex - 1]) {
                    array[currentIndex] = array[currentIndex - 1];
                    array[currentIndex - 1] = temp;
                    currentIndex--;
                } else break;
            }
        }
    }

    //Insertion Sort for sorting an array in descending order
    public static void insertionSortDesc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentIndex = i + 1;
            int temp = array[currentIndex];
            while (currentIndex != 0) {
                if (array[currentIndex] > array[currentIndex - 1]) {
                    array[currentIndex] = array[currentIndex - 1];
                    array[currentIndex - 1] = temp;
                    currentIndex--;
                } else break;
            }
        }
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
        int[] array = {5, 3, 2, 4, 1, 6};
        System.out.print("Given Array: ");
        printArray(array);
        insertionSortAsc(array);
        System.out.print("Sorted in Ascending order: ");
        printArray(array);
        insertionSortDesc(array);
        System.out.print("Sorted in Descending order: ");
        printArray(array);
    }

}
