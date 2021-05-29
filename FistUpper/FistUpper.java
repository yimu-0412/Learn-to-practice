/*
*  首字母大写实现
*/
public class FistUpper {
    public static String firstUpper(String str){
        if("".equals(str) || str == null){
            return str;
        }
        if(str.length() > 1){
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
        //字符串长度为1
        return str.toUpperCase();
    }
    public static void main(String[] args) {
        String name = "beiweixiaoxiang";
        System.out.println(firstUpper(name));;
    }
}