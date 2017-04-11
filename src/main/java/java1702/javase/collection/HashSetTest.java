package java1702.javase.collection;

import java.util.HashSet;

/**
 * Created by mingfei.net@gmail.com
 * 4/11/17 15:48
 * https://github.com/thu/JavaSE_20171
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("hello");
        strings.add("hi");
        strings.add("test");
        strings.add("Test");

//        ArrayList

        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
