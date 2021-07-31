package singlyLinkedList;

public class Driver {

    private static void print(LinkedList list){
        int data;

        for (int i = 0; i < list.getSize(); i++) {
           data = list.get(i);
            System.out.println(data);
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int [] arr = {2,4,5,6,7,};
        list.addAll(arr);
        print(list);
    }
}
