package Array.PopularQuestions;

public class RepeatedNumber {

    public static boolean hasRepeatedElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 5, 2, 8, 6, 3};
        System.out.print("Array has repeated elements? " + hasRepeatedElement(array));
    }
}
