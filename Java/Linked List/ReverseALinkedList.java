package linkedList;

import static linkedList.LinkedList.head;

public class ReverseALinkedList {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();

        head = ll.reverse(head);

        ll.print();

        ll.reverse();

        ll.print();
    }

}
