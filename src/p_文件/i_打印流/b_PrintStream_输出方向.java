package p_文件.i_打印流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/*
<1> PrintStream ：打印流
	1.可以改变输出语句的目的地（打印流的流向）
	2.输出语句默认在控制台
	3.使用System.setOut方法改变输出语句的目的地，改为参数中传递的打印流的目的地
	  static void setOut(PrintStream out);    重新分配“标准” 输出流
*/
public class b_PrintStream_输出方向 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
    //1.默认是在控制台输出
        System.out.println("我是在控制台输出的...");
    //2.使用System.setOut() 方法改变输出语句的目的地
        PrintStream ps = new PrintStream(
                new FileOutputStream("src/p_文件/i_打印流/z_PrintStream.txt",true),
                true,
                "gbk");
        System.setOut(ps);
        System.out.println("打印流的输出地,为文件...");
        ps.close();
    }
}
