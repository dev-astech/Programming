package BitManipulation;

import java.util.Scanner;

public class ClearLastNBits {

    public static int clearLastNBits(int number, int n) {
        int bitMask = ~(0)<<n;
        return number&bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(clearLastNBits(number, n));;
    }
}
