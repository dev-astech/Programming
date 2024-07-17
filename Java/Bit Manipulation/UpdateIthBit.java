package BitManipulation;

import java.util.Scanner;

import static BitManipulation.ClearIthBit.clearIthBit;
import static BitManipulation.SetIthBit.setIthBit;

public class UpdateIthBit {
    public static int updateIthBit(int number, int i, int newBit) {
        if(newBit==0){
            return clearIthBit(number, i);
        }else {
            return setIthBit(number, i);
        }

//        int bitMask;
//        if(newBit == 0){
//            bitMask = ~(1<<i);
//            return number&bitMask;
//        }else {
//            bitMask = newBit<<i;
//            return number|bitMask;
//        }

//        number = number&(~(1<<i));
//        int bitMask = newBit<<i;
//        return number|bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter the value of i: ");
        int i = sc.nextInt();
        System.out.print("Enter the value of new bit: ");
        int newBit = sc.nextInt();
        System.out.println(updateIthBit(number, i, newBit));;
    }
}
