package BitManipulation;

import java.util.Scanner;

public class Swap2Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter a number 2: ");
        int number2 = sc.nextInt();

        System.out.println("Before Swap: "+number1+", "+number2);

        number1 = number1 ^ number2;
        number2 = number1 ^ number2;
        number1 = number1 ^ number2;

        System.out.println("After Swap: "+number1+", "+number2);

    }
}
