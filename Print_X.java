import java.util.*;
public class Print_X{
    public static void main(String[] args){
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
}