package java1702.javase.exercise;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Random;

/**
 * Created by mingfei.net@gmail.com
 * 3/20/17 15:46
 * JavaSE_20171
 */
// 随机生成 [1,20] 随机数 10000 次
// java.lang.Math  java.util.Random
// util - utility 实用工具

// 效率比较  分布比较 Hashtable

// Random 随机
public class E34 {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < 20; i++) {
            hashtable.put(i + 1, 0);
        }
        Random random = new Random();
        long start = System.nanoTime(); // 返回系统当前时间毫微秒数
        for (int i = 0; i < 10000; i++) {
            int r = (int) (Math.random() * 20) + 1;
//            int r = random.nextInt(20) + 1;
            hashtable.put(r, hashtable.get(r) + 1);
//            System.out.println(r);
        }
        long end = System.nanoTime();
        System.out.println(end - start);
        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + "\t->\t" + hashtable.get(integer));
        }
    }
}
/*
key -> value
1 -> 400
2 -> 600
...
20 -> 500
 */
