package Recursion;

import java.util.Scanner;

public class FirstOccurrenceOfElement {

    public static int firstOccurrenceOf(int []array, int number, int index) {
        if(index == array.length){
            return -1;
        }
        if(array[index]==number){
            return index;
        }
        return firstOccurrenceOf(array, number, index+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] array = {1,2,3,4,9,6,7,8,9};
        int startIndex = 0;
        int elementIndex = firstOccurrenceOf(array, number, startIndex);
        if(elementIndex==-1){
            System.out.print("Not Present");
        }else {
            System.out.print("First occurrence of "+number+" in array at index: "+elementIndex);
        }

    }
}
