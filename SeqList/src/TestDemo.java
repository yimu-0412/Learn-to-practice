public class TestDemo {
    public static void main(String[] args) {
        SeqList seqList = new SeqList();
        //顺序表的对象
        seqList.add(0,1);
        seqList.add(1,2);
        seqList.add(2,3);
        seqList.add(3,4);
        seqList.add(4,5);
        seqList.add(5,6);
        seqList.add(0,7);
        seqList.display();
        System.out.println("\n=====================");
        System.out.println(seqList.contains(5));
        System.out.println("=====================");
        System.out.println(seqList.search(7));
        System.out.println("=====================");
        int ret2 = seqList.getPos(5);
        if(ret2 == -1){
            System.out.println("位置不合法");
        }else{
            System.out.println(ret2);
        }
        System.out.println("=====================");
        seqList.setPos(6,99);
        seqList.display();
        System.out.println("\n=====================");
        seqList.remove(7);
        seqList.display();
        System.out.println("\n=====================");
        System.out.println(seqList.size());
        System.out.println("=====================");
        seqList.clear();
        seqList.display();
    }
}
