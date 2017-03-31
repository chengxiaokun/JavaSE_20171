package java1702.javase.collection;

import java.util.*;

/**
 * Created by mingfei.net@gmail.com
 * 3/31/17 11:28
 * JavaSE_20171
 */
public class ListTest {
    public static void main(String[] args) {
        // array 数组\ [ə'reɪ]
        // list 列表\ [lɪst]
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hi");
        strings.add("hello");
        strings.add("hello");
        System.out.println(strings.size());
        System.out.println(strings.get(1));
        System.out.println(strings.contains("test"));
        System.out.println(strings.indexOf("hello"));
        System.out.println(strings.lastIndexOf("hello"));
//        strings.clear();
        System.out.println(strings.isEmpty());
        System.out.println(strings.remove(1));
        System.out.println(strings.set(0, "test"));
        Object[] objects = strings.toArray();
        strings.add("hello");
        System.out.println(strings.size()); // 3
        System.out.println(strings); // [test, hello, hello]
        ArrayList<String> strings1 = new ArrayList<>();
        strings.removeAll(strings1);
        System.out.println(strings); // [test]
        System.out.println(strings.size()); // 3
        strings.trimToSize();
        System.out.println(strings.size()); // 3


        List<String> strings2 = strings.subList(1, 2); // ?
        System.out.println(strings2);
    }
}
