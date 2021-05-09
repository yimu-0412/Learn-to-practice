public class TestDemo {
    public static void main(String[] args) {
        MyLinkList list = new MyLinkList();
//        list.createList();;
//        list.display();
        System.out.println(list.size());
        list.addFirst(6);
        list.addFirst(16);
        list.addLast(16);
        list.addLast(16);
        list.addIndex(1,188);
        list.addLast(16);
        list.display();
        System.out.println(list.contains(188));
        list.remove(16);
        list.removeAllKey(16);

        list.display();
        list.clear();
    }
}
