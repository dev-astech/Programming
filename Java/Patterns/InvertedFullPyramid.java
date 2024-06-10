package pattern_questions;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        for(int r=1;r<=6;r++){
                for (int s = 1; s < r; s++) {
                    System.out.print("  ");
                }
                for (int c = 1; c <= 6 - r + 1; c++) {
                    System.out.print("* ");
                    System.out.print("  ");
                }
            System.out.println();
        }
    }
}
