package p_文件.i_打印流;

import java.io.*;

/*
<1> PrintStream：打印流  -->为其他输出流添加了使他们能够方便的打印各种数据值表示。
	1.java.io.PrintStream extends OutputStream
	2.PrintStream特点：
		1.只负责数据的输出，不负责数据的读取
		2.与其他输出流不同，PrintStream永远不会抛出 IOexcept
	3.特有的方法 print ,println
		void print(任意类型的值);
		void println(任意类型的值并换行);
	4.构造方法：
		PrintStream(File file);       :输出的目的地是一个文件
		PrintStream(OutputStream out) :输出的是一个字节输出流
		PrintStream(String fileName)  :输出的目的地是一个文件路径
	5.如果使用继承至父类的write方法写数据，那么查看的时候会查询编码表  97->a
	  如果是自己的方法，就会原样输出 97->97
	*/
public class a_PrintStream_打印流 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
    //1.创建PrintStream_打印流对象,构造方法中指出输出的目的地
        PrintStream ps = new PrintStream(new FileOutputStream("src/p_文件/i_打印流/z_PrintStream.txt",true),true,"utf-8");
    //2.使用继承至父类的write()方法写数据,会自动查看编码表(97-a)
        ps.write(97);
    //3.使用自己的方法,就会原样输出 97-97
        ps.println();
        ps.println(97);
        ps.print("自己的方法,原样输出");
    //4.释放资源
        ps.close();
    }
}
