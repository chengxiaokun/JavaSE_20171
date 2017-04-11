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
        strings.add("d");
        strings.add("c");
        strings.add("b");
        strings.add("a");

        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
