package array_list;

import java.util.ArrayList;

public class MaxNumber {

    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(10);
        list.add(4);
        list.add(5);

        for(int number: list){
            if(number>max){
                max = number;
            }
        }

        System.out.println("Maximum number is: "+max);

    }

}
