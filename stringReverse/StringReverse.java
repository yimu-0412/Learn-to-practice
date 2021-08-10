package stringReverse;

/**
 * @author wangyimu
 * @create 2021-08-10-23:24
 * 将一个字符串进行反转。将字符串中指定部分进行 反转 。比如 ab cdef g 反转为 ab fedc g
 */
public class StringReverse {
    public String reverse(String str, int startIndex , int endIndex){
        if(str != null){
            char[] arr = str.toCharArray();
            for(int x = startIndex , y = endIndex; x < y; x ++,y --){
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    public String reverse1(String str, int startIndex , int endIndex){

        String reverseStr = str.substring(0,startIndex);
        for(int i = endIndex; i >= startIndex ; i --){
            reverseStr += str.charAt(i);
        }
        reverseStr += str.substring(endIndex + 1,str.length());
        return reverseStr;
    }

    public static void main(String[] args) {
        StringReverse rev = new StringReverse();
        String str = "abcdefgh";
        String ret = rev.reverse(str,2,5);
        String ret1 = rev.reverse1(str,2,5);
        System.out.println(ret1);
    }
}
