package Array.Searching;

public class LinearSearch {

    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (key == numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 7, 6, 8, 9, 2, 14, 11, 4};
        int key = 6;
        int keyIndex = linearSearch(numbers, key);
        if (keyIndex != -1) {
            System.out.print(key + " is present at index " + keyIndex);
        } else {
            System.out.print(key + " is not present in the array");
        }
    }
}
