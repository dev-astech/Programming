package Strings;

public class LargestString {

    public static String largestString(String[] array) {
        String largest = array[0];
        for (int i = 1; i < array.length; i++) {
            int num = largest.compareToIgnoreCase(array[i]);
            if (num < 0) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String[] array = {"apple", "mango", "banana"};
        System.out.println(largestString(array));
    }
}
