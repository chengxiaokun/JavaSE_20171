/**
 * Created by mingfei.net@gmail.com
 * 3/10/17 11:03
 */
public class BreakContinueTest {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                 option + command + t / control + alt + t
//                continue;
//            }
//            System.out.println(i);
//        }

        // 嵌套
        outer: // label: 标签\ ['leɪb\(ə\)l] break to this position
        for (int i = 0; i < 10; i++) {
            System.out.println("i:" + i);
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break outer;
                }
                System.out.println("\tj:" + j);
            }
        }

        System.out.println(1d - .9d); // float point
    }
}
