class Animal{
    public String name;
    public Animal(String name){
        this.name = name;
    }
}
interface IFlying {
    void fly();
}
interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}
class Cat extends Animal implements IRunning{
    public Cat(String name){
        super(name);
    }
    public void run(){
        System.out.println(this.name + "正在跑！");
    }
}
class Bird extends Animal implements IRunning,IFlying{
    public Bird(String name){
        super(name);
    }
    public void run(){
        System.out.println(this.name + "正在跑！");
    }

    @Override
    public void fly() {
        System.out.println(this.name + "正在飞！");
    }
}
class Duck extends Animal implements IRunning,IFlying,ISwimming {
    public Duck(String name) {
        super(name);
    }

    public void run() {
        System.out.println(this.name + "正在跑！");
    }

    @Override
    public void fly() {
        System.out.println(this.name + "正在飞！");
    }

    public void swim() {
        System.out.println(this.name + "会游泳！");
    }
}
class Robot implements IRunning{

    @Override
    public void run() {
        System.out.println("机器人正在跑！");
    }
}
public class MoreExtends {
    public static void funcIRun(IRunning irunning){
        irunning.run();
    }
    public static void funcIFly(IFlying iflying){
        iflying.fly();
    }
    public static void funcISwim(ISwimming iswimming){
        iswimming.swim();
    }

    public static void main(String[] args) {
        /*IRunning isrunning1 = new Cat("小猫");
        IRunning isrunning2 = new Bird("小鸟");
        IRunning isrunning3 = new Duck("小鸭子");*/

        funcIRun(new Cat("小猫"));
        funcIRun(new Bird("小鸟"));
        funcIRun(new Duck("小鸭子"));
        System.out.println("=====================");
        funcIFly(new Bird("小鸟"));
        funcIFly(new Duck("小鸭子"));
        System.out.println("=====================");
        funcISwim(new Duck("小鸭子"));
        System.out.println("=====================");
        funcIRun(new Robot());

    }
}