package java1702.javase.collection;

import java.util.Vector;

/**
 * Created by mingfei.net@gmail.com
 * 3/30/17 14:00
 * JavaSE_20171
 */
public class ArrayVector { // 使用数组来模拟一个向量

    public void add(String string) {

    }

    public String get(int index) {
        return null;
    }

    public static void main(String[] args) {
        // void add(String element)
        // String remove(int index)
        // String set(int index, String element)
        // String get(int index)
        // int size()
        // int capacity()

        ArrayVector arrayVector = new ArrayVector();
        arrayVector.add("hello");
        System.out.println(arrayVector.get(0)); // hello
    }
}
