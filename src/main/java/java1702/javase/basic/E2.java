package java1702.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 3/14/17 11:40
 */

// [100, 200] 素数
// 素数：只能被 1 和它本身整除的正整数 %
public class E2 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
//           如果 i 是素数
            boolean b = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
//            输出 i
            if (b==true) {
                System.out.println(i);
            }
        }
    }
}
