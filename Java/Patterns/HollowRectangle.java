package pattern_questions;

public class HollowRectangle {
    public static void main(String[] args) {
        int rows=5,columns=8;
        for(int r=1;r<=rows;r++){
            for(int c=1;c<=columns;c++){
                if(c!=1 && c!=columns && r!=1 && r!=rows){
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
