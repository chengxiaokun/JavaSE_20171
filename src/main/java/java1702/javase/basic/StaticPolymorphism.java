package java1702.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 3/17/17 08:49
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

//        System.out.println(calculatorTest.add(1, 2, 3));
        System.out.println(calculatorTest.add(1d, 2));
    }
}

class CalculatorTest {

    public int add(int x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(int x, double y) {
        return 0d;
    }

    public double add(double y, int x) {
        return 1d;
    }
}