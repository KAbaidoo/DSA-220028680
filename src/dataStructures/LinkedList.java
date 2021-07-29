package dataStructures;

public class LinkedList {
//  A singly linked list consist of a list of nodes and methods to operate on them.

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public LinkedList() {
    }

    //  Node class
    private static class Node {
        public int element;
        public Node next;

        //      constructor for creating new nodes
        private Node(int element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    //  Inserts the specified element at the beginning of this list.
    public void addFirst(int e) {
        head = new Node(e, null);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    //  Appends the specified element to the end of this list.
    public void addLast(int e) {
        if (size == 0) {
            addFirst(e);
        } else {
            tail.next = new Node(e, null);
            tail = tail.next;
            size++;
        }
    }

    //    Appends the specified element to the end of this list.
    public void add(int e) {
        if (size != 0) {
            addLast(e);
        } else {
            addFirst(e);
        }
    }

    //    Appends all of the elements in the specified collection to the end of this list,
    //    in the order that they are returned by the specified collection's iterator
    public void addAll(int[] arr) {
        for (int e : arr
        ) {
            add(e);
        }
    }

    public int getSize() {
        return size;
    }

    public int getFirst() {
        int e = 0;
        if (head != null) {
            e = head.element;
        }
        return e;
    }

    public int getLast() {
        return tail.element;
    }

    //    Returns the element at the specified position in this list.
    public int get(int index) {
        Node currNode = head;
        int e = 0;
        int i = 0;
        if (index == 0) {
            getFirst();
        } else {
            while (currNode.next != null) {
                i++;
                currNode = currNode.next;
                if (index == i) break;

            }
        }
        e = currNode.element;
        return e;
    }

    public int indexOf(int e) {
        Node currNode = head;
        int i=0;
        if (currNode.element == e) return i;

        while (currNode.next != null) {
            i++;
            currNode = currNode.next;
            if (currNode.element == e) {
                return i;
            };

        }
        return -1;
    }

    //       Removes all of the elements from this list.
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void removeFirst(){
        if (head != null){
            head = head.next;
            size--;
        }

    }
//public void removeLast(){
//    if (tail != null){
//        tail =
//    }
//}


    //  Driver class
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int[] myarr = {1, 3, 4, 5};
        list.addAll(myarr);
        list.removeFirst();
        System.out.println(list.getLast());
    }


}

