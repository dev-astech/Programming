package BitManipulation;

import java.util.Scanner;

public class SetIthBit {
    public static int setIthBit(int number, int i) {
        int bitMask = (1<<i);
        return (number|bitMask);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter the value of i: ");
        int i = sc.nextInt();
        System.out.println(setIthBit(number, i));;
    }
}
