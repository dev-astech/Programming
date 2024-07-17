package recursion;

import java.util.Scanner;

public class NthFibonacciNumber {

    public static int nthFibonacciNumber(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return nthFibonacciNumber(n - 1) + nthFibonacciNumber(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(nthFibonacciNumber(number));
    }

}
