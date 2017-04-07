package java1702.javase.newcollection;

/**
 * Created by mingfei.net@gmail.com
 * 4/7/17 10:56
 * https://github.com/thu/JavaSE_20171
 */
public class _2DArray {
    public static void main(String[] args) {
        String[][] strings = new String[3][5];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = i * j + "";
            }
        }
        System.out.println(strings[strings.length - 1][strings[strings.length - 1].length - 1]);
    }
}
