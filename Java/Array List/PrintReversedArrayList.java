package array_list;

import java.util.ArrayList;

public class PrintReversedArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.reversed());

        for(int i = list.size()-1; i>-1; i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
