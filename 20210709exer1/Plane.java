package exer1;

public class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速行驶");
    }
}
