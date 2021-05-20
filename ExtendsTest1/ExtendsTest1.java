class Animal{
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food + " anmiaml"  );
    }
}

// Cat.java
class Cat extends Animal{
    public Cat(String name) {
        //super 来调用父类的构造器
        super(name);
    }

    public void eat(String food) {
        //super调用父类的方法.
//        super.eat(food);
        System.out.println(this.name + "正在吃" + food + " cat" );
    }
}

// Bird.java
class Bird extends Animal{

    public Bird(String name) {
        //super 来调用父类的构造器
        super(name);
    }
    public void fly() {
        System.out.println(this.name + "正在飞︿(￣︶￣)︿");
    }
}
public class ExtendsTest1 {
    public static void func(Animal animal){
        System.out.println( animal.name + "正在跑！");
    }
    public static Animal func1(){
        Cat cat = new Cat("花花1");
        return cat;
    }
    public static void main(String[] args) {
        //向上转型：直接赋值
        Animal animal = new Cat("花花");
        //向上转型：方法传参
        Cat cat = new Cat("花花");
        func(cat);
        //向上转型：方法返回
        Animal ret = func1();
        System.out.println(ret.name + "正在吃老鼠！");
        System.out.println("===========================");

        //向下转型
        Animal animal1 = new Bird("灰灰");
        //父类引用子类的时候，必须进行强制类型转换
        Bird bird = (Bird)animal1;
        bird.eat("虫子");
        bird.fly();
        Animal animal2 = new Cat("小猫");
        if (animal instanceof Bird) {
            Bird bird1 = (Bird)animal;
            bird1.fly();
        }
        System.out.println("===========================");

        Animal animal3 = new Cat("花花1");
        animal3.eat("猫粮！");
    }
}