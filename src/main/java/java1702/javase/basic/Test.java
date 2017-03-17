package java1702.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 3/15/17 11:26
 */
public class Test {
    public static void main(String[] args) {
        Human tom = new Human(); // 【new + 一个类的构造方法】 对象 实例 实例对象 object instance
        System.out.println(tom.name); // name null

        Human jerry = new Human("Jerry", 1.6, false, 'F', 18, 40);
        System.out.println(jerry.name);
        jerry.study();
        jerry.sing(1d, false); // Ctrl + P / Command + P (Parameter)

        int i = 0;

        String s = new String("test"); // "test";
    }
}
