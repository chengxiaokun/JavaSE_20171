/**
 * Created by mingfei.net@gmail.com
 * 3/14/17 16:39
 */

// 斐波那契数列
// 1,1,2,3,5,8,13,21,34,... f(n)
public class E51 {

    /**
     * 求 Fibonacci 数列的第 n 项
     *       f(n) = 1 (n=1, n=2)
     *       f(n) = f(n-2) + f(n-1) (n > 2)
     *
     *       recursive call 递归调用
     *
     *       非递归？
     *
     * @param n 数列的第 n 项
     * @return Fibonacci(n)
     */
    private int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public static void main(String[] args) {
        E51 e51 = new E51();
        System.out.println(e51.fibonacci(4));
    }
}
