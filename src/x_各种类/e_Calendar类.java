package x_各种类;
/*
1.calendar 日历类
    1.创建对象  Calendar.getInstance();
    2.常用方法
        1.get(int field)            返回给定日历字段的值
        2.set(int field,int value)  设置日历
        3.add(int field,int amount) 根据日历的规定,为给定字段,添加或减去指定时间量
        4.getTime()                 返回Date对象
        */
import java.util.Calendar;

public class e_Calendar类 {
    public static void main(String[] args) {
        //创建日历类对象
        Calendar calendar = Calendar.getInstance();
    //1.get(int field)            返回给定日历字段的值(输入年月日即可,提示)
        System.out.println("calendar.get(Calendar.YEAR) = " + calendar.get(Calendar.YEAR));                 //年
        System.out.println("calendar.get(Calendar.MONTH) = " + calendar.get(Calendar.MONTH));               //月(0-11)
        System.out.println("calendar.get(Calendar.DAY_OF_MONTH) = " + calendar.get(Calendar.DAY_OF_MONTH)); //日
        System.out.println("calendar.get(Calendar.HOUR) = " + calendar.get(Calendar.HOUR));                 //时
        System.out.println("calendar.get(Calendar.MINUTE) = " + calendar.get(Calendar.MINUTE));             //分
        System.out.println("calendar.get(Calendar.SECOND) = " + calendar.get(Calendar.SECOND));             //秒
    //2.set(int field,int value)  设置日历
        calendar.set(Calendar.YEAR,1999);
        calendar.set(Calendar.MONTH,9);
        calendar.set(Calendar.DAY_OF_MONTH,22);
        System.out.println(calendar.get(Calendar.YEAR) + "-"
                + calendar.get(Calendar.MONTH) + "-"
                + calendar.get(Calendar.DAY_OF_MONTH));
        //同时设置
        calendar.set(1999,9,22);
        System.out.println(calendar.get(Calendar.YEAR) + "-"
                + calendar.get(Calendar.MONTH) + "-"
                + calendar.get(Calendar.DAY_OF_MONTH));
    //3.add(int field,int amount) 根据日历的规定,为给定字段,添加(+)或减去(-)指定时间量
        calendar.add(Calendar.YEAR,1);
        calendar.add(Calendar.MONTH,-1);
        System.out.println(calendar.get(Calendar.YEAR) + "-"
                + calendar.get(Calendar.MONTH) + "-"
                + calendar.get(Calendar.DAY_OF_MONTH));
    //4.getTime()                 日历--->Date
        System.out.println("calendar.getTime() = " + calendar.getTime());

    }

}
