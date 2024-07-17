package recursion;

import java.util.Scanner;

public class SearchInRotatedArray {


    public static int search(int[] array, int target, int si, int ei) {
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        if(target==array[mid]){
            return mid;
        }
        if(array[si]<=array[mid]){
            if(target>=array[si] && target<=array[mid]){
               return search(array, target, si, mid-1);
            }else {
               return search(array, target, mid+1, ei);
            }
        }else{
            if(target>=array[mid] && target<=array[ei]){
               return search(array, target, mid+1, ei);
            }else {
               return search(array, target, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {4, 5, 6, 7, 1, 2, 3};
        System.out.print("Enter Target value: ");
        int target = sc.nextInt();
        int result = search(numbers, target, 0, numbers.length-1);
        System.out.println(result);
    }
}
