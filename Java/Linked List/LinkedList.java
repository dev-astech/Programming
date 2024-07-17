package linkedList;

public class LinkedList {

    // Node Structure
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static Node head;   //points to first node of list
    static Node tail;   //points to last node of list
    int size = 0;       //store the size of list


    // this method creates a new node and add it at first position of linked list
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    // this method creates a new node and add it at last position of linked list
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    // this method creates a new node and add it at given index of linked list
    public void addANodeAt(int index, int data){

        if(index<0 || index>size){
            System.out.println("index out of bound");
            return;
        }

        if(index==0){
            addFirst(data);
            return;
        }

        Node iterator = head;
        Node newNode = new Node(data);
        size++;
        for(int i = 0; i < index-1 && iterator!=null ; i++){
            iterator = iterator.next;
        }
        if(iterator==null){
            System.out.println("index out of Bound");
            return;
        }
        newNode.next = iterator.next;
        iterator.next = newNode;
    }


    // this method deletes a node from first position of linked list
    public int removeFirst(){
        if(size==0){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    // this method deletes a node from last position of linked list
    public int removeLast(){
        if(size==0){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size = 0;
            return val;
        }
        Node iterator = head;
        int i = 0;
        while (i<size-2){
            iterator = iterator.next;
            i++;
        }
        int val = iterator.next.data;
        iterator.next = null;
        tail = iterator;
        size--;
        return val;
    }


    // this method deletes a node from given index of linked list
    public int removeANodeAt(int index){
        if(size==0){
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        }else if(index==0){
            return removeFirst();
        }else if(index==size-1){
            return removeLast();
        }else if(index>=size || index<0){
            System.out.println("index out of bound");
            return Integer.MIN_VALUE;
        }
        Node iterator = head;
        int i = 0;
        while (i<index-1){
            iterator = iterator.next;
            i++;
        }
        int val = iterator.next.data;
        iterator.next = iterator.next.next;
        size--;
        return val;
    }


    // this method deletes a node from (given position count from last) of linked list
    public int removeANodeFromLast(int position){
        int index = size-position;
        if(size==0){
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        }else if(index==0){
            return removeFirst();
        }else if(index==size-1){
            return removeLast();
        }else if(index>=size || index<0){
            System.out.println("index out of bound");
            return Integer.MIN_VALUE;
        }
        Node iterator = head;
        int i = 0;
        while (i<index-1){
            iterator = iterator.next;
            i++;
        }
        int val = iterator.next.data;
        iterator.next = iterator.next.next;
        size--;
        return val;
    }


    // this method prints a linked list
    public void print(){
        Node iterator = head;
        while (iterator!=null){
            System.out.print(iterator.data+" -> ");
            iterator = iterator.next;
        }
        System.out.println("null");
    }


    //this method search for an element in linked list
    public int searchInLinkedList(int key){
        Node iterator = head;
        int index = -1;
        while (iterator!=null){
            if(iterator.data==key){
                return ++index;
            }
            index++;
            iterator = iterator.next;
        }
        return -1;
    }


    // this method replace a value of a node present at given index
    public void replaceValueAt(int index, int value){

        if(index<0 || index>size-1){
            System.out.println("index out of bound");
            return;
        }

        Node iterator = head;
        for(int i = 0; i < index; i++){
            iterator = iterator.next;
        }
        iterator.data = value;
    }


    // this method gives a value of a node present at given index
    public int valueAt(int index){

        if(index<0 || index>size-1){
//            System.out.println("index out of bound");
            return Integer.MIN_VALUE;
        }

        Node iterator = head;
        for(int i = 0; i < index; i++){
            iterator = iterator.next;
        }
        return iterator.data;
    }


    //this method reverse a linked list and re-initialise head
    public void reverse(){
        Node previousToCurrent = null;
        Node current = tail = head;
        Node nextToCurrent;

        while (current!=null){
            nextToCurrent = current.next;
            current.next = previousToCurrent;
            previousToCurrent = current;
            current = nextToCurrent;
        }
        head = previousToCurrent;
    }


    //this method reverse a linked list and return what will be new head
    Node reverse(Node head){
        Node previousToCurrent = null;
        Node current = tail = head;
        Node nextToCurrent;

        while (current!=null){
            nextToCurrent = current.next;
            current.next = previousToCurrent;
            previousToCurrent = current;
            current = nextToCurrent;
        }
        return previousToCurrent;
    }


    //this method check where a linked list is palindrome or not in O(n2)
    public boolean isPalindrome(){
        int i = 0;
        while (i<this.size/2){
            if(valueAt(i)!=valueAt(size-i-1)){
                return false;
            }
            i++;
        }
        return true;
    }


    //this method check where a linked list is palindrome or not in O(n)
    public boolean checkPalindrome(){
        Node mid = findMid(head);
        Node newMid = reverse(mid);
        Node leftIterator = head;
        Node rightIterator = newMid;

        while (rightIterator!=null){
            if(leftIterator.data!=rightIterator.data){
                return false;
            }
            leftIterator = leftIterator.next;
            rightIterator = rightIterator.next;
        }

        reverse(newMid);

        return true;
    }


    //this method returns a middle node of a linked list
    Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}