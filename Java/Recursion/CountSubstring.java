package recursion;

import java.util.Scanner;

public class CountSubstring {

    public static int countSubstringOf(String string, int first, int last, int length) {
        if (length == 1) {
            return 1;
        }
        if (length <= 0) {
            return 0;
        }
        int result = countSubstringOf(string, first + 1, last, length - 1)
                + countSubstringOf(string, first, last - 1, length - 1)
                - countSubstringOf(string, first + 1, last - 1, length - 2);
        if (string.charAt(first) == string.charAt(last)) {
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.next();
        System.out.println(countSubstringOf(string, 0, string.length()-1, string.length()));
    }
}
