package array_list;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(10);
        list.add(4);
        list.add(5);

        printArrayList(list);
        Collections.sort(list);
        printArrayList(list);
        Collections.sort(list, Collections.reverseOrder());
        printArrayList(list);

    }

    public static void printArrayList(ArrayList<Integer> list) {
        for(int number: list){
            System.out.print(number+" ");
        }
        System.out.println();
    }
}
