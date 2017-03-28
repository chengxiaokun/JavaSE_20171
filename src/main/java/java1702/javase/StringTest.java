package java1702.javase;

import java.util.Date;

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
//            System.out.println(c);
        }

        String s3 = "Hello"; // hello HELLO
        System.out.println(toLowerCase(s3));
        System.out.println(toUpperCase(s3));

        String str = new String(chars);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println("итальянский".toLowerCase());
        System.out.println("итальянский".toUpperCase());

        String s4 = "итальитальянскийитальянскийитальянскийитальянскийитальянскийянскийa";
        System.out.println(s4.charAt(s4.length() - 1));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.concat(s2));

        System.out.println(s1.contains("a"));
        System.out.println(s1.endsWith("df")); // suffix 后缀\ ['sʌfɪks]

        s1 = "java1702.javase.StringTest@3764951D";
        StringTest stringTest = new StringTest();
        System.out.println(stringTest);
        System.out.println(s1.equalsIgnoreCase(stringTest.toString()));

        System.out.println(String.format("yyyy-MM-dd HH:mm:ss", new Date()));

        String s5 = "heloolo"; // HEX: 4E00
        for (byte b : s5.getBytes()) {
            System.out.println(b);
        }

        System.out.println(s5.indexOf('l', 3));
        s5 = "";
        System.out.println(s5.isEmpty());

        System.out.println("--------------------");
        String s6=null;
        s6=String.format("Hi,%s", "王力");
        System.out.println(s6);
        s6=String.format("Hi,%s:%s.%s", "王南","王力","王张");
        System.out.println(s6);
        System.out.printf("字母a的大写是：%c %n", 'A'); // format
        System.out.printf("3>7的结果是：%b %n", 3>7);
        System.out.printf("100的一半是：%d %n", 100/2);
        System.out.printf("100的16进制数是：%x %n", 100);
        System.out.printf("100的8进制数是：%o %n", 100);
        System.out.printf("50元的书打8.5折扣是：%f 元%n", 50*0.85);
        System.out.printf("上面价格的16进制数是：%a %n", 50*0.85);
        System.out.printf("上面价格的指数表示：%e %n", 50*0.85);
        System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50*0.85);
        System.out.printf("上面的折扣是%d%% %n", 85);
        System.out.printf("字母A的散列码是：%h %n", 'B');

        System.out.println(String.format("%02d", 4000));
    }

    private static String toLowerCase(String origin) {
        char[] chars = origin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar >= 'A' && aChar <= 'Z') {
                chars[i] += 32; // a - A = 32
            }
        }
        return new String(chars);
    }

    private static String toUpperCase(String origin) {
        char[] chars = origin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar >= 'a' && aChar <= 'z') {
                chars[i] -= 32; // a - A = 32
            }
        }
        return new String(chars);
    }
}

/*
172.16.0.5
172.16.0.10
172.16.0.16
172.16.0.22
172.16.0.35
172.16.0.42
172.16.0.53
172.16.0.60
172.16.0.61
172.16.0.62
172.16.0.69
172.16.0.89
172.16.0.92
172.16.0.114
172.16.0.118
172.16.0.119
172.16.0.122
172.16.0.139
172.16.0.157
172.16.0.160
172.16.0.198
172.16.0.203
172.16.0.205
172.16.0.207
172.16.0.216
172.16.0.217
172.16.0.218
172.16.0.223

172.16.0.5
172.16.0.10
172.16.0.16
172.16.0.22
172.16.0.35
172.16.0.42
172.16.0.53
172.16.0.60
172.16.0.61
172.16.0.62
172.16.0.69
172.16.0.89
172.16.0.92
172.16.0.114
172.16.0.118
172.16.0.119
172.16.0.122
172.16.0.139
172.16.0.157
172.16.0.160
172.16.0.198
172.16.0.203
172.16.0.205
172.16.0.207
172.16.0.216
172.16.0.217
172.16.0.218
172.16.0.223
*/
