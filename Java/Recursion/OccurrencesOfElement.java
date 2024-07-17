package recursion;

import java.util.Scanner;

public class OccurrencesOfElement {

    public static void occurrencesOf(int []array, int number, int index) {
        if(index == array.length){
            return;
        }
        if(array[index]==number){
            System.out.print(index+" ");
        }
        occurrencesOf(array, number, index+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] array = {1,2,3,2,9,2,7,2,9};
        int startIndex = 0;
        occurrencesOf(array, number, startIndex);
    }
}
