package java1702.javase.oop;

import static java.lang.System.out; // JDK 1.5
/**
 * Created by mingfei.net@gmail.com
 * 3/22/17 08:47
 * JavaSE_20171
 */
public class StaticTest {


    // static 静态

    private static int i;

    public static void m() {
//        this.i = 1;
//        super.toString();
//        static i  = 0;
    }

    public static void main(String[] args) {
//        StaticTest staticTest = new StaticTest();
//        staticTest.m();
        m();

        i = 1;

        ManKind tom = new ManKind();
//        tom.name = "Tom";
        tom.age = 18;
        ManKind.earth = "tom 种了一棵树";
//        ManKind.married = true;
        out.println(tom.name);
        out.println(tom.age);
        out.println(ManKind.earth);
        out.println(ManKind.married); // true
        out.println("--------------");

        ManKind jerry = new ManKind();
        jerry.name = "Jerry";
//        jerry.age = 16;
//        jerry.earth = "jerry...";
        ManKind.married = true;
        out.println(jerry.name);
        out.println(jerry.age);
        out.println(ManKind.earth);
        out.print(ManKind.married); // false
    }
}

class ManKind { // 人类只有一个地球
    public String name;
    public int age;
    public static String earth; // 地球
    public static boolean married;
}
