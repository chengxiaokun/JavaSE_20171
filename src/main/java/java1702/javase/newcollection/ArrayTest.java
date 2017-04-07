package java1702.javase.newcollection;

/**
 * Created by mingfei.net@gmail.com
 * 4/7/17 10:32
 * https://github.com/thu/JavaSE_20171
 */
public class ArrayTest {
    public static void main(String[] args) { // arguments 参数
        int[] ints = new int[5]; // static
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }

        // itar = iterate array + Tab
        for (int i = 0; i < ints.length; i++) {
            if (i == 5) {
                System.out.println(ints[i]);
            }
        }

        System.out.println("-----------");

        // for-each
        // iter + Tab
        for (int anInt : ints) {
            System.out.println(anInt);
        }

//        System.out.println(ints.length);

        String[] strings = {"Jan", "Feb", "Mar", ""};
        System.out.println(strings.length);
    }
}
