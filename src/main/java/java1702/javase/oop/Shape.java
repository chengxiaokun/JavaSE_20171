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

    public CircleTest(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double getArea() {
        return pi * Math.pow(radius, 2);
    }
}

class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if ((a + b) > c && (b + c) > a && (c + a) > b) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("error.");
            System.exit(0);
        }
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return s * Math.sqrt((s - a) * (s - b) * (s - c)); // 海伦公式
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());

        CircleTest circleTest = new CircleTest(6.0);
//        circleTest.getPerimeter();
        System.out.println(circleTest.getPerimeter());
        System.out.println(circleTest.getArea());
    }
}