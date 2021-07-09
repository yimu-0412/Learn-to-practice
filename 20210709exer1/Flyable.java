package exer1;

public interface Flyable {
    //全局常量
    public static final int MAX_SPEED = 7900;
    ////省略了public static final
    int MIN_SPEED = 1;

    //抽象方法
    public abstract void fly();
    //省略了public abstract
    void stop();

}
