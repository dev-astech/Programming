package linkedList;

public class AddANodeAtFirst {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();

    }

}
