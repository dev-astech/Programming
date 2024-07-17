package recursion;

import java.util.Scanner;

public class RemoveDuplicatesFromString {

    public static void removeDuplicates(String string, StringBuilder newString, int i) {
        if(i==string.length()){
            System.out.println(newString);
            return;
        }
        if(newString.toString().indexOf(string.charAt(i))!=-1){
            removeDuplicates(string, newString, i+1);
        }else {
            removeDuplicates(string, newString.append(string.charAt(i)), i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        removeDuplicates(str, new StringBuilder(), 0);
    }
}
