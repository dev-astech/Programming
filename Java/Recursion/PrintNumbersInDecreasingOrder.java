package recursion;


import java.util.Scanner;

public class PrintNumbersInDecreasingOrder {

    public static void printNumbers(int num) {
        if(num==1){
            System.out.print(num);
        }else {
            System.out.print(num+" ");
            printNumbers(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        printNumbers(number);
    }
}
