package BitManipulation;

import java.util.Scanner;

public class OddOrEven {

    public static void oddOrEven(int number) {
        if((number&1)==0){
            System.out.println(number+" is an even number");
        }else {
            System.out.println(number+" is an odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        oddOrEven(number);
    }
}
