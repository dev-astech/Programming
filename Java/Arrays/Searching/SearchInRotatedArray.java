package array.Searching;

import java.util.Scanner;

public class SearchInRotatedArray {


    public static int search(int[] array, int target) {
        int si = 0;
        int ei = array.length-1;
        int mid = si+(ei-si)/2;
        if(array[mid]==target){
            return mid;
        }
        if(target<=array[mid] && target>=array[si]){
            for(int i=0;i<=mid;i++){
                if(array[i]==target){
                    return i;
                }
            }
        }else {
            for(int i=mid+1;i< array.length;i++){
                if(array[i]==target){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {4, 5, 6, 7, 1, 2, 3};
        System.out.print("Enter Target value: ");
        int target = sc.nextInt();
        int result = search(numbers, target);
        System.out.println(result);
    }
}
