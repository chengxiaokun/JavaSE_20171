package java1702.javase.newcollection;

import java.util.Scanner;

/**
 * Created by mingfei.net@gmail.com
 * 4/7/17 16:38
 * https://github.com/thu/JavaSE_20171
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            String s1 = aChar + "";Character.toString(aChar);
            if (s1.toLowerCase().equals(s1)) {
                s1 = s1.toUpperCase();
                chars[i] = s1.toCharArray()[0];
            } else if (s1.toUpperCase().equals(s1)) {
                s1 = s1.toLowerCase();
                chars[i] = s1.toCharArray()[0];
            }
        }
        char temp = chars[0];
        chars[0] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;

        System.out.println(String.valueOf(chars ));
//        System.out.println(new String(chars));

//        System.out.println("Правительство России".toUpperCase());
    }
}
