import javax.swing.*;

/**
 * @author wangyimu
 * @Program 面试题
 * @create 2021-08-26-21:24
 */
public class ForEachExer {
    public static void main(String[] args) {
        String[] arr = new String[]{"haha","haha","haha"};

        // 方式一:普通遍历
        for(int i = 0; i < arr.length; i ++){
             arr[i] = "huahua";
        }

        for(String str : arr){
            System.out.print(str + " ");
        }

        System.out.println();
        System.out.println("*********************************");

        // 方式二:
        for(String s : arr){
            s = "huihui";
        }

        for(String str : arr){
            System.out.print(str + " ");
        }
    }
}
