package Date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ganlendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2999,10,9,22,10,15);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(weekday);
        System.out.println(year);
        System.out.println(month);
        //设置日期
        Calendar c2 = new GregorianCalendar();
        c2.set(Calendar.YEAR,2023);
        System.out.println(c2);
        //日期的计算
        Calendar c3 = new GregorianCalendar();
        c3.add(Calendar.YEAR,-100);
        System.out.println(c3);
    }
}
