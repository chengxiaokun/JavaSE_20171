package java1702.javase.newoop;
// ctrl + alt + o (optimize) SEO search engine optimize
/**
 * Created by lan on 2017/4/5.
 */
public class SuperClass {
    int i;

//    public SuperClass(){
//
//    }

    public SuperClass(int i) {
        this.i = i;
        System.out.println("in super class constructor...");
    }

    void method() {
        System.out.println("method...");
    }
}

class SubClass extends SuperClass {
    private boolean b;

    public SubClass(int i, boolean b) {
//        super(); // { }
        super(i);
        this.b = b;
        System.out.println("in sub class constructor...");
    }

    public void m() {
        System.out.println("m...");
    }

    public void method(int i) {
        System.out.println("test...");
//        super.method();
    }

    public void method() {
//        super.method();
    }

    public boolean getB() {
        return b;
    }
}

class Test {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(1);
//        System.out.println(superClass.i); // 1
//        superClass.method();
        AccessModifierTest accessModifierTest = new AccessModifierTest();
        System.out.println(accessModifierTest.d);
        SubClass subClass = new SubClass(1,true);
//        System.out.println(subClass.i); // 1 2
//        System.out.println(subClass.getB());
        subClass.method();
        subClass.method(1);
//        subClass.m();


    }
}