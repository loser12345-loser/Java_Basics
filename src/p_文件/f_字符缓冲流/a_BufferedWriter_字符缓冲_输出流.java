package p_文件.f_字符缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
<1> BufferedWriter :字符缓冲输出流
	1.java.io.BufferedWriter extends Writer
	2.继承的共性的成员方法：
		void write(int c)  			：写入字符
		void write(char[] cbuf)  	：写入字符数组
		abstract void write(char[] cbuf,int off ,int len) :写入字符数组的一部分，off数组的开始索引，len写的字符个数。
		void write(String str)		：写入字符串
		void write(String str, int off,int len)  :写入字符串的某一部分，off字符串的开始索引，len写的个数
		void flush() :刷新该流的缓冲
		void close() :关闭此流
	3.构造方法：
		BufferedWriter(Writer out)           ：创建一个使用默认大小输出流的缓冲区的输出流
		BufferedWriter(Writer out,int size)  ：创建一个给定大小输出流缓冲区的输出流
*/
public class a_BufferedWriter_字符缓冲_输出流 {
    public static void main(String[] args) throws IOException {
    //1.获取字符缓冲_输出流---字符流(FileWriter)
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/p_文件/f_字符缓冲流/z_BufferedWriter.txt"));
        bw.write("我是中国人,我爱中国...");
    //2.释放资源
        bw.close();

    }
}
