/**
 * Created by mingfei.net@gmail.com
 * 3/15/17 15:44
 */

// 求解汉诺塔 n 圆盘移动步骤
public class E52 {

    private int counter;

    /**
     * @param n    要移动的圆盘个数
     * @param src  source 从哪个柱子开始移动
     * @param use  use 利用哪个柱子
     * @param dest destination 去哪个柱子
     */
    private void hanoi(int n, String src, String use, String dest) {
        if (n == 1) {
            System.out.println(src + " - " + dest);
            counter++;
        } else {
            hanoi(n - 1, src, dest, use);
            System.out.println(src + " - " + dest);
            counter++;
            hanoi(n - 1, use, src, dest);
        }
    }

    public static void main(String[] args) {
        E52 e52 = new E52();
        e52.hanoi(20, "A", "B", "C");
        System.out.println(e52.counter);
    }
}
