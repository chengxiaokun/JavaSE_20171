package java1702.javase.basic;

import java1702.javase.oop.DefaultClass;
import java1702.javase.oop.SubClass;

/**
 * Created by user
 */

public class Test extends DefaultClass {
    public static void main(String[] args) {
//        Human tom = new Human(); // 【new + 一个类的构造方法】 对象 实例 实例对象 object instance
//        System.out.println(tom.name); // name null
//
//        Human jerry = new Human("Jerry", 1.6, false, 'F', 18, 40);
//        System.out.println(jerry.name);
//        jerry.study();
//        jerry.sing(1d, false); // Ctrl + P / Command + P (Parameter)
//
//        int i = 0;
//
//        String s = new String("test"); // "test";

        DefaultClass defaultClass = new DefaultClass();
//        System.out.println(defaultClass.i); // 0
//        defaultClass.method();

        Test test = new Test();
        test.method();

    }
}

class ExtendsTest {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println(subClass.i); // ?
        subClass.m1();
        subClass.m2();
    }
}
