package BitManipulation;

import java.util.Scanner;

public class PowerOf2 {

    public static boolean isPowerOf2(int number) {
        return (((number) & (number-1)) == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(isPowerOf2(number));
    }
}
