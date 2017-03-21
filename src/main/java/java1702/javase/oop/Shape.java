package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/21/17 09:45
 * JavaSE_20171
 */
// shape 形状\ [ʃeɪp] 三角形 四边形 正方形 矩形 圆型 ...
public abstract class Shape {

    public abstract double getPerimeter();

    public abstract double getArea();
}


class CircleTest extends Shape {
    //    private double x;
//    private double y;
    private double pi = 3.14;
    private double radius;

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double getArea() {
        return pi * Math.pow(radius, 2);
    }
}