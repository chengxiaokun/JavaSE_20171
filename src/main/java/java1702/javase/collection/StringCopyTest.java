package java1702.javase.collection;

import java.util.Arrays;

/**
 * Created by mingfei.net@gmail.com
 * 3/31/17 09:36
 * JavaSE_20171
 */
public class StringCopyTest {
    public static void main(String[] args) {
        int[] srcArray = {1, 2, 3, 4, 5, 6};
        int[] destArray = new int[10];

        // src - source 源\ [sɔːs]
        // dest - destination 目的地\ [,destɪ'neɪʃ\(ə\)n]
        System.out.println(Arrays.toString(destArray));
        System.arraycopy(srcArray, 1, destArray, 6, 4);
        System.out.println(Arrays.toString(destArray));


        String[] strings = {"a", "b", "c", "d", null, null, null, null, null, null};
    }
}
