package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/21/17 09:45
 * JavaSE_20171
 */
// shape 形状\ [ʃeɪp] 三角形 四边形 正方形 矩形 圆型 ...

// 抽象类对其所有的子类做了限制和约束:必须实现抽象类的所有的抽象方法
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

class Quadrangle extends Shape {

    private double a;
    private double b;
    private double c;
    private double d;

    public Quadrangle(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }

    @Override
    public double getArea() {
        return 0;
    }
}

class Square extends Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public double getArea() {
        return width * height;
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

        Quadrangle quadrangle = new Quadrangle(1, 2, 3, 4);
        System.out.println(quadrangle.getPerimeter());

        Square square = new Square(123);
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());

        Rectangle rectangle = new Rectangle(1.2, 3.4);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());

        Shape shape = new Square(1); //
        System.out.println(shape.getPerimeter());
        System.out.println(shape.getArea());
    }
}