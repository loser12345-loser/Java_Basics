package p_文件.g_字符转换流;

import java.io.*;

/*
<1> OutputStreamWriter : 字符输出流，是字符流向字节的桥梁，可以指定要写入的字符编码格式；
	1.java.io.OutputStreamWriter extends Writer
	2.构造方法：
		1.OutputStreamWriter(OutputStream out)                     ：创建使用默认字符编码的OutputStreamWriter
		2.OutputStreamWriter(OutputStream out,String charsetName)  : 创建使用指定字符集的编码OutputStreamWriter
		参数：
			OutputStream out   ：字符输出流，可以用来转换字符格式之后写到文件中
			String charsetName ；指定编码表格式，不区分大小写  可以是 UTF-8/utf-8  GBK/gbk ，默认为UTF-8
	3.使用步骤：
		1.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码格式
		2.使用OutputStreamWriter对象中的write方法，把字符转换为字节写入文件
		3.使用OutputStreamWriter对象中的方法flush，将字节刷新到文件中
		4.释放资源*/
public class a_OutputStreamWriter_转换_字符输出流 {
    public static void main(String[] args) throws IOException {
    //1.获取OutputStreamWriter_字符转换输出流对象,指定文件位置和编码格式    字符输出流--->字节输出流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/p_文件/g_字符转换流/z_字符_字节.txt"), "utf-8");
        OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("src/p_文件/g_字符转换流/z_字符_字节_GBK.txt"), "GBK");
    //2.使用OutputStreamWriter中的write()方法,把字符转换为字节写入文件
        osw.write("中华人民共和国万岁");
        osw1.write("中华人民共和国万岁");
    //3.释放资源
        osw.close();
        osw1.close();

    }
}
