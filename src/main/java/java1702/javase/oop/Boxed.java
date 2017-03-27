package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/27/17 09:41
 * JavaSE_20171
 */
public class Boxed { // 封装类 装箱类
    public static void main(String[] args) {
//        int i = 0;
//        double d = 1.2d;

        Integer i = new Integer(0);
        Double d = new Double(1.2d);

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

        System.out.println(i);
        System.out.println(d);
    }
}
