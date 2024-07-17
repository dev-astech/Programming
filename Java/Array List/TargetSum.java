package array_list;

import java.util.ArrayList;

public class TargetSum {

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp = 0, rp = list.size()-1;
        while (lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)>target){
                rp--;
            }else{
                lp++;
            }
        }
        return false;
    }


//    public static boolean pairSum(ArrayList<Integer> list, int target) {
//        for(int i = 0; i<list.size()-1; i++ ){
//            for(int j = i+1; j<list.size(); j++){
//                if(list.get(i)+ list.get(j)==target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(12);
        list.add(14);
        list.add(19);

        System.out.println(pairSum(list, 20));
    }
}
