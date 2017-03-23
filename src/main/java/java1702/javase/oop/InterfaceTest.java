package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/23/17 08:59
 * JavaSE_20171
 */
public interface InterfaceTest extends A, B, C, D { // 被实现的 implements

     int ONE = 1;

     void m();

}

interface A{
    void a();
}

interface B{

    void b();
}

interface C{
    void c();
}

interface D{
    void d();
}

class InterfaceTestImpl implements InterfaceTest {

    @Override
    public void m() {

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


