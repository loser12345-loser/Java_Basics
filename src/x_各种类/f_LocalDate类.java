package x_各种类;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/*
1.LocalDate     年月日    默认格式  yyyy-MM-dd
    1.静态方法
        1.now()                                           获取当前,年月日(返回LocalDate对象)
        2.of(int year, int month, int dayOfMonth)         构造指定,年月日(返回LocalDate对象)
        3.parse(CharSequence text)                        格式为: yyyy-MM-dd
        4.parse(CharSequence text, DateTimeFormatter formatter)
            1.DateTimeFormatter.ofPattern()   yyyy MM dd, (yyyy-MM-dd), (yyyy/MM/dd)
    2.成员方法   要先获取 LocalDate 对象,LocalDate没有空的构造方法
        1.getYear()         获取年
        2.getMonth()        获取月
        3.getDayOfMonth()   获取日   /getDayOfWeek()/getDayOfYear()
2.LocalTime     时分秒
    1.静态方法
        1.now()                                                 当前时间
        2.of(int hour, int minute)                              指定时间
        3.parse(CharSequence text)                              指定格式,如(12:00)
        4.parse(CharSequence text, DateTimeFormatter formatter)
    2.成员方法
        1.get
3.LocalDateTime=等同于LocalDate+LocalTime  年月日时分秒
4.instant   获取秒数
    1.Instant.now()                 获取当前时刻
    2.instant.getEpochSecond()      获取秒     instant.getEpochSecond()
    3.System.currentTimeMillis()    更方便
*/
public class f_LocalDate类 {
    public static void main(String[] args) {
    //1.LocalDate     年月日
        // 1.LocalDate.now()           获取当前,年月日(返回LocalDate对象)
        System.out.println("LocalDate.now() = " + LocalDate.now());
        // 2.LocalDate.of(2019,9,10)   构造指定,年月日(返回LocalDate对象)
        System.out.println("LocalDate.of(2019,9,10) = " + LocalDate.of(2019, 9, 10));
        // 3.LocalDate.parse(CharSequence text)
        System.out.println("LocalDate.parse(\"1999-09-22\") = " + LocalDate.parse("1999-09-22"));
        // 4.parse(CharSequence text, DateTimeFormatter formatter)
        System.out.println("LocalDate.parse(\"1999/9/22\", DateTimeFormatter.ofPattern(\"yyyy/MM/dd\")) = " +
                LocalDate.parse("1999/09/22",DateTimeFormatter.ofPattern("yyyy/MM/dd") ));
        //成员方法
        LocalDate date = LocalDate.now();
        System.out.println("date.getYear() = " + date.getYear());
        System.out.println("date.get(ChronoField.YEAR) = " + date.get(ChronoField.YEAR));
    //2.LocalTime     时分秒
        //静态方法
        System.out.println("LocalTime.now() = " + LocalTime.now());
        System.out.println("LocalTime.of(13, 51, 10) = " + LocalTime.of(13, 51, 10));
        System.out.println("LocalTime.parse(\"12:23\") = " + LocalTime.parse("12:23"));
        //成员方法
        LocalTime time = LocalTime.now();
        System.out.println("time.getHour() = " + time.getHour());
        System.out.println("time.getMinute() = " + time.getMinute());
        System.out.println("time.getSecond() = " + time.getSecond());
    //4. Instant 获取秒数
        System.out.println("Instant.now() = " + Instant.now());
        Instant instant = Instant.now();
        System.out.println("instant.getEpochSecond() = " + instant.getEpochSecond());
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
    }

}
