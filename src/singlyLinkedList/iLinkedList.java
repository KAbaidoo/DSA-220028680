package singlyLinkedList;

public interface iLinkedList {

    public void addFirst(int e);

    public void addLast(int e, LinkedList.Node next);

    public void add(int e,  LinkedList.Node next) ;

    public void addAll(int[] arr);

    public int getSize();

    public int getFirst();

    public int getLast();

    public int get(int index);

    public int indexOf(int e);

    public void clear();

    public void removeFirst();

    public void removeLast();

}
