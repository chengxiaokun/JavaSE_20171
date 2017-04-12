package java1702.javase.collection;

import java.util.TreeSet;

/**
 * Created by mingfei.net@gmail.com
 * 4/11/17 16:03
 * https://github.com/thu/JavaSE_20171
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
        strings.add("一");
        strings.add("二");
        strings.add("三");
        strings.add("四");

        System.out.println((int)'一');
        System.out.println((int)'二');
        System.out.println((int)'三');
        System.out.println((int)'四');

        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
