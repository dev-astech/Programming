package BitManipulation;

import java.util.Scanner;

public class GetIthBit {

    public static void getIthBit(int number, int i) {
        int bitMask = (1<<i);
        if((number&bitMask)==0){
            System.out.println(0);
        }
        else {
            System.out.println(1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter the value of i: ");
        int i = sc.nextInt();
        getIthBit(number, i);
    }
}
