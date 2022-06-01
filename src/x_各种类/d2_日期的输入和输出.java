package x_各种类;


import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class d2_日期的输入和输出 {
    //成员变量
    Date birth = new SimpleDateFormat("yyyy-MM-dd").parse("1999-09-22");
    //抛出异常
    public d2_日期的输入和输出() throws ParseException {
    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        //访问日期成员变量
        d2_日期的输入和输出 aa = new d2_日期的输入和输出();
        System.out.println("aa.birth = " + new SimpleDateFormat("yyyy-MM-dd").format(aa.birth));
        //将输入日期--->date 日期
        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("1999-09-22");
        System.out.println("parse = " + parse);


        //1.SimpleDateFormat().parse()  将指定日期(符合模式的字符串)-->Date 日期
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse(in.next()));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse("1999-09-22"));


    //2.SimpleDateFormat().format()   Date 日期-->符合模式的日期
        System.out.println("new SimpleDateFormat(\"yyyy-MM-dd\") = " +
                new SimpleDateFormat("yyyy-MM-dd").format(
                        new SimpleDateFormat("yyyy-MM-dd").parse(in.next())));
    }
}