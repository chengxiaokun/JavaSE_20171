package java1702.javase.newoop;

/**
 * Created by mingfei.net@gmail.com
 * 4/7/17 08:44
 * https://github.com/thu/JavaSE_20171
 */
public class ParameterPassTest {

    private String s;

    private static void test(ParameterPassTest x) { // 形参
        System.out.println("b: " + x.s); // null
        x.s = "hello";
        System.out.println("c: " + x.s); // hello
    }

    public static void main(String[] args) {
        ParameterPassTest parameterPassTest = new ParameterPassTest();
        System.out.println("a: " + parameterPassTest.s); // null
        test(parameterPassTest); // 实参
        System.out.println("d: " + parameterPassTest.s); // ?
    }
}

/*
hi
hi
hello
hi

   101  102 103 104
---------------------
|      | | |     |
---------------------
 */
