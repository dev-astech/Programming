package Strings;

public class ToUpperCase {

    public static String toUpperCase(String str) {
        StringBuilder resultString = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        resultString.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                resultString.append(str.charAt(i));
                ch = Character.toUpperCase(str.charAt(++i));
                resultString.append(ch);
            } else {
                resultString.append(str.charAt(i));
            }
        }
        return resultString.toString();
    }

    public static void main(String[] args) {
        String str = new String("hi i am anas");
        System.out.println(str);
        System.out.println(toUpperCase(str));
    }
}
