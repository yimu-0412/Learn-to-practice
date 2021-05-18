import java.util.Scanner;
public class Test20210412{
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