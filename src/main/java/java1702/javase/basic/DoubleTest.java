package java1702.javase.basic;

import java.math.BigDecimal;

/**
 * Created by mingfei.net@gmail.com
 * 3/21/17 15:59
 * JavaSE_20171
 */
public class DoubleTest {
    public static void main(String[] args) {
//        System.out.println(1.0d - 0.9d); // binary 0.1

//        System.out.println(10 - 9);
//        System.out.println((10d - 9d) / 10);

        BigDecimal bigDecimal1 = new BigDecimal("1.0");
        BigDecimal bigDecimal2 = new BigDecimal("0.9");

        System.out.println(bigDecimal2.divide(bigDecimal1));
    }
}
