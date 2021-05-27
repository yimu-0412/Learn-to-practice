

/*
*  检查两个字符串是否相等
*/

public class ArrayStringsAreEqual {
    public static boolean arrayStringsAreEqual(String[] word1,String[] word2){
        if((word1 == null && word2 == null) ||(word1.length == 0 && word2.length == 0)){
            return true;
        }
        if(word1 == null || word2 == null){
            return false;
        }
        if(word1.length == 0 || word2.length == 0){
            return false;
        }
        String str1 = "";
        for(int i = 0;i < word1.length;i ++){
            str1 += word1[i];
        }

        String str2 = "";
        for(int i = 0;i < word2.length;i ++){
            str2 += word2[i];
        }
        return str1.equals(str2);
    }
    public static void main(String[] args) {
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
