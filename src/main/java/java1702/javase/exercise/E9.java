package java1702.javase.exercise;

/**
 * Created by mingfei.net@gmail.com
 * 3/17/17 15:51
 */
// 一个数如果恰好等于它的***因子***之和,这个数就称为’完数’
// 例如 6=1+2+3
// 编程 找出 1000 以内的所有完数
public class E9 {

    public int get(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2 + 1; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        E9 e9 = new E9();
        for (int i = 1; i < 10000; i++) {
            if (i == e9.get(i)) {
                System.out.println(i + " 是一个完数。");
            }
        }
    }
}
