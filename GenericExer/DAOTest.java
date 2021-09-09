package genericTest;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

/**
 * @author wangyimu
 * @Program
 *     定义一个测试类
 *         创建DAO类的对象，分别调用save、get、update、list、delete方法来操作User对象
 * @create 2021-09-09-20:04
 */
public class DAOTest {
    @Test
    public void Test(){
        DAO<User> dao = new DAO<>();
        dao.save("1",new User(1001,"周杰伦"));
        dao.save("2",new User(1002,"刘德华"));
        dao.save("3",new User(1003,"洪金宝"));
        dao.save("4",new User(1004,"吴京"));

        User user = dao.get("1");
        System.out.println(user);
        System.out.println();

        List<User> list = dao.list();
        Iterator<User> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        dao.update("1",new User(1001,"李连杰"));
        dao.delete("2");
        List<User> list1 = dao.list();
        Iterator<User> iterator1 = list1.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}