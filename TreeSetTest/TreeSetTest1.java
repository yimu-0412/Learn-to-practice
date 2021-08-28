

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author wangyimu
 * @Program Day_20210828
 * @create 2021-08-28-16:44
 */
public class TreeSetTest1 {

    public static void main(String[] args) {
        Comparator com = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person)o1;
                    Person p2 = (Person)o2;
                    return Integer.compare(p1.getAge(),p2.getAge());

                }else{
                    throw new RuntimeException("输入年龄不匹配!");
                }

            }
        };

        Set treeSet = new TreeSet(com);
        treeSet.add(new Person("AA",22));
        treeSet.add(new Person("TT",24));
        treeSet.add(new Person("UU",75));
        treeSet.add(new Person("UU",78));
        treeSet.add(new Person("LL",78));
        treeSet.add(new Person("EE",23));
        treeSet.add(new Person("HH",24));


        int size = treeSet.size();
        System.out.println(size);
        System.out.println(  );

        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
