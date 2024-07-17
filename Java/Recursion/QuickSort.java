package recursion;

public class QuickSort {

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void quickSort(int[] array, int startingIndex, int endingIndex) {

        if(startingIndex>=endingIndex){
            return;
        }
        int pivotIndex = partition(array, startingIndex, endingIndex);
        quickSort(array, startingIndex, pivotIndex-1);
        quickSort(array, pivotIndex+1, endingIndex);
    }

    public static int partition(int[] array, int startingIndex, int endingIndex) {
        int i = startingIndex-1;
        int pivot = array[endingIndex];
        for(int j = startingIndex; j < array.length; j++){
            if(array[j]<pivot){
                i++;
                swap(array, i, j);
            }
        }
        i++;
        swap(array, i, endingIndex);
        return i;
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 6, 5, 4, 8, 2, 3};

        System.out.print("Given Array: ");
        printArray(array);

        System.out.print("Sorted Array: ");
        quickSort(array, 0, array.length-1);

        printArray(array);
    }
}
