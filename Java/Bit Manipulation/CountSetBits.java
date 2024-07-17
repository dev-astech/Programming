package BitManipulation;

import java.util.Scanner;

public class CountSetBits {

    public static int countSetBits(int number) {
        int count = 0;
        while (number!=0){
            if((number&1)==1){
                count++;
            }
            number = number>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(countSetBits(number));
    }
}
