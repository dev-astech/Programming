package back_tracking;

public class Permutations {

//    public static void printPermutations(String string, String subString) {
//        if(string.isEmpty()){
//            System.out.print(subString+" ");
//            return;
//        }
//
//        for(int i = 0; i < string.length(); i++){
//            char ch = string.charAt(i);
//            String str = string.substring(0, i) + string.substring(i + 1);
//            printPermutations(str, subString+ch);
//        }
//    }

    public static void printPermutations(StringBuilder string, StringBuilder subString) {
        if(string.isEmpty()){
            System.out.print(subString+" ");
            return;
        }

        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            StringBuilder str = new StringBuilder(string.substring(0, i) + string.substring(i + 1));
            printPermutations(str, subString.append(ch));
            subString.deleteCharAt(subString.length()-1);
        }
    }

    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("abc");
//        printPermutations(string, "");
        printPermutations(string, new StringBuilder());
    }
}