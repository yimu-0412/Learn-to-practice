/*
*
*  信息的封装和隐藏：
*  Java中通过将数据声明为私有的(private)，再提供公共的（public）
*   方法:
*     getXxx()和setXxx()实现对该属性的操作，以实现下述目的：
*        隐藏一个类中不需要对外提供的实现细节；
*        使用者只能通过事先定制好的方法来访问数据，可以方便地加入控制逻辑，
*     限制对属性的不合理操作；
*        便于修改，增强代码的可维护性；
*
*/


class Animal {
    // 将属性legs定义为private，只能被Animal类内部访问
    private int legs;
    public void setLegs(int i){
        if (i != 0 && i != 2 && i != 4) {
            System.out.println("Wrong number of legs!");
              return;
        }
        legs = i;
    }
    // 在这里定义方法 eat() 和 move()
    public void eat(){
        System.out.println("Eating");
    }
    public void move(){
        System.out.println("Moving.");
    }
    public int getLegs() {
        return legs;
    }
}
public class Zoo {
    public static void main(String args[]) {
        Animal xb = new Animal();
        xb.setLegs(4); // xb.setLegs(-1000); //xb.legs = -1000; // 非法
        System.out.println(xb.getLegs());
        xb.eat();
        xb.move();
    }
}