/**
 * @author wangyimu
 * @create 2021-08-14-22:14
 * 将一个字符串进行反转。将字符串中指定部分进行 反转 。比如" ab cdef g "反转为 "ab fedc g"
 */
public class StringReverse {
    // 方式一
    public String reverse(String str,int startIndex,int endIndex){
        if(str != null){
            char[] arr = str.toCharArray();
            for(int x = startIndex,y =  endIndex ; x < y; x ++ ,y --){
                char tmp = arr[x];
                arr[x] = arr[y];
                arr[y] = tmp;
            }
            return new String(arr);
        }
        return null;
    }

    // 方式二
    public String reverse1(String str,int startIndex,int endIndex){
        String revStr = str.substring(0,startIndex);
        for(int i = endIndex; i >= startIndex; i --){
            revStr += str.charAt(i);
        }
        revStr += str.substring(endIndex + 1);
        return revStr;
    }

    public static void main(String[] args) {
        StringReverse rev = new StringReverse();
        String str = "abcdefg";
        String ret = rev.reverse2(str,2,5);
        System.out.println(ret);
    }

    // 方式三
    public String reverse2(String str,int startIndex,int endIndex){
        if(str != null){
            StringBuilder builder = new StringBuilder(str.length());
            // 第一部分
            builder.append(str.substring(0,startIndex));
            // 第二部分
            for(int i = endIndex; i >= startIndex; i --){
                builder.append(str.charAt(i));
            }
            // 第三部分
            builder.append(str.substring(endIndex + 1));
            return builder.toString();
        }

        return null;
    }
}