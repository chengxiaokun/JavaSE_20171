package java1702.javase.collection;

import java.util.Hashtable;

/**
 * Created by mingfei.net@gmail.com
 * 3/29/17 15:16
 * JavaSE_20171
 */
public class HashtableTest {
    public static void main(String[] args) {
        // K - key 键  V - value 值
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "hi");
        hashtable.put(2, "hello");

        System.out.println(hashtable.get(2));
    }
}
