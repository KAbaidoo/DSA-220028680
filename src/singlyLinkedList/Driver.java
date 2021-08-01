package singlyLinkedList;

public class Driver {

    private static void print(LinkedList list){
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

        list.removeLast();
        print(list);

        list.addFirst(10);
        print(list);
    }
}
