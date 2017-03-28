package java1702.javase;

/**
 * Created by mingfei.net@gmail.com
 * 3/28/17 10:42
 * JavaSE_20171
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = "asdf";

        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String s2 = new String(chars);

        System.out.println(s2);

        for (char c : s2.toCharArray()) {
            System.out.println(c);
        }

        String s3 = "Hello"; // hello HELLO
    }
}
