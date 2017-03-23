package test;

/**
 * Created by mingfei.net@gmail.com
 * 3/23/17 11:07
 * JavaSE_20171
 */
public class T {
    public static void main(String[] args) {
        String pattern = "(([0-9a-f])\\2){3}";
        String hexString = "aa0098";
        if (hexString.matches(pattern)) {
            hexString = "" + hexString.charAt(0) + hexString.charAt(2) + hexString.charAt(4);
        }
        System.out.println(hexString);
    }
}
