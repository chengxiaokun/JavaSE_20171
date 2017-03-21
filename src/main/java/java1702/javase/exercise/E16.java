package java1702.javase.exercise;

/**
 * Created by mingfei.net@gmail.com
 * 3/21/17 14:47
 * JavaSE_20171
 */

// 输出9*9口诀
public class E16 {
    public static void main(String[] args) {
        /*
        1 2 ... 9
        2
        3
        .
        .
        .
        9 18 ... 81
         */
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i >= j) {
                    System.out.print((i + 1) * (j + 1) + "\t");
                }
            }
            System.out.println();
        }
    }
}
