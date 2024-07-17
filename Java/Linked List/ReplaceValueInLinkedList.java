package linkedList;

public class ReplaceValueInLinkedList {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();

        ll.replaceValueAt(2, 3);
        ll.replaceValueAt(3, 4);

        ll.print();
    }

}
