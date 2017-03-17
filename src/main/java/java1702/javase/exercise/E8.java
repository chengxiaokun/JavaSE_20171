package java1702.javase.exercise;

/**
 * Created by mingfei.net@gmail.com
 * 3/17/17 15:38
 */
// 求sum = a+aa+aaa+aaaa+aa...a的值,其中a是一个数字。
// 例如 2+22+222+2222+22222(此时共有5个数相加),几个数相加有键盘控制。
public class E8 {
    public static void main(String[] args) {
        int a = 2;
        int n = 5;

        int sum = 0;
        int x = 0; // 2 22 222 ...
        for (int i = 0; i < 5; i++) {
            int y = 1; // 10^0 10^1 10^2
            for (int j = 0; j < i; j++) {
                y *= 10; // y = y * 10
            }
            x += a * y; // 2 22 222 ...
            sum += x;
        }
        System.out.println(sum);
    }
}
