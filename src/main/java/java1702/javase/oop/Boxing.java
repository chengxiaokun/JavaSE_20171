package java1702.javase.oop;

/**
 * Created by mingfei.net@gmail.com
 * 3/27/17 13:47
 * JavaSE_20171
 */
public class Boxing {
    public static void main(String[] args) {
        Long sum = 0L;
        long start = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i; // sum = sum + i;
        }
        System.out.println("time: " + (System.currentTimeMillis() - start)/1000 + " s");
        System.out.println("sum: " + sum);
    }
}
