package array_list;

import java.util.ArrayList;
import java.util.List;

public class MonotonicOrNot {

    public static boolean isMonotonic(ArrayList<Integer> list) {
        if(list.getFirst() < list.getLast()){
            return isIncreasingMonotonic(list);
        }else{
            return isDecreasingMonotonic(list);
        }
    }

    public static boolean isIncreasingMonotonic(ArrayList<Integer> list) {
        for(int i = 0; i<list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasingMonotonic(ArrayList<Integer> list) {
        for(int i = 0; i<list.size()-1; i++){
            if(list.get(i) < list.get(i+1)){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 3, 1));
        System.out.println(isMonotonic(list));
    }
}
