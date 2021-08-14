/**
 * @author wangyimu
 * @create 2021-08-14-22:56
 * 获取一个字符串在另一个字符串中出现的次数。
 *      比如：获取“ ab 在 abkkcadkabkebfkabkskab ” 中 出现的次数
 */
public class StringCount {
    public int getCount(String mainStr,String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;

        if(mainLength >= subLength){
            // 方式一
            /*while((index = mainStr.indexOf(subStr)) != -1){
                count ++;
                mainStr = mainStr.substring(index + subStr.length());
            }*/
            // 方式二:对方式一的改进
            while((index = mainStr.indexOf(subStr,index)) != -1){
                count ++;
                index += subLength;
            }
            return count;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        StringCount c = new StringCount();
        String str1 = "abkkcadkabkebfkabkskab";
        String str2 = "ab";
        System.out.println(c.getCount(str1, str2));
    }
}