package java1702.javase.newoop;

import java1702.javase.oop.StaticTest;

import static java.lang.System.out; // JDK 1.5

/**
 * Created by mingfei.net@gmail.com
 * 4/6/17 11:19
 * https://github.com/thu/JavaSE_20171
 */

// class = fields + methods
public class Mankind implements Swim, Fly {
    // 面向接口 架构师
    // static 静态 ; dynamic 动态\ [daɪ'næmɪk]

    private static final int ONE_TWO_THREE = 123; // 常量

    public Mankind(String name) {
        System.out.println(name + " constructor...");
    }

    static {
        System.out.println("static block...");
    }

    @Override
    public void swimming() {
        System.out.println("...");
    }

    @Override
    public void flying() {
        System.out.println("...");
    }

    class A {} // Inner class 内部类

    String name;
    static String earth; // 地球

    public void study() {
        System.out.println(name + " is studying...");
    }
}

interface Swim {
    void swimming();
}

interface Fly {
    void flying();
}


class NewTest {

    private int i;

    public static void main(String[] args) {
        NewTest newTest = new NewTest();
        newTest.i = 0;
        Boolean b;

        Mankind tom = new Mankind("Tom");
        tom.name = "Tom";
        Mankind.earth = "Tom 种了一棵树";
//        out.println(tom.name);
//        out.println(Mankind.earth);

        Mankind jerry = new Mankind("Jerry");
        jerry.name = "Jerry";
//        out.println(jerry.name);
//        out.println(Mankind.earth);

//        out.println(Math.pow(2, 31));

        Swim swimmer = new Mankind("Zhangsan");
        swimmer.swimming();
    }
}
