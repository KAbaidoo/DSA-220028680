package queue;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int queue_size = 10;
        ArrayBasedQueue<Integer> queue = new ArrayBasedQueue<>(queue_size);
        print(queue);

        // populate queue with random integers between 0 and 10 (inclusive)
        int[] added_elements = new int[12];
        for(int i = 0; i < 12; i++){
            int element = (int) (Math.random() * 11);
            added_elements[i] = element;
            queue.enqueue(element);
        }
        print(queue);
        print("Order of addition "+Arrays.toString(added_elements));

////         repetitive removal
//        int[] removed = new int[queue.getSize()];
//        for(int i = 0; i < queue.getSize(); i++){
//            int element = queue.dequeue();
//            removed[i] = element;
//        }
//        print(Arrays.toString(removed));

        /**
         * Print the elements of the queue in the right order
         * i.e. the head first, and the tail last.
         * In your codes to demonstrate your solution, ensure that
         * the head of the queue is in the middle of the array backing the queue.
         */
        //Put your codes here

        int[] elements = new int[queue_size];

        for(int i = 0; i < elements.length; i++){
            elements[i] = queue.dequeue();
        }
        print("elements of the queue "+Arrays.toString(elements));
    }

    public static void print(Object o){
        System.out.println(o.toString());
    }
}
