
public class ValueTransferTest2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("m = " + data.m + " n = " + data.n);
        //交换两个变量值的操作
        ValueTransferTest2 test = new  ValueTransferTest2();
        test.swap(data);
        System.out.println("m = " + data.m + " n = " + data.n)

    }
    public void swap(Data data){
        int tmp = data.m;
        data.m = data.n;
        data.n = tmp;
    }

}
class Data{
    int m;
    int n;
}
