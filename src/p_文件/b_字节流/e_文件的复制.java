package p_文件.b_字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
<1> 文件的练习：先读后写
	1.明确：
		数据源：
		目的地：
	2.文件复制的步骤：
		1.创建一个字节输入流对象FileInputStream ，构造方法中指定要读的文件
		2.创建一个字节输出流对象FileOutputStream，构造方法中指定要写的文件
		3.字节输入流对象fis.read();  读取文件内容
		4.字节输出流对象fos.write(); 写入文件夹
		5.释放资源
 */
public class e_文件的复制 {
    public static void main(String[] args) throws IOException {
    //1.创建一个字节输入流对象FileInputStream,构造方法中指定要读文件的位置
        FileInputStream fis = new FileInputStream("src/p_文件/b_字节流/z_append.txt");
    //2.创建一个字节输出流FileOutputStream,构造方法中指定写入文件地址
        FileOutputStream fos = new FileOutputStream("src/p_文件/b_字节流/z_copy.txt");
    //3.边读边写
        byte[] bytes = new byte[1024];
        int len=0;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes);
        }
        fis.close();
        fos.close();


    }
}
