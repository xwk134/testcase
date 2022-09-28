package Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        String str = "2020-2-10";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = df.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar c = new GregorianCalendar();
        c.setTime(date);

        System.out.println("日\t一\t二\t三\t四\t五\t六");

        c.set(Calendar.DAY_OF_MONTH,1);

        for (int i = 0; i < c.get(Calendar.DAY_OF_WEEK)-1; i++) {
            System.out.print("\t");
        }

        int days = c.getActualMaximum(Calendar.DATE);
        for (int i = 1;i<=days;i++){
            System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");
            if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
                System.out.println();
            }
            c.add(Calendar.DAY_OF_MONTH,1);
        }
    }
}
