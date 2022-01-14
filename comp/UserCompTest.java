package comp;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wangyimu
 * @Program 2022
 * @create 2022-01-14-14:53
 */
public class UserCompTest {
    public static void main(String[] args) {
        User user1 = new User("花花", 12);
        User user2 = new User("哈哈", 23);

        System.out.println(user1.compareTo(user2));

        ArrayList list = new ArrayList();
        list.add(user1);
        list.add(user2);
        
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
