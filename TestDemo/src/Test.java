import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test {
    public static void main1(String[] args) {
        System.out.println(10%3);
        System.out.println(10%-3);
        System.out.println(-10%3);
        System.out.println(-10%-3);
    }
    public static void main2(String[] args) {
        System.out.println(11.5%2);
        System.out.println(10/0);
    }

    //复合运算符;+= -= *= /=  都会进行一次强制类型转换
    public static void main3(String[] args) {
        int a = 10;
        a += 2;
        System.out.println(a);
        short b = 2;
        b += 2;//b = (short) (b + 2);
        System.out.println(b);
    }


    public static void main4(String[] args) {
        int a = 10;
        a++;
        //int b = a++;
        int c = ++a;
        System.out.println(a);
        //System.out.println(b);
        System.out.println(c);
    }

    //返回值布尔类型的
    public static void main5(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a != b);
        System.out.println(a <= b);
        System.out.println(a >= b);
    }

    //返回值布尔类型的
    public static void main6(String[] args) {
        System.out.println(10>20&&10/0==0);//false
        System.out.println(10<20||10/0==0);//true
        System.out.println(!true);//false
        System.out.println(!false);//true
        System.out.println(10<20|10/0==0);//程序抛出异常
        System.out.println(10<20&10/0==0);//程序抛出异常
    }

    public static void main7(String[] args) {
        System.out.println(5/2);
        System.out.println((float)5/2);
        System.out.println(5/(float)2);
        System.out.println((float)(5/2));
    }

    public static void main8(String[] args) {
        System.out.println(11&13);
        System.out.println(11|13);
        System.out.println(11^13);
        System.out.println(~1);
        int a = 0xf;
        System.out.printf("%x\n",~a);
        System.out.print("hello world ");
        System.out.println("hello world");
    }

    //移位运算符
    public static void main9(String[] args) {
        int a = 11;
        int b = a << 1;
        System.out.println(b);
        System.out.println(-1<<2);
        System.out.println(-1>>1);//相当于除法
        System.out.println(-1>>>1);//无符号右移--  统一补0
    }

    public static void main(String[] args) {
         int a = 10;
         int b = 20;
         int c = 30;
         int max1 = a > b ? a : b;
         int max2 = max1 > c? max1 : c;
        System.out.println(max2);
         int max = a > (b > c ? b : c) ? a :(b > c ? b : c);
        System.out.println(max);

    }


}

