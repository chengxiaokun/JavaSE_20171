package java1702.javase.collection;

/**
 * Created by mingfei.net@gmail.com
 * 3/29/17 08:36
 * JavaSE_20171
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "           hello                   world! test    ";
        // match 匹配\ [mætʃ]
        System.out.println(s.matches("\\w+")); // JavaScript
//        System.out.println(s.contains("he"));
        System.out.println(s.equals("hello"));
        // repalce 取代\ [rɪ'pleɪs]
//        System.out.println(s.replace("l", "a"));
        System.out.println(s.replaceAll("ll", "a"));
//        System.out.println(s.replaceAll("[l]+", "a"));
        System.out.println(s.replaceFirst("ll", "a"));
        // split 分裂\ [splɪt]
        String[] strings = s.split("\\s+"); // space 空格
        System.out.println(strings.length); // 10 12 11
        for (String string : strings) {
            System.out.println(string);
        }
//        System.out.println("boo:and:foo".split("o", 4).length);

        for (String o : "boo:and:foo".split("o", -10)) { // ?
            System.out.println("'" + o + "'");
        }
        System.out.println(s.substring(s.indexOf('w')));
        System.out.println(s.trim()); // trim 修剪\ [trɪm]
        System.out.println(s.replace(" ", ""));

        System.out.println(String.valueOf(123));
    }
}
