class Animal {
    // 将属性legs定义为private ，只能被Animal()类内部访问
    private int legs ;
    public void setLegs( int i ) {
        // 在这里定义方法 eat() 和 move()
        if(i != 0 && i != 2 && i != 4){
            System.out .println ("Wrong number of legs!");
            return;
        }
        legs = i;
    }
    public int getLegs() {
        return legs;
    }

    public void eat(){
        System.out .println ("Eating");
    }
    public void move(){
        System.out .println ("Moving");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setLegs(2);
        System.out.println(animal.getLegs());
        animal.setLegs(12);
        animal.eat();
        animal.move();
    }
}