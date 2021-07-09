package exer1;

public class Bullet implements Flyable,Attack {
    @Override
    public void attack() {
        System.out.println("子弹通过火药飞行");
    }

    @Override
    public void fly() {
        System.out.println("子弹击中目标停止");
    }

    @Override
    public void stop() {
        System.out.println("子弹击中目标");
    }
}
