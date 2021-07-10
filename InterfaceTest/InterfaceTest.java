/*
 * interface CompareObject{
	public int compareTo(Object o);
	//若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
*/

interface CompareObject {
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo (Object o);
}


/*
 * 定义一个Circle类，声明radius属性，提供getter和setter方法
*/
class Circle {
    private Double redius;

    public Circle() {
    }

    public Circle(double redius) {
        this.redius = redius;
    }

    public Double getRedius() {
        return redius;
    }

    public void setRedius(Double redius) {
        this.redius = redius;
    }
}

/*
 * 定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。
 * 在ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半径大小。
*/

class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle(double redius) {
        super(redius);
    }

    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o;
            //方法一：
           /* if(this.getRedius() > c.getRedius()){
                return 1;
            }else if(this.getRedius() < c.getRedius()){
                return -1;
            }else{
                return 0;
            }*/

            //当属性radius声明为Double类型时，可以调用包装类的方法
            //方法二：
            return this.getRedius().compareTo(c.getRedius());
        } else{
            throw new RuntimeException("传入数据有误");
        }
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 =  new ComparableCircle(2.1) ;
        ComparableCircle c2 =  new ComparableCircle(5) ;

        int intValue = c1.compareTo(c2);
        if(intValue ==1){
            System.out.println("c1大");
        }else if(intValue == -1){
            System.out.println("c2大");
        }else{
            System.out.println("c1和c2一样大");
        }
    }

}
