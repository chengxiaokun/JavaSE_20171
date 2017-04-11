package java1702.javase.collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by mingfei.net@gmail.com
 * 4/11/17 15:00
 * https://github.com/thu/JavaSE_20171
 */
public class ArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i + "");
            linkedList.add(i + "");
        }

        long time1 = System.currentTimeMillis();
        System.out.println(arrayList.remove(10000000 - 1));
        long time2 = System.currentTimeMillis();
        System.out.println(linkedList.remove(10000000 - 1));
        long time3 = System.currentTimeMillis();

        System.out.println("arrayList: " + (time2 - time1)); // arrayList
        System.out.println("linkedList: " + (time3 - time2)); // linkedList
    }
}
