package singlyLinkedList;

public interface iLinkedList {
    /**
     * Inserts the specified element at the beginning of this list.
     *
     * @param e The element to be inserted
     */
     void addFirst(int e);

    /**
     * Appends the specified element to the end of this list.
     *
     * @param e    The element to be appended

     */
     void addLast(int e);

     boolean isEmpty();

    /**
     * Appends the specified element to the end of this list.
     *
     * @param e    The element to be appended
     */
     void add(int e);

    /**
     *  Inserts all of the elements in the specified collection into this list, starting at the specified position.
     *
     * @param arr Collection of items to be added
     */
     void addAll(int[] arr);

    /**
     *  Returns the number of elements in this list.
     *
     * @return size of the list
     */
     int getSize();

    /**
     * Returns the first element in this list.
     *
     * @return integer
     */
     int getFirst();

    /**
     * Returns the last element in this list.
     *
     * @return integer
     */
     int getLast();

    /**
     *  Returns the element at the specified position in this list.
     *
     * @param index index of element to return
     * @return integer
     */
     int get(int index);

    /**
     *  Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     *
     * @param e element to search for
     * @return index of first occurrence of the specified element or  -1 if this list does not contain the element.
     */
     int indexOf(int e);

    /**
     *  Removes all of the elements from this list.
     */
     void clear();

    /**
     *  Removes and returns the first element from this list.
     */
     int removeFirst();

    /**
     *  Removes and returns the first element from this list.
     */
     int removeLast();

}
