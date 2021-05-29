public class StringOperation {
    public static void main(String[] args) {
        String str1 = " hello world hello earth ";
        //去掉字符串中的左右空格，保留中间的空格
        String trim = str1.trim();
        //trim()会去掉字符串开头和结尾的空白字符(空格, 换行, 制表符等).
        System.out.println(trim);
        System.out.println("=========================");

        //字符串转大写,只转换字母。
        String str2 = "hello world";
        String up = str2.toUpperCase();
        System.out.println(up);
        System.out.println("=========================");

        //字符串转小写,只转换字母。
        String lower = up.toLowerCase();
        System.out.println(lower);
        System.out.println("=========================");

        //字符串连接，等同于“+”，不入池
        String str3 = "hello world ";
        String str4 = "hello earth";
        String concat = str3.concat(str4);
        System.out.println(concat);
        System.out.println("=========================");

        // 获取字符串长度length()
        // 注意：数组长度使用数组名称.length属性，而String中使用的是length()方法
        int length = str1.length();
        System.out.println(length);
        System.out.println("=========================");

        //判断是否为空字符串，但不是null，而是长度为0
        String str5 = "";
        boolean isempty1 = str5.isEmpty();
        System.out.println(isempty1);
        boolean isempty2 = str1.isEmpty();
        System.out.println(isempty2);
    }
}