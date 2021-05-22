/*
*   1.private是否可以修饰构造方法？
*      可以修饰，但是这个构造方法只能在当前类中调用。具体实例为单例设计模式
*   2.使用多态的好处是什么?
*      (1) 类调用者对类的使用成本进一步降低.
*            封装是让类的调用者不需要知道类的实现细节.
*            多态能让类的调用者连这个类的类型是什么都不必知道, 只需要知道这个对象具有某个方法即可.
*      (2) 能够降低代码的 "圈复杂度", 避免使用大量的 if - else
*      (3) 可扩展能力更强.
*/
class Shape {
    public void draw() {
    // 啥都不用干
    }
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("□");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("♣");
    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("▲");
    }
}


public class Polypeptide {
    // 打印单个图形
    public static void drawShape(Shape shape) {
        shape.draw();
    }

    // (2) 能够降低代码的 "圈复杂度", 避免使用大量的 if - else
    public static void drawShapes1(){
        Rect rect = new Rect();
        Cycle cycle = new Cycle();
        Flower flower = new Flower();
        String[] shapes = {"cycle", "rect", "cycle", "rect", "flower"};
        for (String shape : shapes) {
            if (shape.equals("cycle")) {
                cycle.draw();
            } else if (shape.equals("rect")) {
                rect.draw();
            } else if (shape.equals("flower")) {
                flower.draw();
            }
        }
    }

    // 避免使用大量的 if - else
    public static void drawShapes(){
        Shape[] shapes1 = {new Cycle(), new Rect(), new Cycle(),
                          new Rect(), new Flower()};//向上转型
        for(Shape shape:shapes1){
            shape.draw();
        }
    }
    public static void main(String[] args) {
        drawShapes1();
        System.out.println("==========================" );
        drawShapes();
        System.out.println("==========================" );
        Shape shape1 = new Flower();
        Shape shape2 = new Cycle();
        Shape shape3 = new Rect();
        //多态利用的就是动态绑定
        drawShape(shape1);
        drawShape(shape2);
        drawShape(shape3);
        //(3) 可扩展能力更强.
        Shape shape4 = new Triangle();
        drawShape(shape4);
    }

}