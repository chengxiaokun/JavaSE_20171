package java1702.javase;

/**
 * Created by mingfei.net@gmail.com
 * 3/28/17 10:30
 * JavaSE_20171
 */
public class Game {

    private static final char[] COLORS = {'A', 'B', 'C', 'D', 'E', 'F'};

    public static void main(String[] args) {
        char[][] square = new char[10][10];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                square[i][j] = COLORS[(int) (Math.random() * 6)];
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}
