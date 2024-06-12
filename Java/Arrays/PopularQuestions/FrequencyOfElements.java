package array_questions;

import java.util.Arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int []arr = {10,20,20,10,10,20,5,20};
        boolean []visited = new boolean[arr.length];
        Arrays.fill(visited,false);
        int temp;
        int count;
        for(int i=0;i<arr.length;i++){
            if(visited[i]){
                continue;
            }
            count = 0;
            temp = arr[i];
            for (int j=0;j<arr.length;j++){
                if(arr[j]==temp){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(temp+" "+count);
        }
    }
}
