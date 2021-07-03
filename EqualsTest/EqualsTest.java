/*
*  请根据以下代码自行定义能满足需要的 MyDate 类 在 MyDate 类中覆盖equals 方法，
*  使其判断当两个方法，使其判断当两个 MyDate 类型对象的年月日都相同时，结果为 true ，
*  否则为 false 。 public boolean equals(Object o
*/
class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof MyDate){
            MyDate o1 = (MyDate)o;
            return this.day == o1.day && this.month == o1.month &&
                    this.year == o1.year;
        }
        return false;
    }
}

public class EqualsTest {
    public static void main(String[] args ){
        MyDate m1 = new MyDate(14, 3, 1976);
        MyDate m2 = new MyDate(14, 3, 1976);
        if (m1 == m2 ){
            System.out.println("m1==m2");
        }else {
            System.out .println ("m1!= m2"); // m1 != m2
        }

        if( m1 .equals(m2) ){
            System.out .println ("m1 is equal to m2 "); // m1 is equal to m2
        } else{
            System.out.println ("m1 is not equal to m2");
        }
    }

}