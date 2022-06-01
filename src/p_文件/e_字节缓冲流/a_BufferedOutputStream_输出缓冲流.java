package p_文件.e_字节缓冲流;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
<1> BufferedOutputStream : 字节缓冲输出流
	1.java.io.BufferedOutStream extends OutputStream
	2.构造方法：
		1.BufferedOutputStream(OutputStream out) :创建一个新的缓冲输出流，以将数据写入指定的底层输出流
		2.BufferedOutputStream(OutputStream out,int size) :可以指定缓冲流的大小
		参数：
			OutputStream out :字节输出流
			我们可以传递FileOutputStream，缓冲流会个FileOutputStream增加一个缓冲区，提到写入效率
	3.使用步骤：
		1.创建FileOutputStream对象，指定写入的文件路径
		2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream的对象，提高FileoutputStream对象效率
		3.使用BufferedOutputStream对象中的方法write，把数据写入到缓冲区中
		4.使用flush方法，把缓冲区的数据，刷新到文件中
		5.释放资源（会先自动调用flush方法）*/
public class a_BufferedOutputStream_输出缓冲流 {
    public static void main(String[] args) throws IOException {
    //1.创建FileOutputStream对象,指定写入的文件位置
        FileOutputStream fos = new FileOutputStream("src/p_文件/e_字节缓冲流/z_buffered.txt", true);
    //2.创建BufferedOutputStream对象,构造方法中传递FileOutputStream对象,提高FileOutputStream对象效率
        BufferedOutputStream bos = new BufferedOutputStream(fos);
    //3.使用BufferedOutputStream对象中的write()方法,把数据写到缓冲区中
        bos.write("把数据写到内部缓冲区中".getBytes(StandardCharsets.UTF_8));
    //4.使用flush()方法,把缓冲区的数据写到文件中
        bos.flush();
    //5.释放资源 (会自动调用flush方法)
        bos.close();
        fos.close();
    }
}
