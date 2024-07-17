package array_list;

import java.util.ArrayList;

public class SwapTwoElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(5);

        printArrayList(list);
        swapListItems(list, 1, 3);
        printArrayList(list);
    }

    public static void swapListItems(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void printArrayList(ArrayList<Integer> list) {
        for(int number: list){
            System.out.print(number+" ");
        }
        System.out.println();
    }
}
