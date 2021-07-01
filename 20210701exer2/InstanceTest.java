package exer2;

public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Student());

    }
    public void method(Person e){
        //虚拟方法调用
        String info = e.getInfo();
        System.out.println(info);
        System.out.println();
        if(e instanceof Graduate){
            System.out.println("a graduated student");
            System.out.println("“a student”");
            System.out.println("“a person”");
        }else if(e instanceof Student){
            System.out.println("“a student”");
            System.out.println("“a person”");
        }else{
            System.out.println("“a person”");
        }
    }
}
