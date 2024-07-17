package recursion;


import java.util.Scanner;

public class PrintNumbersInIncreasingOrder {

//    public static void printNumbers(int num, int i) {
//        if(i==num){
//            System.out.print(num);
//        }else {
//            System.out.print(i+" ");
//            printNumbers(num,i+1);
//        }
//    }

    public static void printNumbers(int num) {
        if(num==1){
            System.out.print(num+" ");
        }else {
            printNumbers(num-1);
            System.out.print(num+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
//        printNumbers(number, 1);
        printNumbers(number);
    }
}
