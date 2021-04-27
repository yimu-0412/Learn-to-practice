package exer;

public class ListTest {
    public static void main(String[] args) {
        MyLinkedList linkedlist = new MyLinkedList();
        linkedlist.createList();
        linkedlist.display();
        System.out.println(linkedlist.size());
        linkedlist.addFirst(10);
        linkedlist.display();
        linkedlist.addLast(20);
        linkedlist.display();
        linkedlist.addIndex(0,2);
        linkedlist.display();
        linkedlist.addIndex(1,2);
        linkedlist.display();
        System.out.println(linkedlist.contains(5));
        linkedlist.clear();
        linkedlist.display();
    }
}
