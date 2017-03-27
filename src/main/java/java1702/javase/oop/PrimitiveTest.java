package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/24/17 11:23
 * JavaSE_20171
 */
public class PrimitiveTest {

    private String s;

    // java.lang.String FQN
    private static void method(Integer integer) { // 值传递
        System.out.println("b: " + integer); // 0
        integer = new Integer(1);
        System.out.println("c: " + integer); // 1
    }

    public static void main(String[] args) {
        Integer integer = new Integer(0);
        System.out.println("a: " + integer); // 0
        method(integer);
        System.out.println("d: " + integer); // 0
    }
}
/*
值传递：地址传递
        形式参数 test ----------------------------> address
                                                     ^
        实际参数 primitiveTest -------------------> address


值传递：值本身
        形式参数 j -------------------> address2 0
                                                ^
        实际参数 i -------------------> address1 0
 */
