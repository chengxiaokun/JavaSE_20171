import java.util.Scanner;

/**
 * Created by mingfei.net@gmail.com
 * 3/10/17 08:48
 */
// Ctrl(Command) + O
// 接收用户输入的一个字母 A B C D..., 输出分数区间[90,100],[80,90),[60,80),[0,60)
public class SwitchCaseTest { // 多分枝选择结构
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input A B C D: ");
        String s = scanner.nextLine();

        switch (s) { // 开关\ [swɪtʃ]
            case "A": // 情况下\ [keɪs]
                System.out.println("a");
                break; // 打破\ [breɪk]
            case "B":
                System.out.println("b");
                break;
            case "C":
                System.out.println("c");
                break;
            case "D":
                System.out.println("d");
                break;
            default: // 默认的\ [dɪ'fɔːlt\;\ 'diːfɔːlt]
                System.out.println("default...");
                break;
        }
    }
}
