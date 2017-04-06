package java1702.javase.newoop;

/**
 * Created by mingfei.net@gmail.com
 * 4/6/17 16:33
 * https://github.com/thu/JavaSE_20171
 */
public class ScopeTest {
    // scope 范围\ [skəʊp]

    public void m(String s) {
        System.out.println(i);

        int j = 0; // locale variable
        System.out.println(j);

        method();

        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }

        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }

        int i = 1;
        System.out.println(ScopeTest.i);
    }

    public static void method() {
    }


    private static int i; // field
}
