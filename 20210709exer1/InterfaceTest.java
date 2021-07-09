package exer1;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        System.out.println("***************************");
        Flyable plane = new Plane();//多态
        plane.fly();
        plane.stop();

        System.out.println("***************************");
        Kite kite = new Kite();//多态
        kite.fly();
        kite.stop();

        System.out.println("***************************");
        Bullet bullet = new Bullet();
        bullet.fly();
        bullet.attack();
        bullet.stop();
    }
}
