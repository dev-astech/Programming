package linkedList;

public class RemoveANodeFromLast {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();


        System.out.println(ll.removeANodeFromLast(1));
        System.out.println(ll.removeANodeFromLast(3));

        ll.print();
    }
}
