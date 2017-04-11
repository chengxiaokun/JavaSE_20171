package java1702.javase.collection;

import java.util.LinkedHashSet;

/**
 * Created by mingfei.net@gmail.com
 * 4/11/17 16:00
 * https://github.com/thu/JavaSE_20171
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
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
