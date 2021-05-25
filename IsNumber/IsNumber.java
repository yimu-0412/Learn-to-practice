public class IsNumber {
    public static void main(String[] args) {
        String str = "12345123";
        System.out.println(isNumber(str));
    }

    public static boolean isNumber(String str) {
        char[] chs = str.toCharArray();
        for(int i = 0;i < chs.length;i ++){
            if(chs[i] < '0' || chs[i] > '9'){
                return false;
            }
        }
        return true;
    }

}