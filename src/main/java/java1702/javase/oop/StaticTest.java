package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/22/17 08:47
 * JavaSE_20171
 */
public class StaticTest {
    // static 静态

    public static void main(String[] args) {
        ManKind tom = new ManKind();
//        tom.name = "Tom";
        tom.age = 18;
        tom.married = true;
        System.out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(tom.married);

        System.out.println("--------------");

        ManKind jerry = new ManKind();
        jerry.name = "Jerry";
//        jerry.age = 16;
//        jerry.married = true;
        System.out.println(jerry.name);
        System.out.println(jerry.age);
        System.out.println(jerry.married);
    }
}

class ManKind {
    public String name;
    public int age;
    public static boolean married;
}
