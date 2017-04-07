package java1702.javase.newcollection;

import java.util.Arrays;

/**
 * Created by mingfei.net@gmail.com
 * 4/7/17 10:56
 * https://github.com/thu/JavaSE_20171
 */
public class _2DArray {
    public static void main(String[] args) {
        String[][] strings = {
                {"a", "b"},
                {"c"},
                {"d", "e"},
                {"f", "g", "h"},
                {""}
        };

        int k = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
//                k += i * strings[i].length + j + 1; // ?
                System.out.println(++k);
//                System.out.println((i * strings.length + (j + 1))); // ?
            }
        }

//        int[][] ints = new int[5][];
//        ints[0] = new int[2];
//        // ...
//        ints[4] = new int[1];
//
//        for (int i = 0; i < strings.length; i++) {
//            for (int j = 0; j < strings[i].length; j++) {
//                System.out.print(strings[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println(strings[strings.length - 1][strings[strings.length - 1].length - 1]);
//
//        System.out.println(Arrays.deepToString(strings));
    }
}
