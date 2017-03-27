package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/24/17 11:23
 * JavaSE_20171
 */
public class PrimitiveTest {

    private String s;

    // java.lang.String FQN
    private static void method(PrimitiveTest primitiveTest) { // 值传递
        System.out.println("b: " + primitiveTest.s); // hello
        primitiveTest.s = "hi";
        System.out.println("c: " + primitiveTest.s); // hi
    }

    public static void main(String[] args) {
        PrimitiveTest primitiveTest = new PrimitiveTest();
        primitiveTest.s = "hello"; // 0
        System.out.println("a: " + primitiveTest.s); // hello
        method(primitiveTest);
        System.out.println("d: " + primitiveTest.s); // hello
    }
}
