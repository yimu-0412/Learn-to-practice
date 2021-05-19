/*
*
* 继承的初步学习
*
*/

class Animal{
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }
}

// Cat.java
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
}

// Bird.java
 class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }
    public void fly() {
    System.out.println(this.name + "正在飞︿(￣︶￣)︿");
    }
}

public class ExtendsTest {
    public static void main(String[] args) {
        Cat cat = new Cat("花花");
        cat.eat("猫粮");
        Bird bird = new Bird("灰灰");
        bird.eat("虫子");
        bird.fly();
    }
}