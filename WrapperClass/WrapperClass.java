/**
 * @author wangyimu
 * @Program Day_20210821
 * @create 2021-08-22-22:31
 */
public class WrapperClass {
    public static void main(String[] args) {
        // 基本数据类型、包装类--->String:调用String重载的valueOf（XXX xxx）
        int n = 10;
        String s = String.valueOf(n);
        System.out.println(s);

        double d = 20.1;
        String s1 = String.valueOf(d);
        System.out.println(s1);

        boolean b = new Boolean("true");
        String s2 = String.valueOf(b);
        System.out.println(s2);

        System.out.println("******************");

        Integer n1 = new Integer(21);
        String s3 = String.valueOf(n1);
        System.out.println(n1);

        Double d1 = 32.5;
        String str = String.valueOf(d1);
        System.out.println(str);

        System.out.println("******************");

        // String--->基本数据类型、包装类:调用包装类的parseXxx(String s)
        String s4 = "14";
        Integer n2 = Integer.parseInt(s4);
        System.out.println(n2);

        String s5 = "32.7";
        Double d3 = Double.parseDouble(s5);
        System.out.println(d3);
        
    }
}
