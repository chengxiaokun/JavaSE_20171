package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/24/17 08:47
 * JavaSE_20171
 */
// scope 范围
public class ScopeTest {
    public void method() {
        int i = 1;
        System.out.println(this.i);
    }

    private int i;

    public static void main(String[] args) {
        ScopeTest scopeTest = new ScopeTest();
        scopeTest.method();
    }

    public void exceptionTest() {
        try {
            String s = "hello";
        } catch (Exception e) {

        } finally {
            s = "hi";
        }
    }
}
