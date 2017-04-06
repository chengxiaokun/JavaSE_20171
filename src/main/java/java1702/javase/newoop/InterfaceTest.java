package java1702.javase.newoop;

/**
 * Created by mingfei.net@gmail.com
 * 4/6/17 14:36
 * https://github.com/thu/JavaSE_20171
 */
public interface InterfaceTest extends A, B, C, D {
     int ZERO = 0;
     void method();
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C {
    void c();
}

interface D {
    void d();
}

class InterfaceTestImpl implements InterfaceTest {
    @Override
    public void method() {
        System.out.println("method...");
    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }
}

class T {
    public static void main(String[] args) {
        InterfaceTestImpl interfaceTest = new InterfaceTestImpl();
        interfaceTest.method();
        interfaceTest.d();
    }
}
