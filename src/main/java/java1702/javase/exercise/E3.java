package java1702.javase.exercise;

import java.util.Scanner;

/**
 * Created by mingfei.net@gmail.com
 * 3/14/17 15:54
 */
//                                       所有的水仙花数 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 
// 四位  abcd = a^4 + ...
// N位  n = a^n + b^n + ... + ge^n
public class E3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input n: ");
        int n = scanner.nextInt();
        System.out.println(n);

        for (int i = 1000; i < 10000; i++) {
            // 1234 == 1*1*1 + 2*2*2 + 3*3*3
            int qian = i / 1000;
            int bai = i / 100 % 10; // 百位数字
            int shi = i / 10 % 10; // 十位数字
            int ge = i % 10; // 个位数字
            if (i == qian * qian * qian * qian + bai * bai * bai * bai + shi * shi * shi * shi + ge * ge * ge * ge) {
                System.out.println(i);
            }
        }
    }
}
