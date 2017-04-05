package java1702.javase.newoop;

/**
 * Created by lan on 2017/4/5.
 */
public class SuperClass {
    int i;

    public void method() {
        System.out.println("method...");
    }
}

class SubClass extends SuperClass {
    private boolean b;

    public void m() {
        System.out.println("m...");
    }

    public boolean getB() {
        return b;
    }
}

class Test {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        System.out.println(superClass.i);
        superClass.method();

        SubClass subClass = new SubClass();
        System.out.println(subClass.i);
        System.out.println(subClass.getB());
        subClass.method();
        subClass.m();
    }
}