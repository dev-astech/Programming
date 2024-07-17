package recursion;

import java.util.Scanner;

public class Substrings {

    public static void printSubstringsOf(String string, int first, int last, int length) {

        if(first==last){
            if(string.charAt(first)==string.charAt(last)){
                System.out.print(string.substring(first, last+1)+" ");
            }
            return;
        }
        if(string.charAt(first)==string.charAt(last)){
            System.out.print(string.substring(first, last+1)+" ");
        }
        printSubstringsOf(string, first + 1, last, length - 1);
        printSubstringsOf(string, first, last - 1, length - 1);

//        if (length == 1) {
//            System.out.print(string.substring(first, last+1));
//            return;
//        }
//        if (length <= 0) {
//            return;
//        }
//        printSubstringsOf(string, first + 1, last - 1, length - 2);
//        if (string.charAt(first) == string.charAt(last)) {
//            result++;
//        }
//        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.next();
        printSubstringsOf(string, 0, string.length()-1, string.length());
    }
}
