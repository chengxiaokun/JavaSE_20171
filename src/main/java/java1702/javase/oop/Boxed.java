package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/27/17 09:41
 * JavaSE_20171
 */
public class Boxed { // 封装类 装箱类
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        System.out.println(x >= y);

        Integer i = new Integer(1); // address1
        Integer j = new Integer(1); // address2


        System.out.println(i == j); // == !=

        /*
        java.lang
            boolean - Boolean
            byte - Byte
            char - Character*
            short - Short
            int - Integer*
            long - Long
            float - Float
            double - Double

         */
    }
}
