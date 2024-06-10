package pattern_questions;

public class FullPyramid {
    public static void main(String[] args) {
        for(int r=1;r<=6;r++){
            for(int s=1;s<=6-r;s++){
                System.out.print("  ");
            }
            for(int c=1;c<=r;c++){
                System.out.print("* ");
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
