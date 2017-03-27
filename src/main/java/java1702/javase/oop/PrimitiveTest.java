package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/24/17 11:23
 * JavaSE_20171
 */
public class PrimitiveTest {

    private String s;

    // java.lang.String FQN
    private static void method(PrimitiveTest test) { // 值传递
        System.out.println("b: " + test.s); // hello
        test.s = "hi";
        System.out.println("c: " + test.s); // hi
    }

    public static void main(String[] args) {
        PrimitiveTest primitiveTest = new PrimitiveTest();
        primitiveTest.s = "hello"; // 0
        System.out.println("a: " + primitiveTest.s); // hello
        method(primitiveTest);
        System.out.println("d: " + primitiveTest.s); // hello
    }
}
/*
值传递：地址传递
        形式参数 test -------------------------------|
                                                    |
        实际参数 primitiveTest -------------------> address


值传递
        形式参数 j -------------------> address2 0
                                                |
        实际参数 i -------------------> address1 0
 */
