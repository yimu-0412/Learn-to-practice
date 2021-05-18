
/*
*   5.声明一个日期类型MyDate：有属性：年year,月month，日day。创建
*     2个日期对象，分别赋值为：你的出生日期，你对象的出生日期，并显示信息。
*/
class MyData{
    public int year;
    public int month;
    public int day;
}
public class MydataTest {
    public static void main(String[] args) {
        MyData mybirthday = new MyData();
        MyData girlfriend = new MyData();
        mybirthday.year = 1995;
        mybirthday.month = 4;
        mybirthday.day = 12;
        System.out.println("我的出生日期为：" + mybirthday.year
                +"年" + mybirthday.month + "月" + mybirthday.day + "日");
        girlfriend.year = 1998;
        girlfriend.month = 8;
        girlfriend.day = 28;
        System.out.println("女朋友的出生日期为：" + girlfriend.year
                +"年" + girlfriend.month +"月" + girlfriend.day + "日");

    }
}
