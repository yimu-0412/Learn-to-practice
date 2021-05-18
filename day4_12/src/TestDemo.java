import java.util.*;
public class TestDemo {
    public static void main1(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int n = scan.nextInt();
            for(int i = 0;i < n;i ++){
                for(int j = 0;j < n;j ++){
                    if(i == j){
                        System.out.print("*");
                    }else if(i == n - 1 -j){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数");
        int num = scan.nextInt();
        int count = 0;
        while(num != 0){
            for(int i = 0;i <= 32;i ++){
                if((num & 1) != 0){
                    count ++;
                }
                num = num >>>1;
            }
            System.out.println(count);
        }

    }



}
