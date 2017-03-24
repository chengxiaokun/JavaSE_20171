package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/24/17 11:23
 * JavaSE_20171
 */
public class PrimitiveTest {

    private static void method(int i) {
        System.out.println("b: " + i); // 0
        i++;
        System.out.println("c: " + i); // 1
    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println("a: " + i); // 0
        method(i);
        System.out.println("d: " + i); // ?
    }
}
