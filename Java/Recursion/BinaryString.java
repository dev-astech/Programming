package recursion;

import java.util.Scanner;

public class BinaryString {

    public static void binaryString(String string, StringBuilder stringBuilder, int size, int lastPlace) {
        if(size==0){
            System.out.println("From String: "+string);
//            System.out.println("From StringBuilder: "+stringBuilder);
            return;
        }
        binaryString(string.concat("0"), stringBuilder.append(0), size-1, 0);
        if(lastPlace==0){
            binaryString(string.concat("1"), stringBuilder.append(1), size-1, 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of string: ");
        int size = sc.nextInt();
        binaryString("", new StringBuilder(), size, 0);
    }
}
