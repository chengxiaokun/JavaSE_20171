package java1702.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 3/8/17 13:39
 */
public class AssignmentOperators {
    public static void main(String[] args) {
        int i = 0; // Shift + F6
        i += 1; // 等价于 i = i + 1;
        i -= 2;
        i *= 5;
        i /= 4;
        i %= 5;
        System.out.println(i); // 0 1 -1

        boolean b = true;
        b &= false; // b = b & false
        System.out.println(b);

        i &= 1; // Bitwise & i = -1 & 1
        System.out.println(i);

        // 000...1 111...0 111...1
        //                 000...1  000...1

    }
}
