package p_文件.b_字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
<1> 追加  ： 使用两个参数的构造
	1.FileOutputStream(String name,boolean append) 创建一个向具有指定 name的文件中写入数据的输出文件流
	2.FileOutputStream(File file,boolean append )  创建一个向指定File对象表示的文件中写入数据的文件输出流
		参数：
			String name ，File file ：写入数据的目的
			boolean append ：追加写的开关
			true ：创建对象不会覆盖源文件，继续在文件的末尾追加数据
			false：新建一个文件，覆盖源文件
 */
public class c_续写与换行 {
    public static void main(String[] args) throws IOException {
    //1.创建一个FileOutputStream对象,构造方法中传入写入数据的位置
        FileOutputStream fos = new FileOutputStream("src\\p_文件\\b_字节流\\z_append.txt", true);
    //2.调用FileOutputStream中的write方法,把数据写到文件中
        fos.write("hello world\n".getBytes(StandardCharsets.UTF_8));
    //3.对象.close 释放资源。（流的使用会占用一定的内存）
        fos .close();
    }
}
