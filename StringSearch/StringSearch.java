public class StringSearch {
    public static void main(String[] args) {
        String str = "wangyimu";

        //判断一个子字符串是否存在,boolean类型
        System.out.println(str.contains("mu"));
        System.out.println("====================");

        //从头开始查找字符串的位置，查到了返回位置的开始索引，如果查不到返回-1
        System.out.println(str.indexOf("mu1"));
        System.out.println(str.indexOf("mu"));
        System.out.println("====================");

        //从指定位置开始查找字符串位置，查到了返回位置的开始索引，如果查不到返回-1
        System.out.println(str.indexOf("mu", 2));
        System.out.println(str.indexOf("mu", 7));
        System.out.println("====================");

        //由后向前查找字符串位置,查到了返回位置的开始索引，如果查不到返回-1
        System.out.println(str.lastIndexOf("mu"));
        System.out.println(str.lastIndexOf("yiu"));
        System.out.println("====================");


        //从指定位置由后向前查找字符串位置,查到了返回位置的开始索引，如果查不到返回-1
        System.out.println(str.lastIndexOf("yi", 1));
        System.out.println(str.lastIndexOf("yi", 5));
        System.out.println("====================");

        //判断是否以指定字母开头,boolean类型
        System.out.println(str.startsWith("wang"));
        System.out.println(str.startsWith("yi"));
        System.out.println("====================");

        //从指定位置判断是否以指定字母开头,boolean类型
        System.out.println(str.startsWith("wang", 0));
        System.out.println(str.startsWith("wang", 2));
        System.out.println("====================");

        //是否以指定字符串结尾,boolean类型
        System.out.println(str.endsWith("mu"));
        System.out.println(str.endsWith("mu1"));
    }
}