package BitManipulation;

import java.util.Scanner;

public class ClearRangeOfBits {

    public static int clearRangeOfBits(int number, int i, int j) {
        int bitMask = (~(0)<<(j+1)) | (1<<i);
        return number&bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter the value of i: ");
        int i = sc.nextInt();
        System.out.print("Enter the value of j: ");
        int j = sc.nextInt();
        System.out.println(clearRangeOfBits(number, i, j));;
    }
}
