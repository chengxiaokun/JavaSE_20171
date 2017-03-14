import java.util.Scanner;

/**
 * Created by mingfei.net@gmail.com
 * 3/14/17 17:03
 */
// [90,100] A [60,89] B [0,60) C
public class E5 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("input grade: ");
//        int grade = scanner.nextInt();

        // warning
        int grade = 70;
//        if (grade >=90 && grade <=100) {
//            System.out.println("A");
//        } else if (grade >= 60 && grade <= 89) {
//            System.out.println("B");
//        } else if (grade < 60 && grade >= 0) {
//            System.out.println("C");
//        } else {
//            System.out.println("error.");
//        }
// && ||
        String result = (grade >= 90 && grade <= 100) ? "A" : ((grade >= 60 && grade <= 89) ? "B" : "C");
        System.out.println(result);
    }
}
