package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/27/17 13:56
 * JavaSE_20171
 */
public class CastTest {
    public static void main(String[] args) {
        // 1.
        int x  = 1;
        int y = 2;
        // a.
        Integer integer = new Integer(x);
        String s1 = integer.toString();
        System.out.println(s1);

        // b.
        String s2 = String.valueOf(x);
        System.out.println(s2);

        // c.
        String s3 = "" + x + y;
        System.out.println(s3);

        // d.
        String s4 = Integer.toString(x);
        System.out.println(s4);


        // 2.
        String string = "123";

        // a.
        int y1 = Integer.valueOf(string);
        System.out.println(y1);

        // b.
        int y2 = Integer.parseInt(string); // parse 解析\ [pɑːz]
        System.out.println(y2);

        // c.
        int y3 = new Integer(string);
        System.out.println(y3);
    }
}
