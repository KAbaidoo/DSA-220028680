package singlyLinkedList;

public class LinkedList implements iLinkedList {
//  A singly linked list consist of a list of nodes and methods to operate on them.

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public LinkedList() {
    }

    //  Node class
    static class Node {
        public int element;
        public Node next;

        //      constructor for creating new nodes
        private Node(int element, Node next) {
            this.element = element;
            this.next = next;
        }
    }


    @Override
    public void addFirst(int e) {
        head = new Node(e, null);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

        @Override
    public void addLast(int e, Node next) {
        if (size == 0) {
            addFirst(e);
        } else {
            tail.next = new Node(e, next);
            tail = tail.next;
            size++;
        }
    }

    @Override
    public void add(int e,Node next) {
        if (size != 0) {
            addLast(e, next);
        } else {
            addFirst(e);
        }
    }

    @Override
    public void addAll(int[] arr) {
        for (int e : arr) {
            add(e,null);
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getFirst() {
                int e = 0;
        if (head != null) {
            e = head.element;
        }
        return e;
    }

    @Override
    public int getLast() {
        return tail.element;
    }

    @Override
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

    @Override
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

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void removeFirst() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    @Override
    public void removeLast() {
//    remove the last element
    }

}
