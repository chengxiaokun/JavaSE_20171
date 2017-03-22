package java1702.javase.oop;

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
        System.out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(ManKind.earth);

        System.out.println("--------------");

        ManKind jerry = new ManKind();
        jerry.name = "Jerry";
//        jerry.age = 16;
//        jerry.earth = "jerry...";
        System.out.println(jerry.name);
        System.out.println(jerry.age);
        System.out.println(ManKind.earth);
    }
}

class ManKind { // 人类只有一个地球
    public String name;
    public int age;
    public static String earth; // 地球
}
