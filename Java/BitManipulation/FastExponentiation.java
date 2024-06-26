package BitManipulation;

import java.util.Scanner;

public class FastExponentiation {

    public static int calculateExponentiation(int number, int power) {
        int answer = 1;

        while (power>0){
            if((power&1)!=0){
                answer*=number;
            }
            number*=number;
            power=power>>1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter power of a number: ");
        int power = sc.nextInt();
        System.out.println(calculateExponentiation(number,power));
    }
}
