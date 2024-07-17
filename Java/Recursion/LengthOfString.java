package recursion;

import java.util.Scanner;

public class LengthOfString {

    public static int lengthOf(String str, int i) {
        if(i==str.length()){
            return 0;
        }
        return 1+lengthOf(str, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.println("Length of String: "+lengthOf(str, 0));
    }
}
