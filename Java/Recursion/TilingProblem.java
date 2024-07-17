package recursion;

import java.util.Scanner;

public class TilingProblem {

    public static int noOfWaysToFillTheArea(int n) {
        if(n == 0 || n==1){
            return 1;
        }
        return noOfWaysToFillTheArea(n-1)+ noOfWaysToFillTheArea(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N in 2XN area: ");
        int width = sc.nextInt();
        System.out.println("Number of ways to fill the area: "+noOfWaysToFillTheArea(width));
    }
}
