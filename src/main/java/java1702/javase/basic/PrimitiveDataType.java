package java1702.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 3/7/17 09:12
 */
public class PrimitiveDataType {
    public static void main(String[] args) {
        boolean b = true;

        byte b1 = -128; // [-128, 127]
        char c = 65535; // [0, 65535]
        short s = 32767; // [-32768,32767]
        int i = 4; // [-2147483648, 2147483647]
        // F2
        // auto fix mac: option+enter win: alt+enter
        long l = 1L; // [-9223372036854775808,9223372036854775807]
//        System.out.println(Long.MIN_VALUE + "," + Long.MAX_VALUE);

        float f = 1.1f; // 在出现错误时，要仔细看错误提示
        double d = 2.2;

//        1.234 - double
//        123 - int
    }
}
