/**
 * Created by mingfei.net@gmail.com
 * 3/16/17 15:16
 */
// 将一个正整数分解质因数
// 例如:输入90,打印出90=2*3*3*5

public class E4 {

    public void get(int n) {
        for (int i = 2; i < n + 1; i++) {
            if (n % i == 0) {
                if (i == n) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " * ");
                    get(n / i);
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        // 10 = 2*5
        // 100 = 2*2*5*5
        // 1000 = 2*2*2*5*5*5
        // Ctrl + Alt + T

        E4 e4 = new E4();
        int n = 10000;
        System.out.print(n + " = ");
        e4.get(n);
    }
}
