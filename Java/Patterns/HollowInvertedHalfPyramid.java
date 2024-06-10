package pattern_questions;

public class HollowInvertedHalfPyramid {
    public static void main(String[] args) {
        int n=10;
        for(int r=1;r<n;r++){
            if(r==1 || r==n-2 || r==n-1){
                for(int i=1;i<n-r+1;i++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
           else {
                for(int c=1;c<n-r+1;c++){
                    if(c==1 || c==n-r){
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }
}
