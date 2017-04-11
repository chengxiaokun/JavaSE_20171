package java1702.javase.collection;

import java.util.LinkedList;

/**
 * Created by mingfei.net@gmail.com
 * 4/11/17 09:45
 * https://github.com/thu/JavaSE_20171
 */
public class LinkedListTest {
    // link 链接\ [lɪŋk]
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");

        System.out.println(strings.size());
        System.out.println(strings.get(0));

        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());
    }
}
