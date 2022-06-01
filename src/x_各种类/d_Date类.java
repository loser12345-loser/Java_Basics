package x_各种类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
1.Date: 时间,日期类
    1.构造方法
        1.new Date();   当前时间
        2.new Date(0);  毫秒值-->时间
    2.成员方法
        1.Long getTime() 日期-->毫秒     //System.currentTimeMillis() 类似
2.DateFormat    日期格式化类
    1.构造方法
        1.simpleDateFormat(string pattern)  年-月-日-时-分-秒 = yyyy-MM-dd-HH-mm-ss
        2.Date parse(string source)         符合模式的字符串-->Date 日期

    */
public class d_Date类 {

    public static void main(String[] args) throws ParseException {

    //1.Date: 时间,日期类
        //1.new Date();   当前时间
        System.out.println("now = " + new Date());
        //2.new Date(0);  毫秒值-->时间
        System.out.println("start_point = " + new Date(0));
        //Long getTime() 日期-->毫秒
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        System.out.println("new Date().getTime() = " + new Date().getTime());
    //2.DateFormat    日期格式化类
        //1.simpleDateFormat(string pattern)  年-月-日-时-分-秒 = yyyy-MM-dd-HH-mm-ss
        System.out.println("new SimpleDateFormat(\"yyyy-MM-dd HH:mm:ss\").format(new Date()) = " +
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        System.out.println("new SimpleDateFormat(\"yyyy年MM月dd日 HH时mm分ss秒\").format(new Date()) = " +
                new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").format(new Date()));
        //2.Date parse(string source)         符合模式的字符串-->Date 日期
        System.out.println("new SimpleDateFormat(\"yyyy-MM-dd HH:mm:ss\").parse(\"2015 03 23 08:03:34\") = " +
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2022-04-26 18:46:22"));

    }
}
