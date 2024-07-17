package linkedList;

public class RemoveANode {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();


        System.out.println(ll.removeANodeAt(0));
        System.out.println(ll.removeANodeAt(0));

        ll.print();
    }
}
