package java1702.javase.exercise;

/**
 * Created by mingfei.net@gmail.com
 * 3/16/17 15:00
 */

// 利用递归方法求5! = 5 * 4 * 3 * 2 * 1 = 5 * (5-1)!
public class E22 {

    public long get(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * get(n - 1);
        }
    }

    public static void main(String[] args) {
//        java1702.javase.exercise.E22 e22 = new java1702.javase.exercise.E22();
//        System.out.println(e22.get(16));

        int result = 1;
        for (int i = 1; i < 6; i++) {
            result *= i; // result = result * i;
        }

        System.out.println(result);
    }
}
