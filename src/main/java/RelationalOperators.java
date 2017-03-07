/**
 * Created by mingfei.net@gmail.com
 * 3/7/17 14:35
 */
public class RelationalOperators {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        System.out.println(x != y);

        String s1 = "hi";
        String s2 = new String("hi");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2); // ?

        System.out.println(x <= y);
    }
}
