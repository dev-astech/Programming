package recursion;

import java.util.Scanner;

public class DigitsToString {

    public static String convertDigitsToString(String[] numbers, int number) {
        if(number == 0){
            return "";
        }
        return convertDigitsToString(numbers, number/10)+" "+numbers[number%10];
    }

    public static void main(String[] args) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(convertDigitsToString(numbers, number));
    }
}
