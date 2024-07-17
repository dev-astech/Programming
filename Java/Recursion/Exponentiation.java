package recursion;

import java.util.Scanner;

public class Exponentiation {

    public static int exponentiationOf(int number, int power) {
        if (power == 1) {
            return number;
        }
        return number * exponentiationOf(number, power - 1);
    }

    public static int optimizedExponentiation(int number, int power) {
        if (power == 1) {
            return number;
        }
        int halfExponentiation = exponentiationOf(number, power / 2);
        int halfExponentiationSquare = halfExponentiation * halfExponentiation;

        if (power % 2 != 0) {
            return number * halfExponentiationSquare;
        }
        return halfExponentiationSquare;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter a power: ");
        int power = sc.nextInt();
        int result = exponentiationOf(number, power);
        int optimizedResult = optimizedExponentiation(number, power);
        System.out.println(number + " ^ " + power + " = " + result);
        System.out.print(number + " ^ " + power + " = " + optimizedResult);
    }
}
