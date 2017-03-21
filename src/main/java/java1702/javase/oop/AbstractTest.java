package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/21/17 08:46
 * JavaSE_20171
 */

// class = field + method
public abstract class AbstractTest { // 抽象类
    // abstract adj.\ 抽象的；深奥的

    private int i; // modifier 修饰符\ ['mɒdɪfaɪə]

    public abstract void method();

    public static void main(String[] args) {
//        AbstractTest abstractTest = new AbstractTest(); // instantiated 实例化
        SubAbstractTest subAbstractTest = new SubAbstractTest();
        System.out.println(subAbstractTest); // java1702.javase.oop.SubAbstractTest@...
        subAbstractTest.method();
    }
}

class SubAbstractTest extends AbstractTest {
    // implement 实现
    @Override
    public void method() {
        System.out.println("in SubAbstractTest...");
    }
}
