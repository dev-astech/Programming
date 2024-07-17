package recursion;

import java.util.Scanner;

public class PairOfFriends {

    public static int waysOfPair(int n) {
        if(n==1 || n==2){
            return n;
        }
        return waysOfPair(n-1) + ((n-1)*waysOfPair(n-2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(waysOfPair(number));
    }
}
