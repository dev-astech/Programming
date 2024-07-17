package array_list;

import java.util.ArrayList;
import java.util.List;

public class MostFrequentNumberFollowingKey {

    public static int frequentNumber(ArrayList<Integer> numbers, int key) {
        int max = Integer.MIN_VALUE;
        int num = 0;
        for(int i = 0; i < numbers.size(); i++){
            int count = countOccurrence(numbers, numbers.get(i), key);
            if(max<count){
                max = count;
                num = numbers.get(i);
            }
        }
        return num;
    }

    public static int countOccurrence(ArrayList<Integer> numbers, int target, int key) {
        int count = 0;
        for(int i = 1; i < numbers.size(); i++){
            if(numbers.get(i)==target && numbers.get(i-1)==key){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(3, 4, 5, 4, 5, 5, 5));
        System.out.println(frequentNumber(list, 3));
    }
}
