package java1702.javase.newcollection;

import java.util.Vector;

/**
 * Created by mingfei.net@gmail.com
 * 4/8/17 09:35
 * https://github.com/thu/JavaSE_20171
 */
public class VectorTest<E> extends Vector<E> {

    public VectorTest() {
        super();
    }


    public static void main(String[] args) {
        // vector 向量 矢量
        Vector<String> strings = new Vector<>(100); // E element 元素
        for (int i = 0; i < 100; i++) {
            strings.add("hello");
        }
//        strings.clear(); // clear
        strings.add("hi");
        strings.remove(99);
        strings.set(99, "test");
        System.out.println(strings.size()); // 大小
        System.out.println(strings.capacity()); // capacity 容量
        System.out.println(strings.get(99)); // ? null hello hi ""
//        System.out.println(strings.get(100)); // ? null hello hi ""

        /*
        ------------------------------------=101

         */
//        100k

//        Vector<Boolean> booleans = new Vector<>(); // explicit implicit

        VectorTest<Integer> integers = new VectorTest<>();
        integers.add(1);
        System.out.println(integers.elementData[1]);
    }
}
