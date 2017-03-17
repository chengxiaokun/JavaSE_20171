package java1702.javase.exercise;

import sun.plugin2.message.GetAppletMessage;

/**
 * Created by mingfei.net@gmail.com
 * 3/16/17 15:09
 */
// 。
// 求1+2!+3!+...+20!的和
public class E21 {

    public long get(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * get(n - 1);
        }
    }

    public static void main(String[] args) {
//        java1702.javase.exercise.E21 e21 = new java1702.javase.exercise.E21();
//        long sum = 0;
//        for (int i = 1; i < 21; i++) {
//            sum += e21.get(i);
//        }
//        System.out.println(sum);

        long sum = 0;
        for (int i = 1; i < 21; i++) {
            long n = 1;
            for (int j = 1; j < i + 1; j++) { // i!
                n *= j;
            }
            sum += n;
        }
        System.out.println(sum);
    }
}
