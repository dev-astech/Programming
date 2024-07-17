package array_list;

import java.util.ArrayList;
import java.util.List;

public class LonelyNumber {

    public static void printLonely(ArrayList<Integer> numbers) {
        for(int i = 0; i<numbers.size(); i++){
//            if(!(countOf(numbers, numbers.get(i))>1 || isAdjacentPresent(numbers, numbers.get(i)))){
//                System.out.print(numbers.get(i)+" ");
//            }
            int curr = numbers.get(i);
            if(!(numbers.indexOf(curr)!=numbers.lastIndexOf(curr) || numbers.contains(curr - 1) || numbers.contains(curr + 1))){
                System.out.print(numbers.get(i)+" ");
            }
        }
    }

    public static int countOf(ArrayList<Integer> numbers, int num) {
        int count = 0;
        for(int i : numbers){
            if(i==num){
                count++;
            }
        }
        return count;
    }

    public static boolean isAdjacentPresent(ArrayList<Integer> numbers, int num) {
        for(int i : numbers){
            if(i+1 == num || i-1 == num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 6, 11, 8));
        printLonely(list);
    }
}
