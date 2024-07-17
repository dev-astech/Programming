package back_tracking;

import java.util.Scanner;

public class KeypadCombination {

    final static char[][] sets = {
            {},                     // 0
            {},                     // 1
            {'a', 'b', 'c'},        // 2
            {'d', 'e', 'f'},        // 3
            {'g', 'h', 'i'},        // 4
            {'j', 'k', 'l'},        // 5
            {'m', 'n', 'o'},        // 6
            {'p', 'q', 'r', 's'},   // 7
            {'t', 'u', 'v'},        // 8
            {'w', 'x', 'y', 'z'}    // 9
    };

    public static void combination(String inputString, StringBuilder str, int i) {
        if(inputString.isEmpty()){
            System.out.print("");
            return;
        }

        if(i==inputString.length()){
            System.out.print(str.toString()+" ");
        }else {
            char[] set = sets[Character.getNumericValue(inputString.charAt(i))];
            for (char c : set) {
                combination(inputString, new StringBuilder(str).append(c), i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits: ");
        String inputString = sc.next();
        combination(inputString, new StringBuilder(), 0);
    }
}
