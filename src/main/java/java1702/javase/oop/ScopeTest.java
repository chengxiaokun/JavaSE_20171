package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/24/17 08:47
 * JavaSE_20171
 */
public class ScopeTest {
    // scope 范围


    public void method() {
        i = 0;

        int j = 1; // local variable 局部变量
        System.out.println(j);

        for (int k = 0; k < 10; k++) {
             j = 2;
            System.out.println(j);
        }
        for (int k = 0; k < 10; k++) {
        }


    }


    private int i;
}
