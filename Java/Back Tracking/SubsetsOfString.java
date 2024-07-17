package back_tracking;

public class SubsetsOfString {

    public static void printSubsets(String string, StringBuilder subString, int i) {
        if(i==string.length()){
            if(subString.isEmpty()){
                System.out.print(null+" ");
            }else {
                System.out.print(subString + " ");
            }
            return;
        }
        printSubsets(string, subString.append(string.charAt(i)), i+1);
        subString.deleteCharAt(subString.length()-1);
        printSubsets(string, subString, i+1);
    }

    public static void main(String[] args) {
        String string = "abc";
        printSubsets(string, new StringBuilder(), 0);
    }
}