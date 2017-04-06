package java1702.javase.newoop;

/**
 * Created by mingfei.net@gmail.com
 * 4/6/17 10:28
 * https://github.com/thu/JavaSE_20171
 */
public final class FinalTest { // 终态类

    private final int i;

    public FinalTest(int i) {
        this.i = i;
    }

     public FinalTest() {
        i = 1;
     }

    public final void m() {
//        i = 1;
    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest(1);
    }

}

//class SubFinalTest extends FinalTest {
//    @Override
//    public void m() {
//        super.m();
//    }
//}
