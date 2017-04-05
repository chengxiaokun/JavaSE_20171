package java1702.javase.newoop;

import java.util.Date;

/**
 * Created by lan on 2017/4/5.
 */
public class Student extends Human {

    private String studentNumber;
    private Date time; //

    public Student(String name, char gender, int age, double height, double weight, String studentNumber, Date time) {
        super(name, gender, age, height, weight);
        this.studentNumber = studentNumber;
        this.time = time;
    }

    public static void main(String[] args) {
        Student student = new Student("Tom", 'M', 18, 1.7, 65, "20170001", new Date());
        System.out.println(student.toString()); // FQN ...Student@HEX
        System.out.println(student instanceof Human);

        Human human = new Human("", 'a', 0, 0, 0);
        System.out.println(human instanceof Student);

        Human tom = new Student("Tom", 'M', 18, 1.7, 65, "20170001", new Date());
    }
}
