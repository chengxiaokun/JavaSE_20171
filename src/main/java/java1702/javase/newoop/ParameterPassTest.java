package java1702.javase.newoop;

/**
 * Created by mingfei.net@gmail.com
 * 4/7/17 08:44
 * https://github.com/thu/JavaSE_20171
 */
public class ParameterPassTest {

    private static void test(int x) { // 形参
        System.out.println("b: " + x); // 0
        x++;
        System.out.println("c: " + x); // 1
    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println("a: " + i); // 0
        test(i); // 实参
        System.out.println("d: " + i); // 0
    }
}
