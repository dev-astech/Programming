package Recursion;

import java.util.Scanner;

public class Factorial {

    public static int factorialOf(int num) {
        if(num==0 || num==1){
            return 1;
        }
        return num*factorialOf(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(factorialOf(number));
    }
}
