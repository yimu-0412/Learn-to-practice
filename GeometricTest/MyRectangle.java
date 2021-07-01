package exer3;


// MyRectangle 代表矩形
public class MyRectangle extends  GeometricObject{
    private double width;
    private double hight;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public MyRectangle(double width,double hight,String color, double weight) {
        super(color, weight);
        this.width = width;
        this.hight = hight;
    }

    //计算矩形的表面积
    public double findArea(){
        return width * hight;
    }
}
