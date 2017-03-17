package java1702.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 3/16/17 08:52
 */

// 代码重用

public class Father extends Object { // super class base class 父类 超类 基类
    int money;

    public void coding() {
        System.out.println("java1702.javase.basic.Father is coding...");
    }
}

class Son extends Father { // sub class 子类
    String toy;

    public void study() {
        System.out.println("java1702.javase.basic.Son is studying...");
    }
}

class Grandson extends Son {

}

class ExtendsTest {
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.money); //
        father.coding();

        Son son = new Son();
        System.out.println(son.money); //
        son.coding();

        System.out.println(son.toy); // null
        son.study();

        Grandson grandson = new Grandson();
        System.out.println(grandson.toy);
        System.out.println(grandson.money);
        grandson.study();
        grandson.coding();

        System.out.println(son instanceof Grandson);
        // cast 类型转换
    }
}
