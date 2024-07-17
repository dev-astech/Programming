package recursion;

import java.util.Scanner;

public class ReverseANumber {

    public static int reverse(int num, int multiplier) {
        if(num==0){
            return 0;
        }
        return ((num%10)*multiplier)+reverse((num/10), (multiplier/10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        if(number>Integer.MAX_VALUE || number<Integer.MIN_VALUE){
            System.out.println(0);
            return;
        }
        int digits = countDigits((int) number)-1;
        int multiplier = (int) Math.pow(10, digits);
//        int reversedNumber = reverse((int) number, multiplier);
//        System.out.println(reversedNumber);
        System.out.println();
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number!=0){
            count++;
            number/=10;
        }
        return count;
    }
}
