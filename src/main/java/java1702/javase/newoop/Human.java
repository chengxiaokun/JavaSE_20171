package java1702.javase.newoop;

/**
 * Created by mingfei.net@gmail.com
 * 4/1/17 08:46
 * JavaSE_20171
 */
// class = fields + methods (function)
public class Human {
    private String name;
    private char gender;
    private int age;
    private double height;
    private double weight;

// constructor

    // void adj.\ 空的；无效的；无人的
    public String study(int studyTime) { // call method; 调用\ [kɔːl] invoke method 调用\ [ɪn'vəʊk]
        // ...
        System.out.println(name + "学习了 " + studyTime + "小时。");
        return "一份英语作业";
    }

    public void work(boolean b) {
        if (b) {
            // ...
            return;
        }
        // ...
        // ...
        // ...
        // ...
        // ...
        if (b) {

        } else {

        }
    }

    public void eat(String foods, double amount) { // 形式参数 形参
        System.out.println(name + "吃了" + amount + foods);
    }

    public int sleep(boolean isPlayGame) {
        return isPlayGame ? 1 : 8;
    }
}
