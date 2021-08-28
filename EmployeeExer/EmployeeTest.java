import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author wangyimu
 * @Program
 *  创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（下一章：TreeSet 需使用泛型来定义）
 *  分别按以下两种方式对集合中的元素进行排序，并遍历输出：
 *       1). 使Employee 实现 Comparable 接口，并按 name 排序
 *       2). 创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。
 * @create 2021-08-28-22:26
 */
public class EmployeeTest {

    //问题一:使 Employee 实现 Comparable 接口,并按照name排序
    @Test
    public void test1(){
        TreeSet set = new TreeSet();
        Employee e1 = new Employee("刘德华",60,new MyDate(1960,5,4));
        Employee e2 = new Employee("黄晓明",45,new MyDate(1978,7,4));
        Employee e3 = new Employee("马龙",30,new MyDate(1981,8,12));
        Employee e4 = new Employee("许昕",31,new MyDate(1980,10,24));
        Employee e5 = new Employee("张继科",29,new MyDate(1982,9,25));


        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    // 问题二:创建 TreeSet 时传入 Comparator 对象,按照生日日期排序
    @Test
    public void test2(){
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;

                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();

                    // 比较年
                    int minusYeaar = b1.getYear() - b2.getYear();
                    if(minusYeaar != 0){
                        return minusYeaar;
                    }

                    // 比较月
                    int minusMonth = b1.getMonth() - b2.getMonth();
                    if(minusMonth != 0){
                        return minusMonth;
                    }

                    // 比较日
                    return b1.getDay() - b2.getDay();
                }
                throw new RuntimeException("传入数据类型不一致");
            }
        });
        Employee e1 = new Employee("刘德华",60,new MyDate(1970,7,6));
        Employee e2 = new Employee("黄晓明",60,new MyDate(1970,7,4));
        Employee e3 = new Employee("马龙",30,new MyDate(1981,8,12));
        Employee e4 = new Employee("许昕",31,new MyDate(1980,10,24));
        Employee e5 = new Employee("张继科",29,new MyDate(1982,9,25));


        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
