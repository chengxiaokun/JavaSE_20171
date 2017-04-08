package java1702.javase.newcollection;

import java.util.Vector;

/**
 * Created by mingfei.net@gmail.com
 * 4/8/17 09:35
 * https://github.com/thu/JavaSE_20171
 */
public class VectorTest {
    public static void main(String[] args) {
        // vector 向量 矢量
        Vector<String> strings = new Vector<>(100000, 1000); // E element 元素
        for (int i = 0; i < 100; i++) {
            strings.add("hello");
        }
        strings.clear(); // clear
        strings.add("hi");
        System.out.println(strings.size()); // 大小
//        System.out.println(strings.get(0));
        System.out.println(strings.capacity()); // capacity 容量

//        100k
    }
}
