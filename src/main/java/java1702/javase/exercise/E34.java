package java1702.javase.exercise;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by mingfei.net@gmail.com
 * 3/20/17 15:46
 * JavaSE_20171
 */
// 随机生成 [1,20] 随机数 10000 次
// java.lang.Math  java.util.Random
// util - utility 实用工具

// 效率比较  分布比较

// Random 随机
public class E34 {
    public static void main(String[] args) {
        Random random = new Random();

        long start = System.nanoTime(); // 返回系统当前时间毫微秒数
        // 1490000302941  1/1000 second 1纳秒 = 1*10^-9 秒
        for (int i = 0; i < 1000000; i++) {
            int r = (int) (Math.random() * 20) + 1;
//            int r = random.nextInt(20) + 1;
//            System.out.println(r);
        }
        long end = System.nanoTime();

//        System.out.println(end - start);

        System.out.println(System.currentTimeMillis());

//        System.out.println((1500000000000L - System.currentTimeMillis()) / 1000 / 60 / 60 / 24);

        System.out.println(new Date(1500000000000L));

    }
}
