package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/20/17 13:57
 * JavaSE_20171
 */
public class PrivateField {
    private int x;
    private  int y;

    public int add() {
        return x + y;
    }

    public int divide() { // 除法
        return x / y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        if (y == 0) {
            System.out.println("y can not be zero!");
            return;
        }
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class PrivateFieldTest {
    public static void main(String[] args) {
        PrivateField privateField = new PrivateField();

        privateField.setX(1);
        privateField.setY(0);

//        privateField.y = 0;

        System.out.println(privateField.divide()); //
        System.out.println(privateField.add());
    }

    public void m1() {
        // ...
        m2();
        // ...
    }

    private void m2() { // private default protected public
        // ...
    }
}
