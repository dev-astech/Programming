package array_list;

import java.util.ArrayList;

public class ContainerWithMostWater {

    //2 Pointer Approach
    public static void findContainer(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        int lp=0, rp=list.size()-1;
        int idx1 = 0, idx2 = 0;
        while(lp<rp){
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp-lp;
            int area = height*width;
            if(area>max){
                max = area;
                idx1 = lp;
                idx2 = rp;
            }
            if(list.get(lp)< list.get(rp)){
                lp++;
            }else {
                rp--;
            }
        }
        System.out.println("Water Stored in container: "+max);
        System.out.println("Starting index of container: "+idx1);
        System.out.println("Ending index of container: "+idx2);
    }


    //BruteForce Approach
//    public static void findContainer(ArrayList<Integer> list) {
//        int max = Integer.MIN_VALUE;
//        int idx1=0, idx2=0;
//        for(int i = 0; i<list.size()-1; i++){
//            for(int j = i+1; j<list.size(); j++){
//                int curr = (j-i)*Math.min(list.get(i), list.get(j));
//                if(curr>max){
//                    max = curr;
//                    idx1 = i;
//                    idx2 = j;
//                }
//            }
//        }
//        System.out.println("Water Stored in container: "+max);
//        System.out.println("Starting index of container: "+idx1);
//        System.out.println("Ending index of container: "+idx2);
//    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        findContainer(list);
    }
}
