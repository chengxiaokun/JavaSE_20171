package java1702.javase.newoop;

import java.util.Hashtable;

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
//    public Human() {
//    }

    public Human(String name, char gender, int age, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Human human = new Human("Tom", 'M', 18, 1.7, 65); // 实际参数 实参
        System.out.println(human.name); // null
        System.out.println(human.gender); // 0 - ascii
        System.out.println(human.age); // 0
        System.out.println(human.height); // 0.0
        System.out.println(human.weight);
    }

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
