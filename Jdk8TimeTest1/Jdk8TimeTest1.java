package jdkTimeApi;

import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author wangyimu
 * @create 2021-08-16-19:47
 */
public class Jdk8TimeTest {
    @Test
    public void test(){
        LocalDate localdate = LocalDate.now();
        LocalTime localtime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localdate); // 2021-08-16
        System.out.println(localtime); // 22:57:31.348
        System.out.println(localDateTime); // 2021-08-16T22:57:31.348
        System.out.println("*********************************");

        // of() :设置指定的年月日时分秒.没有偏移量
        LocalDateTime ldt = LocalDateTime.of(2021, 8, 16, 19, 57, 56);
        System.out.println(ldt); // 2021-08-16T19:57:56
        System.out.println("*********************************");

        /*
        *  getXxx()
        */
        // 获得月份天数 (1~31)
        System.out.println(ldt.getDayOfMonth()); // 16
        System.out.println("*********************************");

        // 获得年份天数(1~366)
        System.out.println(ldt.getDayOfYear()); // 228
        System.out.println("*********************************");

        // 获得星期几,返回一个 DayOfWeek 枚举值
        System.out.println(ldt.getDayOfWeek()); // MONDAY
        System.out.println("*********************************");

        // 获得月份,返回一个 Month 枚举值
        System.out.println(ldt.getMonth()); // AUGUST
        System.out.println("*********************************");

        //  获得月份(1~12)
        System.out.println(ldt.getMonthValue()); // 8
        System.out.println("*********************************");

        // 获得年份
        System.out.println(ldt.getYear()); // 2021
        System.out.println("*********************************");


        // 获得当前对象对应的小时、 分钟 、 秒
        System.out.println(ldt.getHour()); // 19
        System.out.println(ldt.getMinute()); // 57
        System.out.println(ldt.getSecond()); // 56
        System.out.println("*********************************");

       /*
       * 体现不可变性
       * withXxx():设置相关的属性
       * 将月份天数、年份天数、月份 、年份、小时修改为指定的值并返回新的对象
       */
        LocalDateTime ldt1 = ldt.withDayOfMonth(18);
        System.out.println(ldt); // 2021-08-16T19:57:56
        System.out.println(ldt1); // 2021-08-18T19:57:56
        System.out.println("*********************************");

        LocalDateTime ldt2 = ldt.withHour(22);
        System.out.println(ldt); // 2021-08-16T19:57:56
        System.out.println(ldt2); // 2021-08-16T22:57:56
        System.out.println("*********************************");

       /*
       * 向当前对象添加几天 、 几周 、 几个月 、 几年 、 几小时
       */

        LocalDateTime plusDays = ldt.plusDays(6);
        System.out.println(ldt); // 2021-08-16T19:57:56
        System.out.println(plusDays); // 2021-08-22T19:57:56
        System.out.println("*********************************");

        LocalDateTime weeks = ldt.plusWeeks(2);
        System.out.println(ldt); // 2021-08-16T19:57:56
        System.out.println(weeks); // 2021-08-30T19:57:56
        System.out.println("*********************************");

        LocalDateTime months = ldt.plusMonths(2);
        System.out.println(ldt); // 2021-08-16T19:57:56
        System.out.println(months); // 2021-10-16T19:57:56
        System.out.println("*********************************");

        LocalDateTime years = ldt.plusYears(2);
        System.out.println(ldt); // 2021-08-16T19:57:56
        System.out.println(years); // 2023-08-16T19:57:56
        System.out.println("*********************************");

        LocalDateTime hours = ldt.plusHours(3);
        System.out.println(ldt); // 2021-08-16T19:57:56
        System.out.println(hours); // 2021-08-16T22:57:56
        System.out.println("*********************************");

        /*
        * 从当前对象减去几月 、 几周 、 几 天 、 几年 、 几小时
        * */

        LocalDateTime months1 = ldt.minusMonths(2);
        System.out.println(ldt); // 2021-08-16T19:57:56
        System.out.println(months1); // 2021-06-16T22:57:56
        System.out.println("*********************************");
    }
}