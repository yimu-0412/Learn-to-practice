/**
 * @author wangyimu
 * @Program Day_20210821
 * @create 2021-08-24-23:10
 */
public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();

        CompareA.method1(); // 北京

        s.method2(); // 上海

        s.method3();
        System.out.println();

        s.myMethod();



    }


}

class SubClass extends SuperClass implements  CompareA, CompareB{
    @Override
    public void method2() {
        System.out.println("CompareA: 上海");
    }

    @Override
    public void method3() {
        System.out.println("CompareA: 深圳");
    }
    public void myMethod(){
        method3(); //调用自己定义的重写的方法 深圳
        super.method3(); // 调用的是父类中声明的 北京

        // 调用接口中默认的方法
        CompareA.super.method3(); // 天津
        CompareB.super.method3(); // 河北

    }
}


