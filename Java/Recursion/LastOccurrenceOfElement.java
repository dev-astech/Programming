package Recursion;

import java.util.Scanner;

public class LastOccurrenceOfElement {

    public static int lastOccurrenceOf(int []array, int number, int index) {
        if(index == -1){
            return -1;
        }
        if(array[index]==number){
            return index;
        }
        return lastOccurrenceOf(array, number, index-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] array = {1,2,8,4,9,6,7,8,9};
        int startIndex = array.length-1;
        int elementIndex = lastOccurrenceOf(array, number, startIndex);
        if(elementIndex==-1){
            System.out.print("Not Present");
        }else {
            System.out.print("Last occurrence of "+number+" in array at index: "+ elementIndex);
        }

    }
}
