package linkedList;

public class AddANode {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addANodeAt(0, 1);
        ll.addANodeAt(0, 2);
        ll.addANodeAt(0, 3);
        ll.addANodeAt(0, 4);
        ll.addANodeAt(0, 5);

        ll.print();
    }

}
