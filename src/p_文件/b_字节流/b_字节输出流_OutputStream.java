package p_文件.b_字节流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
<1> 一切皆为字节
	1.所有的文件数据（文本，图片，视频）在存储时，都是以二进制数字的形式保存。都是一个一个的字节，那么传输是一样如此。
<2> java.io.OutputStream :字节输出流
	1.OutputStream 是一个抽象类，是所有输出字节流的父类
	2.成员方法：
			public void close ();								//关闭此输出流，并释放资源
			public void flush ();								//清空任何缓冲的输出字节流
			public void write (byte[] b);						//将b.length字节从指定的字节数组写入此输出流
			public void write (byte[] b,int off,int length );	//从指定的字节数组写入len字节，从偏移量off开始输出到此字节流
			public abstract void write (int b);					//将指定的字节流输出
	3.FileOutputStream extends OutputStream
			A.FileOutputStream ：文件字节输出流
			B.作用 ：把内存中的数据写入到文件中
			C.构造方法：
					FileOutputStream(String name) ：创建一个向具有指定名称的文件中写入数据的输出文件流
					FileOutputStream(File	file) ：创建一个向指定File对象表示的文件中写入数据的文件输出流
					参数写入数据的目的：
						String name ：目的地是一个文件的路径
						File   file ：目的地是一个文件
					构造方法的作用：
						1.创建一个FileOutputStream对象，构成方法中传递写入数据的目的地
						2.会根据构造方法总传递的文件/文件路径，创建一个空的文件夹
						3.会把 FileOutputStream对象指向这个创建好的文件
<3> 字节流输出的使用步骤（重点）：
	1.创建一个FileOutputStream 对象，构造方法中传递写入数据的目的地
	2.调用FileOutputStream对象中的write方法，把数据写入到文件夹中
	3.对象.close 释放资源。（流的使用会占用一定的内存）
<4> 写入数据的原理（内存——>硬盘）
	java程序——>JVM（java虚拟机）——> OS(操作系统）——>OS调用数据写入的方法——>把数据写入到文件中
 */
public class b_字节输出流_OutputStream {
    public static void main(String[] args) throws IOException {
    //1.FileOutputStream extends OutputStream(字节输出流)
        FileOutputStream fos = new FileOutputStream("D:\\Java\\Java_Basics\\src\\p_文件\\b_字节流\\z.txt");
    //2.调用_write()方法,包数据写到文件夹中
        //write(int b)  写入一个字节
        fos.write(97);  fos.write(10);  //换行
            /* write (byte[] b);   将b.length 字节从指定的字节数组写入此输出流
            一次写多个字节：
                    如果 第一个是正数（0-127） 那么显示的时候会查询ASCII表
                    如果 第一个是负数，那第一个字节会和第二个字节，组成一个中文显示，查询系统默认的码表（GBK)
            */
        //多个字节的写入
        fos.write(49);        fos.write(48);        fos.write(48);  fos.write(10);
        //如果 第一个是正数（0-127） 那么显示的时候会查询ASCII表
        byte[] bytes = {49, 50, 51, 65, 66, 67};
        fos.write(bytes);  /* 123ABC*/   fos.write(10);
        //如果 第一个是负数，那第一个字节会和第二个字节，组成一个中文显示，查询系统默认的码表（GBK)
        byte[] bytes1 = {-65, -66, -67, 68, 69};
        fos.write(bytes1);  fos.write(10);
            /*		public void write (byte[] b,int off,int length );	//把一个字节数组的一部分写入到文件中
            int off :数组的开始索引
            int	len: 写几个字节
            */
        byte[] bytes2 = {65, 66, 67, 68, 69, 70};   //BC
        fos.write(bytes2, 0,3);  fos.write(10);
            /*	写入字节的方法：可以使用String 类中的方法把字符串转换成字符数组
                byte[] getBytes[]	把字符串转换成为字符数组
            */
        byte[] bytes3="好好学习,天天向上".getBytes(StandardCharsets.UTF_8);
        fos.write(bytes3); fos.write(10);

        //关闭文件
        fos.close();
    }
}
