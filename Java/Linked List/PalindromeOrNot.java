package linkedList;

public class PalindromeOrNot {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();

        System.out.println(ll.isPalindrome());
        System.out.println(ll.checkPalindrome());

    }
}
