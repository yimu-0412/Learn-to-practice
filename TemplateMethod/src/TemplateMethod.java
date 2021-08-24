/**
 * @author wangyimu
 * @Program Day_20210821
 * @create 2021-08-24-22:41
 */
public class TemplateMethod {

    public void code(){

    }

    // 代码执行所需要花费的时间
    public void spendTime(){
        long start = System.currentTimeMillis();
        this.code();
        long end = System.currentTimeMillis();

        System.out.println("花费的时间为: " + (end - start));

    }

    public static void main(String[] args) {
        TemplateMethod tmeplate = new TemplateMethod();
        tmeplate.spendTime();
    }
}

class SubTemplateMethod extends TemplateMethod{

    @Override
    public void code() {
        for(int i = 2; i <= 1000; i ++ ){
            boolean isFlag = true;
            for(int j = 2; j <= Math.sqrt(i); j ++){
                if(i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }
        }
    }
}
