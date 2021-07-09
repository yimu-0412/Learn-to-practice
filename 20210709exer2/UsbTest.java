package exer2;
/*
 * 接口的使用
 * 1.接口使用上也满足多态性
 * 2.接口，实际上就是定义了一种规范
 * 3.开发中，体会面向接口编程！
 *
 */
public class UsbTest {
    public static void main(String[] args) {
        Computer com = new Computer();

        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        com.transferData(flash);
        System.out.println("**************************");
        //2. 创建了接口的非匿名实现类的匿名对象
        com.transferData(new Printer());
        System.out.println("**************************");

        //3. 创建了接口的匿名实现类的非匿名对象
        Usb phone = new Usb(){

            @Override
            public void start() {
                System.out.println("MP3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("MP3结束工作");
            }
        };
        com.transferData(phone);
        System.out.println("**************************");

        //4. 创建了接口的匿名实现类的匿名对象
        com.transferData(new Usb() {
            @Override
            public void start() {
                System.out.println("MP4开始工作");
            }

            @Override
            public void stop() {
                System.out.println("MP4结束工作");
            }
         });
    }
}
