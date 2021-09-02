/**
 * @author wangyimu
 * @Program
 *  MyDate类包含:
 *      private成员变量year,month,day；并为每一个属性定义 getter, setter 方法；
 * @create 2021-08-28-22:17
 */
public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate { " +
                "year = " + year +
                ", month = " + month +
                ", day = " + day +
                '}';
    }

    //
    @Override
    public int compareTo(MyDate o) {
        int minYear = this.getYear() - o.getYear();
        if(minYear != 0){
            return minYear;
        }

        int minMonth = this.getMonth() - o.getMonth();
        if(minMonth != 0){
            return minMonth;
        }

        return this.getDay() - o.getDay();
    }
}
