package java1702.javase.newoop;

import java1702.javase.oop.StaticTest;

/**
 * Created by mingfei.net@gmail.com
 * 4/6/17 11:19
 * https://github.com/thu/JavaSE_20171
 */
public class Mankind {
    // static 静态 ; dynamic 动态\ [daɪ'næmɪk]
    String name;
    static String earth; // 地球
}

class NewTest {
    public static void main(String[] args) {
        Mankind tom = new Mankind();
        tom.name = "Tom";
        Mankind.earth = "Tom 种了一棵树";
        System.out.println(tom.name);
        System.out.println(Mankind.earth);

        Mankind jerry = new Mankind();
        jerry.name = "Jerry";
        System.out.println(jerry.name);
        System.out.println(Mankind.earth);
    }
}
