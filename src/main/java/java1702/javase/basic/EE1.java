package java1702.javase.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by mingfei.net@gmail.com
 * 3/21/17 16:41
 * JavaSE_20171
 */
// 猜数字 AI
// 1. 生成一个随机整数（10000） 100 小了 1000 小了 100000 大了 10000 对了
public class EE1 {

    private static int x;
    private static int counter;

    public static void main(String[] args) {
        Random random = new Random();
        x = random.nextInt();
        System.out.println(x);
        guess();
    }

    private static void guess() {
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        if (y > x) {
            System.out.println("大了");
            counter++;
            guess();
        } else if (y < x) {
            System.out.println("小了");
            counter++;
            guess();
        } else {
            System.out.println("猜对了！");
            counter++;
            System.out.println(counter);
        }
    }
}

//  -123456789

//-21亿----- -10亿---- -5亿---0-------------21亿



