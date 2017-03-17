package java1702.javase.exercise;

/**
 * Created by mingfei.net@gmail.com
 * 3/17/17 15:08
 */
// 输入两个正整数m和n,求其最大公约数和最小公倍数。
public class E6 {

    public int min(int x, int y) {
        return (x >= y) ? y : x;
    }

    public int max(int x, int y) {
        return (x <= y) ? y : x;
    }

    public static void main(String[] args) {
        // m=10, n=15 5 30
        int m = 10;
        int n = 15;
        E6 e6 = new E6();
//        int min = Math.min(m, n);
        int min = e6.min(m, n);
        for (int i = min; i > 0; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println(i);
                break;
            }
        }

//        int max = Math.max(m, n);
        int max = e6.max(m, n);
        for (int i = max; ; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
