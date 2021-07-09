package exer1;

public class Kite implements Flyable {
    @Override
    public void fly() {
        System.out.println("风筝通过风起飞");
    }

    @Override
    public void stop() {
        System.out.println("风筝自由落地");
    }
}
