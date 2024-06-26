package BitManipulation;

import java.util.Scanner;

public class UppercaseToLowercase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character(in uppercase): ");
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        ch|=' ';
        System.out.println(ch);
    }
}
