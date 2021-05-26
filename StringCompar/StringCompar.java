public class StringCompar {
    public static void main(String[] args) {
        String str = "hello world";
        String str1 = "Hello world";

        //区分大小写的比较
        System.out.println(str.equals(str1));

        //不区分大小写的比较
        System.out.println(str.equalsIgnoreCase(str1));

        /*
        *  比较两个字符串大小关系：
        *     字符串的比较大小规则, 总结成三个字 "字典序" 相当于判定两个字
        *  符串在一本词典的前面还是后面. 先比较第一 个字符的大小(根据 unicode 的值来判定),
        *  如果不分胜负, 就依次比较后面的内容
        * 1. 相等：返回0
        * 2. 小于：返回内容小于0
        * 2. 大于：返回内容大于0
        */
        int ret = str.compareTo(str1);
        System.out.println(ret);
    }
}