package Recursion;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

    public static int calculateSum(int n) {
        if(n==1){
            return 1;
        }
        return n+calculateSum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(calculateSum(number));
    }
}
