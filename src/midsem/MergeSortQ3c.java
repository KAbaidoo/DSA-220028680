package midsem;

import singlyLinkedList.Driver;
import singlyLinkedList.LinkedList;

import java.util.Comparator;

import static java.util.Objects.compare;


public class MergeSortQ3c {
    public static void main(String[] args) {
        LinkedList list;
        list = new LinkedList();

        list.addAll(new int[]{2, 3, 5, 6, 7, 4, 6, 7, 8, 4});

        Driver d = new Driver();
        System.out.print("Original");
        d.print(list);

        mergeSort(list, new compareElements());

    }

    static class compareElements implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }

    public static void merge(LinkedList S1, LinkedList S2, LinkedList S, Comparator comp
    ) {
        while (!S1.isEmpty() && !S2.isEmpty()) {
            if (comp.compare(S1.getFirst(), S2.getFirst()) < 0)
                S.addLast(S1.removeFirst()); // take next element from S1
            else
                S.addLast(S2.removeFirst()); // take next element from S2
        }
        while (!S1.isEmpty())
            S.addLast(S1.removeFirst()); // move any elements that remain in S1
        while (!S2.isEmpty())
            S.addLast(S2.removeFirst()); // move any elements that remain in S2

        Driver d = new Driver();
        d.print(S);
    }


    //          Merge-sort contents of queue.
    public static void mergeSort(LinkedList S, Comparator comp) {
        int n = S.getSize();
        if (n < 2) return; // queue is trivially sorted
        // divide
        LinkedList S1 = new LinkedList(); // (or any queue implementation)
        LinkedList S2 = new LinkedList();
        while (S1.getSize() < n / 2)
            S1.addLast(S.removeFirst()); // move the first n/2 elements to S1
        while (!S.isEmpty())
            S2.addLast(S.removeFirst()); // move remaining elements to S2
        // conquer (with recursion)
        mergeSort(S1, comp); // sort first half
        mergeSort(S2, comp); // sort second half
        // merge results


        merge(S1, S2, S, comp); // merge sorted halves back into original

    }
}
