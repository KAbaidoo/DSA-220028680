package singlyLinkedList;

public class Driver {

    public static void print(LinkedList list){
        int data;
        System.out.print("List items: ");
        for (int i = 0; i < list.getSize(); i++) {
           data = list.get(i);
            System.out.printf(" %s",data);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAll(new int[] {2,3,5,6,7});
        print(list);

        list.addFirst(10);
        System.out.println("Added 10 to beginning of list");
        print(list);

        list.addLast(12);
        System.out.println("Added 12 to end of list");
        print(list);

        list.removeFirst();
        System.out.println("Removed the element at the beginning of the list");
        print(list);

        list.removeLast();
        System.out.println("Removed the element at the end of the list");
        print(list);

        list.add(8);
        System.out.println("Added 8 to the list");
        print(list);

        System.out.println("The size of the list is : " + list.getSize());

        System.out.println("Index of 3 is : " + list.indexOf(3));

        System.out.println("The first element is: " + list.getFirst());

        System.out.println("The last element is: " + list.getLast());

        System.out.println("Element at index 3 is : " + list.get(3));

        list.clear();
        print(list);


    }
}
