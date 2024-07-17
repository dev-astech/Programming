package BitManipulation;

import java.util.Scanner;

public class Add1ToAnInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = ~number*(-1);

        System.out.println(number);
    }
}
