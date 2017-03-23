package java1702.javase.oop;

import java.util.Calendar;

/**
 * Created by mingfei.net@gmail.com
 * 3/23/17 11:33
 * JavaSE_20171
 */
public class CalendarTest {
    // java.util.calendar 日历\ ['kælɪndə]
    // 输出某年每月的日历

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 0, 8);
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH)); // actual 实际\ ['æktʃʊəl\;\ -tjʊəl]
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        /*
        一月
        一 二 三 四 五 六 日
                        1
        2

          31

        二月

         */
    }
}
