package array_list;

import java.util.ArrayList;

public class BeautifulArray {

    public static void beautifulArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = 1;
        while (temp<=n){
            list.add(temp);
            temp++;
        }
        for(int i = 0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k = i+1; k<j; k++){
//                    if(){
//                        list.add(k);
//                    }
                }
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        beautifulArrayList(4);
    }
}
