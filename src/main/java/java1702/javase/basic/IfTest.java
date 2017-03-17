package java1702.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 3/8/17 15:59
 */
public class IfTest {
    public static void main(String[] args) {
        int grade = 90; // n.\ 年级；等级；成绩；级别；阶段
        if (grade >= 85) {
            System.out.println("优秀。");
        }
        if (grade >= 75) {
            System.out.println("良好。");
        }
        if (grade >= 60) {
            System.out.println("及格。");
        } else { // adv.\ 其他；否则；另外
            System.out.println("不及格。。。");
        }
    }
}
