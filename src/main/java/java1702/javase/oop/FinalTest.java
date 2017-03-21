package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/21/17 14:02
 * JavaSE_20171
 */
public final class FinalTest {
    // final 最后的 最终的 终态

    private final int i;

    private  double d = 1d;

    public FinalTest(int i, double d) {
        this.i = i;
        this.d = d;
    }

    public FinalTest() {
        i = 0;
    }

    public final void method() {

    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
        System.out.println(finalTest.i);
//        finalTest.i = 1;
    }
}

/*
class SubFinalTest extends FinalTest {
    @Override
    public void method() {
        super.method();
        // ...
    }
}
*/
