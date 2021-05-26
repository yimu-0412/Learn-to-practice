public class StringReplace {
    /*
    * 注意事项: 由于字符串是不可变对象, 替换不修改当前字符串, 而是产生一个新的字符串.
    */
    public static void main(String[] args) {
        String name = "wangyimu";

        //替换所有指定内容
        System.out.println(name.replaceAll("wangyimu", "wangzhike"));
        System.out.println("=====================");

        //从首字符开始替换指定内容
        System.out.println(name.replaceFirst("wang", "liu"));
    }
}