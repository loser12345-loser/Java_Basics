package x_各种类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
1.计算出一个人已经出生了多少天
    1.获取当前时间对应的毫秒值
    2.获取自己出生日期对应的毫秒值
    3.两个时间相减(当前时间-出生日期)
    */
public class d1_date练习 {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入你的出生日期(yyyy-MM-dd) :");
    //1.获取当前时间对应的毫秒值
        long now = new Date().getTime();
    //2.获取自己出生日期对应的毫秒值
        String birth = in.next();
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(birth);
        System.out.println("date = " + date);
        System.out.println("new SimpleDateFormat(\"yyyy-MM-dd\").format(date) = " +
                new SimpleDateFormat("yyyy-MM-dd").format(date));
        long dateTime = date.getTime();
    //3.两个时间相减(当前时间-出生日期)
        long time = now - dateTime;
        System.out.println("距离出生,你已度过:"+(time/1000/60/60/24));
    }
}
