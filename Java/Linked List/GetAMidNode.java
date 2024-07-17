package linkedList;

import static linkedList.LinkedList.head;
import static linkedList.LinkedList.Node;

public class GetAMidNode {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();

        Node mid = ll.findMid(head);

        System.out.println(mid.data);

    }

}
