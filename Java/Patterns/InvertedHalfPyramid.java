package pattern_questions;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        for(int r=1;r<7;r++){
            for(int c=r;c<7;c++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
