import java.util.Scanner;

/**
 * Created by mingfei.net@gmail.com
 * 3/10/17 08:48
 */
// 接收用户输入的一个字母 A B C D..., 输出分数区间[90,100],[80,90),[60,80),[0,60)
public class SwitchCaseTest { // 多分枝选择结构
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input A B C D: ");
        String s = scanner.nextLine();
        System.out.println(s);

        int i = 2;

        switch (i) { // 开关\ [swɪtʃ]
            case 0: // 情况下\ [keɪs]
                System.out.println("i = 0...");
                break; // 打破\ [breɪk]
            case 1:
                System.out.println("i = 1...");
                break;
            default: // 默认的\ [dɪ'fɔːlt\;\ 'diːfɔːlt]
                System.out.println("default...");
                break;
        }
    }
}
