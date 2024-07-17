package array_list;

import java.util.ArrayList;

public class PairSum {

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        int lp = 0, rp = list.size()-1;

        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                rp = i;
                lp = i+1;
                break;
            }
        }


        while (lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(rp)+ list.get(lp)>target){
                rp = (list.size()+rp-1)%list.size();
            }else{
                lp=(lp+1)%list.size();
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(pairSum(list, 5));
    }
}
