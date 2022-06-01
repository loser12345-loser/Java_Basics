package p_文件.b_字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
<1> java.io.InputStream :字节输入流
	1.是一个抽象类，是所有输入流的父类
	2.方法：
		int read(); 		:从输入流中读取数据的下一个字节
		int read(byte[] b); :从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
		void close();		:关闭此输入流并释放资源
	3.FileInputStream  extends InputStream
		FileInputStream : 文件字节输入流
		作用：把硬盘文件中的数据，读到内存中使用
	4.构造方法：
		FileInputStream(String name)
		FileInputStream(File   file)
		参数：读取文件的数据源
				String name  ：文件的路径
				File file    ：文件
		构造方法的作用：
				1.会创建一个FileInputStream的对象
				2.会把FileInputStream对象指向构造方法中要读取的文件
	5.字节输入流的使用步骤（重点）：
		1.创建FileInputStream对象，构造方法中指定读取的数据源
		2.使用FileInputStream对象中的read（）方法，读取文件
		3.释放资源
 */
public class d_字节输入流_InputStream {
    public static void main(String[] args) throws IOException {
    //1.创建FileInputStream对象,构造方法中指定读取文件的位置
        FileInputStream fis = new FileInputStream("src/p_文件/b_字节流/z_append.txt");
    //2.使用FileInputStream中的read()方法,读取文件内容,没有内容或读到末尾返回 -1
        //1.单个字节的读入
        int len = fis.read();
        System.out.println("len = " + len); //104='h'
        //2.字节输入流,一次读取多个字节的方法
        byte[] bytes = new byte[3]; //[101, 108, 108]=['e','l','l']
        int len1 = fis.read(bytes);
        System.out.println("Arrays.toString(bytes) = " + Arrays.toString(bytes));
        //3.string类的构造方法_ string(byte[] bytes) 将字节数组转换为字符串
        System.out.println("new String(bytes) = " + new String(bytes));
        //4.通过while循环_读取全部字节
        int count=0;
        while ((count = fis.read())!=-1){
            System.out.print((char) count);
        }
        //5.释放资源
        fis.close();
    }
}
