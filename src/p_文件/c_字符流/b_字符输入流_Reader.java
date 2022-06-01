package p_文件.c_字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
<1> 字符输入流——>Reader类&FileReader类的介绍
	java.io.Reader :字符输入流，是字符输入流的最大父类，定义了一些共性的成员方法，是一个抽象类
	1.共性的成员方法：
		int read() 				：读取单个字符并返回
		int read(char[] cbuf)   ：一次读取多个字符，将字符读取数组
		void close()			：释放资源
	2.FileReader extends InputStreamReader extends Reader
	  FileReader ：文件字符输入流
	  作用：把硬盘的数据以字符的方式，读到内存中
	3.构造方法：
		FileReader(String fileName)
		FileReader(File	file)
		参数：读取文件的数据源
				String fileName ：文件的路径
				File	file	：一个文件
		FileReader构造方法的作用：
				1.创建一个FileReader的对象
				2.会把FileReader的对象指向要读取的文件
<2> 字符输入流的使用步骤：
	1.创建FileReader对象，构造方法中指定要读取的数据源文件
	2.使用FileReader对象中的方法 read 读取文件
	3.释放资源
 */
public class b_字符输入流_Reader {
    public static void main(String[] args) throws IOException {
    //1.创建FileReader对象,构造方法中指定读取文件位置
        FileReader fr = new FileReader("src/p_文件/c_字符流/z_FileReader.txt");
    //2.使用FileReader的方法,read 读取文件
        //1.读取单个字符
        /*
        int len=0;
        while ((len=fr.read())!=-1){
            System.out.print((char) len);
        }   */
        //2.读取多个字符
        char[] cs = new char[10];
        int len=0;
        while ((len=fr.read(cs))!=-1){
            System.out.print(cs);
        }
        fr.close();
    }
}
