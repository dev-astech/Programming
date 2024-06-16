package Array.Searching;

public class BinarySearch {

    public static int binarySearch(int[] numbers, int key) {

        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 8, 10, 11, 13, 17, 20};
        int key = 8;
        int keyIndex = binarySearch(numbers, key);
        if (keyIndex != -1) {
            System.out.print(key + " is present at index " + keyIndex);
        } else {
            System.out.print(key + " is not present in the array");
        }
    }
}
