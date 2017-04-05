package java1702.javase.oop;

import java1702.javase.exercise.E2;
import java1702.javase.newoop.AccessModifierTest;

/**
 * Created by mingfei.net@gmail.com
 * 3/20/17 08:48
 */
public class DefaultClass extends AccessModifierTest {
    // Alt + Insert / Command + N

    // private default protected public
    private int i; // 访问限定修饰符 数据类型 域的名字；

    // default
    protected void method() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        DefaultClass defaultClass = new DefaultClass();
        System.out.println(defaultClass.i);
    }
}

class DefaultClassTest {

    public boolean b;

    public static void main(String[] args) {
        DefaultClass defaultClass = new DefaultClass();
//        System.out.println(defaultClass.i);
    }
}
