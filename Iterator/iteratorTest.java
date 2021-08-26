import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author wangyimu
 * @Program 使用迭代器 Iterator 接口遍历集合元素
 *    1.内部方法:hasNext()和 next()方法交替使用
 *    2.集合 对象每次调用 iterator() 方法都得到一个全新的迭代器对象 ，默认游标都在集合
 * 的第一个元素
 *    3.内部定义了 remove() ,可以在遍历的时候删除集合中的元素,此方法不同于集合中的remove()
 * @create 2021-08-26-20:15
 */

class Person{
   private String name;
   private int age;

   public Person() {
   }

   public Person(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   @Override
   public String toString() {
      return "person{" +
              "name='" + name + '\'' +
              ", age=" + age +
              '}';
   }
}

public class iteratorTest {
    @Test
    public void test(){
       Collection coll = new ArrayList();
       coll.add(123);
       coll.add(456);
       coll.add(new String("tom"));
       coll.add(new Person("Tom",23));
       coll.add(false);

       Iterator iterator = coll.iterator();

       // 方式一
       /*

       System.out.println(iterator.next());
       System.out.println(iterator.next());
       System.out.println(iterator.next());
       System.out.println(iterator.next());
       System.out.println(iterator.next());
       System.out.println(iterator.next());
       // 报异常
       System.out.println(iterator.next());

       */

       // 方式二: 不推荐
       /*
       for(int i =0;i < coll.size(); i ++){
          System.out.println(iterator.next());
       }
       */

       // 方式三: 推荐
       // hasNext():判断是否还有下一个元素
       while(iterator.hasNext()){
          // next(): 指针下移 将下移以后集合位置上的元素打印出来
          System.out.println(iterator.next());
       }

    }

    // 测试 Iterator接口的 remove()
    // 如果还未调用next()或在上一次调用 next 方法之后已经调用了 remove 方法，
    //  再调用remove都会报IllegalStateException。
    @Test
   public void test1(){
       Collection coll = new ArrayList();
       coll.add(123);
       coll.add(456);
       coll.add(new String("tom"));
       coll.add(new Person("Tom",23));
       coll.add(false);

       Iterator iterator = coll.iterator();

       // 删除集合中的 tom
       while(iterator.hasNext()){
          Object o = iterator.next();
          if("tom".equals(o)){
             iterator.remove();
          }
       }

       iterator = coll.iterator();
       // 遍历集合
       while(iterator.hasNext()){
          System.out.println(iterator.next());
       }
    }
}

















































