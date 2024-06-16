package Strings;

public class StringCompression {

    public static String compress(String str) {
        int count = 1;
        char last = str.charAt(0);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(last).append(count);
                } else {
                    sb.append(last);
                }
                count = 1;
                last = str.charAt(i);
            }
        }
        if (count > 1) {
            sb.append(last).append(count);
        } else {
            sb.append(last);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbbjvvgcccvbvh";
        System.out.println("actual string: " + str);
        System.out.println("compressed string: " + compress(str));
    }

//    public static String compress(String str) {
//        int count = 1;
//        char last = str.charAt(0);
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 1; i < str.length(); i++) {
//            while (str.charAt(i) == last) {
//                count++;
//                last = str.charAt(i);
//                i++;
//            }
//            if (count > 1) {
//                sb.append(last).append(count);
//            } else {
//                sb.append(last);
//            }
//            count = 1;
//            last = str.charAt(i);
//
//        }
//        return sb.toString();
//    }

}
