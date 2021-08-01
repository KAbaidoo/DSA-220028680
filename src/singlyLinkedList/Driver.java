package singlyLinkedList;

public class Driver {

    private static void print(LinkedList list){
        int data;

        for (int i = 0; i < list.getSize(); i++) {
           data = list.get(i);
            System.out.printf(" %s",data);

        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int [] arr = {1,2,3,4,5,6,5,4,3,2,1};
        list.addAll(arr);
        print(list);

        list.removeLast();
        print(list);

        list.removeFirst();
        print(list);

        list.clear();
        print(list);

        list.add(2,new LinkedList.Node(3,new LinkedList.Node(4,new LinkedList.Node(5,null))));
        print(list);

    }
}
