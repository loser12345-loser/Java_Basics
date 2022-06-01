package p_文件.c_字符流;

import java.io.FileWriter;
import java.io.IOException;

/*
<1> java.io.Writer :字符输出流，是所有字符输出流的最顶层的父类，是一个抽象类
	1.共性的成员方法：
		void write(int c)  			：写入字符
		void write(char[] cbuf)  	：写入字符数组
		abstract void write(char[] cbuf,int off ,int len) :写入字符数组的一部分，off数组的开始索引，len写的字符个数。
		void write(String str)		：写入字符串
		void write(String str, int off,int len)  :写入字符串的某一部分，off字符串的开始索引，len写的个数
		void flush() :刷新该流的缓冲
		void close() :关闭此流
	2.FileWriter extends OutputStreamWriter extends Writer
	  FileWriter ：文件字符输出流
	  作用： 把内存中的字符数据写到文件中
	3.构造方法：
		FileWriter(File file)       ：根据给定的File对象，构造一个FileWriter对象
		FileWriter(String fileName) ：根据给定的文件名构造一个FileWriter对象
		参数：写入数据的目的地：
			String FileName  ：文件的路径
			File	file	 ：一个文件
		构造方法的作用：
			1.创建一个FileWriter对象
			2.会根据构造方法中传递的文件/文件路径 ，创建文件
			3.会把FileWriter对象指向创建好的文件
	4.字符输出流的使用步骤：
			1.创建FileWriter对象，构造方法中指定要写入的文件
			2.是使用FileWriter中的方法 write，把数据写入到内存缓冲区中（字符转换为字节的过程
			3.使用FileWriter中的flush，把内存缓冲区的数据，刷新到文件中
			4.释放资源（会把内存缓冲区的数据，刷新到文件中）
 */
public class c_字符输出流_Writer {
    public static void main(String[] args) throws IOException {
    //1.创建FileWriter对象,构造方法中指定写入文件位置(会自动创建文件)
        FileWriter fw = new FileWriter("src/p_文件/c_字符流/z_FileWriter.txt", true);
    //2.调用write方法,把数据写到内存中
        //1./void write(int c) ：写入单个字符
        fw.write(97);  //97=a
        fw.write('\n');
        //2.write(char[] cbuf)  	：写入字符数组
        char[] cs = {'a', 'b', 'c', 'd', '\n'};
        fw.write(cs);
        //3.void write(char[] cbuf,int off ,int len) :写入字符数组的一部分，off数组的开始索引，len写的字符个数。
        fw.write(cs,0,3);
        //4.write(String str)		：写入字符串
        fw.write("\n字符输出流,输出字符串\n");
        fw.write("我爱中国",0,3);
        //5.fw.flush();		//清空缓冲区----清空后可以继续写入数据
        fw.close();
    }
}
