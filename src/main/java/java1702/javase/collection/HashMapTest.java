package java1702.javase.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mingfei.net@gmail.com
 * 4/12/17 08:53
 * https://github.com/thu/JavaSE_20171
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(100, "bcd");
        map.put(1000, "efgh");
        map.put(1000, "efgh");

        System.out.println(map.size());
        System.out.println(map.get(100));

        for (Integer integer : map.keySet()) {
            System.out.println(integer + ">" + map.get(integer));
        }

        for (String s : map.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ">" + entry.getValue());
        }
    }
}
