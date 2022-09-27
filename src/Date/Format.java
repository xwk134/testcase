package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //将时间对象转换成字符串
        String daytime =  s1.format(new Date());
        System.out.println(daytime);
        //将符合指定格式的字符串转换成时间对象
        String time = "2007-10-7 20:15:14";
        Date date = s1.parse(time);
        System.out.println(date);
        //获取当前时间是今年的第几天
        SimpleDateFormat s2 = new SimpleDateFormat("D");
        String day = s2.format(new Date());
        System.out.println(day);
    }
}
