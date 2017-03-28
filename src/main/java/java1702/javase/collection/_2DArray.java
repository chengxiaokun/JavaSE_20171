package java1702.javase.collection;

/**
 * Created by mingfei.net@gmail.com
 * 3/28/17 09:06
 * JavaSE_20171
 */
public class _2DArray {
    public static void main(String[] args) {
        int[][] ints = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
