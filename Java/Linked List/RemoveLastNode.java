package linkedList;

public class RemoveLastNode {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();


        ll.removeLast();
        ll.removeLast();
        ll.removeLast();

        ll.print();
    }
}
